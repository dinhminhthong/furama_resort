package Service.Implement;

public interface PromotionService extends Service {
    //Display list customers use service
    //nhập năm để hiện list dịch vụ sử dụng trong năm đó lấy từ danh sách booking

    void displayCustomerListUseServiceInYear();

    //hiển thị danh sách khách hàng nhận voucher
    void displayCustomerListGetVoucher();
}
