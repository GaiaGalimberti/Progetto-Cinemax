package bin;

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
	public void cercaProiezione(Proiezione proiezione){
		FileReader frd = new FileReader("proiezioni.csv");
		BufferedReader brd = new BufferedReader(frd);
		FileWriter fwt = new FileWriter("proiezioni.csv");
		BufferedWriter bwt = new BufferedWriter(fwt);
		while(brd.readLine() != proiezione.toString()){
			bwt.newLine();
		}
		this.proiezione = proiezione;
		brd.close();
		frd.close();
	}
	
	public Proiezione visualizzaProiezione(){
		return cercaProiezione().toString();
	}
	
	
	public void registraCliente(Utente utente){
		FileWriter fwt = new FileWriter("utenti.csv");
		BufferedWriter bwt = new BufferedWriter(fwt);
		FileReader frd = new FileReader("utenti.csv");
		BufferedReader brd = new BufferedReader(frd);
		while(brd.readLine() != null){
			bwt.newLine();
		}
		bwt.write(utente.toString());
		bwt.newLine();
		bwt.close();
		fwt.close();
	}
}
