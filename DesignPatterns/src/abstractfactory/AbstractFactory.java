package abstractfactory;

import abstractfactory.color.Color;
import abstractfactory.shape.Shape;

public abstract class AbstractFactory {
	protected abstract Shape getShape(String shape);
	protected abstract Color getColor(String color);	
}
