import com.example.domain.Money;
import com.example.repository.ProductDao;
import com.example.service.VendingMachineService;
import com.example.service.VendingMachineServiceImpl;
import com.example.ui.VendingMachineUI;

public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachineUI vmUI = new VendingMachineUI();
        ProductDao productDao = new ProductDao("product.txt");
        VendingMachineAdmin vdAdmin = new VendingMachineAdmin(productDao);
        Money money = new Money();
        VendingMachineService vmService = new VendingMachineServiceImpl(productDao.getProducts(),money);
        while(true) {
            vmUI.printUserList(vmService.getUsers());
            int menuId = vmUI.menu();
            if(menuId == 999){
                vdAdmin.adminPage();
            }else if(menuId==1){
                vmService.updateProductCnt(vmUI.selectProduct());
            }else if(menuId == 2){
                vmService.insertTotalMoney(vmUI.insertMoney());
            }else if(menuId == 3){
                vmUI.returnTailMoneyUi(vmService.returnTailMoney());
            }else if(menuId ==4){
                vmUI.showTailMoneyUi(vmService.showTailMoney());
            }else if(menuId == 5){
                if(money.getTailMoney() == 0){
                    System.out.println("종료합니다.");
                    productDao.saveProduct(vmService.getUsers());
                    break;
                }
                else{
                    System.out.println("잔액이 "+vmService.showTailMoney()+"원 남았습니다. 잔액반환을 눌러주세요.");
                }
            }
        }

    }
}