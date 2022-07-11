/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.util.List;


public interface CRUDR{
    public List listar();
    public Rol listarID(int idr);
    public String add(String descripcion,int nivel, int estado);
    public String edit(int idr,String descripcion,int nivel, int estado);
    public Rol delete(int idr);
}
