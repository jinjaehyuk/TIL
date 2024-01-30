import com.example.domain.Product;
import com.example.repository.ProductDao;
import com.example.service.VendingMachineAdminService;
import com.example.service.VendingMachineAdminServiceImpl;
import com.example.service.VendingMachineService;
import com.example.service.VendingMachineServiceImpl;
import com.example.ui.VendingMachineAdminUI;
import com.example.ui.VendingMachineUI;

public class VendingMachineAdmin {


    private int adminPass = 1234;
    private ProductDao productDao;

    public VendingMachineAdmin(ProductDao productDao) {
        this.productDao = productDao;
    }

    public void adminPage(){
        VendingMachineAdminUI vmAdminUI = new VendingMachineAdminUI();
        VendingMachineUI vmUI = new VendingMachineUI();
        int writePass = vmAdminUI.adminPassword();
        if(writePass != adminPass){
            System.out.println("관리자 비밀번호와 일치하지 않습니다.");
            return;
        }
        VendingMachineAdminService vmaService = new VendingMachineAdminServiceImpl(productDao.getProducts());
        VendingMachineService vmService = new VendingMachineServiceImpl(productDao.getProducts());

        while(true){
            System.out.println("==========관리자 페이지입니다=========");
            vmUI.printUserList(vmaService.getUsers());
            int adminMenuId = vmAdminUI.adminMenu();
            if(adminMenuId ==1){    //상품입력
                Product product = vmAdminUI.addProduct();
                vmaService.addProduct(product);
                productDao.saveProduct(vmaService.getUsers());
            }else if(adminMenuId == 2){ //상품 수정
                int num = vmAdminUI.delProduct();
                boolean isFindNum = vmaService.exists(num);
                if(isFindNum){
                    Product updateProduct = vmAdminUI.updProduct(num);
                    vmaService.updateProduct(updateProduct);
                    System.out.println("수정되었습니다.");
                }else{
                    System.out.println("수정할 상품이 없습니다.");
                }
            }else if(adminMenuId == 3){ //상품 삭제
                int num = vmAdminUI.delProduct();
                vmaService.delProduct(num);
            }else if(adminMenuId == 4){
                System.out.println("관리자모드를 종료합니다.");
                productDao.saveProduct(vmaService.getUsers());
                return;
            }
        }
    }
}
