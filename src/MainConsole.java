/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refaktorálva: 2024-02-26, Gyüre Árpád, SZOFT II-1-E
 */

import java.util.Scanner;

public class MainConsole {
    String transportInput = "";
    String businessInput = "";
    String repairInput = "";
    Scanner scanner;

    public MainConsole() {

        drawHeader();

        scanner = new Scanner(System.in);

        startInput();
        writeData();
    }

    private void drawHeader() {
        System.out.println("╔═════════════════════════════════════════╗");
        System.out.printf("║%29s%13s\n", "Projekt költsége", "║");
        System.out.println("╚═════════════════════════════════════════╝");
    }

    private void startInput() {
        transportInput = input("Szállítási költség: ");
        businessInput = input("Üzleti költség: ");
        repairInput = input("Javítási költség: ");
    }

    private String input(String inputText) {
        System.out.println("──────────────────────────────────────────");
        System.out.print(inputText);
        String inputData = scanner.nextLine();
        return inputData;
    }

    private void writeData() {
        Cost cost = new Cost(transportInput, businessInput, repairInput);
        Filehandler write = new Filehandler("adat.txt");
        write.writeData(cost);
        write.closeFile();
    }
}
