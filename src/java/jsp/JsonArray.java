package jsp;

import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JsonArray {

    public static void main(String args[]) {
        JSONParser parser = new JSONParser();
        try {
            Object object = parser.parse(new FileReader("A:/Instaspaces/Ram/instaspaces.json"));
            System.out.println(object);

            final JSONObject res = new JSONObject();

            JSONArray jarray = new JSONArray();
            for (int i = 0; i < 3; i++) {
                JSONObject ob = new JSONObject();
                ob.put("fname", "ram");
                ob.put("lname", "das");
                jarray.add(ob);
            }
            //res.put("data", jarray);
            System.out.println(jarray);

            JSONObject ob = new JSONObject();
            ob.put("fname", "ram");
            ob.put("lname", "das");
            jarray.add(ob);
            System.out.println(jarray);
            
            JSONArray list =(JSONArray) object;
            System.out.println(list);
            System.out.println(list.size());
            JSONArray jsonarray = new JSONArray();
            for (int i = 0; i < list.size(); i++) {
                System.out.println("a");
            }

        } catch (FileNotFoundException fe) {
            fe.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
