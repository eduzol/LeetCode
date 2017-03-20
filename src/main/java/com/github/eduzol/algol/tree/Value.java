package com.github.eduzol.algol.tree;

public class Value {

	int key ;
	double value;
	
	public Value(){}
	
	public Value(int key, double value){
		this.key = key;
		this.value = value;
	}

	
	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Value [key=" + key + ", value=" + value + "]";
	}
	
	
}
