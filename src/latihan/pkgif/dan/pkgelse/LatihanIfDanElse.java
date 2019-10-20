//assalamualikum warahmatullah wabarakatuh
//imam vusuvangat
//uin suska riau
package latihan.pkgif.dan.pkgelse;

import java.io.*;

public class LatihanIfDanElse {

    public static void main(String[] args) {
        // TODO code application logic here
        int nilai;
        BufferedReader input = new BufferedReader (new InputStreamReader(System.in)); 
        char grade;
         
        try {
            System.out.print ("Input nilai (0-100): ");
            nilai = Integer.parseInt(input.readLine());
            if (nilai >= 60) {
                System.out.println ("LULUS");
            } else {
                System.out.println ("GAGAL");
                 
            }
            if (nilai >= 85 && nilai <= 100) {
                grade = 'A';
            } else if (nilai >= 75 && nilai < 85) {
                grade = 'B';
            } else if (nilai >= 60 && nilai < 75) {
                grade = 'C';
            } else if (nilai >= 45 && nilai < 60) {
                grade = 'D';
            } else if (nilai >= 0 && nilai < 45) {
                grade = 'E';
            } else {
                grade = '-';
            }
            System.out.println ("Grade : " + grade);
             
        }
        catch (Exception e) {
        }
    }
    }
    

