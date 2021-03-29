package com.sp.lss.mybatis;

import com.sp.lss.mybatis.Model.People;
import com.sp.lss.mybatis.Utils.MyBytaisUtils;
import com.sp.lss.mybatis.dao.GetData;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/***
 * Mybatis连接数据库测试
 */
public class MybatisTest {
    public static void main(String[] args) {
        SqlSession sqlSession = MyBytaisUtils.getSqlSession();
        GetData mapper = sqlSession.getMapper(GetData.class);
        List<People> peopleList = mapper.getPeopleList();
        for (People people : peopleList) {
            System.out.println(people.toString());
        }

    }
}
