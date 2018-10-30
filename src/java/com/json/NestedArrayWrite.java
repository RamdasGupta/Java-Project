package com.json;

import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class NestedArrayWrite {

    public static void main(String[] args) throws IOException {
        
        JSONArray firsta=new JSONArray();
        JSONObject obja=new JSONObject();
        
        JSONArray firstaa=new JSONArray();
        JSONObject first=new JSONObject();
        
        JSONArray f1a=new JSONArray();
        JSONObject f1=new JSONObject();
        f1.put("id","1");
        f1.put("name", "Ravi Raushan");
        f1.put("contact", "8758745845");
        f1a.add(f1);
        first.put("id", f1a);
        first.put("name", "Rakesh Kumar");
        first.put("contact", "8989789878");
        firstaa.add(first);
        obja.put("first", firstaa);
        
        
        
        JSONObject second=new JSONObject();
        second.put("id", "2");
        second.put("name", "Ramdas Gupta");
        second.put("contact", "9340172104");
        obja.put("second", second);
        
        JSONObject third=new JSONObject();
        third.put("id", "3");
        third.put("name", "Ramdas Gupta");
        third.put("contact", "9340172104");
        obja.put("third", third);
        firsta.add(obja);
                
        try (FileWriter file = new FileWriter("A:/Instaspaces/Ram/nestedarray.txt")) {
            file.write(firsta.toString());
            System.out.println("\nJSON Object: " + firsta.toString());
        }
    }
}
