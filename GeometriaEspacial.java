public class GeometriaEspacial {
    public double Pi = 3.14;

    //métodos prisma
    public double prismaAl(int nlados, double face) {
        return nlados * face;
    }
    public double prismaAt(double areal, double areab) {
        return areal + (2 * areab);
    }
    public double prismaVolume(double areab, double altura) {
        return areab * altura;
    }

    //métodos cilindro
    public double cilindroAl(double raio, double altura) {
        return 2 * this.Pi * raio * altura;
    }
    public double cilindroAb(double raio) {
        return this.Pi * (raio * raio);
    }
    public double cilindroAt(double areal, double areab) {
        return areal + (2 * areab);
    }
    public double cilindroVolume(double areab, double altura) {
        return areab * altura;
    }

    //metodos piramide
    public double piramideAl(double lado, double altura) {
        return (lado * altura) / 2;
    }
    public double piramideAb(String poligonoBase, double lado, double altura) {
        double resultado = 0;
        if (poligonoBase.toLowerCase() == "triangulo") {
            resultado = (lado * altura) / 2;
        } else if (poligonoBase.toLowerCase() == "quadrado") {
            resultado = lado * lado;   
        } else if (poligonoBase.toLowerCase() == "retangulo") {
            resultado = lado * altura;
        }
        return resultado;
    }
    public double piramideAt(double areal, double areab) {
        return areal + areab;
    }
    public double piramideVolume(double areab, double altura) {
        return (areab * altura) / 3;
    }

    //métodos cone
    public double coneAl(double raio, double geratriz) {
        return this.Pi * raio * geratriz;
    }
    public double coneAb(double raio) {
        return this.Pi * (raio * raio);
    }
    public double coneAt(double raio, double geratriz) {
        return this.Pi * raio * (geratriz + raio);
    }
    public double coneVolume(double areab, double altura) {
        return (areab * altura) / 3;
    }

    //métodos esfera
    public double esferaAt(double raio) {
        return 4 * this.Pi * (raio * raio);
    }
    public double esferaVolume(double raio) {
        return 4 * this.Pi * (raio * raio * raio) / 3;
    }

    //métodos tronco
    public double troncoAt(double areabMaior, double areabMenor, double areal) {
        return areabMaior + areabMenor + areal;
    }
    public double troncoVolume(double areabMaior, double areabMenor, double altura) {
        return (altura * (areabMenor + areabMaior + Math.sqrt(areabMenor * areabMaior))) / 3;
    }
}
