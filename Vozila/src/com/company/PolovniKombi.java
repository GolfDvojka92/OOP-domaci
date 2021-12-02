package com.company;

public class PolovniKombi extends PolovnoVozilo{
    private int brojSedista;
    PolovniKombi()
    {
        super();
        this.brojSedista=2;
    }
    PolovniKombi(int starost, int brojSedista)
    {
        super(starost);
        this.brojSedista=brojSedista;
    }
    @Override
    public int cena() {
        return baznaCena()+this.brojSedista*50;
    }

    @Override
    public String opisVozila() {
        return null;
    }
}
