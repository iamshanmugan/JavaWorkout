package com.java.nestedinterfacesamp;

public class MyClass implements OuterInterface.NestedInterface{

	@Override
	public void nestedinterfacemeth() {

		System.out.println("This is nested interface method implementation....");
	}

}
