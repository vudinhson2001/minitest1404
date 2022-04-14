package member;

public class QuanLySinhVien implements QuanLy<SinhVien> {
    private SinhVien[] MangSinhVien = new SinhVien[5];
    private int size = 0;

    @Override
    public void them(SinhVien sinhVien) {
        MangSinhVien[size] = sinhVien;
        size++;
    }

    @Override
    public void sua(String ten, SinhVien sinhVien) {
        MangSinhVien[timKiem(ten)]=sinhVien;
    }

    @Override
    public int timKiem(String ten) {
        for (int i = 0; i < size; i++) {
            if (ten.equals(MangSinhVien[i].getTen())) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void hienThi() {
        for (int i = 0; i < size; i++) {
            System.out.println(MangSinhVien[i]);
        }
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        QuanLySinhVien quanLySinhVien=new QuanLySinhVien();
        SinhVien sv1=new SinhVien("555","Bich",16,5);
        SinhVien sv2=new SinhVien("666","Co",20,7);
        SinhVien sv3=new SinhVien("777","Nhep",18,9);
        SinhVien sv4=new SinhVien("888","Do",19,6);
        quanLySinhVien.them(sv1);
        quanLySinhVien.them(sv2);
        quanLySinhVien.them(sv3);
        quanLySinhVien.them(sv4);
        quanLySinhVien.hienThi();
        SinhVien sv5=new SinhVien("6868","Thuan",19,10);
        quanLySinhVien.sua("Do",sv5);
        quanLySinhVien.hienThi();
        quanLySinhVien.timKiem("Nhep");
        quanLySinhVien.hienThi();


    }
}
