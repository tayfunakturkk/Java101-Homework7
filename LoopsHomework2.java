package Loops.Homework2;
import java.util.Scanner;
public class LoopsHomework2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter the number:");
        int n=input.nextInt();
        int sum=0;
        for(int i=1;i<n;i++){
        if(n%i==0){
            sum+=i;}        
        }
        if(sum==n){
            System.out.println(n+" is a perfect number.");
        }
        else{
            System.out.println(n+" is not a perfect number.");
        }
        }
        
    }
