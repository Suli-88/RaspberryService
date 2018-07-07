package com.sul.jdbc;

public class Gpio {
	private int id;
	private String name;
	private int number;
	private boolean status;
	private boolean outputPin;
	private boolean inputPin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public boolean isOutputPin() {
		return outputPin;
	}

	public void setOutputPin(boolean outputPin) {
		this.outputPin = outputPin;
	}

	public boolean isInputPin() {
		return inputPin;
	}

	public void setInputPin(boolean inputPin) {
		this.inputPin = inputPin;
	}

}
