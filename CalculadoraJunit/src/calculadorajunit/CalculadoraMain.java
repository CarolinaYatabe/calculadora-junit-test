
package calculadorajunit;

public class CalculadoraMain {

    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        
        //soma
        
        int somaDoisPositivos = calc.somarDoisPositivos(8, 4);
        System.out.print("Soma Dois Positivos: " + somaDoisPositivos);
        
        int somaUmPositivoUmNegativo = calc.somarUmPositivoUmNegativo(8, 4);
        System.out.print("\n Soma Um + e um -: " + somaUmPositivoUmNegativo);
        
        int somaDoisNegativos = calc.somarDoisNegativos(8, 4);
        System.out.print("\n Soma Dois Negativos: " + somaDoisNegativos);
        
        int somaUmZero = calc.somarUmZero(8, 0);
        System.out.print("\n Soma Um deles = 0: " + somaUmZero);
        
        int somaDoisZeros = calc.somarDoisZeros(0, 0);
        System.out.print("\n Soma Dois Zeros: " + somaDoisZeros);
        
        //subtração
        
        int subtrairDoisPositivos = calc.subtrairDoisPositivos(8, 4);
        System.out.println(" \n Subtracao dois positivos: " + subtrairDoisPositivos);
        
        int subtrairDoisNegativos = calc.subtrairDoisNegativos(8, 4);
        System.out.println("\n subtracao dois Negativos: " + subtrairDoisNegativos);
        
        int subtrairUmNegativo = calc.subtrairUmNegativo(8, 4);
        System.out.println("\n subtracao um + e um -: " + subtrairUmNegativo);
        
        int subtrairUmZero = calc.subtrairUmZero(8, 0);
        System.out.println("\n subtracao um deles = 0: " + subtrairUmZero);
        
        int subtrairDoisZeros = calc.subtrairDoisZeros(0, 0);
        System.out.println("\n subtracao dois zeros: " + subtrairDoisZeros);
        
        //multiplicação
        
        int multiplicarDoisPositivos = calc.multiplicarDoisPositivos(8, 4);
        System.out.println("\n multiplicar Dois Positivos: " + multiplicarDoisPositivos);
        
        int multiplicarDoisNegativos = calc.multiplicarDoisNegativos(8, 4);
        System.out.println("\n multiplicar Dois negativos: " + multiplicarDoisNegativos);
        
        int multiplicarUmNegativo = calc.multiplicarUmNegativo(8, 4);
        System.out.println("\n multiplicar um + e um -: " + multiplicarUmNegativo);
        
        int multiplicarUmZero = calc.multiplicarUmZero(8, 0);
        System.out.println("\n multiplicar um dos valores por 0: " + multiplicarUmZero);
        
        int multiplicarDoisZeros = calc.multiplicarDoisZeros(0, 0);
        System.out.println("\n multiplicar Dois Zeros: " + multiplicarDoisZeros);
        
        //divisão
        
        int dividirDoisPositivos = calc.dividirDoisPositivos(8, 4);
        System.out.println("\n dividir dois positivos: " + dividirDoisPositivos);
        
        int dividirDoisNegativos = calc.dividirDoisNegativos(8, 4);
        System.out.println("\n dividir dois negativos: " + dividirDoisNegativos);
        
        int dividirUmNegativo = calc.dividirUmNegativo(8, 4);
        System.out.println("\n dividir um + e um -: " + dividirUmNegativo);
         
        //Nesta situação é necessário realizar um tratamento no resultado
        //int dividirUmZero = calc.dividirUmZero(8, 0);
        System.out.println("Esse teste e o valor com divisao por zero");
        
        //Nesta situação é necessário realizar um tratamento no resultado
        //int dividirDoisZeros = calc.dividirDoisZeros(0, 0);
        System.out.println("Esse teste e o valor com divisao de zero por zero");

    }
    
}
