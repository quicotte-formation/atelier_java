/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import javax.sound.midi.Instrument;
import javax.sound.midi.MidiChannel;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Synthesizer;
import m2i.atelierjava.entite.Synthetiseur;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Administrateur
 */
public class SynthTest {
    
    @Test
    public void testJouerNoteOK(){ 
        
        Synthetiseur synth = new Synthetiseur();
        
        synth.allumageOnOff();
        synth.jouerNote("FA#3");
    }
    
    @Test
    public void testVolumnePlusOK(){
        
        Synthetiseur v = new Synthetiseur();
        v.allumageOnOff();
        v.volumePlus();
        v.volumePlus();
        v.volumePlus();
        v.volumePlus();
        v.volumePlus();
        v.volumePlus();
        Assert.assertEquals(10, v.getVolume());
    }
    
    @Test
    public void testAllumerOnOffOK(){
        
        Synthetiseur s = new Synthetiseur();
        Assert.assertFalse(s.isOn());
//        Assert.assertFalse( s.isOn() );
        s.allumageOnOff();
//        Assert.assertTrue( s.isOn() );
        s.allumageOnOff();
//        Assert.assertFalse( s.isOn() );
    }
    
//    @Test
    public void synthTest() throws MidiUnavailableException, InterruptedException{
        Synthesizer synth = MidiSystem.getSynthesizer();
        
        synth.open();
        MidiChannel[] channels = synth.getChannels();
        Instrument[] instrus = synth.getDefaultSoundbank().getInstruments();
        synth.loadInstrument( instrus[1] );
        channels[5].noteOn(30, 600);
        Thread.sleep(10000);
    }
}
