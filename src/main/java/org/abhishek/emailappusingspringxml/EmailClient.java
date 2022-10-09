package org.abhishek.emailappusingspringxml;

public class EmailClient {
	
	private SpellChecker spellChecker;
	
//	public EmailClient(SpellChecker spellChecker) {
//        this.spellChecker = spellChecker;
//    }
	
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	public void sendEmail(String msg) {
        boolean isSpellingCorrect = spellChecker.performSpellCheck(msg);
        if(isSpellingCorrect) {
            System.out.println("Email sent");
        } else {
            System.out.println("Cannot send email, check spelling failed");
        }
    }



}
