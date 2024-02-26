/*
 * Sallai András, 2024-02-19
 * Copyright (c) 2024, Sallai András
 * Licenc: MIT
 * Refaktorálva: 2024-02-26, Gyüre Árpád, SZOFT II-1-E
 */

public class Cost {
    Double transport;
    Double business;
    Double repair;

    public Cost(String transport, String business, String repair) {
        this.transport = Double.parseDouble(transport);
        this.business = Double.parseDouble(business);
        this.repair = Double.parseDouble(repair);
    }

}
