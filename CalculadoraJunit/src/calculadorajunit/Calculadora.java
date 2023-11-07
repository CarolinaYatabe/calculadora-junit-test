
package calculadorajunit;

/** 
 * @author Carolina Ayumi Yatabe
 * @version 1.1
 * Classe que reliza as operaações de adição, subtração, divisão e multiplicação
 */

public class Calculadora {
    
    /**
     * Operação: Adição
     * 
     * @param a Primeiro operando
     * @param b Segundo operando
     * @return resultado da adição
    */
    
    //Soma de dois número positivos
    public int somarDoisPositivos(int a, int b){
        return a + b;
    }
    
    //Soma de um número positivo e um negativo
    public int somarUmPositivoUmNegativo(int a, int b){
        return a + -(b);
    }
    
    //Soma de dois números negativos
    public int somarDoisNegativos(int a, int b){
        return -(a) + -(b);
    }
    
    //Soma de dois números sendo um deles igual a zero
    public int somarUmZero(int a, int b){
        return a + b;
    }
    
    //Soma de dois números sendo que ambos são iguais a zero 
    public int somarDoisZeros(int a, int b){
        return a + b;
    }
  
    /**
     * Operação: Subtração
     * 
     * @param a O operando do qual será subtraído um valor
     * @param b Valor a ser subtraído
     * @return resultado da subtração
     */
    
    
    //Subtração de dois números positovos
    public int subtrairDoisPositivos(int a, int b){
        return a - b;
    }
    
    //Subtração de dois números negativos
    public int subtrairDoisNegativos(int a, int b){
        return -(a) - -(b);
    }
    
    //Subtração de dois números sendo um deles negativo
    public int subtrairUmNegativo(int a, int b){
        return -(a) - b;
    }
    
    //Subtração de dois números sendo um deles igual a zero
    public int subtrairUmZero(int a, int b){
        return a - b;
    }
    
    //Subtração de dois números sendo ambos iguais a zero
    public int subtrairDoisZeros(int a, int b){
        return a - b;
    }
    
    /**
     * 
     * @param a Primeiro fator
     * @param b Segundo fator
     * @return produto da multiplicação dos fatores
     */
    
    
    //Multiplicação de dois números positivos
    public int multiplicarDoisPositivos(int a, int b){
        return a * b;
    }
    
    
    //Multiplicação de dois números negativos
    public int multiplicarDoisNegativos(int a, int b){
        return -(a) * -(b);
    }
    
    //Multiplicação de dois números sendo um deles negativo
    public int multiplicarUmNegativo(int a, int b){
        return -(a) * b;
    }
    
    //Multiplicação de dois números senddo um deles igual a zero
    public int multiplicarUmZero(int a, int b){
        return a * b;
    }
    
    //Multiplicação de dois números sendo ambos iguais a zero
    public int multiplicarDoisZeros(int a, int b){
        return a * b;
    }
    
    /**
     *  
     * @param a Dividendo
     * @param b Divisor
     * @return Quociente da divisão entre o dividendo e o divisor
     */
    
    
    //Divisão de dois números positivos
    public int dividirDoisPositivos(int a, int b){
        return a / b;
    }
    
    
    //Divisão de dois números negativos
    public int dividirDoisNegativos(int a, int b){
        return -(a) / -(b);
    }
    
    //Divisão de dois números sendo um deles negativo
    public int dividirUmNegativo(int a, int b){
        return -(a) / b;
    }
    
    //Divisãao de dois números sendo um deles igual a zero
    public int dividirUmZero(int a, int b){
        return a / b;
    }
    
    //Divisão de dois números sendo ambos iguis a zero
    public int dividirDoisZeros(int a, int b){
        return a / b;
    }
}
