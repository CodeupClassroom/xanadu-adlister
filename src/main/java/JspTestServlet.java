import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "JspTestServlet", urlPatterns = "/jsp-test")
public class JspTestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        request.getRequestDispatcher("jsp-tags.jsp").forward(request, response);

//        request.getRequestDispatcher("include-test.jsp").forward(request, response);

//        request.getRequestDispatcher("include1.jsp").forward(request, response);
//        request.getRequestDispatcher("include2.jsp").forward(request, response);
//        request.getRequestDispatcher("implicit.jsp").forward(request, response);
//        request.getRequestDispatcher("el.jsp").forward(request, response);
//        request.getRequestDispatcher("jstl-test.jsp").forward(request, response);
        request.getRequestDispatcher("jstl.jsp").forward(request, response);
    }
}
