package com.mp2srt.beans;


import javax.sound.sampled.AudioFileFormat;
import com.darkprograms.speech.microphone.Microphone;
import com.darkprograms.speech.recognizer.GoogleResponse;
import com.darkprograms.speech.recognizer.Recognizer;


public class Reader {
	
	
	public String filename = "sound.wav";
	public String data = null;
	
	public String Listen(String valide, String stop, int time){
	
	TextToSpeech tts = new TextToSpeech();
	Microphone mic = new Microphone(AudioFileFormat.Type.WAVE);
	while (true)
	{
	try{
        Thread.sleep(2000);	
		tts.playSynth("Please, Speak now..."); 
			Thread.sleep(50);
			mic.open();
			mic.captureAudioToFile(filename);
			System.out.println("Listening...");		
			Thread.sleep(time);
			mic.close();
			new Thread(new RecognizeThread()).start();
			Thread.sleep(5000);
		
        if (valide.contains(data))
        {
        	tts.playSynth("The word accepted: " + data);
        	return data;
        }
        else if (stop.contains(data))
        {
        	tts.playSynth("recognition stopped!!");
        	System.out.println("Exiting...");
        	break;
        }
        else {
        	tts.playSynth("Didn't get that.");
        }
       }
    catch(Exception e){
        e.printStackTrace();
    }
	
	
	}
	return "wrong";
	}
	
	protected class RecognizeThread implements Runnable {

        @Override
        public void run() {
            Recognizer recognizer = new Recognizer();
            TextToSpeech tts = new TextToSpeech();
            try {
                recognizer.setLanguage(Recognizer.Languages.ENGLISH_US);
                GoogleResponse googleResponse = recognizer.getRecognizedDataForWave(filename);
                data= googleResponse.getResponse();
                System.out.println(data);
                tts.playSynth("You have said "+ data);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            
        }
    }

}
