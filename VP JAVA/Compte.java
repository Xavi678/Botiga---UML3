import java.util.*;

public class Compte {

	ShoppingCart ShoppingCart;
	Collection<Comanda> Comanda;
	Pagament Pagament;
	Collection<Client> Client;
	private Date dataObertura;
	private Date dataClausura;
	private boolean Estat;
	private string adre�aFacturacio;

	public Date getDataObertura() {
		return this.dataObertura;
	}

	public void setDataObertura(Date dataObertura) {
		this.dataObertura = dataObertura;
	}

	public Date getDataClausura() {
		return this.dataClausura;
	}

	public void setDataClausura(Date dataClausura) {
		this.dataClausura = dataClausura;
	}

	public boolean isEstat() {
		return this.Estat;
	}

	public void setEstat(boolean Estat) {
		this.Estat = Estat;
	}

	public string getAdre�aFacturacio() {
		return this.adre�aFacturacio;
	}

	public void setAdre�aFacturacio(string adre�aFacturacio) {
		this.adre�aFacturacio = adre�aFacturacio;
	}

}