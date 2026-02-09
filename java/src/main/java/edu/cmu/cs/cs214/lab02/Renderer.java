package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Renderer {
    // Renderer нь зөвхөн Shape interface-с хамаарах болгож сайжруулсан

    private Shape shape;

    public Renderer(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        System.out.println("Area = " + shape.getArea());
    }
}

