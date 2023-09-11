package controller;
import model.PilhaInt;

public class ConverteController {

    public ConverteController() {

    }

    public String decToBin(int decimal) throws Exception {

        PilhaInt quocientes = new PilhaInt();
        PilhaInt restos = new PilhaInt();

        while (decimal >= 2) {

            int resto = decimal % 2;
            restos.push(resto);
//			System.out.println(resto + " <- Resto");

            decimal = decimal / 2;
            quocientes.push(decimal);
//			System.out.println(decimal + " <- Quociente");
        }

        String binario = "";

        if (!quocientes.isEmpty()) {
            int ultimoQuociente = quocientes.pop();
            binario += String.valueOf(ultimoQuociente);
//			System.out.println(binario + " <- Binario");
        } else {
            binario += "1";
        }

        while(!restos.isEmpty()) {
            int ultimoResto = restos.pop();
            binario += String.valueOf(ultimoResto);
//			System.out.println(binario + " <- Binario");
        }

        return binario;

    }
}
