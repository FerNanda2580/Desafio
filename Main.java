import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        printRepeatedString("-", 20);
        
        
        printRepeatedString("-", 20);

        
        ophedianBank ophBank = new ophedianBank();

        
        for (int i = 0; i < 5; i++) {
            ophBank.addcliente();
        }

        
        ophBank.Hall();

        
        for (int i = 0; i < 5; i++) {
            ophBank.atendimento();
            ophBank.Hall();
        }

        
        printRepeatedString("-", 20);
        System.out.println("Contador binário ...");
        
        printRepeatedString("-", 20);

        
        counterBi binario = new counterBi();

        
        try (Scanner scan = new Scanner(System.in)) {
            
            System.out.println("Digite o valor de N: ");
            int n = scan.nextInt();
            binario.setBinarios(n);
            binario.getBinarios();
        } 
    }

    
    private static void printRepeatedString(String str, int times) {
        for (int i = 0; i < times; i++) {
            System.out.print(str);
        }
        System.out.println(); 
    }

    
}
    