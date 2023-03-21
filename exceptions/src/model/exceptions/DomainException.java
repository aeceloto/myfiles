package model.exceptions;

public class DomainException extends Exception {

	/* se você colocar a classe como extensão da classe runtime exception o compilador não irá obrigar você a tratar a exceção,
	*entretanto se você usar a extensão da classe "Exception" o compilador irá obrigar você a tratar a exceção. 
	**/
	
	private static final long serialVersionUID = 1L;
	
	public DomainException(String msg) {
		super(msg);
	}

	

}
