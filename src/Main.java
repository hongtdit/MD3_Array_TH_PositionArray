import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] studen={"dat","hong","son","yen","van","huy"};
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter your name: ");
        String inputname=scanner.nextLine();
        boolean isExit=false;
        for(int i=0; i<studen.length;i++){
            if(studen[i].equals(inputname)){
                System.out.println("possiton :"+ inputname +  " is:" +  (i+1));
                isExit=true;break;
            }
        }
        if(!isExit){
            System.out.println("Not Found:"+ inputname + "in the list");
        }
    }
}
