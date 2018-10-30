package ram;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ShowRecords {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();
        try (FileReader reader = new FileReader("A:/Instaspaces/Ram/records.json")) {
            Object obj = jsonParser.parse(reader);
            JSONArray employeeList = (JSONArray) obj;
            System.out.println(employeeList);
            JSONObject ob = new JSONObject();

            employeeList.forEach(emp -> parseEmployeeObject((JSONObject) emp));
            System.out.println("Result:" + employeeList);
            ob.put("firstName", "Ramdas");
            ob.put("lastName", "Gupta");
            ob.put("website", "rdg.com");
            employeeList.add(ob);
            System.out.println("Data:" + employeeList);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    private static void parseEmployeeObject(JSONObject employee) {
        String firstName = (String) employee.get("firstName");
        String lastName = (String) employee.get("lastName");
        String website = (String) employee.get("website");
        System.out.println("Name :" + firstName + " " + lastName);
        System.out.println("Website :" + website);
    }
}
