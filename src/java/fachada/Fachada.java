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
public class Fachada {

    public ROb registrarNacido(String name) {
        return Servicios.registerBirth(name);
    }

    public ROb registrarDefuncion(Long cedule) {
        return Servicios.registerDeath(cedule);
    }
}
