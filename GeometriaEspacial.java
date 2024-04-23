public class GeometriaEspacial {
    public Double prismaAl(int nlados, double face) {
        return nlados * face;
    }
    public Double prismaAt(double areal, double areab) {
        return areal + (2 * areab);
    }
    public Double prismaVolume(double areab, double altura) {
        return areab * altura;
    }

    public Double cilindroAl(double pi, double raio, double altura) {
        return 2 * pi * raio * altura;
    }
    public Double cilindroAb(double pi, double raio) {
        return pi * (raio * raio);
    }
    public Double cilindroAt(double areal, double areab) {
        return areal + (2 * areab);
    }
    public Double cilindroVolume(double areab, double altura) {
        return areab * altura;
    }
}
