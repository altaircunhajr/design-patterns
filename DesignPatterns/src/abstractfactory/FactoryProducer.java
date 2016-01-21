package abstractfactory;

import abstractfactory.color.ColorFactory;
import abstractfactory.shape.ShapeFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String choice){
		if("SHAPE".equalsIgnoreCase(choice))
			return new ShapeFactory();
		
		if("COLOR".equalsIgnoreCase(choice))
			return new ColorFactory();
		
		throw new RuntimeException("Invalid argument");
	}
}
