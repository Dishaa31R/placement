class Patient{
   private String nameno;
   private int age;
   private String gender;
   private double weight,height,bmi;
   
}
public class HealthMetric{
    public static void calculate(int age,double bmi){
        System.out.println("Body Age:");
        if(bmi<18.5)
           System.out.println(age+2);
        else if(bmi>25)
            System.out.println(age+5);
        else
            System.out.println(age);
        }

    public static void calculate(double bmi,int age,String gender){
        System.out.println("Fat Rate:");
        if(gender.equals("male"))
            System.out.println((1.20*bmi)+(0.23*age)-16.2);
        else
              System.out.println((1.20*bmi)+(0.23*age)-5.4);
    }
    public static void calculate(Patient object){
        System.out.println(object.getname()+"\nBMI");
        object.Setheight(object.getheight()/=100);
        object.setbmi()=object.getweight()/(object.getheight()*object.getheight());
        System.out.println(object.getbmi());
        calculate(object.getage(),object.getbmi());
        calculate(object.getbmi(),object.getage(),object.getgender());
    }
    public static void main(String args[]){
        Patient patient1=new Patient();
        patient1.setname()="Amshi";
        patient1.setage()=34;
        patient1.setgender()="female";
        patient1.setweight()=45;
        patient1.setheight()=158;
        calculate(patient1);
    }

    
 
}