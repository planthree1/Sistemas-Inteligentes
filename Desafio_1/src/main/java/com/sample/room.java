package com.sample;

public class room {
	
	private String pessoa;
	private double temp;
	room(String pessoa, double temp) {
			super();
			this.pessoa = pessoa;
			this.temp  = temp;
	}
	public String getPessoa() {
		return pessoa;
	}
	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
}

