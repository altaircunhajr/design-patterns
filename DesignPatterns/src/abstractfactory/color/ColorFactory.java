package abstractfactory.color;

import abstractfactory.AbstractFactory;
import abstractfactory.shape.Blue;
import abstractfactory.shape.Shape;

public class ColorFactory extends AbstractFactory {

	protected Shape getShape(String shape) {
		return null;
	}

	@Override
	protected Color getColor(String color) {
		if("RED".equalsIgnoreCase(color))
			return new Red();
		
		if("GREEN".equalsIgnoreCase(color))
			return new Green();
		
		if("BLUE".equalsIgnoreCase(color))
			return new Blue();
		
		throw new RuntimeException("argumento inválido");
	}

}
