import java.util.*;

public class Comanda {

	Collection<Línia> Línia;
	Compte Compte;
	private Date dataCreacio;
	private Date dataEnviament;
	private string adreça;
	private int número;
	Collection<Client> Client;

	public Date getDataCreacio() {
		return this.dataCreacio;
	}

	public void setDataCreacio(Date dataCreacio) {
		this.dataCreacio = dataCreacio;
	}

	public Date getDataEnviament() {
		return this.dataEnviament;
	}

	public void setDataEnviament(Date dataEnviament) {
		this.dataEnviament = dataEnviament;
	}

	public string getAdreça() {
		return this.adreça;
	}

	public void setAdreça(string adreça) {
		this.adreça = adreça;
	}

	public int getNúmero() {
		return this.número;
	}

	public void setNúmero(int número) {
		this.número = número;
	}

	public void afegirComandes() {
		// TODO - implement Comanda.afegirComandes
		throw new UnsupportedOperationException();
	}

}