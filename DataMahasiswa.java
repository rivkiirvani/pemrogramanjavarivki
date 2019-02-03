public class DataMahasiswa
{
private String[] name=new String [100];
private String[] alamat=new String [100];
private String[] telepone=new String [100];
private String[] email=new String [100];

private static int mahasiswaCount;
private static int indek;

public DataMahasiswa(){
mahasiswaCount=0;
}
public String getName(int indek){
return name[indek];
}


public String getAlamat(int indek){
return alamat[indek];
}
public String getTelpon(int indek){
return telepon[indek];
}
public String getEmail(int indek){
return email[indek];
}
public void setName( String nama, int indek,String alamat,String telepon,String email){
name[indek] = nama;
alamat[indek] = alamat;
telepon[indek] = telpon;
email[indek] = email;
mahasiswaCount++;
}

public static int getMahasiswaCount(){
return mahasiswaCount;
}
}