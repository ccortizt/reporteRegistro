/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webService;

import fachada.Fachada;
import fachada.ROb;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Camilo
 */
@WebService(serviceName = "Report")
@Stateless()
public class RegistroWS {
     @EJB
    private Fachada ejbRef;

    @WebMethod(operationName = "registrarNacido")
    public ROb registrarNacido(@WebParam(name = "name") String name) {
        return ejbRef.registrarNacido(name);
    }

    @WebMethod(operationName = "registrarDefuncion")
    public ROb registrarDefuncion(@WebParam(name = "cedule") Long cedule) {
        return ejbRef.registrarDefuncion(cedule);
    }
    
}
