package Jobsheet9;
import java.util.Scanner;
public class ArrayNilai05 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int[] nilaiAkhir = new int[10];

        for (int i=0; i<nilaiAkhir.length; i++){
            System.out.print("Masukkan nilai ke-"+i+" : ");
            nilaiAkhir[i] = scan.nextInt();
        }
        for(int i = 0; i < nilaiAkhir.length; i++){
            if(nilaiAkhir[i] > 70){
                System.out.println("Mahasiswa ke-"+i+"lulus!");

            }else{
                System.out.println("Mahasiswa ke-"+i+"Tidak lulus !");
                
            }
        }
            
        
             
        }


    }
    

