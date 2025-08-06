/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deaa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author PC 27 - LAB R1
 */
public class Deaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
//        System.out.println("Halo Dunia");
//        System.out.println("Halo"+"Dunia");
//        System.out.println(2+" "+5);
//        System.out.println(2+5);
//        System.out.println("Angka "+" "+5);
//        System.out.println("2 + 5"+" = "+2+5);
//        System.out.println("2 + 5"+" = "+(2+5));
//        System.out.println("Halo" + "Inces");
//
//String namaDepan = "";
//String namaBelakang = "";
//Scanner input = new Scanner(System.in);
//System.out.println("Nama Depan : ");
////membaca inputan user
//namaDepan = input.next();
//System.out.println("Nama Belakang : ");
////membaca inputan user
//namaBelakang = input.next();
//System.out.println("Nama Saya adalah :");
//System.out.println(namaDepan + " " + namaBelakang);
//String nama = JOptionPane.showInputDialog("Masukan Nama:");
//System.out.println("Nama : "+nama);

String namaDepan = "";
String namaBelakang = "";
//buat objek dari inputStream
InputStreamReader ireader = new InputStreamReader(System.in);
//buat objek bufferreader
BufferedReader breader = new BufferedReader(ireader);
System.out.println("Nama Depan : ");
//membaca inputan user
namaDepan = breader.readLine();
System.out.println("Nama Belakang : ");
//membaca inputan user
namaBelakang =
breader.readLine();
System.out.println("Nama Saya adalah :");
System.out.println(namaDepan + " " + namaBelakang);
    

//String a = JOptionPane.showInputDialog("Masukan nilai untuk variabel a : ");
//String b = JOptionPane.showInputDialog("Masukan nilai untuk variabel b : ");
//System.out.println("Hasil :" +
//(Integer.parseInt(a) *
//Integer.parseInt(b)));

//String nama = "Aqila";
//String jurusan = "PPLG";
//JOptionPane.showMessageDialog(null, "Halo " + nama
//+ ",jurusan Kamu " + jurusan);

//JOptionPane.showMessageDialog(
//null, "Sebuah Informasi.","Informasi",
//JOptionPane.INFORMATION_MESSAGE);

//JOptionPane.showMessageDialog(
//null, "Sebuah Error !","Error",
//JOptionPane.ERROR_MESSAGE);

//JOptionPane.showMessageDialog(
//null, "Sebuah Peringatan.","Peringatan",
//JOptionPane.WARNING_MESSAGE);

//JOptionPane.showMessageDialog(
//null, "Sebuah Pertanyaan.", "Pertanyaan",
//JOptionPane.QUESTION_MESSAGE);

//JOptionPane.showMessageDialog(
//null, "Sebuah Plain Message.","Plain Message",
//JOptionPane.PLAIN_MESSAGE);

//int pertanyaan = JOptionPane.showConfirmDialog(null, "Pilih Yes atau No?", "Pertanyaan",JOptionPane.YES_NO_OPTION);
//
//if(JOptionPane.YES_OPTION == pertanyaan){
//JOptionPane.showMessageDialog(null, "Kamu memilih Yes.");
//}else if(JOptionPane.NO_OPTION == pertanyaan){
//JOptionPane.showMessageDialog(null, "Kamu memilih No.");
    }
    
}
