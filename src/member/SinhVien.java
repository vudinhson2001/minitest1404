package member;

public class SinhVien extends Nguoi {
    private double diem;

    public SinhVien(String ma, String ten, int tuoi, double diem) {
        super(ma, ten, tuoi);
        this.diem = diem;
    }

    public SinhVien(double diem) {
        this.diem = diem;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

}
