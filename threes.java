/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threes;
import java.io.*;
import java.util.*;
/**
 *
 * @author sathya
 */
public class Threes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int row,col,count=0,val;
        Scanner scan=new Scanner(System.in);
        int n;
        char  ch;
      
   
        n=scan.nextInt();
         int matrix[][]=new int[n][n];
        for (row=0;row<n;row++)
        {
            for(col=0;col<n;col++)
            {
                matrix[row][col]=0;
            }
        }
        matrix[0][0]=1;
        matrix[0][1]=2;
        for (row=0;row<n;row++)
        {
            for(col=0;col<n;col++)
            {
                if(matrix[row][col]!=0)
                    count++;
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println("\n");
        }
        if(count==(n*n))
            System.out.print("Game Over");
        else
        {
            //while(count<=(n*n)){
            System.out.println("Enter the key");
            ch=scan.next().charAt(0);
            switch(ch)
            {
                case 'u':
                    for (row=0;row<n;row++)
                         {
                    for(col=0;col<n;col++)
                            {
                                if(matrix[row][col]!=0)
                                {
                                    if(row>0)
                                    {
                                        if(matrix[row-1][col]==0)
                                        {
                                            matrix[row-1][col]=matrix[row][col];
                                            matrix[row][col]=0;
                                        }
                                        
                                        else
                                        {
                                            if(matrix[row][col]==2&& matrix[row-1][col]==1||matrix[row][col]==matrix[row-1][col]||matrix[row][col]==1&& matrix[row-1][col]==2){
                                                matrix[row-1][col]=matrix[row-1][col]+matrix[row][col];
                                                matrix[row][col]=0;
                                                
                                            }
                                                
                                            }
                                        }     
                                        
                                    }
                               
                                
                                }
                     matrix[n-1][col-1]=randomNumberInRange(1, 3);
                                //4
                                break;
                    
                                
                            }
                           for (row=0;row<n;row++)
                         {
                    for(col=0;col<n;col++)
                            {
                                System.out.print(matrix[row][col]+" ");
                            }
                    System.out.println("\n");
                         }
           
                    break;
                case 'd':
                    for (row=0;row<n;row++)
                         {
                    for(col=0;col<n;col++)
                            {
                                if(matrix[row][col]!=0)
                                {
                                    if(row<(n-1))
                                    {
                                        if(matrix[row+1][col]==0)
                                        {
                                            matrix[row+1][col]=matrix[row][col];
                                            matrix[row][col]=0;
                                           
                                        }
                                        
                                        else
                                        {
                                            if(matrix[row][col]==2&& matrix[row+1][col]==1||matrix[row][col]==matrix[row+1][col]||matrix[row][col]==1&& matrix[row+1][col]==2){
                                                matrix[row+1][col]=matrix[row+1][col]+matrix[row][col];
                                                matrix[row][col]=0;
                                                
                                            }
                                                
                                            }
                                        }     
                                        
                                    }
                               matrix[0][col-1]=randomNumberInRange(1, 3);
                                //break;
                                }
                                
                            }
                           for (row=0;row<n;row++)
                         {
                    for(col=0;col<n;col++)
                            {
                                System.out.print(matrix[row][col]+" ");
                            }
                    System.out.println("\n");
                         }
           
                    break;
                case 'l':
                    for (row=0;row<n;row++)
                         {
                    for(col=0;col<n;col++)
                            {
                                if(matrix[row][col]!=0)
                                {
                                    if(col>0)
                                    {
                                        if(matrix[row][col-1]==0)
                                        {
                                            matrix[row][col-1]=matrix[row][col];
                                            matrix[row][col]=0;
                                        }
                                        
                                        else
                                        {
                                            if(matrix[row][col]==2&& matrix[row][col-1]==1||matrix[row][col]==matrix[row][col-1]||matrix[row][col]==1&& matrix[row][col-1]==2){
                                                matrix[row][col-1]=matrix[row][col-1]+matrix[row][col];
                                                matrix[row][col]=0;
                                                
                                            }
                                                
                                            }
                                        }     
                                        
                                    }
                               //matrix[row][n-1]=randomNumberInRange(1, 3);
                                //break;
                                }
                                
                            }
                           for (row=0;row<n;row++)
                         {
                    for(col=0;col<n;col++)
                            {
                                System.out.print(matrix[row][col]+" ");
                            }
                    System.out.println("\n");
                         }
           
                    break;
                case 'r':
                    for (row=0;row<n;row++)
                         {
                    for(col=0;col<n;col++)
                            {
                                if(matrix[row][col]!=0)
                                {
                                    if(col<(n-1))
                                    {
                                        if(matrix[row][col+1]==0)
                                        {
                                            matrix[row][col+1]=matrix[row][col];
                                            matrix[row][col]=0;
                                        }
                                        
                                        else
                                        {
                                            
                                               
                                            
                                            if(matrix[row][col]==2&& matrix[row][col+1]==1||matrix[row][col]==matrix[row][col+1]||matrix[row][col]==1&& matrix[row][col+1]==2){
                                                
                                                matrix[row][col+1]=matrix[row][col+1]+matrix[row][col];
                                                matrix[row][col]=0;
                                                
                                            }
                                                
                                            
                                        }
                                        }     
                                        
                                    }
                               //4
                               //matrix[row][0]=randomNumberInRange(1, 3);
                                
                                }
                                
                            }
                           for (row=0;row<n;row++)
                         {
                    for(col=0;col<n;col++)
                            {
                                System.out.print(matrix[row][col]+" ");
                            }
                    System.out.println("\n");
                         }
           
                    break;
         
           // }
            
        }
            count++;
        }
        for(row=0;row<n;row++)
        {
            for(col=0;col<n;col++)
            {
                if(matrix[row][col]!=1&&matrix[row][col]!=2){
                    val=matrix[row][col]/3;
                    
                    
                }
                    
            }
        }

    }
    public static int randomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
    

}
