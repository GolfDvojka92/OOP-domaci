package tri.klase;

public class Covek {
	private String ime;
	private String prezime;
	private int starost;
	private String datumRodjenja;
	Covek()
	{
		ime="";
		prezime="";
		starost=0;
		datumRodjenja="xx/xx/xxxx";
	}
	Covek(String ime, String prezime, int starost, String datumRodjenja)
	{
		this.ime=ime;
		this.prezime=prezime;
		this.starost=starost;
		this.datumRodjenja=datumRodjenja;
	}
}
