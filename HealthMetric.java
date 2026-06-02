class Patient{
   private String nameno;
   private int age;
   public String getNameno() {
    return nameno;
}
   public void setNameno(String nameno) {
    this.nameno = nameno;
   }
   public int getAge() {
    return age;
   }
   public void setAge(int age) {
    this.age = age;
   }
   public String getGender() {
    return gender;
   }
   public void setGender(String gender) {
    this.gender = gender;
   }
   public double getWeight() {
    return weight;
   }
   public void setWeight(double weight) {
    this.weight = weight;
   }
   public double getHeight() {
    return height;
   }
   public void setHeight(double height) {
    this.height = height;
   }
   public double getBmi() {
    return bmi;
   }
   public void setBmi(double bmi) {
    this.bmi = bmi;
   }
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
        System.out.println(object.getNameno()+"\nBMI");
        object.setHeight(object.getHeight()/100);
        object.setBmi(object.getWeight()/(object.getHeight()*object.getHeight()));
        System.out.println(object.getBmi());
        calculate(object.getAge(),object.getBmi());
        calculate(object.getBmi(),object.getAge(),object.getGender());
    }
    public static void main(String args[]){
        Patient patient1=new Patient();
        patient1.setNameno("Amshi");
        patient1.setAge(34);
        patient1.setGender("female");
        patient1.setWeight(45);
        patient1.setHeight(158);
        calculate(patient1);
    }

    
 
}