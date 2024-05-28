import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        

        Scanner scanner = new Scanner(System.in);

        String palarabaSecreta = "inteligencia";
        int intenstosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //Arreglos
        char letrasAdivinadas[] = new char[palarabaSecreta.length()];

        for (int i=0; i<letrasAdivinadas.length;i++){
            letrasAdivinadas[i] = '_';
        }

        while(!palabraAdivinada && intentos <intenstosMaximos){

            System.out.println("Palabra adivinar:" + String.valueOf(letrasAdivinadas) + "(" + letrasAdivinadas.length +" Letras)");

            System.out.println("Introduce una letra, por favor:");

            char letra = Character.toLowerCase(scanner.next().charAt(0));
            System.out.println("");

            boolean letraCorrecta = false;

            for (int i=0;i <palarabaSecreta.length();i++){
                if(palarabaSecreta.charAt(i) == letra ){
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if(!letraCorrecta){
                intentos++;
                System.out.println("INCORRECTO Te queda: " + (intenstosMaximos - intentos) + " Intentos");
            }

            if(String.valueOf(letrasAdivinadas).equals(palarabaSecreta)){
                palabraAdivinada = true;
                System.out.println("Felicidades, has adivinado la palabra secreta");
            }
        }
            if(!palabraAdivinada){
                System.out.println("GAME OVER");
            }

            scanner.close();

    }
}
