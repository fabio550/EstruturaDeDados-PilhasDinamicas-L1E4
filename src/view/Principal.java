package view;
import javax.swing.JOptionPane;
import controller.ConverteController;

public class Principal {

    public static void main(String[] args) throws Exception {

        ConverteController cc = new ConverteController();

        int decimal = 1000;

        while (decimal <= 0 || decimal >= 1000) {
            decimal = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "Insira um número decimal de 0 à 1000: "));
        }

        String binario = cc.decToBin(decimal);

        System.out.println(binario);



    }

}
