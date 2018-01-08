package calculadoracastro;

public class Calculator {
    
    private double result;
    private double percent;
    private String conversion;
    
    // getters    

    public double getResult() {
        return result;
    }

    public double getPercent() {
        return percent;
    }
    
    public String getConversion() {
        return conversion;
    }
    
    // operações básicas
    
    public void plus(double a, double b){
        this.result = a + b;
    }
    
    public void minus(double a, double b){
        this.result = a - b;
    }
    
    public void times(double a, double b){
        this.result = a * b;
    }
    
    public void division(double a, double b){
        this.result = a / b;
               
    }
    
    // potenciação
    
    public void power(double a, double b){
        this.result = Math.pow(a,b);
    }
    
    // raízes
    
    public void squareRoot(double a){
        this.result = Math.sqrt(a);
    }
    
    public void cubeRoot(double a){
        this.result = Math.cbrt(a);
    }
    
    // porcentagem
    
    public void percentage(double a, double b){
        this.percent = a * b / 100;
    }
    
    // logaritmo
    
    public void log(double a){
        this.result = Math.log(a);
               
    }
    
    // fatorial
    
    public void factorial(double a){
        if (a == 1 || a == 0){
            this.result = 1;
        } else if (a > 1){
            this.result = a;
            for (double i = a - 1; i >= 2; i--){
                this.result = this.result * i;
            }
        } else if (a < 0){
            this.result = 0;
        }
    }
    
    // inverso
    
    public void inverse(double a){
        this.result = Math.pow(a,-1);
    }
    
    // oposto
    
    public void opposite (double a){
        this.result = a * -1;
    }
    
    // número absoluto
    
    public void absolute (double a){
        this.result = Math.abs(a);
    }
    
    // operações trigonométricas
    
    public void sin(double a){
        this.result = Math.sin(a);
    }
    
    public void cos(double a){
        this.result = Math.cos(a);
    }
    
    public void tan(double a){
        this.result = Math.tan(a);
    }
    
    // conversões numéricas
    
    // de decimal
    
    public void decBin(int c){
        this.conversion = Integer.toBinaryString(c);
    }
    
    public void decOct(int c){
        this.conversion = Integer.toOctalString(c);
    }
    
    public void decHex(int c){
        this.conversion = Integer.toHexString(c);
    }   
    
    // de binário
    
    public void binDec(String s){
        this.result = Integer.parseInt(s, 2);
    }
    
    public void binOct(int c){
        this.conversion = Integer.toOctalString(c);
    }
    
    public void binHex(int c){
        this.conversion = Integer.toHexString(c);
    }
    
    // de octal
    
    public void octDec(String s){
        this.result = Integer.parseInt(s, 8);
    }
    
    public void octBin(int c){
        this.conversion = Integer.toBinaryString(c);
    }
    
    public void octHex(int c){
        this.conversion = Integer.toHexString(c);
    }
    
    // de hexadecimal
    
    public void hexDec(String s){
        this.result = Integer.parseInt(s, 16);
    }
    
    public void hexBin(int c){
        this.conversion = Integer.toBinaryString(c);
    }
    
    public void hexOct(int c){
        this.conversion = Integer.toOctalString(c);
    }
    
    
}