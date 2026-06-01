public class SandClock{
    public static void pattern(int name){
        int n=name;
        for(int i=0;i<n;i++){
            for(int j=0;j<n+i-n;j++){
                System.out.print(" ");
            }
             for(int j=n;j>=(2*i)+1;j--){
             //   System.out.print(name.charAt(j));
             System.out.print("*");
            }
            System.out.println();
        }
         for(int i=n;i>=0;i++){
            for(int j=n+i-n;j>=0;j++){
                System.out.print(" ");
            }
             for(int j=(2*i)+1;j>=n;j++){
             //   System.out.print(name.charAt(j));
             System.out.print("*");
            }
            System.out.println();
        }
    
    }
    public static void main(String args[]){
       int name=5;
        pattern(name);
    }
}