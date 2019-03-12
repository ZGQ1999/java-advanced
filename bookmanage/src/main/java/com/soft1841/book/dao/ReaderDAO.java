package com.soft1841.book.dao;

import cn.hutool.db.Entity;

import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

/**
 * @parm id
 * @reture
 * @throws SQLException
 */
public interface ReaderDAO {
    List <Entity> selectReaders () throws SQLException;
    int deleteById (long id) throws SQLException;

    void deleteReaderById (long id);
    /**
     * 新增一个读者，返回自增主键
     * @param reader
     * @return
     * @throws SQLException
     */
    Long insertReader(Reader reader) throws SQLException;


    Long insertReader(com.soft1841.book.entity.Reader reader) throws SQLException;
}

