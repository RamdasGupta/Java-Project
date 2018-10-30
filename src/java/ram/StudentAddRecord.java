/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ram;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class StudentAddRecord {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        String filename="A:/Instaspaces/Ram/studentrecords.json";
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader(filename)) {
            Object obj = jsonParser.parse(reader);
            JSONArray studentList = (JSONArray) obj;
            System.out.println(studentList);
            JSONObject ob = new JSONObject();
            ob.put("name", "Shravan Sanidhya");
            ob.put("email", "shravan@gmail.com");
            ob.put("contact", "8989875486");
            ob.put("address", "Gorakhpur");
            studentList.add(ob);
            studentList.forEach(stu -> parseStudentObject((JSONObject) stu));
            try (FileWriter file = new FileWriter(filename)) {
                file.write(studentList.toJSONString());
                file.flush();

            } catch (IOException e) {
                e.printStackTrace();
            }
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
        System.out.println("Name :" + name + " Email :" + email + " Contact :" + contact + " Address :" + address);
    }
}
