package com.ckcj.tools;

import com.ckcj.dao.TblUserDao;
import com.ckcj.dao.TblUserDaoImpl;
import com.ckcj.entity.Tbluser;
import org.junit.Test;

import java.util.List;

public class TestTblUserDao<tbluser, Static, TblUser> {

public Static void main(String[] args) {
        TblUserDao tblUserDao = new TblUserDaoImpl() {
            TblUser tblUser = new TblUser();
               Tbluser.setRid(1);
               Tbluser.setUname("admin");
               tbluser.setUpwd("123456");
               tbluser.setMoney(100);
               tbluser.setPhone("123345677890")
                       tblUserDao.addTblUser(tbluser);
        }
    }
