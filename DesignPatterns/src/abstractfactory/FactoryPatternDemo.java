package abstractfactory;

import abstractfactory.color.Color;
import abstractfactory.shape.Shape;

public class FactoryPatternDemo {
	
	public static void main(String[] args) {
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();
		
		Shape rectangle = shapeFactory.getShape("rectangle");
		rectangle.draw();
		
		Shape square = shapeFactory.getShape("square");
		square.draw();
		
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		
		Color blue = colorFactory.getColor("blue");
		blue.fill();
		
		Color red = colorFactory.getColor("red");
		red.fill();
		
		Color green = colorFactory.getColor("green");
		green.fill();
	}
}
