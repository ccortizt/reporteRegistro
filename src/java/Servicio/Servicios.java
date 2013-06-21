/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import fachada.ROb;


/**
 *
 * @author Camilo
 */
public class Servicios {
    
    public void registrarNacido(String nombre){
      Servicios.registerBirth(nombre);
    }
    public void registrarMuerte(Long cedule){
      Servicios.registerDeath(cedule);
    }

    public static ROb registerBirth(java.lang.String name) {
        fachada.PersonWS_Service service = new fachada.PersonWS_Service();
        fachada.PersonWS port = service.getPersonWSPort();
        return port.registerBirth(name);
    }

    public static ROb registerDeath(java.lang.Long cedule) {
        fachada.PersonWS_Service service = new fachada.PersonWS_Service();
        fachada.PersonWS port = service.getPersonWSPort();
        return port.registerDeath(cedule);
    }
   

}
