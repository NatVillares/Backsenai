package aula03;

import java.util.Scanner;

public class IfElse {
    static void main() {

        Scanner sc = new Scanner(System.in);

//        int idade = 18;
//        if (idade < 18) {
//            IO.println("Foi barrado na porta");
//        } else {
//            IO.println("Liberado");
//        }
        //Atividade Notas
        IO.println("Digite a nota 1");
        int nota1 = sc.nextInt();

        IO.println("Digite a nota 2");
        int nota2 = sc.nextInt();

        IO.println("Digite a nota 3");
        int nota3 = sc.nextInt();

        int media = (nota1+nota2+nota3)/3;

        if (media < 4){
            IO.println("Reprovado sua media foi " + media );
        } else if (media <= 6) {
            IO.println("vc esta de recuperação " +  media);
        }else{
            IO.println("vc esta aprovado 8" + media);
        }

    }

    }




