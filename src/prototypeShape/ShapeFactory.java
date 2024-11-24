package prototypeShape;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private Map<String, Shape> shapeMap = new HashMap<>();

    public ShapeFactory() {
        shapeMap.put("CIRCLE", new Circle());
        shapeMap.put("SQUARE", new Square());
        shapeMap.put("RECTANGLE", new Rectangle());
    }

    public Shape getShape(String shapeType) {
        Shape shape = shapeMap.get(shapeType);
        return shape == null ? null : shape.clone(); // Use prototype method to clone  
    }
}