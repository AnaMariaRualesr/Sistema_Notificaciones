package Model;

import Enums.EstadoNotificacion;
import Enums.TipoNotificacion;

public class NotificacionSMS extends Notificacion {

    private String numeroTelefono;

    public NotificacionSMS(String codigo, String destinatario, String mensaje,
                            TipoNotificacion tipo, String numeroTelefono) {
        super(codigo, destinatario, mensaje, tipo);
        this.numeroTelefono = numeroTelefono;
    }

    public NotificacionSMS() {
        super();
        this.numeroTelefono = "";
    }

    public String getNumeroTelefono() { return numeroTelefono; }
    public void setNumeroTelefono(String numeroTelefono) { this.numeroTelefono = numeroTelefono; }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS...");
        System.out.println("   Para: " + numeroTelefono);
        System.out.println("   Mensaje: " + getMensaje());
        setEstado(EstadoNotificacion.ENVIADA);
        System.out.println("   Estado: " + getEstado());
    }

    @Override
    public String toString() {
        return "NotificacionSMS{" +
                super.toString() +
                ", numeroTelefono=" + numeroTelefono +
                '}';
    }
}