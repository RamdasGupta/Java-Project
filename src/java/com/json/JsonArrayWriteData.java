package com.json;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
public class JsonArrayWriteData {
    public static void main(String[] args) throws IOException{
        JSONObject a=new JSONObject();
        JSONArray jarray=new JSONArray();
        for(int i=0;i<=3;i++){
        JSONObject b=new JSONObject();
        b.put("a"+i, "Ramdas Gupta");
        b.put("b"+i, "Irfan");
        jarray.add(b);
        }
        a.put("first",jarray);
        JSONObject b=new JSONObject();
        b.put("arr", "Ramdas Gupta");
        b.put("bss", "Irfan");
        jarray.add(b);
        System.out.println("Output"+a);
        try (FileWriter file = new FileWriter("A:/Instaspaces/Ram/json.txt")) {
            file.write(a.toJSONString());
            System.out.println("Successfully Copied JSON Object to File...");
            System.out.println("\nJSON Object: " + jarray);
        }
    }
}
