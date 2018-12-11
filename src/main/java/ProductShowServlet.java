import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductShowServlet", urlPatterns = "/view-product")
public class ProductShowServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        if (request.getParameter("id") != null) {
            Products pdao = DaoFactory.getProductsDao();
            long id = Long.parseLong(request.getParameter("id"));
            Product p = pdao.findOne(id);
            request.setAttribute("product", p);
        }

        request.getRequestDispatcher("product-display.jsp").forward(request, response);

    }
}
