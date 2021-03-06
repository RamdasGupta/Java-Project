
package jsp;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import org.json.*;
public class AddJsonObject {
    public static void main(String[] args) {
        String jsonString = callURL("https://cdn.crunchify.com/wp-content/uploads/code/jsonArray.txt");
		System.out.println("\n\njsonString: " + jsonString);
 
		try {
		    JSONArray jsonArray = new JSONArray(jsonString);
 
		    JSONObject jsonObj= new JSONObject();  
		    jsonObj.put("color", "CrunchifyColor1");
		    jsonObj.put("value", "#111");
		    jsonArray.put(jsonObj);
 
			int count = jsonArray.length(); 
			for(int i=0 ; i< count; i++){   
				JSONObject jsonObject = jsonArray.getJSONObject(i);   
				System.out.println("jsonObject " + i + ": " + jsonObject);
			}
 
		} catch (JSONException e) {
			e.printStackTrace();
		}
	}
 
	public static String callURL(String myURL) {
		System.out.println("Requested URL:" + myURL);
		StringBuilder sb = new StringBuilder();
		URLConnection urlConn = null;
		InputStreamReader in = null;
		try {
			URL url = new URL(myURL);
			urlConn = url.openConnection();
			if (urlConn != null)
				urlConn.setReadTimeout(60 * 1000);
			if (urlConn != null && urlConn.getInputStream() != null) {
				in = new InputStreamReader(urlConn.getInputStream(),
						Charset.defaultCharset());
				BufferedReader bufferedReader = new BufferedReader(in);
				if (bufferedReader != null) {
					int cp;
					while ((cp = bufferedReader.read()) != -1) {
						sb.append((char) cp);
					}
					bufferedReader.close();
				}
			}
		in.close();
		} catch (Exception e) {
			throw new RuntimeException("Exception while calling URL:"+ myURL, e);
		} 
 
		return sb.toString();
	
 
    }
  
}
