import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		
	    //bir dizide 13 var ise 13 ve bir sonraki eleman
        //toplama eklenmeden toplam sonucu bulan kod
        //çarşamba
        
        int toplam =0;
        int nums[] = {13, 1, 13, 13, 13, 2, 5, 13, 1,20,13,2,5};
        for (int i = 0; i <nums.length; i++) {
        if (nums[i] == 13 || (i > 0 && nums[i - 1] == 13)) {    
        continue;      
        } else {
       toplam = toplam + nums[i];
        		    }
        
	}
        System.out.println(toplam);

	}


}
