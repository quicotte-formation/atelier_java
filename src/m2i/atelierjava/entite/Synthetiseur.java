/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

/**
 *
 * @author Administrateur
 */
public class Synthetiseur {

    protected boolean on=true;
    protected String instrument;
    protected int volume;

    public void jouerNote(String noteAJouer) {
        if (this.on == true) {
            System.out.println(noteAJouer + " " + instrument + " " + volume + " " + on);
        }else{
            System.out.println("Le synthé est éteint");
        }
    }

    public void volumeMoins() {

        if (volume > 0) {
            volume--;
        }
    }

    public void volumePlus() {

        if (volume < 10) {
            volume = volume + 1;
        }
    }

    public void allumageOnOff() {

        if (on == false) {
            on = true;
            instrument = "piano";
            volume = 5;
        } else {
            // on vaut donc true
            on = false;
        }
    }

    public boolean isOn() {
        return on;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getVolume() {
        return volume;
    }

}
