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
    
    //mình mún kết luận hàm ngon mình phải test các trường hợp xài hàm
    //trường hợp 5! 0! -5! 21!
    //mình phải thiết kế các test case tình huống test để sau đó mình verify
    //giữa giá trị trả về của hàm(actual) có khớp vs expected cái mình đã dự đoán
    //hàm chạy phải trả về
    //nếu mọi thứ khớp tức là actual == expected, mới nói hàm ngon
    //nhược điểm: nhìn bằng mắt và so sánh kq của từng case
    //cách này ổn nhưng tiềm ẩn sai sót do nhìn = mắt nhìu case
    
    //cách nâng cao
    //cũng nhìn = mắt, nhưng chỉ nhìn 2 màu xanh- đỏ cho mọi test case
    //có nghĩa: nếu bạn xài hàm vs 100 tham số, chạy hàm 100 tình huống khác nhau
    //bạn chỉ cần nhìn duy nhất 2 màu xanh đor
    //xanh code ổn cho mọi test case mọi tình huống gọi hàm
    //mọi case phải có actual == expected thì mới xanh
    //hàm dùng cho 99 trường hợp, actual == expcted cho 99% tình huống
    //chỉ có 1 tình huống sai,k khớp , hàm không ổn định
    //khi không ổn định ai dám sài, ổn định và chính xác phải cho mọi trường hợp
    //chỉ cần ít nhất 1 cái không ổn, đỏ cả đám để 
    
    
}
