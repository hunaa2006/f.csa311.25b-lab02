package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Rectangle;
import edu.cmu.cs.cs214.lab02.shapes.Shape;

public class Main {
    // Main класс дээр Rectangle объектыг Shape интерфейсээр дамжуулж өгсөн.
    // Энэ нь битүүмжлэл болон мэдээлэл нууцлалыг сайжруулж,
    // Renderer классыг тодорхой нэг дүрсээс хараат бус болгож байгаа.
    // Шинэ дүрс нэмэхэд Main болон Renderer код өөрчлөгдөх шаардлагагүй болно.

    public static void main(String[] args) {
        Shape rect = new Rectangle(5, 10);
        Renderer renderer = new Renderer(rect);
        renderer.draw();

        
    }
}
