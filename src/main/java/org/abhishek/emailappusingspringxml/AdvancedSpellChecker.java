package org.abhishek.emailappusingspringxml;

public class AdvancedSpellChecker implements SpellChecker {
    @Override
    public boolean performSpellCheck(String msg) {
        System.out.println("Advanced spell check done");
        return true;
    }
}
