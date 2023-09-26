
package calculadorajunit;

public class Calculadora {
    
    //Soma
    
    public int somarDoisPositivos(int a, int b){
        return a + b;
    }
    
    public int somarUmPositivoUmNegativo(int a, int b){
        return a + -(b);
    }
    
    public int somarDoisNegativos(int a, int b){
        return -(a) + -(b);
    }
    
    public int somarUmZero(int a, int b){
        return a + b;
    }
    
    public int somarDoisZeros(int a, int b){
        return a + b;
    }
  
    
    //Subtração
    
    public int subtrairDoisPositivos(int a, int b){
        return a - b;
    }
    
    public int subtrairDoisNegativos(int a, int b){
        return -(a) - -(b);
    }
    
    public int subtrairUmNegativo(int a, int b){
        return -(a) - b;
    }
    
    public int subtrairUmZero(int a, int b){
        return a - b;
    }
    
    public int subtrairDoisZeros(int a, int b){
        return a - b;
    }
    
    
    //Multiplicação
    
    
    public int multiplicarDoisPositivos(int a, int b){
        return a * b;
    }
    
    public int multiplicarDoisNegativos(int a, int b){
        return -(a) * -(b);
    }
    
    public int multiplicarUmNegativo(int a, int b){
        return -(a) * b;
    }
    
    public int multiplicarUmZero(int a, int b){
        return a * b;
    }
    
    public int multiplicarDoisZeros(int a, int b){
        return a * b;
    }
    
    //Divisão
    
    public int dividirDoisPositivos(int a, int b){
        return a / b;
    }
    
    public int dividirDoisNegativos(int a, int b){
        return a / b;
    }
    
    public int dividirUmNegativo(int a, int b){
        return a / b;
    }
    
    public int dividirUmZero(int a, int b){
        return a / b;
    }
    
    public int dividirDoisZeros(int a, int b){
        return a / b;
    }
}
