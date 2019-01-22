public enum Months {
    Ianuarie(31, "Gerar", -1.5),
    Februarie(28, "Faurar", 0.6),
    Martie(31, "Mart", 5.7),
    Aprilie(30, "Prier", 11.1),
    Mai(31, "Florar", 16.3),
    Iunie(30, "Ciresar", 19.6),
    Iulie(31, "Cuptor", 21.5),
    August(31, "Gustar", 20.9),
    Septembrie(30, "Rapciune", 16.8),
    Octombrie(31, "Brumarel", 11.2),
    Noiembrie(30, "Brumar", 5.7),
    Decembrie(31, "Ningau", 1.2);

    int numarZile;
    String descriere;
    double temperaturaMedieC;
    double temperaturaMedieK;

    Months(int numarZile, String descriere, double temperaturaMedieC) {
        this.numarZile = numarZile;
        this.descriere = descriere;
        this.temperaturaMedieC = temperaturaMedieC;
    }

    double getTemperatureFromCelsiusInKelvin() {
        return temperaturaMedieK = temperaturaMedieC + 273.15;
    }
}