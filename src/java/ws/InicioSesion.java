package ws;

import db.db;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import clases.Usuario;

@WebService(serviceName = "InicioSesion")
public class InicioSesion {

    @WebMethod(operationName = "login")
    public Usuario login(@WebParam(name = "usuario") String usuario, @WebParam(name = "password") String password) {
        db.llenarDB();
        for (Usuario u : db.usuarios) {
            if (u.getUsuario_usu().equals(usuario) && u.getPassword_usu().equals(password)) {
                return u;
            }
        }
        return null;
    }

    @WebMethod(operationName = "euroAdolar")
    public Double euroAdolar(@WebParam(name = "euros") double euros) {
        return euros * 1.15;
    }

    @WebMethod(operationName = "dolarEuro")
    public Double dolarEuro(@WebParam(name = "dolares") double dolares) {
        return dolares / 1.15;
    }
}
