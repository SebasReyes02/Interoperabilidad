/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webserviceusu;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.Usuario;
import modelo.UsuarioDAO;


@WebService(serviceName = "Servicios")
public class Servicios {

UsuarioDAO dao = new UsuarioDAO();
@WebMethod(operationName = "listar")
public List<Usuario> listar(){
    List datos=dao.listar();
    return datos;
}
@WebMethod(operationName = "agregar") public String agregar(@WebParam(name = "usuario") String usuario,@WebParam(name = "contraseña") String contraseña,@WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "estado") int estado) {
    String datos = dao.add(usuario,contraseña,nombre, apellido, estado);
    return datos;
}
@WebMethod(operationName = "listarID") public Usuario listarID(@WebParam(name = "id") int id) {
    Usuario usuario = dao.listarID(id);
    return usuario;
}
@WebMethod(operationName = "actualizar") public String actualizar(@WebParam(name = "id") int id,@WebParam(name = "usuario") String usuario,@WebParam(name = "contraseña") String contraseña,@WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "estado") int estado) {
    String datos = dao.edit(id,usuario,contraseña,nombre, apellido, estado);
    return datos;
}
@WebMethod(operationName = "Eliminar") public Usuario Eliminar(@WebParam(name = "id") int id) {
    Usuario c = dao.delete(id);
    return c;
}
@WebMethod(operationName = "validar") public Usuario validar(@WebParam(name = "usuario") String usuario) {
    Usuario datos = dao.validar(usuario);
    return datos;
}
}
