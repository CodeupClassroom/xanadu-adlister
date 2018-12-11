import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductIndexServlet", urlPatterns ="/products")
public class ProductIndexServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Products pdao = DaoFactory.getProductDao();
        request.setAttribute("products", pdao.findAll());
        request.getRequestDispatcher("product-index.jsp").forward(request, response);

    }
}
