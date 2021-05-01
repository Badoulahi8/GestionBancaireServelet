import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/exemple")
public class MainServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getParameter("page") != null)
        {
            String page = req.getParameter("page");
            switch (page)
            {
                case "listeClient" :
                    req.getRequestDispatcher("pages/listeClient.jsp").forward(req,resp) ;
                break;
                case "listeCompte" :
                    req.getRequestDispatcher("pages/listeCompte.jsp").forward(req,resp) ;
                    break;
                case "listeOperation" :
                    req.getRequestDispatcher("pages/listeOperation.jsp").forward(req, resp);
                    break;
            }
        }
    }
}
