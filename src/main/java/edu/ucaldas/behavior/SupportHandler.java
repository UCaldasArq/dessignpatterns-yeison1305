package edu.ucaldas.behavior;

// Patrón Chain of Responsibility.
// Tres manejadores concretos encadenados: Basic → Supervisor → Manager.
// Cada uno maneja su tipo de solicitud o la pasa al siguiente.

class BasicSupportHandler extends Handler {
    @Override
    public String handleRequest(String request) {
        if ("básica".equals(request)) {
            return "Atendido por Soporte Básico";
        }
        if (next != null) {
            return next.handleRequest(request);
        }
        return "No se puede atender la solicitud.";
    }
}

class SupervisorHandler extends Handler {
    @Override
    public String handleRequest(String request) {
        if ("intermedia".equals(request)) {
            return "Atendido por Supervisor";
        }
        if (next != null) {
            return next.handleRequest(request);
        }
        return "No se puede atender la solicitud.";
    }
}

class ManagerHandler extends Handler {
    @Override
    public String handleRequest(String request) {
        if ("avanzada".equals(request)) {
            return "Atendido por Gerente";
        }
        if (next != null) {
            return next.handleRequest(request);
        }
        return "No se puede atender la solicitud.";
    }
}

public class SupportHandler {
    public static Handler createChain() {
        BasicSupportHandler basic = new BasicSupportHandler();
        SupervisorHandler supervisor = new SupervisorHandler();
        ManagerHandler manager = new ManagerHandler();

        basic.setNext(supervisor);
        supervisor.setNext(manager);

        return basic;
    }
}
