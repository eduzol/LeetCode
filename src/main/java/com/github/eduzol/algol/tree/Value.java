package com.github.eduzol.algol.tree;

public class Value {

	int key ;
	double value;
	
	public Value(){}
	
	public Value(int key, double value){
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Value [key=" + key + ", value=" + value + "]";
	}
	
	
}
