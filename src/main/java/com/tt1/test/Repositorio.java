package com.tt1.test;

public class Repositorio {
    private DBStub db;

    public Repositorio(DBStub db) {
        this.db = db;
    }

    public ToDo encontrarTarea(String id) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void marcarCompletada(String id) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void guardarTarea(ToDo todo) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void guardarCorreo(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}
