package Projeto_Inter;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
      int menu_principal;
      int menu_area;
      int menu_perimetro;
      int menu_volume;

      Formula f1 = new Formula();
      Quadrado q1 = new Quadrado();
      Quadrado q2 = new Quadrado();
      Cilindro c1 = new Cilindro();
      Cilindro c2 = new Cilindro();
      Triangulo t1 = new Triangulo();
      Triangulo t2 = new Triangulo();
      Cone cone1 = new Cone();
      Cone cone2 = new Cone();
      Paralelepipedo para1 = new Paralelepipedo();
      Paralelepipedo para2 = new Paralelepipedo();

    while (true) {
      menu_principal = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite 1 para calculo de area: \nDigite 2 para calculo de perimetro:\nDigite 3 para calculo de volume:\nDigite 4 para calculo de raiz: \nAperte ENTER para sair"));
      
      switch (menu_principal) {
        case 1:
          menu_area = Integer.parseInt(JOptionPane.showInputDialog(null, "------------------------------  ÁREA  ------------------------------\nDigite 1 para calculo de área do triângulo: \nDigite 2 para calculo de área do quadrado: \nDigite 3 para calculo de área do cone: \nDigite 4 para calculo de área do paralelepipedo: \nDigite 5 para calculo de área do cilindro: \nDigite 6 para retornar ao menu principal"));
             switch (menu_area) {
                case 1:
                  t1.getBase();
                  t1.getAltura();
                  t1.Calcula_AreaTriangulo();
                  t1.retornoArea_Triangulo();
                  break;
                case 2:
                   q1.getLado();
                   q1.AreaQuadrado();
                   q1.retornaAreaQ();
                  break;
                case 3:
                   cone1.get_raio();
                   cone1.get_geratriz();
                   cone1.calculaArea_Cone();
                   cone1.imprimeDados_AreaCone();
                  break;
                case 4:
                    para1.getComprimento();
                    para1.getLargura();
                    para1.getAltura();
                    para1.calculoAreaPara();
                    para1.imprimeDadosAreaPara();
                  break;
                case 5:
                  c1.getArea_Base();
                  c1.getArea_Lateral();
                  c1.calculaAreaCilindro();
                  c1.imprimeDadosArea();
                  break;             
              }
          break;


        case 2:
          menu_perimetro = Integer.parseInt(JOptionPane.showInputDialog(null, "------------------------------  PERIMETRO  ------------------------------\nDigite 1 para calculo de perimetro do triângulo: \nDigite 2 para calculo de perimetro do quadrado: \nDigite 3 para retornar ao menu principal"));
          switch (menu_perimetro) {
            case 1:
               t2.getLado1Triangulo();
               t2.getLado2Triangulo();
               t2.getLado3Triangulo();
               t2.Calcula_PeriTriangulo();
               t2.retornoPeri_Triangulo();

              break;
            case 2:              
                q2.getLado(); 
                q2.PerimetroQuadrado();
                q2.retornaPeriQ();             
            break;
          }
          break;
        case 3:
         menu_volume = Integer.parseInt(JOptionPane.showInputDialog(null, "------------------------------  VOLUME  ------------------------------\nDigite 1 para calculo de volume do cone: \nDigite 2 para calculo de volume do cilindro: \nDigite 3 para calculo de volume do paralelepipedo: \nDigite 4 para retornar ao menu principal"));
          switch(menu_volume){
            case 1:
              cone2.get_raio();
              cone2.get_geratriz();
              cone2.get_altura();
              cone2.calculaVolume_Cone();
              cone2.imprimeDados_VolumeCone();
              break;
            case 2:
              c2.getArea_Base();
              c2.getArea_Lateral();
              c2.getAltura();
              c2.calculaVolCilindro();
              c2.imprimeDados();
              break;
            case 3:
              para2.getComprimento();
              para2.getLargura();
              para2.getAltura();
              para2.calculaVolumePara();
              para2.imprimeDadosVolPara();
              break;
          }
          break;
        case 4:
            f1.getA();
            f1.getB();
            f1.getC();
            f1.calculoDeRaiz();
          break;
       
        default:
          JOptionPane.showMessageDialog(null, "Opção inválida");
          break;
      }
    }
  }
}
