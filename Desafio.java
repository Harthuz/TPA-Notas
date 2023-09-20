import javax.swing.JOptionPane;

public class Desafio{
    public static void main(String[] args){
        String[] nomes = new String [10];
        Double[][] notas = new Double [10][3];
        Double[][] media = new Double [10][3];
        Double num=0.0;
        String result;
        int l, c;

        for(l=0;l<10;l++){
            nomes[l] = JOptionPane.showInputDialog("Digite o nome do " +(l+1) +"° aluno");
        }

        for(l=0;l<10;l++){
            for(c=0;c<3;c++){
                notas[l][c] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do " +(c+1) +"° Bimestre do aluno(a) " +nomes[l]));
            }
        }
        
        for(l=0;l<10;l++){
            for(c=0;c<3;c++){
                num += notas[l][c];
            }
            for(c=0;c<1;c++){
                media[l][c]=num;
            }
            num=0.0;
        }
        
        System.out.print("***** Média ***** \n");

        for(l=0;l<10;l++){
            for(c=0;c<1;c++){
                if((media[l][c]/3)<7){
                    result=(nomes[l] +"\t" +notas[l][c] +"\t" +notas[1][1] +"\t" +notas[l][c] +"\t" +((media[l][c])/3)+"*");
                    System.out.print(result);
                }
                else{
                    result=(nomes[l] +"\t" +notas[l][c] +"\t" +notas[l][c] +"\t" +notas[l][c] +"\t" +((media[l][c])/3));
                    System.out.print(result);
                }
            }
            System.out.print("\n");
        }
    }
}

