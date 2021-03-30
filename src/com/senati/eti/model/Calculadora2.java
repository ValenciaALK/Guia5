package com.senati.eti.model;

public class Calculadora2 {
	// Atributos
	private float numero1;
	private float numero2;
	public float getNumero1() {
		return numero1;
	}
	public void setNumero1(float numero1) {
		this.numero1 = numero1;
	}
	public float getNumero2() {
		return numero2;
	}
	public void setNumero2(float numero2) {
		this.numero2 = numero2;
	}
	// Métodos constructores
	public void Calculadora2() {
		
	}
	
	public Calculadora2(float numero1, float numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	public float Operar(int tipo) {
		float rpta = 0;
		Boolean r;
		// 9 -> Mayor, 10 -> Menor
		switch (tipo) {
		case 1:
			rpta = this.numero1 + this.numero2;
			break;
		case 2:
			rpta = this.numero1 - this.numero2;
			break;
		case 3:
			rpta = this.numero1 * this.numero2;
			break;
		case 4:
			if (this.numero2 != 0)
				rpta = this.numero1 / this.numero2;
			break;
		case 5:
			if (this.numero2 != 0)
				rpta = this.numero1 % this.numero2;
			break;
		case 6:
			rpta = (this.numero1 + this.numero2) / 2;
			break;
		case 7:
			rpta = (float)Math.pow(numero1, 2) + (float)Math.pow(numero2, 2);
			break;
			
		case 8:
			rpta = ((this.numero2 - this.numero1) / this.numero1) * 100; 
			break;
		case 9:
			float num_may = (float) this.numero1;
			if (this.numero2 > this.numero1)
				num_may = this.numero2;
			else 
				num_may = this.numero1;
			
			rpta = num_may;
			break;
			
		case 10:
			float num_men = (float) this.numero1;
			if (this.numero2 < this.numero1)
				num_men = this.numero2;
			else
				num_men = this.numero1;
			rpta = num_men;
			break;
		}
		return rpta;
		
	}
	

}
