import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        req.getRequestDispatcher("/login.jsp").forward(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
            if (req.getMethod().equalsIgnoreCase("post")) {
                String username = req.getParameter("username");
                String password = req.getParameter("password");
                if (username.equals("admin") && password.equals("password")) {
                    res.sendRedirect("/profile");
                }
                else {
                    res.sendRedirect("/login");
                }
            }
    }




}
