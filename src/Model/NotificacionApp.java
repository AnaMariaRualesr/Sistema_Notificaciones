package Model;

import Enums.EstadoNotificacion;
import Enums.TipoNotificacion;

public class NotificacionApp extends Notificacion {

    private String idDispositivo;
    private String tipoAlerta;

    public NotificacionApp(String codigo, String destinatario, String mensaje,
                            TipoNotificacion tipo, String idDispositivo, String tipoAlerta) {
        super(codigo, destinatario, mensaje, tipo);
        this.idDispositivo = idDispositivo;
        this.tipoAlerta = tipoAlerta;
    }

    public NotificacionApp() {
        super();
        this.idDispositivo = "";
        this.tipoAlerta = "";
    }

    public String getIdDispositivo() { return idDispositivo; }
    public void setIdDispositivo(String idDispositivo) { this.idDispositivo = idDispositivo; }

    public String getTipoAlerta() { return tipoAlerta; }
    public void setTipoAlerta(String tipoAlerta) { this.tipoAlerta = tipoAlerta; }

    @Override
    public void enviar() {
        System.out.println("Enviando NOTIFICACION APP...");
        System.out.println("   Dispositivo: " + idDispositivo);
        System.out.println("   Tipo de alerta: " + tipoAlerta);
        System.out.println("   Mensaje: " + getMensaje());
        setEstado(EstadoNotificacion.ENVIADA);
        System.out.println("   Estado: " + getEstado());
    }

    @Override
    public String toString() {
        return "NotificacionApp{" +
                super.toString() +
                ", idDispositivo=" + idDispositivo +
                ", tipoAlerta=" + tipoAlerta +
                '}';
    }
}