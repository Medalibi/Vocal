package com.mp2srt.struts.action;


import javax.sound.sampled.AudioFileFormat;
import com.darkprograms.speech.microphone.Microphone;
import com.darkprograms.speech.recognizer.GoogleResponse;
import com.darkprograms.speech.recognizer.Recognizer;


public class Reader {
	
	
	public String filename = "sound.wav";
	public String data = null;
	
	
	// public static void main(String args[]) {
		 
	 
		// Reader read = new Reader();
		// System.out.println(read.Listen("read this, record what i'm saying", "exit the program," +
		 //		" stop recording, nothing to say, no command to say," +
		// 		" no command to tell.", 7000));
		 
	// }
	
	
	
	public String Listen(String valide, String stop, int time){
	
	long t = 1;
	//String text = " ";
	
	TextToSpeech tts = new TextToSpeech();
	
	//VocabulaireDAO vocdao = new VocabulaireDAO();

	//List<Vocabulaire> listvocab = new ArrayList<Vocabulaire>(); 
	//listvocab = vocdao.findAll(); 
	
	
	//System.out.println(listvocab.get(1).getNomVocab());
	
	               //Your Desired FileName
    Microphone mic = new Microphone(AudioFileFormat.Type.WAVE);
	while (true)
	{
	try{
        
  
		Thread.sleep(2000);	
		tts.playSynth("Please, Speak now..."); 
			//data = null;
			
			Thread.sleep(50);
				mic.open();
				mic.captureAudioToFile(filename);
				
				//tts.Spell("beep");
				System.out.println("Listening...");		
				Thread.sleep(time);
			
			
			    //volume = mic.getAudioVolume();
				mic.close();
				//Thread.sleep(3000);
			
        
        
              
            //You can also measure the volume across the entire file if you want
            //to be resource intensive.
				new Thread(new RecognizeThread()).start();
				//rec.setLanguage("en_US");
				//GoogleResponse out = rec.getRecognizedDataForWave(filename);
        
        //System.out.println(out.getResponse());
        
				Thread.sleep(5000);
		//tts.Spell("You have said "+ data);  data.trim().equals(valid)
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
	return null;
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
                //confidence.setText(googleResponse.getConfidence());
                
                
                System.out.println(data);
                tts.playSynth("You have said "+ data);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            //setStatus("Waiting...");
        }
    }

}
