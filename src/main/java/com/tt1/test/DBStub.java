package com.tt1.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DBStub {
    private HashMap<String, ToDo> bdTareas;
    private List<String> emails;

    public DBStub() {
        bdTareas = new HashMap<>();
        emails = new ArrayList<>();
    }

    public void subirTareas(ToDo tarea) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public ToDo recuperarTarea() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void actualizarTarea(ToDo tarea) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void eliminarTarea(ToDo tarea) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public List<ToDo> obtenerTodasTareas() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void agregarEmail(String email) {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    public void listarEmails() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("Clase aún no implementada.");
    }
}


