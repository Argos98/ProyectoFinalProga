package cr.ac.ucenfotec.bl;

    import java.util.Date;
    import java.time.LocalDateTime;

public class Actividad  {

    private String qHizo;
    private Date fechaInicio;
    private Date fechaFin;
   // luego cambiarlo a un localthetime
    private String horaIncio;
    private String horaFin;

    public Actividad() {
    }

    public Actividad(String qHizo, Date fechaInicio, Date fechaFin, String horaIncio, String horaFin) {
        this.qHizo = qHizo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horaIncio = horaIncio;
        this.horaFin = horaFin;
    }

    public String getqHizo() {
        return qHizo;
    }

    public void setqHizo(String qHizo) {
        this.qHizo = qHizo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getHoraIncio() {
        return horaIncio;
    }

    public void setHoraIncio(String horaIncio) {
        this.horaIncio = horaIncio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

    @Override
    public String toString() {
        return "Actividad{" + "qHizo=" + qHizo + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", horaIncio=" + horaIncio + ", horaFin=" + horaFin + '}';
    }

   
    
}
