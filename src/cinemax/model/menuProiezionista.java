package src.cinemax.model;

import src.cinemax.model.Proiezione;

 public class menuProiezionista {
  
  
  //CAMPI
 
 private Proiezione[] = proiezioni;
 private int numeroProiezioni;
  
  
  //COSTRUTTORE
  
  public menuProiezionista() {
   this.proiezioni = new Proiezione[10]; //l'array memorizza al massimo 10 proiezioni
   this.numeroProiezioni = 0;
   }
   
   
   //METODI
   
   //aggiunge una proiezione
   public void aggiungiProiezione(Proiezione p) {
    proiezioni[numeroProiezioni] = p;
	numeroProiezioni++;
	}
	
   //visualizza tutte le proiezioni
   public String visualizzaProiezioni() {
    for(int i=0; i<numeroProiezioni; i++) {
	 System.out.println("ecco l'elenco delle proiezioni: ");
	 System.out.println(proiezioni[i]);
	 }
   }
   
   //modifica il prezzo di una proiezione
   public void modificaPrezzo(int i, double nuovoPrezzo) {
    proiezioni[i].setPrezzoBiglietto(nuovoPrezzo);
	}
  }
   