import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CityServlet",urlPatterns = "/cities")
public class CityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<City> cities=CityService.getAllCities();
        request.setAttribute("cities",cities);
        RequestDispatcher dispatcher=request.getRequestDispatcher("/WEB-INF/views/City/List.jsp");
        dispatcher.forward(request,response);
    }
}
