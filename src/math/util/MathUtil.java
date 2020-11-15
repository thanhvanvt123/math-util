/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import van.util.MathUtility;

/**
 *
 * @author AVITA
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long expected = 120; //hi vong thay 120 neu goi 5!
        long actual = MathUtility.getFactorial(5);
        //in ra kt su khop nhau giua cai ta muon va cai ta lam
        System.out.println("5! expected:" + expected);
        System.out.println("5! actual:" + actual);
        
        //tiep tuc cho cac tình huống test khác cần phải test ta gọi là test cases
        //về thực hành kì 5
        System.out.println("6!: 720, actual: " + MathUtility.getFactorial(6));
        System.out.println("0!: 1, actual: " + MathUtility.getFactorial(0));
        //ki vong nem ve ngoai le phai la ngoai le
        //IllegalArguementException nếu t cố tình, ng xài hàm của t 
        //đưa tham số âm, tham số >20
        System.out.println("expected: IllegalArguementException: " + MathUtility.getFactorial(-5));
    }
    
}
