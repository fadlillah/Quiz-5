public class Kendaraan{
    String noPol;
    int jumRod;
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
