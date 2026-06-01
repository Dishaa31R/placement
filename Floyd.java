

public class Floyd{
    public static void pattern(String name){
        int n=name.length();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(name.charAt(j));
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
    
        String name="helloworld";
        pattern(name);
    }
}