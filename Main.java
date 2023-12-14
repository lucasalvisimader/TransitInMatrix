import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Bem vindo ao caos no trânsito!");
        System.out.println("Escreva a quantidade de linhas que a matriz de trânsito vai possuir: ");
        int lines = sc.nextInt();
        System.out.println("Escreva a quantidade de colunas que a matriz de trânsito vai possuir: ");
        int columns = sc.nextInt();
        String[][] mapTransit = new String[lines][columns];
        for (String[] mapTransitLines : mapTransit) {
            Arrays.fill(mapTransitLines, " ");
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Escreva em que linha em que o " + (i + 1) + "º carro vai estar");
            int lineCar = sc.nextInt();
            System.out.println("Escreva em que coluna em que o " + (i + 1) + "º carro vai estar");
            int columnCar = sc.nextInt();
            mapTransit[lineCar][columnCar] = "C";
        }
        String mapTransitString = "";
        for (int i = 0; i < mapTransit.length; i++) {
            mapTransitString += " ";
            for (int j = 0; j < mapTransit[i].length; j++) {
                mapTransitString += "+---";
            }
            mapTransitString += "+\n";
            for (int j = 0; j < mapTransit[i].length; j++) {
                if (j == 0) {
                    mapTransitString += " | ";
                }
                mapTransitString += mapTransit[i][j] + " | ";
            }
            mapTransitString += "\n";
            if (i == mapTransit.length - 1) {
                mapTransitString += " ";
                for (int j = 0; j < mapTransit[i].length; j++) {
                    mapTransitString += "+---";
                }
                mapTransitString += "+\n";
            }
        }
        System.out.println(mapTransitString);
    }
}
