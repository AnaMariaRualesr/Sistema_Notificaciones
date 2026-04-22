package Model;

import Enums.EstadoNotificacion;
import Enums.TipoNotificacion;
import java.time.LocalDate;

public abstract class Notificacion {

    private String codigo;
    private String destinatario;
    private String mensaje;
    private LocalDate fechaEnvio;
    private EstadoNotificacion estado;
    private TipoNotificacion tipo;

    public Notificacion(String codigo, String destinatario, String mensaje, TipoNotificacion tipo) {
        this.codigo = codigo;
        this.destinatario = destinatario;
        this.mensaje = mensaje;
        this.tipo = tipo;
        this.fechaEnvio = LocalDate.now();
        this.estado = EstadoNotificacion.PENDIENTE;
    }

    public Notificacion() {
        this.codigo = "";
        this.destinatario = "";
        this.mensaje = "";
        this.fechaEnvio = LocalDate.now();
        this.estado = EstadoNotificacion.PENDIENTE;
        this.tipo = null;
    }

    public abstract void enviar();

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getDestinatario() { return destinatario; }
    public void setDestinatario(String destinatario) { this.destinatario = destinatario; }

    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }

    public LocalDate getFechaEnvio() { return fechaEnvio; }
    public void setFechaEnvio(LocalDate fechaEnvio) { this.fechaEnvio = fechaEnvio; }

    public EstadoNotificacion getEstado() { return estado; }
    public void setEstado(EstadoNotificacion estado) { this.estado = estado; }

    public TipoNotificacion getTipo() { return tipo; }
    public void setTipo(TipoNotificacion tipo) { this.tipo = tipo; }

    @Override
    public String toString() {
        return "codigo=" + codigo +
                ", destinatario=" + destinatario +
                ", mensaje=" + mensaje +
                ", fechaEnvio=" + fechaEnvio +
                ", estado=" + estado +
                ", tipo=" + tipo;
    }
}

