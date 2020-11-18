/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package van.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static van.util.MathUtility.*;
//chỉ có từ JDK 5 hàm static mà hong cần tên class chấm
//do khai báo sẵn tên class và tên hàm static qua lệnh
//import static
//sau này sài hàm static của class hong cần tên class chấm

/**
 *
 * @author AVITA
 */
public class MathUtilityTest {
    
   //viết ra những tình huống xài hàm getFactorial() 
    //kt xem actual == expected hay k?
    //như truyền thống bên main nhưng đây xịn xò hơn show ra màu XANH - ĐỎ
    //nó còn dùng cho việc CI - Continuous Intergration
    //                     CD - Continuous Delivery
    //                     CT - Continuous Regression Test
    //                     DevOps- Development & Operation
    //doanh nghiệp đang sài
    //app liên tục đc kt chất lượng code, build ra file .jar .war
    //đẩy lên 1 server trung gian - Staging Environment để cho nhóm test
    //sẵn sàng test
    //sau đó đẩy thẳng lên Production Server, máy chạy thật ở nơi khách
    //mọi việc sẽ bắt đầu từ kusc dev push code lên github
    //mọi thứ có thể tự động , k cần ng can thiệp
    
    @Test //từ khóa này - biến hàm này thành public static void main()
    //show ra màu xanh- đỏ dựa trên sự khớp nhau của expected vs actual
    //qua hàm assertEquals() .. mà thư viện cung cấp
    //thay vì so sánh bằng mắt, ta nhờ hàm so sánh dùm, thấy màu dùm
    public void getFactorial_RunWell_IfValidArguement(){
        assertEquals(120, getFactorial(5));
        assertEquals(24, getFactorial(4));
        assertEquals(720, getFactorial(6));
        assertEquals(1, getFactorial(0)); 
        //hãy tính dùm tui 5! coi có = 120 hong
        //có báo xanh, ko báo đỏ
        //tui mún thấy màu xanh trên github để tui đóng dấu chất lượng code
    }
    
}
