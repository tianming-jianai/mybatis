package com;

import com.hkd.entity.Employee;
import com.hkd.mapper.EmployeeMapper;
import lombok.extern.java.Log;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;

/**
 * @Author: 张世罡
 * @Date： 2019/7/20
 * @Description: com.hkd
 * @version: 1.0
 */
@Log
public class TestMyBatis {

    public static final SqlSessionFactory getSqlsessionFactory() throws IOException {
        String config="sqlMapConfig.xml";
        Reader reader = Resources.getResourceAsReader(config);
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        return sqlSessionFactory;
    }


    @Test
    public void testResultMap() throws IOException {
        SqlSessionFactory sqlsessionFactory = getSqlsessionFactory();
        SqlSession sqlSession=sqlsessionFactory.openSession(true);
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee emp = mapper.getEmpById(1);
        System.out.println(emp);

        sqlSession.close();
    }

    @Test
    public void testResultMap2() throws IOException {
        SqlSessionFactory sqlsessionFactory = getSqlsessionFactory();
        SqlSession sqlSession=sqlsessionFactory.openSession(true);
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee emp = mapper.getEmpById2(1);
        System.out.println(emp);
    }

    @Test
    public void testResultMap3() throws IOException {
        SqlSessionFactory sqlsessionFactory = getSqlsessionFactory();
        SqlSession sqlSession=sqlsessionFactory.openSession(true);
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee emp = mapper.getEmpById3(2);
        System.out.println(emp);
    }
}
