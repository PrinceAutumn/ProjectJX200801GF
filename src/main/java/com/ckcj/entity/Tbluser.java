package com.ckcj.entity;

public class Tbluser {
    private long userid;
    private static long rid;
    private String uname;
    private String upwd;
    private double money;
    private String phone;

    public static void setRid(int rid) {
        Tbluser.rid = rid;
    }

    public long getUserid(){return userid;}
    public  void  setUserid(long userid){this.userid=userid;}
    public long getid(){return rid;}
}
