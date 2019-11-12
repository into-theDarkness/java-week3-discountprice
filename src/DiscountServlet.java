import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/convert")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String des = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("list"));
        float discount= Float.parseFloat(request.getParameter("discount"));
        float amount = price * discount/100;
        float result = price - amount;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h3>Product Description: " + des+ "</h3>");
        writer.println("<h3>Price: " + price + "</h3>");
        writer.println("<h3>Discount Percent: " +discount+ "%" + "</h3>");
        writer.println("<h3>Discount Amount: " + amount + "</h3>");
        writer.println("<h3>Discount price: " + result+ "</h3>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
