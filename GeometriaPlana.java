public class GeometriaPlana {
    public Double Q(double vl, a){
        return vl * 4; // PERIMETRO//
        return a * a; //AREA//
    }
    //Q = PQUADRADO E VL VALOR DO LADO E A = AREA//
    public Double R(double vl,double h){
        return 2*vl + 2*h; // PERIMETRO//
        return vl * h; //AREA//
        // R = RETANGULO E H = ALTURA//
    }
    public Double T(double a, double b, double c ,double h){
        return a + b + c; // PERIMETRO//
        return a * h / 2; //AREA//
        // T = TRIANGULO E A,B,C = VALOR DOS LADOS//
    }
    public Double TE(double l, double h){
        return a + b + c; // PERIMETRO//
        return a * h / 2; //AREA//
        // T = TRIANGULO EQUILATERO E A,B,C = VALOR DOS LADOS//
    }
    public Double P(double a, double b, double h){
        return 2*a + 2*b; // PERIMETRO//
        return a * h / 2; //AREA//
        // T = TRIANGULO E A,B,C = VALOR DOS LADOS//
    }
}
