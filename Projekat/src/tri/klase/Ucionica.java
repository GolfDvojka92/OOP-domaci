package tri.klase;

import java.io.*;

public class Ucionica {
	Profesor[] nizProfesora;
	Ucenik[] nizUcenika;
	Ucionica(String fajl) throws IOException
	{
		BufferedReader br = new BufferedReader (new FileReader(fajl));
		int brProfesora=Integer.parseInt(br.readLine().trim());
		nizProfesora = new Profesor[brProfesora];
		
		for(int i=0; i<brProfesora; i++)
		{
			String linija=br.readLine().trim();
			String[] delovi=linija.split(",");
			
			String ime=delovi[0];
			String prezime=delovi[1];
			int starost=Integer.parseInt(delovi[2]);
			String datumRodjenja=delovi[3];
			String predmet=delovi[4];
			boolean razredni=Boolean.parseBoolean(delovi[5]);
			double plata=Double.parseDouble(delovi[6]);
			int godineStaza=Integer.parseInt(delovi[7]);
			nizProfesora[i]=new Profesor(ime,prezime,starost,datumRodjenja,predmet,razredni,plata,godineStaza);
		}
		
		int brUcenika = Integer.parseInt(br.readLine().trim());
		nizUcenika = new Ucenik[brUcenika];
		
		for(int i=0; i<brUcenika; i++)
		{
			String linija=br.readLine().trim();
			String[] delovi=linija.split(",");
			
			String ime=delovi[0];
			String prezime=delovi[1];
			int starost=Integer.parseInt(delovi[2]);
			String datumRodjenja=delovi[3];
			String skola=delovi[4];
			String smer=delovi[5];
			nizUcenika[i]=new Ucenik(ime,prezime,starost,datumRodjenja,skola,smer);
		}
		br.close();
	}
}