/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fachada;

import Servicio.Servicios;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Camilo
 */
@Stateless
@LocalBean
public class fachada {
    
    Servicios service = new Servicios();
    
    public boolean registrarNacido(String name){
       return  service.registerBirth(name);
    }
    
    public boolean registrarDefuncion(Long cedule){
       return  service.registerDeath(cedule);
    }
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

}
