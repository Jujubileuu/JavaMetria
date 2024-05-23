import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GeometriaPlana gp = new GeometriaPlana();
        GeometriaEspacial ge = new GeometriaEspacial();

        while (true) {
            System.out.println("\nSeja Bem Vindo a calculadora geometrica feita por Pedro e Christian, selecione uma opção:\n1-Geometria Plana\n2-Geometria Espacial\n3-Trocar valor de PI\n4-Fechar Programa");
            int opGeo = Integer.parseInt(sc.nextLine());

            switch (opGeo) {
                case 1:
                    System.out.println("\nEscolha a figura geometrica plana:\n1-Quadrado\n2-Retangulo\n3-Triângulo\n4-Triângulo equilátero\n5-Paralelograma\n6-Losango\n7-Trapézio\n8-Círculo");
                    int opGP = Integer.parseInt(sc.nextLine());
                    switch (opGP) 
                    {
                        case 1:    
                            System.out.println("\nValor do lado: ");
                            double pQ = Double.parseDouble(sc.nextLine());
                            System.out.println("\nO valor do perimetro do quadrado é: " + gp.pQ(pQ) + "\nA sua área é: " + gp.aQ(pQ) );
                            break;
                        case 2:
                            System.out.println("\nValor do lado: ");
                            double pR = Double.parseDouble(sc.nextLine());
                            System.out.println("\nValor da altura: ");
                            double hR = Double.parseDouble(sc.nextLine());
                            System.out.println("\nO valor do perimetro do retangulo é: " + gp.pR(pR, hR) + "\nA sua área é: " + gp.aR(pR, hR));
                            break;
                        case 3:
                            System.out.println("\nNúmero do lado A: ");
                            double aT = Double.parseDouble(sc.nextLine());
                            System.out.println("\nNúmero do lado B: ");
                            double bT = Double.parseDouble(sc.nextLine());
                            System.out.println("\nNúmero do lado C: ");
                            double cT = Double.parseDouble(sc.nextLine());
                            System.out.println("\nO valor do perimetroo triângulo é: " + gp.pT(aT, bT, cT) + "\nA sua área é: " + gp.pT(aT, bT, cT));
                            break;
                        case 4:
                            System.out.println("\nNúmero do lado: ");
                            double l = Double.parseDouble(sc.nextLine());
                            System.out.println("\nO valor do perimetro do triângulo equilátero é: " + gp.pTE(l) + "\nA sua área é: " + gp.aTE(l));
                            break;
                        case 5:
                            System.out.println("\nNúmero do lado A: ");
                            double a = Double.parseDouble(sc.nextLine());
                            System.out.println("\nNúmero do lado B: ");
                            double b = Double.parseDouble(sc.nextLine());
                            System.out.println("\nO valor do perimetro do paralelograma é: " + gp.pP(a, b) + "\nA sua área é: " + gp.aP(a, b));
                            break;
                        case 6:
                            System.out.println("\nValor do lado: ");
                            double al = Double.parseDouble(sc.nextLine());
                            System.out.println("\nValor da altura: ");
                            double d = Double.parseDouble(sc.nextLine());
                            System.out.println("\nValor da largura: ");
                            double D = Double.parseDouble(sc.nextLine());
                            System.out.println("\nO valor do perimetro do losango é: " + gp.pL(al) + "\nA sua área é: " + gp.aL(D, d));
                            break;
                        case 7:
                            System.out.println("\nValor do lado esquerdo: ");
                            double ct = Double.parseDouble(sc.nextLine());
                            System.out.println("\nValor do lado direito: ");
                            double dt = Double.parseDouble(sc.nextLine());
                            System.out.println("\nValor da base menor: ");
                            double bt = Double.parseDouble(sc.nextLine());
                            System.out.println("\nValor da base maior: ");
                            double Bt = Double.parseDouble(sc.nextLine());
                            System.out.println("\nValor da altura: ");
                            double ht = Double.parseDouble(sc.nextLine());
                            System.out.println("\nO valor do perimetro do trapézio é: " + gp.pTR(ct, dt, bt, Bt) + "\nA sua área é: " + gp.aTR(bt, Bt, ht));
                            break;
                        case 8:
                            System.out.println("\nValor do raio: ");
                            double r = Double.parseDouble(sc.nextLine());
                            System.out.println("\nO valor do perimetro do circulo é: " + gp.pC(r) + "\nA sua área é: " + gp.aC(r));
                    }
                    break;
                case 2:
                    System.out.println("\nEscolha a figura geometrica espacial:\n1-Prisma\n2-Cilindro\n3-Pirâmide\n4-Cone\n5-Esfera\n6-Tronco");
                    int opGE = Integer.parseInt(sc.nextLine());

                    switch (opGE) {
                        case 1:
                            System.out.println("\nNúmero de lados: ");
                            int nladosPrisma = Integer.parseInt(sc.nextLine());
                            System.out.println("\nValor da face: ");
                            double facePrisma = Double.parseDouble(sc.nextLine());
                            System.out.println("\nValor da altura: ");
                            double alturaPrisma = Double.parseDouble(sc.nextLine());
                            System.out.println("\nValor da área da base: ");
                            double areabPrisma = Double.parseDouble(sc.nextLine());
                            
                            System.out.println("\nO valor da área do prisma é: " + ge.prismaAt(ge.prismaAl(nladosPrisma, facePrisma), areabPrisma) + "\nO seu volume é: " + ge.prismaVolume(areabPrisma, alturaPrisma));
                            break;
                    
                        case 2:
                            System.out.println("\nValor do raio: ");
                            double raioCilindro = Double.parseDouble(sc.nextLine());
                            System.out.println("\nValor da altura: ");
                            double alturaCilindro = Double.parseDouble(sc.nextLine());

                            double areabCilindro = ge.cilindroAb(raioCilindro);
                            
                            System.out.println("\nO valor da área do cilindro é: " + ge.cilindroAt(ge.cilindroAl(raioCilindro, alturaCilindro), areabCilindro) + "\nO seu volume é: " + ge.cilindroVolume(areabCilindro, alturaCilindro));
                            break;
                        case 3:
                            System.out.println("\nValor do lado: ");
                            double ladoPiramide = Double.parseDouble(sc.nextLine());
                            System.out.println("\nValor da altura: ");
                            double alturaPiramide = Double.parseDouble(sc.nextLine());
                            System.out.println("\nInforme o poligono da base sem acento: ");
                            String poligonoBase = sc.nextLine();

                            double areabPiramide = ge.piramideAb(poligonoBase, ladoPiramide, alturaPiramide);

                            System.out.println("\nO valor da área da pirâmide é: " + ge.piramideAt(ge.piramideAl(ladoPiramide, alturaPiramide), areabPiramide) + "\nO seu volume é: " + ge.piramideVolume(areabPiramide, alturaPiramide));
                            break;
                        case 4:
                            System.out.println("\nValor do raio: ");
                            double raioCone = Double.parseDouble(sc.nextLine());
                            System.out.println("\nValor da geratriz: ");
                            double geratrizCone = Double.parseDouble(sc.nextLine());
                            System.out.println("\nValor da altura: ");
                            double alturaCone = Double.parseDouble(sc.nextLine());

                            System.out.println("\nO valor da área do cone é: " + ge.coneAt(raioCone, geratrizCone) + "\nO seu volume é: " + ge.coneVolume(ge.coneAb(raioCone), alturaCone));
                            break;
                        case 5:
                            System.out.println("\nValor do raio: ");
                            double raioEsfera = Double.parseDouble(sc.nextLine());

                            System.out.println("\nO valor da área da esfera é: " + ge.esferaAt(raioEsfera) + "\nO seu volume é: " + ge.esferaVolume(raioEsfera));
                            break;
                        case 6:
                            System.out.println("\nValor da área da base maior: ");
                            double areabMaior = Double.parseDouble(sc.nextLine());
                            System.out.println("\nValor da área da base menor: ");
                            double areabMenor = Double.parseDouble(sc.nextLine());
                            System.out.println("\nValor da área lateral: ");
                            double arealTronco = Double.parseDouble(sc.nextLine());
                            System.out.println("\nValor da altura: ");
                            double alturaTronco = Double.parseDouble(sc.nextLine());

                            System.out.println("\nO valor da área do tronco é: " + ge.troncoAt(areabMaior, areabMenor, arealTronco) + "\nO seu volume é: " + ge.troncoVolume(areabMaior, areabMenor, alturaTronco));
                            break;
                    }
                    break;
                case 3:
                    System.out.println("\nInforme o novo valor de PI: ");
                    ge.setPi(Double.parseDouble(sc.nextLine()));
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
                    break;
            }   
        }
    }
}
