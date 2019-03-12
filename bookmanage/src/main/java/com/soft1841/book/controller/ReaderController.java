package com.soft1841.book.controller;
/**
 * 读者信息控制器
 */
import cn.hutool.db.Entity;
import com.soft1841.book.dao.ReaderDAO;
import com.soft1841.book.entity.Reader;
import com.soft1841.book.utils.DAOFactory;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import java.net.URL;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class ReaderController implements Initializable {
    @FXML
    private FlowPane readerPane;

    private ReaderDAO readerDAO = DAOFactory.getReaderDAOInstance();
    List<Entity> readerList = new ArrayList<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            readerList = readerDAO.selectReaders();
            System.out.println(readerList.size());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        showReaders(readerList);
    }
    //通过循环遍历readerList集合，创建HBox来显示每个读者信息
    private void showReaders(List<Entity> readerList){
        ObservableList<Node> observableList = readerPane.getChildren();
        readerPane.getChildren().removeAll(observableList);
        for (Entity entity:readerList) {
            HBox hBox = new HBox();
            hBox.setPrefSize(320,280);
            hBox.setSpacing(10);
            hBox.setPadding(new Insets(10,10,10,10));
            hBox.getStyleClass().add("box");
            //创建左侧的垂直布局,用来放头像和角色
            VBox leftBox = new VBox();
            leftBox.setSpacing(30);
            leftBox.setPadding(new Insets(20,10,10,10));
            leftBox.setAlignment(Pos.TOP_CENTER);
            ImageView avatarImg = new ImageView(new Image(entity.getStr("avatar")));
            avatarImg.setFitWidth(80);
            avatarImg.setFitHeight(80);
            //给头像设置圆形效果
            Circle circle = new Circle();
            circle.setCenterX(40);
            circle.setCenterY(40);
            circle.setRadius(40);
            avatarImg.setClip(circle);
            leftBox.getChildren().add(avatarImg);
            Label roleLabel = new Label(entity.getStr("role"));
            leftBox.getChildren().add(roleLabel);
            VBox rightBox = new VBox();
            rightBox.setPadding(new Insets(20,10,10,10));
            rightBox.setSpacing(25);
            rightBox.setAlignment(Pos.TOP_CENTER);
            Label nameLabel = new Label(entity.getStr("name"));
            nameLabel.getStyleClass().add("font-title");
            Label depLabel = new Label(entity.getStr("department"));
            Label emailLabel = new Label(entity.getStr("email"));
            Label mobileLabel = new Label(entity.getStr("mobile"));
            Label timeLabel = new Label(entity.getDate("join_date").toString());
            Button delButton = new Button("删除");
            delButton.getStyleClass().add("green-theme");
            delButton.setPrefSize(80,80);
            rightBox.getChildren().addAll(nameLabel,depLabel,emailLabel,mobileLabel,timeLabel,delButton);
            hBox.getChildren().add(leftBox);
            hBox.getChildren().add(rightBox);
            readerPane.getChildren().add(hBox);
            //2:删除按钮事件
            delButton.setOnAction(event -> {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("确认对话框");
                alert.setHeaderText("请确认");
                alert.setContentText("确定要删除这行记录吗?");
                Optional<ButtonType> result = alert.showAndWait();
                //点击了确认按钮，执行删除操作，同时移除一行模型数据
                if (result.get() == ButtonType.OK) {
                    //点击删除按钮做的事件，得到这个人的ID
                    try {
                        long id = entity.getLong("id");
                        readerDAO.deleteById(id);
                        //从流式面板移除当前这个人的数据
                        readerPane.getChildren().remove(hBox);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            });

        }
    }
    //3:新增读者方法
    public void addReader() throws SQLException{
        //创建一个Reader对象
        Reader reader = new Reader();
        //新建一个舞台
        Stage stage = new Stage();
        stage.setTitle("新增读者界面");
        //创建一个垂直布局，用来放新增用户的各个组件
        VBox vBox = new VBox();
        vBox.setSpacing(10);
        vBox.setPadding(new Insets(20,10,10,10));
        TextField nameField = new TextField("请输入姓名");
        TextField avatarField = new TextField("请输入头像地址");
        //性别，两个单选按钮为一个组，教师单选按钮默认被选中
        HBox roleBox = new HBox();
        roleBox.setSpacing(20);
        ToggleGroup group = new ToggleGroup();
        RadioButton teacherButton = new RadioButton("教师");
        teacherButton.setToggleGroup(group);
        teacherButton.setSelected(true);
        teacherButton.setUserData("教师");
        RadioButton studentButton = new RadioButton("学生");
        studentButton.setToggleGroup(group);
        studentButton.setUserData("学生");
        roleBox.getChildren().addAll(teacherButton,studentButton);
        group.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                //给读者对象设置选中的角色
                System.out.println(group.getSelectedToggle().getUserData().toString());
                reader.setRole(group.getSelectedToggle().getUserData().toString());
            }
        });
        //院系部门数组
        String[] departments = {"机械工程学院","电气工程学院","航空工程学院","交通工程学院",
                "计算机与软件学院","经济管理学院","商务贸易学院","艺术设计学院"};
        //数组转为List
        List<String> list = Arrays.asList(departments);
        //将list中的数据加入observableList
        ObservableList<String> observableList = FXCollections.observableArrayList();
        observableList.addAll(list);
        //创建院系下拉框
        ComboBox<String> depComboBox = new ComboBox<>();
        depComboBox.setPromptText("请选择院系");
        //给下拉框初始化值
        depComboBox.setItems(observableList);
        //下拉框选项改变事件
        depComboBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                //将选中的值设置给读者的部门属性
                reader.setDepartment(newValue);
            }
        });
        //创建一个日期选择器对象，并初始化值为当前日期
        DatePicker datePicker = new DatePicker();
        datePicker.setValue(LocalDate.now());
        //邮箱输入框
        TextField emailField = new TextField("请输入邮箱");
        //电话输入框
        TextField mobileField =  new TextField("请输入电话");
        //新增按钮
        Button addBtn = new Button("新增");
        addBtn.getStyleClass().add("blue-theme");
        vBox.getChildren().addAll(nameField,avatarField,roleBox,depComboBox,datePicker,
                emailField,mobileField,addBtn);
        Scene scene = new Scene(vBox,600,380);
        scene.getStylesheets().add("/css/style.css");
        stage.setScene(scene);
        stage.show();
        //点击新增按钮，将界面数据封装成一个Reader对象，写入数据库
        addBtn.setOnAction(event ->{
            String nameString = nameField.getText().trim();
            String avatarString = avatarField.getText().trim();
            String dateString = datePicker.getEditor().getText();
            String emailString = emailField.getText().trim();
            String mobileString = mobileField.getText().trim();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date joinDate = null;
            try {
                joinDate = df.parse(dateString);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            reader.setName(nameString);
            reader.setAvatar(avatarString);
            reader.setJoinDate(joinDate);
            reader.setEmail(emailString);
            reader.setMobile(mobileString);
            System.out.println(reader.getName()+reader.getRole()+reader.getMobile() );
            try {
                readerDAO.insertReader(reader);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            stage.close();
            //重新读取数据显示
            try {
                readerList = readerDAO.selectReaders();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            showReaders(readerList);
        });
    }
}