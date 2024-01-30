import com.example.domain.Money;
import com.example.repository.ProductDao;
import com.example.service.VendingMachineMoneyService;
import com.example.service.VendingMachineMoneyServiceImpl;
import com.example.service.VendingMachineService;
import com.example.service.VendingMachineServiceImpl;
import com.example.ui.VendingMachineUI;

public class VendingMachineMain {
    public static void main(String[] args) {
        VendingMachineUI vmUI = new VendingMachineUI();
        ProductDao productDao = new ProductDao("product.txt");
        VendingMachineAdmin vdAdmin = new VendingMachineAdmin(productDao);
        Money money = new Money();
        VendingMachineMoneyService vmmService = new VendingMachineMoneyServiceImpl(money);
        VendingMachineService vmService = new VendingMachineServiceImpl(productDao.getProducts());
        vmUI.printUserList(vmService.getUsers());
        while(true) {
            int menuId = vmUI.menu();
            if(menuId == 999){
                vdAdmin.adminPage();
            }else if(menuId == 2){
                vmmService.insertTotalMoney(vmUI.insertMoney());
            }else if(menuId == 3){
                vmUI.returnTailMoneyUi(vmmService.returnTailMoney());
            }else if(menuId ==4){
                vmUI.showTailMoneyUi(vmmService.showTailMoney());
            }else if(menuId == 5){
                if(money.getTailMoney() == 0){
                    System.out.println("종료합니다.");
                    break;
                }
                else{
                    System.out.println("잔액이 "+vmmService.showTailMoney()+"원 남았습니다. 잔액반환을 눌러주세요.");
                }
            }
        }

    }
}