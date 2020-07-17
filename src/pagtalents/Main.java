package pagtalents;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		int termo = 10;
		for(int i = 0; i < termo; i++) System.out.println(fibonacciRecursiva(i));

	}
	
	public static int fibonacciRecursiva(int n) {
		if(n == 0 || n == 1) return n;
		else return (fibonacciRecursiva(n - 1) + fibonacciRecursiva(n - 2));
	}
	
	public static int fibonacciPilha(int n) {
		Stack <Integer> pilha = new Stack<>();
		pilha.push(0);
		pilha.push(1);
		while(!pilha.isEmpty()) {
			int a = pilha.pop();
			
		}
	}

}
