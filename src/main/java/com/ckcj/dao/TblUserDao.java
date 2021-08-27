package com.ckcj.dao;

import com.ckcj.entity.Tbluser;

import java.util.List;

public interface TblUserDao<userid, Sqlsession, SqlSession, tbluserlist, TblUser> {
    static void delTbluser(Object uid) {
    }
    //1.增加用户
    public  boolean addTblUser(TblUser tbluser);
    //2.删除用户
    public  boolean delTblUser(String uid) ;
    //3.用户重置密码
    //传参使用 注阶param
    public  boolean updateTblUser(String upwd, String userid);
    //4.查询所有的用户列表 根据用户模糊查询，分页
    public List<Tbluser> findTblUser(String uname, int pageNo);
    //5.登录 根据用户和密码查询
    public TblUser loginUSer(String uname,String upwd);

    boolean addTblUser(Tbluser tbluser);
};


