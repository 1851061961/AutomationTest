package Day_5;
import java.util.ArrayList;
import java.util.List;
public class Tennhanvien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		System.out.println("Danh sach nhan vien la: ");
        list.add("NV1");
        list.add("NV2");
        list.add("NV3");
        list.add("NV4");
        list.add("NV5");
        
        // Show list through for-each
        for (String nv : list) {
            System.out.println(nv);
        }
	}

}
