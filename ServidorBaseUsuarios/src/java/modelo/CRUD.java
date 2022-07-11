/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.util.List;

public interface CRUD{
    public List listar();
    public Usuario listarID(int id);
    public String add(String usuario,String contraseña,String nombre, String apellido, int estado);
    public String edit(int id,String usuario,String contraseña,String nombre, String apellido, int estado);
    public Usuario delete(int id);
    public Usuario validar(String usuario);

}

