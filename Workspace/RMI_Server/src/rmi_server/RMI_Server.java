package rmi_server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMI_Server {
    public static void main(String[] args) {
        try {
            // Tạo đối tượng RMI để đồng bộ trạng thái đăng nhập
            LoginSyncImpl loginSyncA = new LoginSyncImpl();
            Registry registry = LocateRegistry.createRegistry(1099); // Cổng 1099
            registry.bind("ServerA", loginSyncA);
            System.out.println("Server A đang chạy...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}