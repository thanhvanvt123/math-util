/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package van.util;

/**
 *
 * @author AVITA
 */
public class MathUtility {
    //làm bộ thư viện fake giống y chang math
    //math.PI, .abs(), .sqrt(), pow(a,b), a^b
    //là thư viện thì sẽ sài static khi không cần lưu infor cho riêng mình
    //còn thư viện mà vẫn cần lưu infor riêng, thì vẫn non-static như bth
    
    public static final double PI = 3.1415;
    
    //tiện ích tính giai thừa n! = 1.2.3...n
    //0!= 1! = 1
    //âm giai thừa vô nghĩa
    //giai thừa tăng cực nhanh, 21! long không chứa đc
    //chặn giai thừa từ 0 đến 20
    //âm hoặc 21 bỏ ko tính
    
//    public static long getFactorial(int n) {
//        if(n < 0 || n > 20) {
//            throw new IllegalArgumentException("n must be between 0 ... 20");
//        } 
//        if(n == 0 || n == 1){
//            return 1; //dac biet return luon
//        } 
//        //dua nao viết else ở đây trừ điểm
//        //mặc nhiên CPU đến đc đây là hiểu rằng n = 2...20
//        long result = 1;
//        for (int i = 2; i <= n; i++) {
//            result *= i;
//        }
//        return result;
//    }
    
    //hàm đệ quy
    public static long getFactorial(int n) {
        if(n < 0 || n > 20) 
            throw new IllegalArgumentException("n must be between 0 ..20");
        if(n == 0 || n == 1) 
            return 1;
        return n * getFactorial(n - 1);
        //gọi lại chính hàm của mình vs qui mô khác , n - 1
        //đi mãi sẽ về 1
    }
}
