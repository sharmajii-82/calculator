package calculator;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculate")
public class so extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String operation = request.getParameter("operation");
        String url = "";
        
        switch (operation) {
            case "add":
                url = "add";
                break;
            case "subtract":
                url = "subtract";
                break;
            case "multiply":
                url = "multiply";
                break;
            case "divide":
                url = "divide";
                break;
        }
        
        // Forward the request to the appropriate servlet
        request.getRequestDispatcher("/" + url).forward(request, response);
    }
}