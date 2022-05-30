package model;

import java.util.ArrayList;
/**
 * Diese Klasse modelliert einen kontakt. Ein Kontakt hat
 * einen Vornamen, einen Nachnamen, ein Foto, E-Mail-Adressen haben
 *
 */

public class Contact {


    private String vorname;
    private String nachname;
    private String foto;
    private ArrayList<String> EmailAdresse;

    /**
     *
     * Konstruktor für die Klasse contact
     *
     * @param nachname, nachname des Kontakt

     * @param vorname, vorname des Kontakt
     *
     * @param foto, foto des Kontakt
     *
     * @param photo name of the photo of this hotel
     */

    public Contact(String nachname, String vorname, String foto) {
        this.nachname = nachname;
        this.vorname = vorname;
        this.foto = foto;

        EmailAdresse = new ArrayList<>();

    }

    /**
     * getter für den Vorname
     * @return der Vorname des Kontakts
     */

    public String getVorname() {
        return vorname;
    }

    /**
     * getter für den Nachname
     * @return der Nachname des Kontakts
     */

    public String getNachname() {
        return nachname;
    }

    /**
     * getter für das Foto
     * @return das Foto des Kontakts
     */
    public String getFoto(){
        return foto;
    }

    public ArrayList<String> geteMail(){
        return EmailAdresse;
    }

    @Override
    public String toString(){
        return vorname +" "+ nachname +" "+ foto +" "+"\n "+EmailAdresse.toString();
    }

    /**
     * Die Methode fügt E-Mail für den Kontakt hinzu
     * @param Mail, Mail des Kontakts
     */

    public void addeMail(String Mail) {
        if (Mail.length() >= 3 && Mail.contains("@")
                && Mail.charAt(0)!='@' && Mail.charAt(Mail.length()-1) != '@') {
        	EmailAdresse.add(Mail);
        }else {
            System.out.println("falsche eMail");
        }
    }


}
