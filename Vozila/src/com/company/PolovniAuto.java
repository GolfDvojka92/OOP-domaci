package com.company;

public class PolovniAuto extends PolovnoVozilo {
    private int brojVrata;
    PolovniAuto()
    {
        super();
        this.brojVrata=5;
    }
    PolovniAuto(int starost, int brojVrata)
    {
        super(starost);
        this.brojVrata=brojVrata;
    }
    @Override
    public int cena() {
        int cena=baznaCena();
        if(brojVrata<=3)
        {
            cena*=0.95;
        }
        return cena;
    }

    @Override
    public String opisVozila() {
        return null;
    }
}
