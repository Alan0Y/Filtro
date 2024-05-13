import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculaEdad", urlPatterns = {"/CalculaEdad"})
public class CalculaEdad extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Aquí puedes obtener el contexto del servlet
        ServletContext context = getServletContext();
        
        // Luego, puedes llamar al método log() para registrar información en el registro (log)
        context.log("Este es un mensaje de registro desde el servlet CalculaEdad.");
        
        // Resto de tu código para calcular la edad y procesar la solicitud
    }
}
