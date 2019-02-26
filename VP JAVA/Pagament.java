public class Pagament {

	Compte Compte;
	private string id;
	private int quantitatTotal;
	private Date dataPagament;
	private string Observacions;

	public string getId() {
		return this.id;
	}

	public void setId(string id) {
		this.id = id;
	}

	public int getQuantitatTotal() {
		return this.quantitatTotal;
	}

	public void setQuantitatTotal(int quantitatTotal) {
		this.quantitatTotal = quantitatTotal;
	}

	public Date getDataPagament() {
		return this.dataPagament;
	}

	public void setDataPagament(Date dataPagament) {
		this.dataPagament = dataPagament;
	}

	public string getObservacions() {
		return this.Observacions;
	}

	public void setObservacions(string Observacions) {
		this.Observacions = Observacions;
	}

}