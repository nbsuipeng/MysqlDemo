package com.sp.lss;



import java.sql.*;

/**
 * 对数据库连接进行简单测试
 */

public class ConnectTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //加载驱动
        Class.forName("com.mysql.jdbc.Driver");
        //用户信息 jdbc:mysql://localhost/biao?characterEncoding=utf8
        String url="jdbc:mysql://127.0.0.1:3333/mysql?characterEncoding=utf8";
        String username="root";
        String userpassword="root";
        //连接返回数据库连接对象
        Connection connection = DriverManager.getConnection(url, username, userpassword);
        //执行SQL
        Statement statement = connection.createStatement();
        String sql="select * from user";
        ResultSet resultSet = statement.executeQuery(sql);
        //必须得先执行next才能访问数据
        int i=0;
        while(resultSet.next())
        {
            System.out.println(resultSet.getObject(3));
        }
        //释放连接
        statement.close();
        connection.close();
    }
}

