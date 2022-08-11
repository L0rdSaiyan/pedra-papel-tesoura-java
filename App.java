import java.util.Scanner;
import java.util.Random;
public class App
{

public static void main(String []args)
{

    Scanner leitor = new Scanner(System.in);
    Random aleatorio = new Random();

    String resposta;


    System.out.println("Informe a sua jogada");
    resposta=leitor.nextLine();

    if(resposta.equals("tesoura") && aleatorio.nextInt(3)==1){


        System.out.println("EU GANHEI!");


    }else{

        System.out.println("Você ganhou!");

    }

    leitor.close();

}


}