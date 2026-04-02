package com.tt1.test;

import java.time.LocalDate;
import java.util.List;

public class Servicio {
    private Repositorio repositorio;
    private MailerStub mailer;

    public Servicio(Repositorio repositorio, MailerStub mailer) {
        this.repositorio = repositorio;
        this.mailer = mailer;
    }

    public void crearTarea(String nombre, LocalDate fechaLimite) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void agregarCorreo(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void marcarCompletada(String id) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<ToDo> listarSinCompletar() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    private void verificarYAlertarPasadas() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}
