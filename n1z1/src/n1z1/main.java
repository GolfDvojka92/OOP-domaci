package n1z1;

public class main {

	public static void main(String[] args) {
		int n1=15,n2=25;
		System.out.println("Broj 1:"+n1+" Broj 2:"+n2);
		int n3;
		n3=n2+n1;
		System.out.println("Zbir tih brojeva:"+n3);
		n3=n2-n1;
		System.out.println("Razlika tih brojeva"+n3);
		n3=n1*n2;
		System.out.println("Proizvod tih brojeva"+n3);
		double n4;
		n4=(double)n2/(double)n1;
		System.out.println("Razlika tih brojeva:"+n4);
		String s1="string",s2="stirng";
		System.out.println("String 1:"+s1+" String 2:"+s2);
		if(s1.equals(s2))
		{
			System.out.println("Dosta fino");
		}
		else
		{
			System.out.println("Ne bas fino");
		}
		s2="string";
		if(s1.equals(s2))
		{
			System.out.println("Dosta fino");
		}
		else
		{
			System.out.println("Ne bas fino");
		}
	}

}
