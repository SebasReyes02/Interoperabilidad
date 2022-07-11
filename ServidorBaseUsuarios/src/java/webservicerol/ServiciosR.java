/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservicerol;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Rol;
import modelo.RolDAO;


@WebService(serviceName = "ServiciosR")
public class ServiciosR {

RolDAO dao = new RolDAO();
@WebMethod(operationName = "listar")
public List<Rol> listar(){
    List datos=dao.listar();
    return datos;
}
@WebMethod(operationName = "agregar") public String agregar(@WebParam(name = "descripcion") String descripcion, @WebParam(name = "nivel") int nivel, @WebParam(name = "estado") int estado) {
    String datos = dao.add(descripcion,nivel, estado);
    return datos;
}
@WebMethod(operationName = "listarID") public Rol listarID(@WebParam(name = "idr") int idr) {
    Rol rol = dao.listarID(idr);
    return rol;
}
@WebMethod(operationName = "actualizar") public String actualizar(@WebParam(name = "idr") int idr,@WebParam(name = "descripcion") String descripcion, @WebParam(name = "nivel") int nivel, @WebParam(name = "estado") int estado) {
    String datos = dao.edit(idr,descripcion, nivel, estado);
    return datos;
}
@WebMethod(operationName = "Eliminar") public Rol Eliminar(@WebParam(name = "idr") int idr) {
    Rol c = dao.delete(idr);
    return c;
}
}