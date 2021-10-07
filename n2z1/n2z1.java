import java.*;

public class Nezaposleni
{
    String ime;
    String struka;
    int vremeCekanja;
    boolean odobrenje=false;
    int brojNezaposlenih;
    Nezaposleni(String inputIme, int inputVreme)
    {
        ime=inputIme;
        vremeCekanja=inputVremel;
    }
    Nezaposleni(String inputIme, String inputStruka, int inputVreme)
    {
        ime=inputIme;
        struka=inputStruka;
        vremeCekanja=inputVreme;
    }
    public void zaposli()
    {
        if(struka.equals("Informaticar") || struka.equals("Programer") || vremeCekanja>=24)
        {
            odobrenje=true;
            brojNezaposlenih--;
        }
    }
    public void Status()
    {
        System.out.println("Ime:"+ime);
        System.out.println("Struka:"+struka);
        System.out.print("Zaposlen:");
        if(odobrenje)
        {
            System.out.println("Da");
        }
        else
        {
            System.out.println("Ne");
            System.out.println("Vreme cekanja"+vremeCekanja);
        }
    }
}

public class TrzisteRada
{
    Nezaposleni n1,n2,n3;
    String ime="Petar Djurovic";
    String ime2="Djuradj Petrovic";
    String ime3="Bogdan Zivoinovic";
    String struka="Programer";
    String struka2="Stolar";
    String struka3="Masin-bravar";
    int vreme=5;
    int vreme2=28;
    int vreme3=16;
    n1.Nezaposleni(ime,struka,vreme);
    n2.Nezaposleni(ime2,vreme2);
    n3.Nezaposleni(ime3,struka3,vreme3);
    zaposli(n1);
    zaposli(n2);
    zaposli(n3);
    Status(n1);
    Status(n2);
    Status(n3);
}