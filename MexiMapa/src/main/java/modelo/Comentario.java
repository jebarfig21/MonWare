package modelo;
// Generated 8/04/2019 09:44:45 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Comentario generated by hbm2java
 */
public class Comentario  implements java.io.Serializable {


     private int idcomentario;
     private Marcador marcador;
     private Usuario usuario;
     private String comentario;
     private float calificacion;
     private Date fecha;

    public Comentario() {
    }

	
    public Comentario(int idcomentario, Marcador marcador, Usuario usuario, float calificacion, Date fecha) {
        this.idcomentario = idcomentario;
        this.marcador = marcador;
        this.usuario = usuario;
        this.calificacion = calificacion;
        this.fecha = fecha;
    }
    public Comentario(int idcomentario, Marcador marcador, Usuario usuario, String comentario, float calificacion, Date fecha) {
       this.idcomentario = idcomentario;
       this.marcador = marcador;
       this.usuario = usuario;
       this.comentario = comentario;
       this.calificacion = calificacion;
       this.fecha = fecha;
    }
   
    public int getIdcomentario() {
        return this.idcomentario;
    }
    
    public void setIdcomentario(int idcomentario) {
        this.idcomentario = idcomentario;
    }
    public Marcador getMarcador() {
        return this.marcador;
    }
    
    public void setMarcador(Marcador marcador) {
        this.marcador = marcador;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getComentario() {
        return this.comentario;
    }
    
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public float getCalificacion() {
        return this.calificacion;
    }
    
    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }




}


