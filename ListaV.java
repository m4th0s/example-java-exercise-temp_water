import java.util.Scanner;

public class ListaV {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double soma = 0;
        int contador = 0;

        while(contador < 12){
            
            System.out.println("Digite a temperatura: ");
            double temperatura= sc.nextDouble();

            if (temperatura < 4 || temperatura > 10){
                System.out.println("Temperatura inválida! Digite um valor entre 4º a 10ºC.");
            }else{
                soma+= temperatura;
                contador++;
            }
        }
            double media = soma/12;

            System.out.printf("A média de hoje das temperaturas é: %.1f °C%n", media);
        
     sc.close();   
    }
}
