
package ram;

import org.json.JSONObject;

/**
 *
 * @author R D Gupta
 */

public class Update {
    
private JSONObject jData = new JSONObject();

public Update(String username, String tagline) {
    try {
        jData.put("username", username);
        jData.put("tagline" , tagline);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public String getUsername () { 
    String ret = null;
    try {
        ret = jData.getString("username");
    } catch (Exception e) {
    e.printStackTrace();
    } 
    return ret;
}

public void setUsername (String username) { 
    try {
        jData.remove("username");
        jData.put("username" , username);
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public String getTagline () {
    String ret = null;
    try {
        ret = jData.getString("tagline");
    } catch (Exception e) {
    e.printStackTrace();
    } 
    return ret;
}

    public static void main(String[] args) {
       String username="Ravi Raushan";
        Update a=new Update("Ramdas Gupta", "rdg");
        a.getUsername();
        System.out.println(a.getUsername());
        a.setUsername(username);
        System.out.println(a.getUsername());
    }
}
