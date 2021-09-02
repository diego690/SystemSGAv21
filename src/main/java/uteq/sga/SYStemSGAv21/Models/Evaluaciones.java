/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uteq.sga.SYStemSGAv21.Models;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author capur
 */
@Entity
@Table(name = "evaluaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Evaluaciones.findAll", query = "SELECT e FROM Evaluaciones e"),
    @NamedQuery(name = "Evaluaciones.findByIdevaluacion", query = "SELECT e FROM Evaluaciones e WHERE e.idevaluacion = :idevaluacion"),
    @NamedQuery(name = "Evaluaciones.findByDescripcion", query = "SELECT e FROM Evaluaciones e WHERE e.descripcion = :descripcion"),
    @NamedQuery(name = "Evaluaciones.findByUnidad", query = "SELECT e FROM Evaluaciones e WHERE e.unidad = :unidad"),
    @NamedQuery(name = "Evaluaciones.findByTarea", query = "SELECT e FROM Evaluaciones e WHERE e.tarea = :tarea"),
    @NamedQuery(name = "Evaluaciones.findByPuntaje", query = "SELECT e FROM Evaluaciones e WHERE e.puntaje = :puntaje"),
    @NamedQuery(name = "Evaluaciones.findByFechaevaluacion", query = "SELECT e FROM Evaluaciones e WHERE e.fechaevaluacion = :fechaevaluacion")})
public class Evaluaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idevaluacion", nullable = false)
    private Integer idevaluacion;
    @Basic(optional = false)
    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;
    @Basic(optional = false)
    @Column(name = "unidad", nullable = false, length = 50)
    private String unidad;
    @Basic(optional = false)
    @Column(name = "tarea", nullable = false, length = 50)
    private String tarea;
    @Basic(optional = false)
    @Column(name = "puntaje", nullable = false)
    private int puntaje;
    @Basic(optional = false)
    @Column(name = "fechaevaluacion", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaevaluacion;
    @JoinColumn(name = "idasignatura", referencedColumnName = "idasignatura", nullable = false)
    @ManyToOne(optional = false)
    private Asignaturas idasignatura;
    @JoinColumn(name = "iddocente", referencedColumnName = "iddocente", nullable = false)
    @ManyToOne(optional = false)
    private Docentes iddocente;
    @JoinColumn(name = "idestudiante", referencedColumnName = "idestudiante", nullable = false)
    @ManyToOne(optional = false)
    private Estudiantes idestudiante;

    public Evaluaciones() {
    }

    public Evaluaciones(Integer idevaluacion) {
        this.idevaluacion = idevaluacion;
    }

    public Evaluaciones(Integer idevaluacion, String descripcion, String unidad, String tarea, int puntaje, Date fechaevaluacion) {
        this.idevaluacion = idevaluacion;
        this.descripcion = descripcion;
        this.unidad = unidad;
        this.tarea = tarea;
        this.puntaje = puntaje;
        this.fechaevaluacion = fechaevaluacion;
    }

    public Integer getIdevaluacion() {
        return idevaluacion;
    }

    public void setIdevaluacion(Integer idevaluacion) {
        this.idevaluacion = idevaluacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public Date getFechaevaluacion() {
        return fechaevaluacion;
    }

    public void setFechaevaluacion(Date fechaevaluacion) {
        this.fechaevaluacion = fechaevaluacion;
    }

    public Asignaturas getIdasignatura() {
        return idasignatura;
    }

    public void setIdasignatura(Asignaturas idasignatura) {
        this.idasignatura = idasignatura;
    }

    public Docentes getIddocente() {
        return iddocente;
    }

    public void setIddocente(Docentes iddocente) {
        this.iddocente = iddocente;
    }

    public Estudiantes getIdestudiante() {
        return idestudiante;
    }

    public void setIdestudiante(Estudiantes idestudiante) {
        this.idestudiante = idestudiante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idevaluacion != null ? idevaluacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evaluaciones)) {
            return false;
        }
        Evaluaciones other = (Evaluaciones) object;
        if ((this.idevaluacion == null && other.idevaluacion != null) || (this.idevaluacion != null && !this.idevaluacion.equals(other.idevaluacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "uteq.sga.SYStemSGAv21.Models.Evaluaciones[ idevaluacion=" + idevaluacion + " ]";
    }
    
}
