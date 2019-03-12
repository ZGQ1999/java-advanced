package com.soft1841.book.utils;
import com.soft1841.book.dao.ReaderDAO;
import com.soft1841.book.dao.TypeDAO;
import com.soft1841.book.dao.impl.BookDAOImpl;
import com.soft1841.book.dao.impl.ReaderDAOImpl;
import com.soft1841.book.dao.impl.TypeDAOImpl;

/**
 * 工厂类，用静态方法来生成各个DAO实例
 */
public class DAOFactory {
    /**
     * 静态方法，返回TypeDAO实现类的对象
     * @return
     */
    public static TypeDAO getTypeDAOInstance() {
        return new TypeDAOImpl();
    }
    public static BookDAOImpl getBookDAOInstance() {
        return new BookDAOImpl();
    }
    public static ReaderDAO getReaderDAOInstance() {return new ReaderDAOImpl();}
}
