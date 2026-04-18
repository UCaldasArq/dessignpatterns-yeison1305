package edu.ucaldas.creational;

// Patrón Factory Method.
// ShapeFactory crea objetos Shape según el tipo recibido como String.

public class ShapeFactory {
    public Shape createShape(String type) {
        if (type == null) {
            return null;
        }
        switch (type) {
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            default:
                return null;
        }
    }
}

class Circle implements Shape {
    @Override
    public String draw() {
        return "Dibujando un círculo.";
    }
}

class Square implements Shape {
    @Override
    public String draw() {
        return "Dibujando un cuadrado.";
    }
}
