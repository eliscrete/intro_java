
//Pacote

package intro;

// Onde deverá ser referenciado as bibliotecas.


//Classes
public class Medidas {
    //Atributos da classe Medidas

    //Métodos e funções-  os verbos

public static void main(String[] args) {
// Condicional = Verificar uma condição - fazer uma pergunta para uma pessoa, hardware ou software.
// switch selecionar o comportamento conforme a escolha da pessoa , hardware ou software.

    String opcao = "ifSimples";
    switch (opcao) {
        case "ifSimples":
            System.out.println("Você escolheu executar o método ifSimples");
            ifSimples();
            break;
        case "curto":
            System.out.println("Você escolheu executar o método curto");
            calcularAreaModoCurto();
            break;
        case "extenso":
            System.out.println("Você escolheu executar o método extenso");
            CalcularModoExtenso();
            break;
        default:
        System.out.println("Você escolheu outro valor que não tem opção acima");
        break;
    }
        calcularAreaModoCurto();
        CalcularModoExtenso();

    }
    public static void ifSimples(){

        // if- se
        //else- senão

        String modo = "curto";
        if (modo == "curto"){
            calcularAreaModoCurto();
        }
        else{
        }calcularAreaModoCurto();
    }


    private static void calcularAreaModoCurto() {
    }

    public static void calcularAreaModoCompacto(){
        System.out.println("Calculo de aréas modo Curto!");
        int largura = 2;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de "+ comprimento + "m a área é de " + largura * comprimento + "m²");
    }

    public static void CalcularModoExtenso(){
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
//  Calculo de aréa reduzido

}




