/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit.test.pkg1;
import java.util.Scanner;
/**
 *
 * @author hp.pc
 */
public class UnitTest1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int i=0,size=3;
        int a[]=new int[3];
        System.out.println("enter the array elements to be inserted:");
        for(i=0;i<size;i++)
        {
            a[i]=obj.nextInt();
        }
        System.out.println("enter the index where the number to be deleted:");
        int d=obj.nextInt();
        for(i=d;i<size;i++)
        {
            a[i]=a[i+1];
            size--;
       
        }
        System.out.println("displaying the array");
        for(i=0;i<size;i++)
        {
            System.out.println(+a[i]);
            
        }
        if(i==size)
        {
            System.out.println("array is full");
            
        }
        else if(size==0)
        {
            System.out.println("array is empty");
            
        }
                
        
        
        // TODO code application logic here
    }
    
}
