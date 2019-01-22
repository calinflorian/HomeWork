import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce numarul aferent lunii dorite : ");
        int n = scanner.nextInt();

        if (n >= 1 && n <= 12) {
            switch (n) {
                case 1:
                    System.out.println("Luna este " + Months.Ianuarie + ", are " + Months.Ianuarie.numarZile + " zile, numita si " + Months.Ianuarie.descriere + " cu o temperatura medie de " + Months.Ianuarie.temperaturaMedieC + " °C si " + Months.Ianuarie.getTemperatureFromCelsiusInKelvin() + " °K.");
                    System.out.println(Season.Iarna.descriere);
                    break;
                case 2:
                    System.out.println("Luna este " + Months.Februarie + ", are " + Months.Februarie.numarZile + " zile, numita si " + Months.Februarie.descriere + " cu o temperatura medie de " + Months.Februarie.temperaturaMedieC + " °C si " + Months.Februarie.getTemperatureFromCelsiusInKelvin() + " °K.");
                    System.out.println(Season.Iarna.descriere);
                    break;
                case 3:
                    System.out.println("Luna este " + Months.Martie + ", are " + Months.Martie.numarZile + " zile, numita si " + Months.Martie.descriere + " cu o temperatura medie de " + Months.Martie.temperaturaMedieC + " °C si " + Months.Martie.getTemperatureFromCelsiusInKelvin() + " °K.");
                    System.out.println(Season.Primavara.descriere);
                    break;
                case 4:
                    System.out.println("Luna este " + Months.Aprilie + ", are " + Months.Aprilie.numarZile + " zile, numita si " + Months.Aprilie.descriere + " cu o temperatura medie de " + Months.Aprilie.temperaturaMedieC + " °C si " + Months.Aprilie.getTemperatureFromCelsiusInKelvin() + " °K.");
                    System.out.println(Season.Primavara.descriere);
                    break;
                case 5:
                    System.out.println("Luna este " + Months.Mai + ", are " + Months.Mai.numarZile + " zile, numita si " + Months.Mai.descriere + " cu o temperatura medie de " + Months.Mai.temperaturaMedieC + " °C si " + Months.Mai.getTemperatureFromCelsiusInKelvin() + " °K.");
                    System.out.println(Season.Primavara.descriere);
                    break;
                case 6:
                    System.out.println("Luna este " + Months.Iunie + ", are " + Months.Iunie.numarZile + " zile, numita si " + Months.Iunie.descriere + " cu o temperatura medie de " + Months.Iunie.temperaturaMedieC + " °C si " + Months.Iunie.getTemperatureFromCelsiusInKelvin() + " °K.");
                    System.out.println(Season.Vara.descriere);
                    break;
                case 7:
                    System.out.println("Luna este " + Months.Iulie + ", are " + Months.Iulie.numarZile + " zile, numita si " + Months.Iulie.descriere + " cu o temperatura medie de " + Months.Iulie.temperaturaMedieC + " °C si " + Months.Iulie.getTemperatureFromCelsiusInKelvin() + " °K.");
                    System.out.println(Season.Vara.descriere);
                    break;
                case 8:
                    System.out.println("Luna este " + Months.August + ", are " + Months.August.numarZile + " zile, numita si " + Months.August.descriere + " cu o temperatura medie de " + Months.August.temperaturaMedieC + " °C si " + Months.August.getTemperatureFromCelsiusInKelvin() + " °K.");
                    System.out.println(Season.Vara.descriere);
                    break;
                case 9:
                    System.out.println("Luna este " + Months.Septembrie + ", are " + Months.Septembrie.numarZile + " zile, numita si " + Months.Septembrie.descriere + " cu o temperatura medie de " + Months.Septembrie.temperaturaMedieC + " °C si " + Months.Septembrie.getTemperatureFromCelsiusInKelvin() + " °K.");
                    System.out.println(Season.Toamna.descriere);
                    break;
                case 10:
                    System.out.println("Luna este " + Months.Octombrie + ", are " + Months.Octombrie.numarZile + " zile, numita si " + Months.Octombrie.descriere + " cu o temperatura medie de " + Months.Octombrie.temperaturaMedieC + " °C si " + Months.Octombrie.getTemperatureFromCelsiusInKelvin() + " °K.");
                    System.out.println(Season.Toamna.descriere);
                    break;
                case 11:
                    System.out.println("Luna este " + Months.Noiembrie + ", are " + Months.Noiembrie.numarZile + " zile, numita si " + Months.Noiembrie.descriere + " cu o temperatura medie de " + Months.Noiembrie.temperaturaMedieC + " °C si " + Months.Noiembrie.getTemperatureFromCelsiusInKelvin() + " °K.");
                    System.out.println(Season.Toamna.descriere);
                    break;
                case 12:
                    System.out.println("Luna este " + Months.Decembrie + ", are " + Months.Decembrie.numarZile + " zile, numita si " + Months.Decembrie.descriere + " cu o temperatura medie de " + Months.Decembrie.temperaturaMedieC + " °C si " + Months.Decembrie.getTemperatureFromCelsiusInKelvin() + " °K.");
                    System.out.println(Season.Iarna.descriere);
                    break;
            }
        } else {
            System.out.println("|-------------------------------|");
            System.out.println("| Numarul introdus este gresit! |");
            System.out.println("|-------------------------------|");
        }


    }
}
