package Siralama;
import java.util.Scanner;

    public class Siralama {

        public static void main(String[] args) {
            
            Scanner tar=new Scanner(System.in);

            int a,b,c;

            System.out.println("Birinci Sayıyı Giriniz");
            a=tar.nextInt();
            System.out.println("İkinci Sayıyı Giriniz");
            b=tar.nextInt();
            System.out.println("Üçüncü Sayıyı Giriniz");
            c=tar.nextInt();

  
        
           

             if(a>b&&a>c){

                if(b==c){

                    if(b==a){
    
                        System.out.println("Sayılar Eşit");
                    }
    
                    else if(b>a){
    
                        System.out.println("Sıralama"+a+"<"+c+"="+b);
                    }
    
                    else{
    
                        System.out.println("Sıralama"+b+"="+c+"<"+a);
                    }
                }

                else if(b>c){

                    System.out.println("Sıralama"+c+"<"+b+"<"+a);

                }

                else{

                    System.out.println("Sıralama"+b+"<"+c+"<"+a);
                }
            }

            else if (b>a&&b>c){

                if(a==c){

                    if(b==c){
    
                        System.out.println("Sayılar Eşit");
                    }
    
                    else if(b>c){
    
                        System.out.println("Sıralama"+c+"="+a+"<"+b);
                    }
    
                    else{
    
                        System.out.println("Sıralama"+b+"<"+a+"="+c);
                    }
                }

                else if(a>c){

                    System.out.println("Sıralama: "+c+"<"+a+"<"+b);
                }

                else{

                    System.out.println("Sıralama "+a+"<"+c+"<"+b);
                }
            }

            else if(c>a&&c>b){

                if(a==b){

                     if(b>c){
    
                        System.out.println("Sıralama"+c+"<"+b+"="+a);
                    }
    
                    else{
    
                        System.out.println("Sıralama"+a+"="+b+"<"+c);
                    }
                }

                else if(b>a){

                    System.out.println("Sıralama "+a+"<"+b+"<"+c);

                }

                else{

                    System.out.println("Sıralama "+b+"<"+a+"<"+c);
                }
            }
            else {

                System.out.println("Sıralama "+a+"="+b+"="+c);
            }

        
        }







        }











    











