package rmi_server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface LoginSyncInterface extends Remote {
    // Kiểm tra trạng thái đăng nhập của một người dùng
    boolean isUserLoggedIn(String username) throws RemoteException;

    // Cập nhật trạng thái đăng nhập của người dùng
    void updateUserStatus(String username, boolean isLoggedIn) throws RemoteException;
    
    void updateBanking(String sender, String receiver, String money) throws RemoteException;
}
