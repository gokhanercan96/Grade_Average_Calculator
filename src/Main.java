import java.util.Scanner;

public class GradeAverageCalculator {
    public static void main(String[] args) {
        int calculus, temel, zemin, beton, malzeme, analiz;

        Scanner inp = new Scanner(System.in);

        System.out.print("Calculus Notunuz:");
        calculus = inp.nextInt();

        System.out.print("Temel Tasarımı Notunuz:");
        temel = inp.nextInt();

        System.out.print("Zemin Mekaniği Notunuz:");
        zemin = inp.nextInt();

        System.out.print("Betonarme Notunuz:");
        beton = inp.nextInt();

        System.out.print("Malzeme Bilimi Notunuz:");
        malzeme = inp.nextInt();

        System.out.print("Yapısal Analiz Notunuz:");
        analiz = inp.nextInt();

        double ortalama = ((calculus+temel+zemin+beton+malzeme+analiz)/6);
        System.out.println("Ortalamanız:" + ortalama);

        System.out.println(ortalama>=50? "Başarılı!":"Başarısız!");

    }
}
