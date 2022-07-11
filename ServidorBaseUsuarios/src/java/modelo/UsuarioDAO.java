/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements CRUD{
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex = new Conexion();
    int res;
    int r=0;
    String msg;
    Usuario c = new Usuario();
    
    @Override
    public Usuario validar(String usuario){
        String sql = "select * from usuario where usuario=?" ;
        try {
            con = conex.getConection();
        ps = (PreparedStatement) con.prepareStatement(sql);
        ps.setString(1, usuario);
         rs=ps.executeQuery();
        while (rs.next()) {
            c.setId(rs.getInt("id"));
            c.setUsuario(rs.getString("usuario"));
            c.setContraseña(rs.getString("contraseña"));
            c.setNombre(rs.getString("nombre"));
            c.setApellido(rs.getString("apellido"));
            c.setEstado(rs.getInt("estado"));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return c;
    }
    public List validar(){
        List < Usuario > datos = new ArrayList < > ();
        String sql = "select * from usuario";
        try {
            con = conex.getConection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuario c = new Usuario();
                c.setId(rs.getInt("id"));
                c.setUsuario(rs.getString("usuario"));
                c.setContraseña(rs.getString("contraseña"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setEstado(rs.getInt("estado"));
                datos.add(c);
            }
        } catch (Exception e) {}
        return datos;
    }
    
    @Override
    public List listar(){
        List < Usuario > datos = new ArrayList < > ();
        String sql = "select * from usuario";
        try {
            con = conex.getConection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuario c = new Usuario();
                c.setId(rs.getInt("id"));
                c.setUsuario(rs.getString("usuario"));
                c.setContraseña(rs.getString("contraseña"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setEstado(rs.getInt("estado"));
                datos.add(c);
            }
        } catch (Exception e) {}
        return datos;
    }
        public List listarID(){
        List < Usuario > datos = new ArrayList < > ();
        String sql = "select * from usuario";
        try {
            con = conex.getConection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuario c = new Usuario();
                c.setId(rs.getInt("id"));
                c.setUsuario(rs.getString("usuario"));
                c.setContraseña(rs.getString("contraseña"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setEstado(rs.getInt("estado"));
                datos.add(c);
            }
        } catch (Exception e) {}
        return datos;
    }
            public List add(){
        List < Usuario > datos = new ArrayList < > ();
        String sql = "select * from usuario";
        try {
            con = conex.getConection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuario c = new Usuario();
                c.setId(rs.getInt("id"));
                c.setUsuario(rs.getString("usuario"));
                c.setContraseña(rs.getString("contraseña"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setEstado(rs.getInt("estado"));
                datos.add(c);
            }
        } catch (Exception e) {}
        return datos;
    }
                public List edit(){
        List < Usuario > datos = new ArrayList < > ();
        String sql = "select * from usuario";
        try {
            con = conex.getConection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuario c = new Usuario();
                c.setId(rs.getInt("id"));
                c.setUsuario(rs.getString("usuario"));
                c.setContraseña(rs.getString("contraseña"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setEstado(rs.getInt("estado"));
                datos.add(c);
            }
        } catch (Exception e) {}
        return datos;
    }
        public List delete(){
        List < Usuario > datos = new ArrayList < > ();
        String sql = "select * from usuario";
        try {
            con = conex.getConection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Usuario c = new Usuario();
                c.setId(rs.getInt("id"));
                c.setUsuario(rs.getString("usuario"));
                c.setContraseña(rs.getString("contraseña"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setEstado(rs.getInt("estado"));
                datos.add(c);
            }
        } catch (Exception e) {
        }
        return datos;
    }

@Override
public Usuario listarID(int id) {
    String sql = "select * from usuario where id=" + id;
    try {
        con = conex.getConection();
        ps = (PreparedStatement) con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            c.setId(rs.getInt("id"));
            c.setUsuario(rs.getString("usuario"));
            c.setContraseña(rs.getString("contraseña"));
            c.setNombre(rs.getString("nombre"));
            c.setApellido(rs.getString("apellido"));
            c.setEstado(rs.getInt("estado"));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return c;
}
@Override
public String add(String usuario,String contraseña,String nombre, String apellido, int estado) {
        String sql = "insert into usuario(usuario,contraseña,nombre,apellido,estado) values(?,?,?,?,?)";
        try {
            con = conex.getConection();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            ps.setString(3, nombre);
            ps.setString(4, apellido);
            ps.setInt(5, estado);
            res = ps.executeUpdate();
            if (res == 1) {
                msg = "Usuario Agregado";
            } else {
                msg = "Usuario no fue Agregado";
            }
        } catch (Exception e) {
            //e.println("Error"+e.getMessage());
            e.printStackTrace();
            
        }
        return msg;
    
}
@Override
public String edit(int id, String usuario, String contraseña, String nombre, String apellido, int estado)
{
    String sql="update usuario set usuario=?,contraseña=?,nombre=?,apellido=?,estado=? where id="+id;
    try 
    {
        con=conex.getConection();
        ps=con.prepareStatement(sql);
            ps.setString(1, usuario);
            ps.setString(2, contraseña);
            ps.setString(3, nombre);
            ps.setString(4, apellido);
            ps.setInt(5, estado);
        res=ps.executeUpdate();
        if (res==1){
            msg="Usuario Actualizado";
            
        }else {
            msg="Usuario no Actualizado";
            
        }
        
    } catch (Exception e) {
        e.printStackTrace();
        
    }
            return msg;
        }
        @Override
        public Usuario delete(int id) {
            String sql = "delete from usuario where id=" + id;
            try {
                con = conex.getConection();
                ps = con.prepareStatement(sql);
                res = ps.executeUpdate();
            } catch (Exception e) {}
            return c;
        }
}
