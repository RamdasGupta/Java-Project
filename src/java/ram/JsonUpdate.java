
package ram;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class JsonUpdate {
    public static void main(String[] args) {
        String filename = "A:/Instaspaces/Ram/profile.json";
        JSONParser parser = new JSONParser();
        try {
            FileReader reader = new FileReader(filename);
            Object obj = parser.parse(reader);
            JSONArray array = (JSONArray) obj;
            System.out.println(array);
            System.out.println(array.size());
            
            JSONArray a=new JSONArray();
           array.forEach(item -> {
                JSONObject list = (JSONObject) item;
                JSONObject o=new JSONObject();
                if (list.get("name").equals("Ramdas Gupta")) {
                    list.remove("name");
                    list.put("name", "Ravi Raushan");
                    System.out.println("Name :" + list.get("name"));
                }
                o.put("id", list.get("id"));
                o.put("name", list.get("name"));
                o.put("email", list.get("email"));
                o.put("contact", list.get("contact"));
                o.put("address", list.get("address"));
                a.add(o);
            });
            System.out.println(a);
    }
        catch(Exception e){
            e.printStackTrace();
        }
   
}
}
