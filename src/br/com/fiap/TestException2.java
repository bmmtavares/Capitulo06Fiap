package br.com.fiap;

public class TestException2 {
	public static void main(String args[]) {
		
		
		//excecoes unchecked
		try {
			int val = 10 / 0;
			
			int[] valores = new int[3];
			System.out.println(valores[4]);
			
			String nome = null;
			System.out.println(nome.length());
			
			int numero = Integer.parseInt("zero");
//		} catch (ArithmeticException e) {
//			System.out.println("Nao e possivel realizar uma divisao por zero");
//			
//			//msg com lista de erros
//			System.out.println(e.getMessage());
//			
//			//msg pilha erro
//			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("nao e possivel acessar a posicao 4 do array");
		} catch (NullPointerException e) {
			System.out.println("nao foi possivel retornar o length, variavel nome nao instanciada");
		} catch (NumberFormatException e ) {
			System.out.println("nao foi possivel realizar a conversao");
		} catch(Exception e) {
			System.out.println("erro na execucao do programa");
		} finally {
			System.out.println("sempre passa aqui");
		}
		
	}
}
