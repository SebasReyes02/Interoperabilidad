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

public class RolDAO implements CRUDR{
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conex = new Conexion();
    int res;
    String msg;
    Rol c = new Rol();
    @Override
    public List listar(){
        List < Rol > datos = new ArrayList < > ();
        String sql = "select * from rol";
        try {
            con = conex.getConection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Rol c = new Rol();
                c.setIdr(rs.getInt("idr"));
                c.setDescripcion(rs.getString("descripcion"));
                c.setNivel(rs.getInt("nivel"));
                c.setEstado(rs.getInt("estado"));
                datos.add(c);
            }
        } catch (Exception e) {}
        return datos;
    }
        public List listarID(){
        List < Rol > datos = new ArrayList < > ();
        String sql = "select * from rol";
        try {
            con = conex.getConection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Rol c = new Rol();
                c.setIdr(rs.getInt("idr"));
                c.setDescripcion(rs.getString("descripcion"));
                c.setNivel(rs.getInt("nivel"));
                c.setEstado(rs.getInt("estado"));
                datos.add(c);
            }
        } catch (Exception e) {}
        return datos;
    }
            public List add(){
        List < Rol > datos = new ArrayList < > ();
        String sql = "select * from rol";
        try {
            con = conex.getConection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Rol c = new Rol();
                c.setIdr(rs.getInt("idr"));
                c.setDescripcion(rs.getString("descripcion"));
                c.setNivel(rs.getInt("nivel"));
                c.setEstado(rs.getInt("estado"));
                datos.add(c);
            }
        } catch (Exception e) {}
        return datos;
    }
                public List edit(){
        List < Rol > datos = new ArrayList < > ();
        String sql = "select * from rol";
        try {
            con = conex.getConection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Rol c = new Rol();
                c.setIdr(rs.getInt("idr"));
                c.setDescripcion(rs.getString("descripcion"));
                c.setNivel(rs.getInt("nivel"));
                c.setEstado(rs.getInt("estado"));
                datos.add(c);
            }
        } catch (Exception e) {}
        return datos;
    }
        public List delete(){
        List < Rol > datos = new ArrayList < > ();
        String sql = "select * from rol";
        try {
            con = conex.getConection();
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Rol c = new Rol();
                c.setIdr(rs.getInt("idr"));
                c.setDescripcion(rs.getString("descripcion"));
                c.setNivel(rs.getInt("nivel"));
                c.setEstado(rs.getInt("estado"));
                datos.add(c);
            }
        } catch (Exception e) {
        }
        return datos;
    }

@Override
public Rol listarID(int idr) {
    String sql = "select * from rol where idr=" + idr;
    try {
        con = conex.getConection();
        ps = (PreparedStatement) con.prepareStatement(sql);
        rs = ps.executeQuery();
        while (rs.next()) {
            c.setIdr(rs.getInt("idr"));
            c.setDescripcion(rs.getString("descripcion"));
            c.setNivel(rs.getInt("nivel"));
            c.setEstado(rs.getInt("estado"));
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return c;
}
@Override
public String add(String descripcion, int nivel, int estado) {
        String sql = "insert into rol(descripcion,nivel,estado) values(?,?,?)";
        try {
            con = conex.getConection();
            ps = con.prepareStatement(sql);
            ps.setString(1, descripcion);
            ps.setInt(2, nivel);
            ps.setInt(3, estado);
            res = ps.executeUpdate();
            if (res == 1) {
                msg = "Rol Agregado";
            } else {
                msg = "EL Rol no fue Agregado";
            }
        } catch (Exception e) {
            //e.println("Error"+e.getMessage());
            e.printStackTrace();
            
        }
        return msg;
    
}
@Override
public String edit(int idr,String descripcion, int nivel, int estado)
{
    String sql="update rol set descripcion=?,nivel=?,estado=? where idr="+idr;
    try 
    {
        con=conex.getConection();ps=con.prepareStatement(sql);
        ps.setString(1,descripcion);ps.setInt(2,nivel);
        ps.setInt(3,estado);res=ps.executeUpdate();
        if (res==1){
            msg="Rol Actualizado";
            
        }else {
            msg="Rol no Actualizado";
            
        }
        
    } catch (Exception e) {
        e.printStackTrace();
        
    }
            return msg;
        }
        @Override
        public Rol delete(int idr) {
            String sql = "delete from rol where idr=" + idr;
            try {
                con = conex.getConection();
                ps = con.prepareStatement(sql);
                res = ps.executeUpdate();
            } catch (Exception e) {}
            return c;
        }
}
