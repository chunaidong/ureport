package com.wangmike.ureport.bean;


import java.io.Serializable;

/**
 * <pre>
 *    @author  : wangchun
 *    @time    : 2020/6/28 9:03
 *    @desc    : 输入描述
 *    @version : v1.0
 * </pre>
 */
public class User implements Serializable {

    private Integer id;

    private String name;

    private String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


   /* public static void main(String[] args) {
      *//*  StringBuffer div = new StringBuffer("<div class='col-md-6' style='padding-left:2px;padding-right:2px' fdasfadsfadsfdasfdas");
        StringBuffer div1 =  new StringBuffer("<div class='col-md-12' style='padding-left:2px;padding-right:2px' style='fdasfdasfdsafdas'");
        System.out.println(div.indexOf("style="));
        System.out.println(div1.indexOf("style="));
        System.out.println("style='padding-left:2px;padding-right:2px'".length());
        System.out.println(div.replace(div.indexOf("style="),div.indexOf("style=")+42,"ssssss"));*//*
        String dddd = "dfafdasfStartDate";
        String sss = "StartDate";
        String dfa = "sdfsdfEndDate";
        System.out.println(dddd.endsWith("StartDate"));
        System.out.println(sss.endsWith("StartDate"));
        System.out.println(dfa.endsWith("EndDate"));
    }*/
}
