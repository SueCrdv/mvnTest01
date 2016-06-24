package stefanini.jquery.beans;

public class Saludos {
	private static final String[] idioms = {"English", "Español", "Frances", 
			"Irlandes", "Italiano", "Aleman"};
	private static final String[] regards = {"Hello world!", "¡Hola mundo!", 
			"Bonjour monde!", "Dia duit an Domhain!", "Ciao a tutti!",
			"Hallo Welt!", "Olá mundo!"};
	
	public String[] getIdioms(){
		return idioms;
	}
	
	public String[] getRegards(){
		return regards;
	}
}
