package tri.klase;

public class Ucenik extends Covek{
	private String skola;
	private String smer;
	Ucenik(String ime, String prezime, int starost, String datumRodjenja, String sk, String sm)
	{
		super(ime,prezime,starost,datumRodjenja);
		this.skola=sk;
		this.smer=sm;
	}
}
