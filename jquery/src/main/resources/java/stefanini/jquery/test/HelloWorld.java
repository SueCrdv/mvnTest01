package stefanini.jquery.test;

import stefanini.jquery.beans.Saludos;

public class HelloWorld {

	public static void main(String[]args){
		System.out.println("Hey");
		Saludos s = new Saludos();
		String[] idiomas = s.getIdioms();
		String[] saludos = s.getRegards();
		System.out.println("Estas son algunas de las formas de decir");
		System.out.println("¡Hola Mundo!");
		System.out.println("En diferentes idiomas :)");

		for(int i = 0; i < idiomas.length; i++){
			System.out.println(String.format("En %s se dice %s :D", idiomas[i], saludos[i]));
		}
	}
}
