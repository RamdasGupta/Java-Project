package jsp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author R D Gupta
 */
public class Jspindex extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        String filename = "A:/Instaspaces/Ram/instaspaces.json";
        String line = null;
        ArrayList<JSONObject> json = new ArrayList<JSONObject>();
        JSONObject obj;
        String name, email, contact, address;
        name = request.getParameter("name");
        email = request.getParameter("email");
        contact = request.getParameter("contact");
        address = request.getParameter("address");
        JSONObject a = new JSONObject();
        
        try {
//            BufferedReader br = new BufferedReader(new FileReader(filename));
//            while ((line = br.readLine()) != null) {
//                obj = (JSONObject) new JSONParser().parse(line);
//                json.add(obj);
//                System.out.println((String) obj.get("name") + ":" + (String) obj.get("email")+(String) obj.get("contact") + ":" + (String) obj.get("address"));
//            }
//            br.close();
            JSONObject b = new JSONObject();
            b.put("name", "Ramdas Gupta");
            b.put("email", "ramdasguptardg@gmail.com");
            b.put("contact", "9340172104");
            b.put("address", "Bhopal");
           
            System.out.println("Output" + a);
            try (FileWriter file = new FileWriter(filename)) {
                file.write(b.toJSONString());
                System.out.println("Successfully Copied JSON Object to File...");
                System.out.println("\nJSON Object: " + b);
            }
        }
        catch(Exception e){
            System.out.println("Error : "+e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(Jspindex.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(Jspindex.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
