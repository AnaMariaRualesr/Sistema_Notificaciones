package Model;

import Enums.EstadoNotificacion;
import Enums.TipoNotificacion;

public class NotificacionEmail extends Notificacion {

    private String asunto;
    private String direccionEmail;

    public NotificacionEmail(String codigo, String destinatario, String mensaje,
                              TipoNotificacion tipo, String asunto, String direccionEmail) {
        super(codigo, destinatario, mensaje, tipo);
        this.asunto = asunto;
        this.direccionEmail = direccionEmail;
    }

    public NotificacionEmail() {
        super();
        this.asunto = "";
        this.direccionEmail = "";
    }

    public String getAsunto() { return asunto; }
    public void setAsunto(String asunto) { this.asunto = asunto; }

    public String getDireccionEmail() { return direccionEmail; }
    public void setDireccionEmail(String direccionEmail) { this.direccionEmail = direccionEmail; }

    @Override
    public void enviar() {
        System.out.println("Enviando EMAIL...");
        System.out.println("   Para: " + direccionEmail);
        System.out.println("   Asunto: " + asunto);
        System.out.println("   Mensaje: " + getMensaje());
        setEstado(EstadoNotificacion.ENVIADA);
        System.out.println("   Estado: " + getEstado());
    }

    @Override
    public String toString() {
        return "NotificacionEmail{" +
                super.toString() +
                ", asunto=" + asunto +
                ", direccionEmail=" + direccionEmail +
                '}';
    }
}