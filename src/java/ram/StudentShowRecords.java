
package ram;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StudentShowRecords {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("A:/Instaspaces/Ram/studentrecords.json")) {
            Object obj = jsonParser.parse(reader);
            JSONArray studentList = (JSONArray) obj;
            System.out.println(studentList);
            studentList.forEach(stu -> parseStudentObject((JSONObject) stu));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parseStudentObject(JSONObject stu) {
        String name = (String) stu.get("name");
        String email = (String) stu.get("email");
        String contact = (String) stu.get("contact");
        String address = (String) stu.get("address");
        System.out.println(" Name :" + name + " Email :" + email + " Contact :" + contact + " Address :" + address);
    }
  
}
