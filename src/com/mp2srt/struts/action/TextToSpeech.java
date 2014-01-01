package com.mp2srt.struts.action;


import javazoom.jl.player.Player;
import com.darkprograms.speech.synthesiser.Synthesiser;



public class TextToSpeech {
	
	public String words;

		
	public void playSynth(String words) {//GEN-FIRST:event_playSynthActionPerformed
        System.out.println("Traslating...");
        this.words=words;

        new Thread(new PlayMP3Thread()).start();
    }
	
	public class PlayMP3Thread implements Runnable {

        @Override
        public void run() {

            Synthesiser synthesiser = new Synthesiser();

            try {


                Player player = new Player(synthesiser.getMP3Data(words));
                player.play();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            System.out.println("Playing...");
        }
    }

}
