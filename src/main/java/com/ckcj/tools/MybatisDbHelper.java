package com.ckcj.tools;

import sun.security.tools.keytool.Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ResourceBundle;

public class MybatisDbHelper<sqlsession> {
    public static Sqlsession getSession;

    public static <SqlSession, SqlSessionFactoryBuilder, SqlFactory> SqlSession getSession() {
        SqlSession session = null;
        try { 
            //1.创建一个连接工厂的构造器
        SqlSessionFactoryBuilder sfb =new SqlSessionFactoryBuilder();
            //2.拿到工厂的实例
        String fpath="mybatis-config.xml";
            SqlFactory sf =sfb.build(new FileInputStream(new file(fpath)));
            SqlFactory sf =sfb.build(Resources.getResourceAsStream(new file(fpath)));
            //3.由工厂实例获得链接
            SqlFactory sf =sfb.build(new FileInputStream(new file(fpath)));
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }

    } void Catch (Exception e) {
            e.printStackTrace();
        }
        //3.由工厂实例获得一个连接
        return sqlsession;
    }

    private static class Sqlsession {
    }

    private static class file extends File {
        public file(String fpath) {
            super();
        }
    }
}
