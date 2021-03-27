/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.especialistajee.jbib.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author FUJITSU
 */
@Entity
public class EjemplarDomain implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String idEjemplar;
    private Date FechaAdquisicion;
    private String Observaciones;
    private Date fechaPrestamo;
    private Date fechaDevolucion;

    public String getidEjemplar() {
        return idEjemplar;
    }

    public void setidEjemplar(String idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public String getIdEjemplar() {
        return idEjemplar;
    }

    public void setIdEjemplar(String idEjemplar) {
        this.idEjemplar = idEjemplar;
    }

    public Date getFechaAdquisicion() {
        return FechaAdquisicion;
    }

    public void setFechaAdquisicion(Date FechaAdquisicion) {
        this.FechaAdquisicion = FechaAdquisicion;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEjemplar != null ? idEjemplar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EjemplarDomain)) {
            return false;
        }
        EjemplarDomain other = (EjemplarDomain) object;
        if ((this.idEjemplar == null && other.idEjemplar != null) || (this.idEjemplar != null && !this.idEjemplar.equals(other.idEjemplar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.especialistajee.jbib.model.EjemplarDomain[ id=" + idEjemplar + " ]";
    }

}
