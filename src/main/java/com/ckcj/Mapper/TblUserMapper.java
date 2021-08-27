package com.ckcj.Mapper;

import com.ckcj.dao.TblUserdao;
import org.apache.ibatis.annotations.Param;

import java.awt.*;

public interface TblUserMapper<userid, uname, upwd> {
    //1.增加用户（int）
    public int addTblUser (TblUserdao.Tbluser tbluser);
    //2.删除用户(查找时返回布尔值boolean)
    public void delUser(String uid);
    //3.重置用户密码
    //传参用  注解 param
    public void udpateTblUser(String upwd ,String userid);
    //4.查询所有的用户列表 根据用户模糊、余额范围 查询，分页。
    public List findTblUser ( @Param(value="uname") String uname,
                              @Param(value="miny")  long miny,
                              @Param(value="maxy")  long maxy,
                              @Param(value="pageSize")int pageSize);
    //5.登录 根据用户和密码查询 param?不适用于字段的原因？
    public TblUserdao.Tbluser loginUser
            (@Param(value="uname")    String uname,
             @Param(value="password") String Upwd);
             int addTblUser = 0;
          (TblUserdao.Tbluser tbluser);


}