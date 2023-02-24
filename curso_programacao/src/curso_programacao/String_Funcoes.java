package curso_programacao;

public class String_Funcoes {
	public static void main(String[] args) {
		
		String original = "aaaa bbbbb CCCCC DeDeDe   ";
		
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03=  original.trim();
		System.out.println("Original - " + original + "-");
		System.out.println("To LowerCase: -" + s01 + "-");
		System.out.println("To UpperCase: -" +s02 + "-");
		System.out.println("Trim: -"+ s03 + "-");
		
	}
	}

