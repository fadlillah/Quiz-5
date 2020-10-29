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