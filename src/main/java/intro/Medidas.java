
//Pacote

package intro;

// Onde deverá ser referenciado as bibliotecas.


import java.awt.color.ICC_Profile;
import java.util.Scanner;

//Classes
public class Medidas {
    //Atributos da classe Medidas

    //Métodos e funções-  os verbos

public static void main(String[] args) {
// Condicional = Verificar uma condição - fazer uma pergunta para uma pessoa, hardware ou software.


    // Utiliza a classe scanner do java para ler a escolha do usuario

    Scanner scanner = new Scanner(System.in);

    System.out.println("MENU DE OPÇÕES");

    System.out.println("c - Calcular aréa modo curto");
    System.out.println("d - Conta até DEZ");
    System.out.println("e - Calcular aréa modo extenso");
    System.out.println("i - if simples");
    System.out.println("r - Contagem regressiva de 10 até 0");
    System.out.println("QUAL A OPÇÃO DESEJADA");

    String opcao = scanner.next();

// switch selecionar o comportamento conforme a escolha da pessoa , hardware ou software.

//    String opcao = "ifSimples";

    switch (opcao) {
        case "c":
        case "C":
            System.out.println("Você escolheu executar o métodocurto");
            calcularAreaModoCurto();
            break;
        case "d":
        case "D":
            System.out.println("Você escolheu o texto  até 10");
            contarAteDez();
            break;
        case "e":
        case "E":
            System.out.println("Você escolheu executar o métodoextenso");
            calcularAreaModoExtenso();
            break;
        case "i":
        case "I":
            System.out.println("Você escolheu executar o método ifSimples");
            ifSimples();
            break;
        case "r":
        case "R":
            System.out.println("Você escolheu executar o método contagemRegressiva");
            contagemRegressiva();
            break;

        default:
        System.out.println("Você escolheu outro valor que não tem opção acima");
        break;
    }
        calcularAreaModoCurto();
        calcularAreaModoExtenso();

    }
    public static void ifSimples(){

        // if- se
        //else- senão

        String modo = "curto";
        if (modo == "curto"){
            calcularAreaModoCurto();
        }
        else{
        }calcularAreaModoExtenso();
    }


    private static void calcularAreaModoCurto() {
        System.out.println("Calculo de aréas modo Curto!");
        int largura = 2;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "+ comprimento + "m a área é de " + largura * comprimento + "m²");
    }

    public static void calcularAreaModoExtenso(){
        //Calculo de area- como calcular a area de acordo com algumas medidas.
        System.out.println("Calculo de aréas modo Extenso!");
        int largura;
        int comprimento;
        int resultado;

        largura = 4;
        comprimento = 3;

        resultado = largura * comprimento;
        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento + "m a área é de " + resultado + "m²");
    }

    public static void contarAteDez(){

// Loops ou Repetição
// For - Repetição incondicional

        System.out.println("Contagem crescente");

        for(int numero = 1; numero <=10; numero++){
            System.out.println(numero);

                    }


    }

    public static void contagemRegressiva(){

// Loops ou Repetição
// For - Repetição incondicional

        System.out.println("Contagem decrescente");

        for(int numero = 10; numero > -1; numero--){
            System.out.println(numero);

        }


    }

}




