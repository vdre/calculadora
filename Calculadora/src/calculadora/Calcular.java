/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Victor Rivera
 */
public class Calcular {

    private int ans;

    public Calcular() {
        ans = 0;
    }
    
    int multiplicacion(int a, int b) {
        return (a * b);
    }

    int suma(int a, int b) {
        return (a + b);
    }

    int resta(int a, int b) {
        return (a - b);
    }

    float division(int a, int b) {
        return (a / b);
    }
    
    public int ans(){
        return ans;
    } 
   public  void limpiar(){
      ans=0;  
    }
}
