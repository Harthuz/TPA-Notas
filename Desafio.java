import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class Desafio {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        Double[][] notas = new Double[10][3];
        Double[][] media = new Double[10][1];
        Double num = 0.0, resultD=0.0;
        String result;
        int l, c;

        for (l = 0; l < 3; l++) {
            nomes[l] = JOptionPane.showInputDialog("Digite o nome do " + (l + 1) + "° aluno");

            for (c = 0; c < 3; c++) {
                notas[l][c] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do " + (c + 1) + "° Bimestre do aluno(a) " + nomes[l]));
                while(notas[l][c] > 10 || notas[l][c] <= 0) {
                	JOptionPane.showMessageDialog(null, "Digite uma nota válida");
                	notas[l][c] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do " + (c + 1) + "° Bimestre do aluno(a) " + nomes[l]));
                }
            }
        }

        for (l = 0; l < 3; l++) {
            for (c = 0; c < 3; c++) {
                num += notas[l][c];
            }
            media[l][0] = num / 3;
            num = 0.0;
        }

        System.out.println("\t***** Média *****");
        System.out.println("Aluno\t\t\tNotas\t\tMédia");
        
        DecimalFormat df = new DecimalFormat("0.00");
        
        for (l = 0; l < 3; l++) {
            result = nomes[l] + "\t\t";
            for (c = 0; c < 3; c++) {
                result += notas[l][c] + "\t";
            }
            resultD = media[l][0];
            result += df.format(resultD);
            if (media[l][0] < 7) {
                result += "*";
            }
            System.out.println(result);
        }
    }
}