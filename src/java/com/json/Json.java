
package com.json;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Json {
    public static void main(String... args) throws JSONException{
        final JSONObject res = new JSONObject();
        //adding value in JSON object
        JSONArray jarray= new JSONArray();
        for(int i=0;i<3;i++){
            JSONObject ob = new JSONObject();
            ob.put("k1"+i, "ram");
            ob.put("k2"+i, "das");
            jarray.put(ob);
        }
        res.put("res", jarray);
        System.out.println("structure of created json object:"+res);
        //retrieving value from JSON object element wise
        System.out.println("retrieving value from JSON object element wise");
        JSONArray output= res.getJSONArray("res");
        for(int i=0;i<output.length();i++){
            JSONObject ob= output.getJSONObject(i);
            System.out.print(ob.get("k1"+i));
            System.out.println(ob.get("k2"+i));
        }
        
        JSONObject ram=new JSONObject();
        ram.put("r", "Ramdas Gupta");
        ram.put("i", "Irfan");
        System.out.println(ram.get("i"));;
    }
}