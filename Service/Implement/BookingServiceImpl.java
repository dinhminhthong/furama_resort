package Service.Implement;

import Module.*;
import view.BookingComparator;
import view.ReadAndWrite;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    /*1. Khi thực hiện booking phải hiển thị danh sách khách hàng cho nhân viên chọn mã khách hàng,
    hiển thị danh sách dịch vụ cho nhân viên chọn mã dịch vụ.*/
    static Set<Booking> bookingListSet = new TreeSet<>(new BookingComparator());

    //list booking đệm, khi hoàn thành hợp đồng thì list booking này sẽ bị xoá hết dữ liệu
    static Set<Booking> bookingListSetBuffer = new TreeSet<>(new BookingComparator());

    //Set vì danh sách booking luôn khác nhau
    //dùng TreeSet vì list phải sắp xếp theo trật tụ là ngày

    //danh sách khách hàng
    static List<Customer> customerList = new CustomerServiceImpl().getListCustomer();

    //danh sách dịch vụ HOUSE, ROOM, VILLA
    static Map<Room, Integer> listRoom = new FacilityServiceImpl().getListRoom();
    static Map<Villa, Integer> listVilla = new FacilityServiceImpl().getListVilla();

    static Map<Facility, Integer> serviceList = new FacilityServiceImpl().getListFacility();

    //đường link CSV và HEADER
    private static final String PATH = "E:\\Codegym\\Module2.1\\src\\Case_Study\\Data";
    private static final String HEADER = "idBooking,  startDate,  endDate,  name, dateOfBirth, sex, id, phoneNumber, email, address, idCustomer, rankCustomer, facility, , , , , , , , ";
    //khai báo đọc ghi file CSV
    static ReadAndWrite<Booking> bookingReadAndWrite = new ReadAndWrite<>();



    static Scanner scanner = new Scanner(System.in);

    //xuất list booking set để chuyển thành Queue bên hợp đồng
    public Set<Booking> bookingListSetToQueue() {
        //tiến hành đọc file để lấy dữ liệu
//        List<String> stringList = bookingReadAndWrite.readFromFile(PATH);
//
//        for (String string: stringList) {
//            //cắt thành chuỗi
//            String[] bookingArray = string.split(",");
//            bookingListSetBuffer.add(new Booking())
//        }
        return bookingListSetBuffer;
    }

    //xuất danh sách booking(lịch sử booking)
    public Set<Booking> getBookingList() {
        return bookingListSet;
    }

    //hiển thị danh sách Customer để nhân viên chọn
    public Customer chooseCustomer() {
        //hiển thị danh sách khách hàng
        System.out.println("\n----------Customer List----------");
        for (Customer customer : customerList) {
            System.out.println(customer.toStringDisplay());
        }

        //cho nhân viên chọn ID khách hàng
        //nếu nhân viên nhập sai ID khách hàng thì nhập lại
        System.out.print("Input ID Customer Booking: ");
        String id = scanner.nextLine();

        while (true) {
            //nếu họ nhập STOP thì dừng tìm kiếm và trả lại null
//            if (id.equals("STOP")) {
//                return null;
//            }

            //kiểm tra xem có id trong list không
            for (Customer customer : customerList) {
                if (id.equals(customer.getIdCustomer())) {
                    return customer;
                }
            }
            //nếu nhập sai thì bắt người dùng nhập lại
            System.out.print("Not Found ID Customer, Please re-input ID customer: ");
            id = scanner.nextLine();
        }
    }

    //hiển thị cơ sở facility để nhân viên chọn
    public Facility chooseFacility() {
        //hiển thị danh sách khách hàng
        System.out.println("\n----------Facility List----------");
        for (Map.Entry<Facility, Integer> element : serviceList.entrySet()) {
            System.out.println("Service: " + element.getKey().toStringDisplay() + " USED: " + element.getValue());
        }

        //cho nhân viên chọn ID khách hàng
        //nếu nhân viên nhập sai ID khách hàng thì nhập lại
        System.out.print("Input ID Facility Booking: ");
        String idFacility = scanner.nextLine();

        while (true) {
            //nếu họ nhập STOP thì dừng tìm kiếm và trả lại null
//            if (idFacility.equals("STOP")) {
//                return null;
//            }

            //kiểm tra xem có id trong list không
            for (Map.Entry<Facility, Integer> facility : serviceList.entrySet()) {
                if (idFacility.equals(facility.getKey().getIdFacility())) {
                    //mỗi lần sử dụng dịch vụ thì số lần sử dụng tăng lên 1
                    serviceList.put(facility.getKey(), facility.getValue() + 1);
                    return facility.getKey();
                }
            }
            //nếu nhập sai thì bắt người dùng nhập lại
            System.out.print("Not Found ID Facility, Please re-input ID Facility: ");
            idFacility = scanner.nextLine();
        }
    }

    //thêm mới booking
    @Override
    public void addNew() {
        //xét id booking, bắt đầu từ 1
        int idBooking = 1;
        //kiểm tra list booing có trống hay không
        if (!bookingListSet.isEmpty()) {
            idBooking = bookingListSet.size() + 1;
        }
        //chọn customer
        Customer customer = chooseCustomer();

        //chọn facility
        Facility facility = chooseFacility();

        //nhập ngày bắt đầu thuê
        System.out.print("Enter start time rent: ");
        String startTimeRent = scanner.nextLine();

        //nhập ngày kết thúc thuê
        System.out.print("Enter end time rent: ");
        String endTimeRent = scanner.nextLine();

        //tạo đối tượng booking
        Booking booking = new Booking(idBooking, startTimeRent, endTimeRent, customer, facility);

        //thêm booking vào list
        bookingListSet.add(booking);
        bookingListSetBuffer.add(booking);

        //ghi file booking csv
        System.out.println("-----ADD BOOKING SUCCESS!-----");
    }

    //add

    //hiện danh sách booking
    @Override
    public void display() {
        for (Booking booking : bookingListSet) {
            System.out.println(booking.toStringDisplay());
        }
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
