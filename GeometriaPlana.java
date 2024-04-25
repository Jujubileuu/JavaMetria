public class GeometriaPlana {
    public Double pQ(double a){
        return a * 4; // PERIMETRO//
        //Q = QUADRADO a = AREA//
    }
    public Double aQ(double a){
        return a * a; //AREA//
        //Q = QUADRADO a = AREA//
    }
    //Q = PQUADRADO E VL VALOR DO LADO E A = AREA//
    public Double pR(double vl,double h){
        return 2 * vl + 2 * h; // PERIMETRO//
        // R = RETANGULO E H = ALTURA//
    }
    public Double aR(double vl,double h){
        return vl * h; //AREA//
        // R = RETANGULO E H = ALTURA//
    }
    public Double pT(double a, double b, double c){
        return a + b + c; // PERIMETRO//
        // T = TRIANGULO E A,B,C = VALOR DOS LADOS//
    }
    public Double aT(double a,double h){
        return a * h / 2; //AREA//
        // T = TRIANGULO E A,B,C = VALOR DOS LADOS//
    }
    public Double pTE(double l){
        return 3 * l; // PERIMETRO//
        // T = TRIANGULO EQUILATERO E A,B,C = VALOR DOS LADOS//
    }
    public Double aTE(double l){
        return l * l / 4; //AREA// // FALTA ADICIONAR A √3 NO FINAL DA RESPOSTA//
        // T = TRIANGULO EQUILATERO E A,B,C = VALOR DOS LADOS//
    }
    public Double pP(double a, double b){
        return 2 * a + 2 * b; // PERIMETRO//
        // T = TRIANGULO E A,B,C = VALOR DOS LADOS//
    }
    public Double aP(double a, double h){
        return a * h / 2; //AREA//
        // T = TRIANGULO E A,B,C = VALOR DOS LADOS//
    }
    public Double pL(double a){
        return 4 * a; // PERIMETRO//
        //L = Losangulo a = VALOR DOS LADO d = ALTURA D = LARGURA//
    }
    public Double aL(double D, double d){
        return D * d / 2; //AREA//
        //L = Losangulo a = VALOR DOS LADO d = ALTURA D = LARGURA//
    }
    public Double pTR(double c, double d, double b, double B,double h){
        return c + d + b + B; // PERIMETRO//
        //TR = TRAPEZIO C = VALOR DO LADO ESQUERDO d = VALOR DO LADO DIREITO b = BASE MENOR B = BASE MAIOR H = ALTURA//
    }
    public Double aTR(double b, double B,double h){
        return (B + b) * h / 2; //AREA//
        //TR = TRAPEZIO C = VALOR DO LADO ESQUERDO d = VALOR DO LADO DIREITO b = BASE MENOR B = BASE MAIOR H = ALTURA//
    }
    public Double pC(double r){
        return 2 * 3.14 * r; // PERIMETRO//
        //C = CIRCULO r = RAIO//
    }
    public Double aC(double r){
        return 3.14 * (r * r); //AREA//
        //C = CIRCULO r = RAIO//
    }
}
