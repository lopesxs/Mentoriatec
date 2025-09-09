public class Avaliacao01 {

    public static void main(String[] args) {
      double n1 = 7.0;
      double n2 = 5.0;
      double n3 = 10.0;
      double n4 = 9.0;
      double n5 = 8.4;
      double n6 = 8.5;
      double n7 = 6.3;
      double n8 = 2.0;

      double mediaBimestre1 = (n1 + n2)/ 2;
      double mediaBimestre2 = (n3 + n4) / 2;
      double mediaBimestre3 = (n5 + n6) / 2;
      double mediaBimestre4 = (n7 + n8) / 2;


      double semestre1 = (mediaBimestre1 + mediaBimestre2) / 2;
      double semestre2 = (mediaBimestre3 + mediaBimestre4) / 2;

      System.out.println("Resultado Escolar");
      System.out.printf(" 1º Bimestre: %.2f/n",mediaBimestre1);
      System.out.printf(" 2º Bimestre: %.2f/n",mediaBimestre2);
      System.out.printf("1ªsemestre: %.2f/n", semestre1);

      System.out.printf(" 3º Bimestre: %.2f/n",mediaBimestre3);
      System.out.printf(" 4º Bimestre: %.2f/n",mediaBimestre4);
      System.out.printf(" 2º Semestre: %.2f/n",semestre2);











    }
}
