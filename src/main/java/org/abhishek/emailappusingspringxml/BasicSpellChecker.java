package org.abhishek.emailappusingspringxml;

public class BasicSpellChecker implements SpellChecker{
    @Override
    public boolean performSpellCheck(String msg) {
        System.out.println("Basic spell check done");
        return true;
    }
}
