/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlás esetén jelölje meg, ki, mikor.
 */

// A fájl writer import
import java.io.FileWriter;
import java.io.IOException;
// A print wirter import:
import java.io.PrintWriter;


/*
 * A fájkezelő osztály
 */
public class Filehandler {
    /* Az i() metódus kiírja a 
    kapott költségeket fájlba.
    */
    public void i(Koltseg k) {
        //Próba, hogy lefut-e.
        try {
            FileWriter fw = new FileWriter("adat.txt", true);
            fw.write(k.szallitas.toString());
            fw.write(":");
            fw.write(k.uzlet.toString());
            fw.write(":");
            fw.write(k.javitas.toString());
            fw.write("\n");
            fw.close();
            
        } catch (IOException e) {
            // TODO: handle exception
        }//A cath ág vége
    }// Az i változó vége
    /*
     * Valahova lehetne tenni egy adatbázis-kezelő
     * részt is. Ugyanaz a lenne a metódus ami,
     * kiírja a fájlba és kiírja adatbázisba. 
     * Mármint a metódus neve lenne ugyanaz.
     * De lehetnek olyan általános osztály
     * ahol a konstruktor paraméterként kapná
     * meg az a típust, amivel tárolni kell.
     * Mármint, hogy adatbázisba, vagy fájlba.
     */
}
