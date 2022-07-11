/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


public class UsuarioRol {
    int idur;
    int id;
    int idr;
    int estado;
    public UsuarioRol() {}
    
    public UsuarioRol(int idur, int id,int idr, int estado) {
        this.idur = idur;
        this.id = id;
        this.idr=idr;
        this.estado = estado;
    }
    public int getIdur() {
        return idur;
    }
    public void setIdur(int idur) {
        this.idur = idur;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public int getIdr() {
        return idr;
    }
    public void setIdr (int idr) {
        this.idr = idr;
    }
    public int getEstado() {
        return estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }
}

