package abstractfactory.shape;

import abstractfactory.AbstractFactory;
import abstractfactory.color.Color;
import abstractfactory.color.Rectangle;

public class ShapeFactory extends AbstractFactory {

	@Override
	protected Shape getShape(String shape) {
		if("CIRCLE".equalsIgnoreCase(shape))
			return new Circle();
		
		if("RECTANGLE".equalsIgnoreCase(shape))
			return new Rectangle();
		
		if("SQUARE".equalsIgnoreCase(shape))
			return new Square();
		
		return null;
	}

	@Override
	protected Color getColor(String color) {
		return null;
	}

}
