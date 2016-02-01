package Commercialista;

public class Main {
	
	
	public static void main(String [] args){
		
		Dipendente dipendente = new Dipendente();
		dipendente.setNome("Francesco");
		dipendente.setCognome("Celato");
		dipendente.setCF("CLTFC98432423342");
		
		System.out.println(dipendente.getNome());
		System.out.println(dipendente.getCognome());
		System.out.println(dipendente.getCF());
		System.out.println(dipendente.parcellaDipendente());
		
		LiberoProfessionista lp = new LiberoProfessionista();
		lp.setNome("Steve");
		lp.setCognome("Jobs");
		lp.setNFatture(5);
		lp.setPIva("0568626");
		
		System.out.println(lp.parcellaLiberiProfessionisti());
		
	}
}
