package jsp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;

/**
 *
 * @author R D Gupta
 */
public class readfile {

    public static void main(String arg[]) {
        String filename = "A:/Instaspaces/Ram/instaspaces.json";
        String jsonString = callURL(filename);
        System.out.println("\n\njsonString: " + jsonString);

        try {
            JSONArray jsonArray = new JSONArray(jsonString);
            System.out.println("\n\njsonArray: " + jsonArray);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static String callURL(String myURL) {
        System.out.println("Requested URL:" + myURL);
        StringBuilder sb = new StringBuilder();
        InputStreamReader in = null;
        try {
            BufferedReader bufferedReader = new BufferedReader(in);
                if (bufferedReader != null) {
                    int cp;
                    while ((cp = bufferedReader.read()) != -1) {
                        sb.append((char) cp);
                    }
                    bufferedReader.close();
                }
          
            in.close();
        } catch (Exception e) {
            throw new RuntimeException("Exception while calling URL:" + myURL, e);
        }

        return sb.toString();
    }
}
