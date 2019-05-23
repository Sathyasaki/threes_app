/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threesgame;

import static java.lang.Math.pow;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author sathya
 */
public class Threesgame {

     public static void main(String[] args) {
        int row,col,count=0,sum=0,power,val,max=0,place;
        System.out.print("Enter the N:");
        Scanner scan=new Scanner(System.in);
        int n,i,first,second,c=0;
        char  ch;
      
   
        n=scan.nextInt();
         int matrix[][]=new int[n][n];
         int change[][]=new int[n][n];
        for (row=0;row<n;row++)
        {
            for(col=0;col<n;col++)
            {
                matrix[row][col]=0;
                change[row][col]=0;
                
            }
        }
        first=randomNumberInRange(1, (n*n)-1);
        second=randomNumberInRange(1, (n*n)-1);
        if(first==second)
        {
        matrix[first/n][first%n]=1;
        matrix[(second+1)/n][(second+1)%n]=2;
        }
        else
        {
            matrix[first/n][first%n]=1;
            matrix[second/n][second%n]=2;
            
        }
        for (row=0;row<n;row++)
        {
            for(col=0;col<n;col++)
            {
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println("\n");
        }
       
            while(count<=(n*n)){
            System.out.println("\nEnter the key:");
            ch=scan.next().charAt(0);
            switch(ch)
            {
                
                case 'u':
                    sum=0;
                    for (row=0;row<n;row++)
                         {
                    for(col=0;col<n;col++)
                            {
                                if(matrix[row][col]!=0)
                                {
                                    //count++;
                                    if(row>0)
                                    {
                                        
                                        if(matrix[row-1][col]==0)
                                        {
                                            matrix[row-1][col]=matrix[row][col];
                                            matrix[row][col]=0;
                                        
                                            
                                        }
                                        
                                        else
                                        {
                                            if(matrix[row][col]==2 && matrix[row-1][col]==2||matrix[row][col]==1&& matrix[row-1][col]==1) 
                                            {
                                                 change[row-1][col]=1;
                                                  change[row][col]=1;
                                            }
                                            else if(((matrix[row][col]==2&& matrix[row-1][col]==1)||(matrix[row][col]==matrix[row-1][col])||(matrix[row][col]==1&& matrix[row-1][col]==2))){
                                                matrix[row-1][col]=matrix[row-1][col]+matrix[row][col];
                                                System.out.print(matrix[row-1][col]);
                                                matrix[row][col]=0;
                                                max=matrix[row-1][col];
                                                change[row-1][col]=1;
                                                
                                            }
                                                
                                        }
                                    }     
                                        
                                }
                               
                                
                              }
                        }
                                        place=randomNumberInRange(0, (n-1));
                                        if(matrix[n-1][place]==0)
                                matrix[n-1][place]=randomNumberInRange(1, 3);
                                        else
                                            matrix[n-1][(place+1)%n]=randomNumberInRange(1, 3);
                               
                          for (row=0;row<n;row++)
                         {
                    for(col=0;col<n;col++)
                            {
                              //if( change[row][col]!=0){
                                   //c++;
                                   //change[row][col]=0;
                              // }
                                
                                System.out.print(matrix[row][col]+" ");
                                 /*val=matrix[row][col]/3;
                               
                                power=val>>1;
                           
                                if(matrix[row][col]>=3)
                                sum+=(int)pow(3,(power+1));*/
                            }
                    System.out.println("\n");
                         }
           // System.out.print(sum);
                    break;
                case 'd':
                    sum=0;
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
                                             change[row+1][col]=1;
                                           
                                           
                                        }
                                        
                                        else
                                        {if(matrix[row][col]==2&&matrix[row+1][col]==2||matrix[row][col]==1&&matrix[row+1][col]==1) {
                                        change[row][col]=1;
                                         change[row+1][col]=1;
                                        
                                        
                                        } else if(matrix[row][col]==2&& matrix[row+1][col]==1||matrix[row][col]==matrix[row+1][col]||matrix[row][col]==1&& matrix[row+1][col]==2&& change[row+1][col]!=1){
                                                matrix[row+1][col]=matrix[row+1][col]+matrix[row][col];
                                                matrix[row][col]=0;
                                                max=matrix[row+1][col];
                                                 change[row+1][col]=1;
                                                
                                                
                                            }
                                                
                                            }
                                        }     
                                        
                                    }
                              
                                }
                                  
                            }
                   place=randomNumberInRange(0, (n-1));
                   if(matrix[0][place]==0)
                                matrix[0][place]=randomNumberInRange(1, 3);
                   else
                       
                                     matrix[0][(place+1)%n]=randomNumberInRange(1, 3);
                                
                          for (row=0;row<n;row++)
                         {
                    for(col=0;col<n;col++)
                            {
                              /* if( change[row][col]!=0){
                                   c++;
                                   change[row][col]=0;
                               }*/
                                
                                System.out.print(matrix[row][col]+" ");
                               /* val=matrix[row][col]/3;
                               
                                power=val>>1;
                           
                                if(matrix[row][col]>=3)
                                sum+=(int)pow(3,(power+1));*/
                          
                            }
                    System.out.println("\n");
                         }
                                //System.out.print(sum);
           
                    break;
                case 'l':
                    sum=0;
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
                                            //change[row][col]=1;
                                        }
                                        
                                        else
                                        {
                                            if(matrix[row][col]==2&&matrix[row][col-1]==2||matrix[row][col]==1&&matrix[row][col-1]==1) {
                                            } else if(matrix[row][col]==2&& matrix[row][col-1]==1||matrix[row][col]==matrix[row][col-1]||matrix[row][col]==1&& matrix[row][col-1]==2&& change[row][col]==0){
                                                matrix[row][col-1]=matrix[row][col-1]+matrix[row][col];
                                                matrix[row][col]=0;
                                                max=matrix[row][col-1];
                                                 //change[row][col]=1;
                                               
                                                
                                            }
                                                
                                            }
                                        }     
                                        
                                    }
                       
                                }
                                
                            }
                    place=randomNumberInRange(0, (n-1));
                    if(matrix[place][n-1]==0)
                                matrix[place][n-1]=(int)randomNumberInRange(1,3 );
                    else
                        
                                matrix[(place+1)%n][n-1]=(int)randomNumberInRange(1,3 );
                           for (row=0;row<n;row++)
                         {
                    for(col=0;col<n;col++)
                            {
                               // if( change[row][col]!=0){
                                 //  c++;
                                  // change[row][col]=0;
                              // }
                                System.out.print(matrix[row][col]+" ");
                                /* val=matrix[row][col]/3;
                               
                                power=val>>1;
                           
                                if(matrix[row][col]>=3)
                                sum+=(int)pow(3,(power+1));*/
                            }
                    System.out.println("\n");
                         }
           // System.out.print(sum);
                    break;
                case 'r':
                    sum=0;
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
                                             change[row][col]=1;
                                           
                                        }
                                        
                                          else
                                        {
                                            if(matrix[row][col]==2&& matrix[row][col+1]==2||matrix[row][col]==1&& matrix[row][col+1]==1) {
                                            } else if(matrix[row][col]==2&& matrix[row][col+1]==1||matrix[row][col]==matrix[row][col+1]||matrix[row][col]==1&& matrix[row][col+1]==2&& change[row][col]==0){
                                                matrix[row][col+1]=matrix[row][col+1]+matrix[row][col];
                                                matrix[row][col]=0;
                                                max=matrix[row][col+1];
                                                 change[row][col]=1;
                                              
                                                
                                            }
                                                
                                            }
                                        }     
                                        
                                    }
                               
                                }
                                
                            }
                                place=randomNumberInRange(0, (n-1));
                                if(matrix[place][0]==0)
                                matrix[place][0]=(int)randomNumberInRange(1, 3);
                                else
                                    matrix[(place+1)%n][0]=(int)randomNumberInRange(1, 3);
                               
                           for (row=0;row<n;row++)
                         {
                    for(col=0;col<n;col++)
                            {
                               if( change[row][col]!=0){
                                   c++;
                                   change[row][col]=0;
                               }
                                System.out.print(matrix[row][col]+" ");
                                /* val=matrix[row][col]/3;
                               
                                power=val>>1;
                           
                                if(matrix[row][col]>=3)
                                sum+=(int)pow(3,(power+1));*/
                            }
                    System.out.println("\n");
                    
                         }
            //System.out.print(sum);
                    break;
                default:
                    System.out.println("Press correct key..!.\nU:UP\nD:DOWN\nL:LEFT\nR:RIGHT");
         
            }
          for(row=0;row<n;row++)
          {
              for(col=0;col<n;col++)
              {
                  
                  if(matrix[row][col]!=0)
                  {
                      //if(row>0&&col>0){
                      //if((matrix[row][col]!=2&&matrix[row+1][col]!=2&&matrix[row-1][col]!=2&&matrix[row][col+1]!=2&&matrix[row][col-1]!=2)||(matrix[row][col]!=1&&matrix[row+1][col]!=1&&matrix[row-1][col]!=1&&matrix[row][col+1]!=1&&matrix[row][col-1]!=1))
                        val=matrix[row][col]/3;
                               
                                power=val>>1;
                           
                                if(matrix[row][col]>=3)
                                sum+=(int)pow(3,(power+1));
                              
                      count++;
                      
                      
                      //}
    // if( ( matrix[row][col]!=2&&matrix[row+1][col]!=2&&matrix[row-1][col]!=2&&matrix[row][col+1]!=2&&matrix[])
                  }
              }
          }
            System.out.print(sum+" ");
         // System.out.print(count);
            
          if(count==(n*n))
        {
            
        System.out.println("\nGame over And your score is:"+sum);
        break;
         }
          else
              count=0;
        
            
            
        }
            
       

    
     }
    public static int randomNumberInRange(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

}

