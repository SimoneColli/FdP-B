package simulazioneEsame;

public class StudenteGiaIscrittoException extends Exception{
    public StudenteGiaIscrittoException(){
        super("Studente già iscritto");
    }
}
