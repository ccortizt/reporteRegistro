/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import javax.xml.namespace.QName;
import javax.xml.transform.Source;
import javax.xml.ws.Dispatch;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Service;
import java.io.StringReader;

/**
 *
 * @author Camilo
 */
public class Servicios {

    public boolean registerBirth(String name) {
        Servicio.PersonWS_Service service = new Servicio.PersonWS_Service();
        QName portQName = new QName("http://ws.dataejbsra.com/", "PersonWSPort");
        String req = "<registerBirth  xmlns=\"http://ws.dataejbsra.com/\"><name>"+name+"</name></registerBirth>";
        try {
            // Call Web Service Operation
            Dispatch<Source> sourceDispatch = null;
            sourceDispatch = service.createDispatch(portQName, Source.class, Service.Mode.PAYLOAD);
            Source result = sourceDispatch.invoke(new StreamSource(new StringReader(req)));
        } catch (Exception ex) {
            // TODO handle custom exceptions here
            return false;
        }
        return true;
    }

    public boolean registerDeath(Long cedule) {
        Servicio.PersonWS_Service service = new Servicio.PersonWS_Service();
        QName portQName = new QName("http://ws.dataejbsra.com/", "PersonWSPort");
        String req = "<registerDeath  xmlns=\"http://ws.dataejbsra.com/\"><cedule>"+cedule+"</cedule></registerDeath>";
        try {
            // Call Web Service Operation
            Dispatch<Source> sourceDispatch = null;
            sourceDispatch = service.createDispatch(portQName, Source.class, Service.Mode.PAYLOAD);
            Source result = sourceDispatch.invoke(new StreamSource(new StringReader(req)));
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
    
}
