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

public class UsuarioRolDAO implements CRUDUR{
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex = new Conexion();
    int res;
    String msg;
    UsuarioRol c = new UsuarioRol();
    @Override
    public List listar(){
        List < UsuarioRol > datos = new ArrayList < > ();
        String sql = "select * from usurol";
        try {
            con = conex.getConection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                UsuarioRol c = new UsuarioRol();
                c.setIdur(rs.getInt("idur"));
                c.setId(rs.getInt("id"));
                c.setIdr(rs.getInt("idr"));
                c.setEstado(rs.getInt("estado"));
                datos.add(c);
            }
        } catch (Exception e) {}
        return datos;
    }
        public List listarID(){
        List < UsuarioRol > datos = new ArrayList < > ();
        String sql = "select * from usurol";
        try {
            con = conex.getConection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                UsuarioRol c = new UsuarioRol();
                c.setIdur(rs.getInt("idur"));
                c.setId(rs.getInt("id"));
                c.setIdr(rs.getInt("idr"));
                c.setEstado(rs.getInt("estado"));
                datos.add(c);
            }
        } catch (Exception e) {}
        return datos;
    }
            public List add(){
        List < UsuarioRol > datos = new ArrayList < > ();
        String sql = "select * from usurol";
        try {
            con = conex.getConection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                UsuarioRol c = new UsuarioRol();
                c.setIdur(rs.getInt("idur"));
                c.setId(rs.getInt("id"));
                c.setIdr(rs.getInt("idr"));
                c.setEstado(rs.getInt("estado"));
                datos.add(c);
            }
        } catch (Exception e) {}
        return datos;
    }
                public List edit(){
        List < UsuarioRol > datos = new ArrayList < > ();
        String sql = "select * from usurol";
        try {
            con = conex.getConection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                UsuarioRol c = new UsuarioRol();
                c.setIdur(rs.getInt("idur"));
                c.setId(rs.getInt("id"));
                c.setIdr(rs.getInt("idr"));
                c.setEstado(rs.getInt("estado"));
                datos.add(c);
            }
        } catch (Exception e) {}
        return datos;
    }
        public List delete(){
        List < UsuarioRol > datos = new ArrayList < > ();
        String sql = "select * from usurol";
        try {
            con = conex.getConection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                UsuarioRol c = new UsuarioRol();
                c.setIdur(rs.getInt("idur"));
                c.setId(rs.getInt("id"));
                c.setIdr(rs.getInt("idr"));
                c.setEstado(rs.getInt("estado"));
                datos.add(c);
            }
        } catch (Exception e) {
        }
        return datos;
    }

@Override
public UsuarioRol listarID(int idur) {
    String sql = "select * from usurol where idur=" + idur;
    try {
        con = conex.getConection();
        ps = (PreparedStatement) con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            c.setIdur(rs.getInt("idur"));
            c.setId(rs.getInt("id"));
            c.setIdr(rs.getInt("idr"));
            c.setEstado(rs.getInt("estado"));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return c;
}
@Override
public String add(int id, int idr, int estado) {
        String sql = "insert into usurol(id,idr,estado) values(?,?,?)";
        try {
            con = conex.getConection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.setInt(2, idr);
            ps.setInt(3, estado);
            res = ps.executeUpdate();
            if (res == 1) {
                msg = "Se Asigno correctamente el rol al usuario";
            } else {
                msg = "No se Asigno correctamente el rol al usuario";
            }
        } catch (Exception e) {
            //e.println("Error"+e.getMessage());
            e.printStackTrace();
            
        }
        return msg;
    
}
@Override
public String edit(int idur,int id, int idr, int estado)
{
    String sql="update usurol set id=?,idr=?,estado=? where idur="+idur;
    try 
    {
        con=conex.getConection();
        ps=con.prepareStatement(sql);
        ps.setInt(1,id);
        ps.setInt(2,idr);
        ps.setInt(3,estado);
        res=ps.executeUpdate();
        if (res==1){
            msg="Usuario-Rol Actualizado";
            
        }else {
            msg="Usuario-Rol no Actualizado";
            
        }
        
    } catch (Exception e) {
        e.printStackTrace();
        
    }
            return msg;
        }
        @Override
        public UsuarioRol delete(int idur) {
            String sql = "delete from usurol where idur=" + idur;
            try {
                con = conex.getConection();
                ps = con.prepareStatement(sql);
                res = ps.executeUpdate();
            } catch (Exception e) {}
            return c;
        }
}
