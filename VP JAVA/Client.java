public class Client {

	Compte Compte;
	Usuariweb UsuariWeb;
	private string Identificador;
	private string adreça;
	private string telefon;
	private string email;
	Comanda Comanda;

	public string getIdentificador() {
		return this.Identificador;
	}

	public void setIdentificador(string Identificador) {
		this.Identificador = Identificador;
	}

	public string getAdreça() {
		return this.adreça;
	}

	public void setAdreça(string adreça) {
		this.adreça = adreça;
	}

	public string getEmail() {
		return this.email;
	}

	public void setEmail(string email) {
		this.email = email;
	}

	public Client obtenir() {
		// TODO - implement Client.obtenir
		throw new UnsupportedOperationException();
	}

}