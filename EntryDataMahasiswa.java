import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class EntryDataMahasiswa
{
public static void main( String[] args ){
BufferedReader dataIn=new BufferedReader(new InputStreamReader(System.in));
String [] nama =new String[100];
String [] alamat =new String[100];
String [] telp =new String[100];
String [] email =new String[100];

//membuat 5 object CatatanMahasiswa
DataMahasiswa namaRecord = new DataMahasiswa();
for(int i=0; i<2; i++ ){
System.out.print("Masukan Nama: ");
           try{
            nama[i]=dataIn.readLine();
           }catch(IOException e){
           System.out.println("Erorr!");
           }

System.out.print("Masukan Alamat: ");
           try{
            alamat[i]=dataIn.readLine();
           }catch(IOException e){
           System.out.println("Erorr!");
           }
System.out.print("Masukan telepon: ");
           try{
            telp[i]=dataIn.readLine();
           }catch(IOException e){
           System.out.println("Erorr!");
           }
System.out.print("Masukan Email: ");
           try{
            email[i]=dataIn.readLine();
           }catch(IOException e){
           System.out.println("Erorr!");
           }
    }
for(int i=0; i<2; i++ ){
namaRecord.setName(nama[i],i,alamat[i],telp[i],email[i]);
System.out.println("===========================================");
System.out.println("Nama                  :"+namaRecord.getName(i) );
System.out.println("Alamat                :"+namaRecord.getAlamat(i) );
System.out.println("Telepon               :"+namaRecord.getTelepon(i) );
System.out.println("Email                 :"+namaRecord.getEmail(i) );
System.out.println("===========================================");
}

System.out.println("\nTotal Jumlah Mahasiswa ="+DataMahasiswa.getMahasiswaCount());
}
}