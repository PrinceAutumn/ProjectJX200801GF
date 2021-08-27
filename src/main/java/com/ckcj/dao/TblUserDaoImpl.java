package com.ckcj.dao;

import com.ckcj.entity.Tbluser;
import com.ckcj.tools.MybatisDbHelper;

import java.util.HashMap;
import java.util.Map;

public abstract class TblUserDaoImpl<SqlSession> implements TblUserDao {
       @Override
       public  boolean addTblUser(Tbluser tbluser) {
           boolean flag = false;
           try {
               //1.得到连接
               SqlSession sqlSession = MybatisDbHelper.getSession();
               //2.SQL
               Object s;
               int num = (int) sqlSession.wait(s:"addTblUser",tbluser);
               //3.提交
               System.out.println(num);
               if (num>0)
                  {
                   flag = true;
               }
           }
               catch(Exception e){
                   flag =false;
                   e.printStackTrace();
           }
                 return flag;
           }
        }