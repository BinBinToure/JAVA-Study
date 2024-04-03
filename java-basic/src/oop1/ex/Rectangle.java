package oop1.ex;

public class Rectangle {
    int width;
    int height;


    int calcuateArae() {
        return width * height;
    }

    int calcuatePerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }
}
