import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        double maioralt = Double.MIN_VALUE;
        double menoralt = Double.MAX_VALUE;
        double somam = 0;
        int contm = 0;
        double Somaturma = 0;
        for (int i = 0; i < 50; i++) {

            double altura = Double.parseDouble(
                    JOptionPane.showInputDialog("Digite a altura da " + (i + 1) + "ª pessoa (em metros):")
            );


            char sexo = JOptionPane.showInputDialog("Digite o sexo da " + (i + 1) + "ª pessoa (M/F):")
                    .toUpperCase().charAt(0);

            if (altura > maioralt) {
                maioralt = altura;
            }
            if (altura < menoralt) {
                menoralt = altura;
            }

            if (sexo == 'F') {
                somam += altura;
                contm++;
            }


            Somaturma += altura;
        }


        double mediaAlturaMulheres = (contm > 0) ? somam / contm : 0;


        double mediaAlturaTurma = Somaturma / 50;


        JOptionPane.showMessageDialog(null,
                "Resultados:\n" +
                        "a) Maior altura da turma: " + maioralt + " metros\n" +
                        "   Menor altura da turma: " + menoralt + " metros\n" +
                        "b) Média da altura das mulheres: " + mediaAlturaMulheres + " metros\n" +
                        "c) Média da altura da turma: " + mediaAlturaTurma + " metros"
        );

    }
}