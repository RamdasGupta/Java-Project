package com.json;

import org.json.JSONObject;

public class JsonTostring {
    public static void main(String[] args) {
        JsonClass jc=new JsonClass();
        jc.setId("1");
        jc.setName("Ramdas Gupta");
        jc.setAge("23");
        jc.setContact("9340172104");
        JSONObject json=new JSONObject(jc);
        System.out.println(json.toString());
         
    }
}
