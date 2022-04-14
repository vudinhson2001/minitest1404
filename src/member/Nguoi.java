package member;

public class Nguoi {
    private String ma ;
    private  String ten;
    private  int tuoi;

    public Nguoi(String ma, String ten, int tuoi) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
    }

    public Nguoi() {
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "ma='" + ma + '\'' +
                ", ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                '}';
    }
}
