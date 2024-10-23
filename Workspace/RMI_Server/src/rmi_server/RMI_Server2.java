package rmi_server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RMI_Server2 {
    public static void main(String[] args) {
        try {
            // Tạo đối tượng RMI để đồng bộ dữ liệu
        	LoginSyncImplB loginSyncB = new LoginSyncImplB();
            Registry registry = LocateRegistry.createRegistry(1100); // Cổng 1099 cho Server B
            registry.bind("ServerB", loginSyncB);
            System.out.println("Server B đang chạy...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}