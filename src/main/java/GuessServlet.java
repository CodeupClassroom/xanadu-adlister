import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(name = "GuessServlet", urlPatterns = "/guess")
public class GuessServlet extends HttpServlet {

    private int correctNumber = getRandom();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int numberGuess = Integer.parseInt(request.getParameter("guess"));
        String message;
        boolean isNotCorrect;
        if (numberGuess == correctNumber) {
            message = "YOU WON!";
            isNotCorrect = false;
        } else if (numberGuess > correctNumber) {
            message = "LOWER";
            isNotCorrect = true;
        } else {
            message = "HIGHER";
            isNotCorrect = true;
        }
        request.setAttribute("message", message);
        request.setAttribute("isNotCorrect", isNotCorrect);
        request.getRequestDispatcher("/results.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("correctNumber", correctNumber);
        request.getRequestDispatcher("guess-form.jsp").forward(request, response);
    }

    private int getRandom() {
        Random rand = new Random();
        int n = rand.nextInt(100) + 1;
        return n;
    }

}
