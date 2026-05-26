package src.cinemax.model;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;


public class csvReader{
	//campi
	private Proiezione proiezione;
	private Utente utente;
	
	//costruttori
	public csvReader(Proiezione proiezione){
		this.proiezione = proiezione;
	}
	
	public csvReader(Utente utente){
		this.utente = utente;
	}
	
	//metodi
	public Proiezione getProiezione(Film film){					//metodo da rivedere
		FileReader frd = new FileReader("proiezioni.csv");
		BufferedReader brd = new BufferedReader(frd);
		return brd.readLine();
		brd.close();
		frd.close();
	}
	
	public void registraUtente(Utente utente){
		FileWriter fwt = new FileWriter("utenti.csv");
		BufferedWriter bwt = new BufferedWriter(fwt);
		bwt.write(utente);
		bwt.newLine();
		bwt.close();
		fwt.close();
	}
}