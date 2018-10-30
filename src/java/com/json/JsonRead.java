package com.json;

import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonRead {

    public static void main(String[] args) {
        JSONParser parser = new JSONParser();

        try {

            Object obj = parser.parse(new FileReader("A:/Instaspaces/Ram/data.json"));
            JSONArray jsonArray = (JSONArray) obj;
            int length = jsonArray.size();
            LinkedList id = new LinkedList();
            LinkedList name = new LinkedList();

            for (int i = 0; i < length; i++) {
                JSONObject jsonObject = (JSONObject) jsonArray.get(i);
                Set s = jsonObject.entrySet();
                Iterator iter = s.iterator();
                LinkedList lm = new LinkedList();
                LinkedList ll = new LinkedList();

                while (iter.hasNext()) {
                    Map.Entry me = (Map.Entry) iter.next();
                    System.out.println(me.getKey() + "  " + me.getValue());
                    lm.add(me.getKey());
                    ll.add(me.getValue());

                }

                id.add(ll.get(0));
                name.add(ll.get(1));
            }
            System.out.println(id);
            System.out.println(name);
            System.out.println("********************************");
            Object obj1 = parser.parse(new FileReader("A:/Instaspaces/Ram/json.txt"));
            JSONObject jsonObject = (JSONObject) obj1;
            JSONArray array = (JSONArray) jsonObject.get("first"); 

            Iterator<Object> iterator = array.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
            
            

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
