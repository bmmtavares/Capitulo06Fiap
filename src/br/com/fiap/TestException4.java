package br.com.fiap;

public class TestException4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int val = 10 / 0;
			System.out.println(val);
		} catch (Exception e) {
			
			throw new DivisaoPorZeroException();
			
		}
		
	}

}
