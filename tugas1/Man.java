import java.util.Scanner;

public class Man {
    public static void main(String[] args) {
        // import
        Scanner scanner = new Scanner(System.in);
        Celsius suhu = new Celsius();

        // Masukkan input
        System.out.print("Masukkan suhu dalam Celsius: ");

        // Membuat Variabel
        double celsius = scanner.nextDouble();
        double fahrenheit = suhu.Fahrenheit(celsius);
        double kelvin = celsius + 273.15;

        // Print 
        System.out.println(celsius + " derajat Celsius sama dengan " + fahrenheit + " derajat Fahrenheit.");
        System.out.println(celsius + " derajat Celsius sama dengan " + kelvin + " Kelvin.");

        // Tutup
        scanner.close();
    }
}

class Celsius {

    double Fahrenheit (int cel) {
        double data = (cel * 9/5) + 35;
        return data;
    }


}
