package simulazioneEsame2;

public class StudenteGiaIscrittoException extends Exception{
    public StudenteGiaIscrittoException(){
        super("Studente già iscritto all'esame!!");
    }
}
