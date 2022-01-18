package Shapes;

public class ShapeSearcher {
    Shape[] shapes = new Shape[]{
            new Triangle(), new Square(5), new Circle()
    };

    public Shape find(String nameOfShape) {
        for (int i = 0; i < shapes.length; i++) {
            if (nameOfShape.equals(shapes[i].name)) {
                return shapes[i];
            }
        }
        return null;
    }
}
