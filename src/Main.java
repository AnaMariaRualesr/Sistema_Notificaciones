import Enums.TipoNotificacion;
import Model.NotificacionApp;
import Model.NotificacionEmail;
import Model.NotificacionSMS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("== Sistema de Notificaciones - Universidad ==");

        // ── Notificación EMAIL ─────────────────────────────────────────

        System.out.println("\nVamos a registrar una Notificacion por EMAIL");

        System.out.print("Codigo: ");
        String codigoEmail = input.nextLine();
        System.out.print("Destinatario: ");
        String destinatarioEmail = input.nextLine();
        System.out.print("Mensaje: ");
        String mensajeEmail = input.nextLine();
        System.out.print("Asunto: ");
        String asunto = input.nextLine();
        System.out.print("Direccion de email: ");
        String direccionEmail = input.nextLine();

        System.out.println("Seleccione el tipo de notificacion:");
        System.out.println("1 - PUBLICACION DE CALIFICACIONES");
        System.out.println("2 - RECORDATORIO DE PAGO");
        System.out.println("3 - AVISO CANCELACION DE CLASE");
        System.out.println("4 - CONFIRMACION DE INSCRIPCION");
        System.out.print("Opcion: ");
        int opcionEmail = input.nextInt();
        input.nextLine();

        TipoNotificacion tipoEmail;
        switch (opcionEmail) {
            case 2: tipoEmail = TipoNotificacion.RECORDATORIO_PAGO; break;
            case 3: tipoEmail = TipoNotificacion.AVISO_CANCELACION_CLASE; break;
            case 4: tipoEmail = TipoNotificacion.CONFIRMACION_INSCRIPCION; break;
            default: tipoEmail = TipoNotificacion.PUBLICACION_CALIFICACIONES; break;
        }

        NotificacionEmail miEmail = new NotificacionEmail(
                codigoEmail, destinatarioEmail, mensajeEmail,
                tipoEmail, asunto, direccionEmail
        );

        // ── Notificación SMS ───────────────────────────────────────────

        System.out.println("\nVamos a registrar una Notificacion por SMS");

        System.out.print("Codigo: ");
        String codigoSMS = input.nextLine();
        System.out.print("Destinatario: ");
        String destinatarioSMS = input.nextLine();
        System.out.print("Mensaje: ");
        String mensajeSMS = input.nextLine();
        System.out.print("Numero de telefono: ");
        String numeroTelefono = input.nextLine();

        System.out.println("Seleccione el tipo de notificacion:");
        System.out.println("1 - PUBLICACION DE CALIFICACIONES");
        System.out.println("2 - RECORDATORIO DE PAGO");
        System.out.println("3 - AVISO CANCELACION DE CLASE");
        System.out.println("4 - CONFIRMACION DE INSCRIPCION");
        System.out.print("Opcion: ");
        int opcionSMS = input.nextInt();
        input.nextLine();

        TipoNotificacion tipoSMS;
        switch (opcionSMS) {
            case 2: tipoSMS = TipoNotificacion.RECORDATORIO_PAGO; break;
            case 3: tipoSMS = TipoNotificacion.AVISO_CANCELACION_CLASE; break;
            case 4: tipoSMS = TipoNotificacion.CONFIRMACION_INSCRIPCION; break;
            default: tipoSMS = TipoNotificacion.PUBLICACION_CALIFICACIONES; break;
        }

        NotificacionSMS miSMS = new NotificacionSMS(
                codigoSMS, destinatarioSMS, mensajeSMS,
                tipoSMS, numeroTelefono
        );

        // ── Notificación APP ───────────────────────────────────────────

        System.out.println("\nVamos a registrar una Notificacion por APP");

        System.out.print("Codigo: ");
        String codigoApp = input.nextLine();
        System.out.print("Destinatario: ");
        String destinatarioApp = input.nextLine();
        System.out.print("Mensaje: ");
        String mensajeApp = input.nextLine();
        System.out.print("ID del dispositivo: ");
        String idDispositivo = input.nextLine();
        System.out.print("Tipo de alerta: ");
        String tipoAlerta = input.nextLine();

        System.out.println("Seleccione el tipo de notificacion:");
        System.out.println("1 - PUBLICACION DE CALIFICACIONES");
        System.out.println("2 - RECORDATORIO DE PAGO");
        System.out.println("3 - AVISO CANCELACION DE CLASE");
        System.out.println("4 - CONFIRMACION DE INSCRIPCION");
        System.out.print("Opcion: ");
        int opcionApp = input.nextInt();
        input.nextLine();

        TipoNotificacion tipoApp;
        switch (opcionApp) {
            case 2: tipoApp = TipoNotificacion.RECORDATORIO_PAGO; break;
            case 3: tipoApp = TipoNotificacion.AVISO_CANCELACION_CLASE; break;
            case 4: tipoApp = TipoNotificacion.CONFIRMACION_INSCRIPCION; break;
            default: tipoApp = TipoNotificacion.PUBLICACION_CALIFICACIONES; break;
        }

        NotificacionApp miApp = new NotificacionApp(
                codigoApp, destinatarioApp, mensajeApp,
                tipoApp, idDispositivo, tipoAlerta
        );


        // ── Envío Y Resultados ─────────────────────────────────────────

        System.out.println("\n== ENVIANDO NOTIFICACIONES ==\n");
        miEmail.enviar();
        System.out.println();
        miSMS.enviar();
        System.out.println();
        miApp.enviar();

        System.out.println("\n== DATOS REGISTRADOS ==\n");
        System.out.println(miEmail);
        System.out.println(miSMS);
        System.out.println(miApp);

        input.close();
    }
}