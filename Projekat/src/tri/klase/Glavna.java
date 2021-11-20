package tri.klase;

import java.io.IOException;

public class Glavna {
	public static void main(String[] args) throws IOException 
	{
		Ucionica u = new Ucionica("liste.txt");
		
		System.out.println("Profesori su:");
		for(int i=0; i < u.nizProfesora.length; i++)
		{
			System.out.println(u.nizProfesora[i]);
		}
		System.out.println("Ucenici su:");
		for(int i=0;i<u.nizUcenika.length;i++)
		{
			System.out.println(u.nizUcenika[i]);
		}
	}
}
