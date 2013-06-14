/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webService;

import fachada.fachada;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Camilo
 */
@WebService(serviceName = "Report")
@Stateless()
public class RegistroWS {
    @EJB
    private fachada ejbRef;

    @WebMethod(operationName = "registrarNacido")
    public boolean registrarNacido(@WebParam(name = "name") String name) {
        return ejbRef.registrarNacido(name);
    }

    @WebMethod(operationName = "registrarDefuncion")
    public boolean registrarDefuncion(@WebParam(name = "cedule") Long cedule) {
        return ejbRef.registrarDefuncion(cedule);
    }
    
}
