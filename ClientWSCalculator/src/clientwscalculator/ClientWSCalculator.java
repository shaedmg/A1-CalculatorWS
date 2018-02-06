/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientwscalculator;

/**
 *
 * @author entrar
 */
public class ClientWSCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Result = "+suma(1,2) +" ");
    }

    private static int suma(int n1, int n2) {
        calc.Calc_Service service = new calc.Calc_Service();
        calc.Calc port = service.getCalcPort();
        return port.suma(n1, n2);
    }
    
}
