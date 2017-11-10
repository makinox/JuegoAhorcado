package logica;

public class funcion {
    public static void main(String[] args) {
        String palabraElegida;
        String [] [] palabras = new String[1][5];
        //Facil
        palabras[0][0] = "perro";
        palabras[0][1] = "gato";
        palabras[0][2] = "leon";
        palabras[0][3] = "gallo";
        palabras[0][4] = "lobo";
        palabras[0][5] = "conejo";
        //dificil
        palabras[1][0] = "cebra";
        palabras[1][1] = "jaguar";
        palabras[1][2] = "elefante";
        palabras[1][3] = "ardilla";
        palabras[1][4] = "cocodrilo";
        palabras[1][5] = "comadreja";

        palabraElegida = palabras[0][0];


    }



    public static void palabraHide(String palabraOculta, String palabraElegida, String[] palabraJuego){
        palabraOculta = "";
        palabraJuego = palabraElegida.split("");

        for (int i = 0; i < palabraJuego.length; i++) {
            palabraOculta = palabraOculta + "*";
            System.out.println(palabraOculta);
        }

        /*txtPalabra.setText(palabraOculta);
        la palabra que queda en el cajon
        */

        //for de palabra del juego
        palabraJuego = palabraElegida.split("");
        for (int i = 0; i < palabraJuego.length; i++) {

            System.out.println(palabraJuego[i]);
        }
    }

    public static void dificultadRamdon(int dificultad, String [][] matriz){
        Math.floor(Math.random()*(max - min + 1)) + min;
    }

}
