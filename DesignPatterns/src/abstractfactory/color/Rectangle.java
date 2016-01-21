package abstractfactory.color;

import abstractfactory.shape.Shape;

public class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("printing rectangle");
	}

}
