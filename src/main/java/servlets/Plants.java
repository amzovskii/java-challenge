package servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.json.*;

public class Plants extends HttpServlet {
    int accesses = 0;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
         throws IOException, ServletException
    {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        JSONObject plant = new JSONObject();
        plant.put("name", "Flower");

        out.print(plant);
        out.close();
    }
} 