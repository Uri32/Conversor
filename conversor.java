import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class conversor {

    public static void main(String[] args) {

        boolean continuarPrograma = true;

        while (continuarPrograma) {

            String[] options = { "Pesos a Euros", "Pesos a Dólares", "Pesos a Libras Esterlinas", "Pesos a Yen",
                    "Pesos a Won" };
            String choice = (String) JOptionPane.showInputDialog(null, "Elija una opción:",
                    "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            String input = JOptionPane.showInputDialog("Ingrese la cantidad en pesos mexicanos: ");
            double pesos;
            try {
                pesos = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Valor no válido.");
                return;
            }
            DecimalFormat FormatearDecimal = new DecimalFormat("#.##");

            if (choice.equals("Pesos a Dólares")) {
                double dollars = pesos / 17.42;
                JOptionPane.showMessageDialog(null,
                        pesos + " pesos mexicanos son " + FormatearDecimal.format(dollars) + " dólares.");
            } else if (choice.equals("Pesos a Euros")) {
                double euros = pesos / 18.41;
                JOptionPane.showMessageDialog(null, pesos + " pesos mexicanos son " + euros + " euros.");
            } else if (choice.equals("Pesos a Libras Esterlinas")) {
                double pounds = pesos / 21.25;
                JOptionPane.showMessageDialog(null, pesos + " pesos mexicanos son " + pounds + " libras esterlinas.");
            } else if (choice.equals("Pesos a Yen")) {
                double yen = pesos / 0.12;
                JOptionPane.showMessageDialog(null, pesos + " pesos mexicanos son " + yen + " yenes japoneses.");
            } else if (choice.equals("Pesos a Won")) {
                double won = pesos / 77.67;
                JOptionPane.showMessageDialog(null, pesos + " pesos mexicanos son " + won + " wones surcoreanos.");
            }
            
            int confirm = JOptionPane.showConfirmDialog(null, "¿Desea continuar usando el programa?", "Confirmar",
                    JOptionPane.YES_NO_CANCEL_OPTION);
            if (confirm == JOptionPane.NO_OPTION || confirm == JOptionPane.CANCEL_OPTION) {
                continuarPrograma = false;
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
            }
        }

    }
}