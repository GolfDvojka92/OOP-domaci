package tri.klase;

public class Profesor extends Covek{
	private String predmet;
	private boolean razredni;
	private double plata;
	private int godineStaza;
	Profesor()
	{
		super();
		predmet="";
		razredni=false;
		plata=0;
		godineStaza=0;
	}
	Profesor(String ime, String prezime, int starost, String datumRodjenja, String pr, boolean r, double pl, int gs)
	{
		super(ime,prezime,starost,datumRodjenja);
		predmet=pr;
		razredni=r;
		plata=pl;
		godineStaza=gs;
	}
}
