/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refaktorálva: 2024-02-26, Gyüre Árpád, SZOFT II-1-E
 */

import java.io.FileWriter;
import java.io.IOException;

public class Filehandler {
    private FileWriter fileWriter;

    public Filehandler(String fileName) {
        try {
            fileWriter = new FileWriter(fileName, true);
        } catch (IOException e) {
            handleIOException(e);
        }
    }

    public void writeData(Cost cost) {
        try {
            StringBuilder outData = new StringBuilder();
            outData.append(cost.transport).append(":")
                   .append(cost.business).append(":")
                   .append(cost.repair).append("\n");
            fileWriter.write(outData.toString());
        } catch (IOException e) {
            handleIOException(e);
        }
    }

    public void closeFile() {
        try {
            if (fileWriter != null) {
                fileWriter.close();
            }
        } catch (IOException e) {
            handleIOException(e);
        }
    }

    private void handleIOException(IOException e) {
        e.printStackTrace();
    }
}
