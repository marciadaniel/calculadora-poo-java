package calculadora;

import java.util.Scanner;


public class Calculadora {
	Scanner scan = new Scanner(System.in);
	private int valorA;
	private int valorB;
	private int result = 0;
	private char op;
	private boolean erro = false;
	
	
	public int getValorA() {
		return valorA;
	}
	
	public void setValorA(int valorA) {
		this.valorA = valorA;
	}
	
	public int getValorB() {
		return valorB;
	}
	
	public void setValorB(int valorB) {
		this.valorB = valorB;
	}
	
	public char getOp() {
		return op;
	}
	
	public void setOp(char op) {
		this.op = op;
	}
	
	
	private boolean testOperator() {
		
		boolean valid = false;
		if((op == '+') || (op == '-') || (op == '*') || (op == '/'))
			valid = true;
		else
			valid = false;
			return valid;
		
	}
	
	public int calculate() {
		
		try {
			if(op == '+')
				result = valorA + valorB;
			
			if(op == '-')
				result = valorA - valorB;
			
			if(op == '*')
				result = valorA * valorB;
			
			if(op == '/')
				result =  valorA / valorB;
			
		} catch (Exception e) {
			System.out.println("Operação inválida");
			//e.printStackTrace();
			this.erro = true;
		}
		
		return result;
		
	}
	
	
	public void show() {
		if(this.erro == false)
		System.out.println("O resultado é " + result);
		else 
			System.out.println();
	}
	
	public void captureInformations() {
		
		try {
			System.out.println("Insira o valor A:");
			valorA = scan.nextInt();
			
			
			System.out.println("Insira o valor B:");
			valorB = scan.nextInt();
			
			do {
				
			System.out.println("selecione um dos operadores: \n +" 
			+ "soma (+)" + "subtracao (-)" + "multiplicação (*)" 
					+ "divisão (/)" );
			op = scan.next().charAt(0);
			} while (this.testOperator() == false);
			
		} catch (Exception e) {
			System.out.println("Valor inválido");
			//e.printStackTrace();
			this.erro = true;
		}
			
	}
	
	
	
	
	
	
	
	
	
}
