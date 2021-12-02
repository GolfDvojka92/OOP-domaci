package com.company;

public abstract class PolovnoVozilo {
    protected int starost;
    public abstract int cena();
    public abstract String opisVozila();
    PolovnoVozilo()
    {
        this.starost=0;
    }
    PolovnoVozilo(int starost)
    {
        this.starost=starost;
    }
    @Override
    public String toString() {
        return "PolovnoVozilo{" +
                "starost=" + starost +
                '}';
    }
    protected int baznaCena()
    {
        int cena=2000;
        if (this.starost >= 20)
        {
            cena=400;
        }
        else
        {
            cena-=70*this.starost;
        }
        return cena;
    }
}
