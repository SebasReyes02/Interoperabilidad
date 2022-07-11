/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.List;


public interface CRUDUR{
    public List listar();
    public UsuarioRol listarID(int idur);
    public String add(int id,int idr, int estado);
    public String edit(int idur,int id,int idr, int estado);
    public UsuarioRol delete(int idur);
}

