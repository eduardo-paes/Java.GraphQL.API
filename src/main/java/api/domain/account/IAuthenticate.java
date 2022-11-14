package api.domain.account;

public interface IAuthenticate {
    boolean Authenticate(String email, String password);
    boolean RegisterUser(String email, String password);
    void Logout();
}
