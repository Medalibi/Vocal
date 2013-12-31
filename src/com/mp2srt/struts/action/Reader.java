package com.mp2srt.struts.action;



import javax.sound.sampled.AudioFileFormat;


import com.darkprograms.speech.microphone.Microphone;
import com.darkprograms.speech.recognizer.GoogleResponse;
import com.darkprograms.speech.recognizer.Recognizer;
import com.mp2srt.hibernate.Email;
import com.mp2srt.hibernate.EmailDAO;

public class Reader {
	
	public String filename = "sound.wav";
	public String data = null;
	
	
	public void Listen(long idmail){
	
	EmailDAO maidao = new EmailDAO();
	Email mail = new Email();
	String text = " ";
	
	TextToSpeech tts = new TextToSpeech();
	//String command =null;
	Recognizer rec = new Recognizer();
	
	               //Your Desired FileName
    Microphone mic = new Microphone(AudioFileFormat.Type.WAVE);
	while (true)
	{
	try{
        
  
			tts.playSynth("Name your action now"); 
			//data = null;
			
			Thread.sleep(50);
				mic.open();
				mic.captureAudioToFile(filename);
				//int ambientVolume = mic.getAudioVolume();
				//Thread.sleep(2000);
				//tts.Spell("beep");
				
				//Thread.sleep(50);
				//int volume = mic.getAudioVolume();
			
				Thread.sleep(7000);
			
			
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
		//tts.Spell("You have said "+ data);
        if (data.trim().equals("read the mail"))
        {
        	mail = maidao.findById(idmail);
        	System.out.println(text);
        	text= "The subject is "+ mail.getSujet().trim() + " and it have " + mail.getContenu().trim();
        	text = text.replaceAll("\n", " ");
        	text = text.replaceAll(",", " ");
        	text = text.replaceAll(".", " ");
        	System.out.println(text);
        	tts.playSynth(text);
        }
        else {
        	tts.playSynth("I didn't hear you right");
        }
        
        Thread.sleep(5000);
    
	}
    catch(Exception e){
        e.printStackTrace();
    }
	
	
	}
	}
	
	protected class RecognizeThread implements Runnable {

        @Override
        public void run() {
            Recognizer recognizer = new Recognizer();
            TextToSpeech tts = new TextToSpeech();
            try {
                recognizer.setLanguage("en_US");
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
