/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refakotárlás esetén jelölje meg, ki, mikor.
 */

import java.util.Scanner;

public class MainConsole {
    /*
     * A csoni objektum osztáj tagjává kellen tenni.
     * Meg fontolandü a egy try() utasításba zárása is,
     * így le lesz zárva biztosan.
     * Ezzel valamit kezdünk.
     * Most jó lesz így.
     */
    /* Szállítási költségecske tárolása a memóriában */
    //szallitas
    String szal = "";

/* Most jön a nevecske */
// A bekért név tárolása:
String ez = "";

    /* Most jön a mennyiségecske */
    //Mennyiség:
    String ris = "";    
    public MainConsole() {
        /* dísz sor kiírása */
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.printf("║%17s%25s\n", "Projekt költsége", "║");
        System.out.println("╚═════════════════════════════════════════╝");        
        
        /* A bekérő: */
        Scanner csoni = new Scanner(System.in);        

System.out.println("──────────────────────────────────────────");
System.out.print("Szállítási költség: ");
szal = csoni.nextLine();

System.out.println("──────────────────────────────────────────");
System.out.print("Üzleti költség: ");
ez = csoni.nextLine();

System.out.println("──────────────────────────────────────────");
 System.out.print("Javítási költség: ");
  ris = csoni.nextLine();        
  Koltseg k = new Koltseg(szal, ez, ris);
  Filehandler f = new Filehandler();
  f.i(k);
    }
}
