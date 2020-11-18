package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class ShowFile {

	public static void main(String[] args) {

		int i;
		FileInputStream fin = null;

		// verificar se o arquivo foi especificado
//		if (args.length != 1) {
//			System.out.println("Usage: ShowFile file");
//			return;
//		}

		// ABRIR O ARQUIVO (OPEN FILE) !!!!
		try {
			fin = new FileInputStream("..\\ShowFile\\src\\application\\teste2.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo nao encontrado.");
		}

		// LER O ARQUIVO (READ FILE) !!!
		try {

			do {
				i = fin.read();
				// verificar se o final do arquivo foi alcançado.
				if (i != -1)
					System.out.print((char) i);
			} while (i != -1);

		} catch (IOException e) {
			System.out.println("ERROR READING FILE.");
		}
		
		//CLOSE FILE
		try {
			fin.close();
		} catch (IOException e) {
			System.out.println("ERROR CLOSING FILE.");
		}

	}// main

}// class
