package pertemuan2;
public class main {

    public static void main(String[] args) {
        Kendaraan motor = new Kendaraan("1924",2); 
        Kendaraanparkir park = new Kendaraanparkir("1924",2,4,10);
    }

}

public class Kendaraan{
    private String noPol;
    private int jumRod;
    void Kendaraan(String noPol, int jumRod){
        this.noPol = noPol;
        this.jumRod = jumRod;
    }
    public String getnoPol(){
        return noPol;
    }
    public void setnoPol(String noPol){
        this.noPol = noPol;
    }
    public int getjumRod(){
        return jumRod;
    }
    public void setjumRod(int jumRod){
        this.jumRod = jumRod;
    } 
}

public class Kendaraanparkir extends Kendaraan{
    private int jamMasuk;
    private int jamKeluar;
    private int totHarga;
    private int hargaRodaDua = 1000;
    private int hargaRodaEmpat = 2000;
    public Kendaraanparkir(String noPol, int jumRod, int jamMasuk, int jamKeluar){
        super(noPol, jumRod);
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
    }
    public int getHarga(){
        if (jumRod ==2)
        {
            return (jamKeluar - jamMasuk)*hargaRodaDua;
        }
        else if (jumRod == 4)
        {
            return (jamKeluar - jamMasuk)*hargaRodaEmpat;
        }
    }
}