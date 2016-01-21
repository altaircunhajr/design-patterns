package abstractfactory.shape;

import abstractfactory.color.Color;

public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("filling with blue");
	}

}
