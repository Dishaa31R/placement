package Day5;

import java.util.Scanner;
import java.util.logging.Logger;
public class DemoLogs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Logger logger=Logger.getLogger(DemoLogs.class.getName()); 
        //Logger logger=Logger.getLogger(null)
        String[] recruiters={"Google","Deloitte","Cognizant","Accenture","Zoho"};
        int day=0;
        System.out.println("Enter the day to get name of the company");
        day=scanner.nextInt();day--;
        logger.info("Requested Day:"+day);
        System.out.println(recruiters[day]);

       /* KYC kyc=KYC.getKyc();
        kyc.name="Disha";kyc.contact=847856225555L; */
    }
    
}
//SingleTon
class KYC{
    String name;long contact;
    private static KYC kyc=new KYC();
    public static KYC getKyc(){
        return kyc;
    }
    private KYC(){}
}
