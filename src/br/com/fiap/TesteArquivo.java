package br.com.fiap;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TesteArquivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nomeDoArquivo="estoque.csv";
		String diretorio=System.getProperty("user.home");
		String caminho = diretorio + "\\" + nomeDoArquivo;
		
		List<String> conteudo = new ArrayList<>();
		conteudo.add("Produto;Quantidade;Unidade de Medida;Valor da Unidade;");
		conteudo.add("Pera;200;pct;R$5,40");
		conteudo.add("Morando;400;cx;R$6,50");
		conteudo.add("Abacaxi;280;un;R$5,00");
		
		//gravarEstoque(nomeDoArquivo,caminho,conteudo);
		
		lerEstoque(caminho);
		
		File arquivo = new File(caminho);
		if(arquivo.exists()) {
			System.out.println("arquivo existe"+"\npode ser lido "+arquivo.canRead()+"\npode ser gravado "+arquivo.canWrite()+"\ntamanho: "+arquivo.length()+"\ncaminho: "+arquivo.getPath());
		}else {
			//cria arquivo
			try {
				if(arquivo.createNewFile())
					System.out.println("arquivo criado");
				else
					System.out.println("arquivo nao criado");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		File fDiretorio = new File(diretorio);
		if(fDiretorio.exists()) {
				System.out.println("diretorio existe");
		}else {
			if(fDiretorio.mkdir())
				System.out.println("diretorio criado");
			else
				System.out.println("diretorio nao criado");
		}
		
	}

	private static void lerEstoque(String caminho) {
		// TODO Auto-generated method stub
		
		try {
		//abre arquivo
		FileReader stream = new FileReader(caminho);
		
		//bufferedreader possui o metodo readline
		//le uma linha do arquivo e retorna uma string com valor lido ou null
		BufferedReader reader = new BufferedReader(stream);
		
		//le uma linha do arquivo
		String linha = reader.readLine();
		
		//enquanto linha <> null
		while(linha != null) {
			System.out.println(linha);
			//le proxima linha do arquivo
			linha = reader.readLine();
		}
		reader.close();
		//fecha arquivo
		stream.close();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	private static void gravarEstoque(String nomeDoArquivo, String caminho, List<String> conteudo) {
		// TODO Auto-generated method stub
		
		FileWriter stream;
		PrintWriter print;
		
		try {
			//stream e uma conexao de escrita para o arquivo
			stream = new FileWriter(caminho);
			//a classe PrintWriter escrevera no arquivo
			print = new PrintWriter(stream);
			
			for(String linha: conteudo) {
				//o metodo println escreve uma linha no arquivo
				print.println(linha);
			}
			//close fecha o arquivo
			print.close();
			stream.close();
			
			System.out.println("O arquivo "+nomeDoArquivo+" foi salvo em "+caminho);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
