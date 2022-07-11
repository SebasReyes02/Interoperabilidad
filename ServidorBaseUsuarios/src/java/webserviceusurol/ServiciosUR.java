/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webserviceusurol;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.UsuarioRol;
import modelo.UsuarioRolDAO;


@WebService(serviceName = "ServiciosUR")
public class ServiciosUR {

UsuarioRolDAO dao = new UsuarioRolDAO();
@WebMethod(operationName = "listar")
public List<UsuarioRol> listar(){
    List datos=dao.listar();
    return datos;
}
@WebMethod(operationName = "agregar") public String agregar(@WebParam(name = "id") int id, @WebParam(name = "idr") int idr, @WebParam(name = "estado") int estado) {
    String datos = dao.add(id,idr, estado);
    return datos;
}
@WebMethod(operationName = "listarID") public UsuarioRol listarID(@WebParam(name = "idur") int idur) {
    UsuarioRol usurol = dao.listarID(idur);
    return usurol;
}
@WebMethod(operationName = "actualizar") public String actualizar(@WebParam(name = "idur") int idur,@WebParam(name = "id") int id, @WebParam(name = "idr") int idr, @WebParam(name = "estado") int estado) {
    String datos = dao.edit(idur,id, idr, estado);
    return datos;
}
@WebMethod(operationName = "Eliminar") public UsuarioRol Eliminar(@WebParam(name = "idur") int idur) {
    UsuarioRol c = dao.delete(idur);
    return c;
}
}