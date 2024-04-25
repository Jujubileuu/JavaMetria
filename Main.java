import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GeometriaPlana gp = new GeometriaPlana();
        GeometriaEspacial ge = new GeometriaEspacial();

        System.out.println("Seja Bem Vindo a calculadora geometrica, selecione uma opção:\n1-Geometria Plana\n2-Geometria Espacial\n3-Trocar valor de PI\n4-Fechar Programa");
        int opGeo = Integer.parseInt(sc.nextLine());

        switch (opGeo) {
            case 1:
                int opGP = Integer.parseInt(sc.nextLine());
                switch (opGP) {
                    case 1:
                        
                        break;
                
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:
                    
                        break;
                break;
        
            case 2:
                System.out.println("Escolha a figura geometrica espacial:\n1-Prisma\n2-Cilindro\n3-Pirâmide\n4-Cone\n5-Esfera\n6-Tronco");
                int opGE = Integer.parseInt(sc.nextLine());

                switch (opGE) {
                    case 1:
                        
                        break;
                
                    case 2:

                        break;
                    case 3:

                        break;
                    case 4:

                        break;
                    case 5:

                        break;
                    case 6:
                    
                        break;
                }

                break;
            
            case 3:
                break;

            case 4:
                sc.close();
                System.exit(0);
                break;
        }
    }
}
