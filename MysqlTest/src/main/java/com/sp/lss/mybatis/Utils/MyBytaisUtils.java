package com.sp.lss.mybatis.Utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MyBytaisUtils {
    //获取SqlSessionFactory
    private static SqlSessionFactory sqlSessionFactory;
    static
    {
        String resource="Mybatis.xml";
        InputStream inputStream= null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);

    }
    //获取SqlSession
    public static SqlSession getSqlSession()
    {
        return sqlSessionFactory.openSession();
    }
}
