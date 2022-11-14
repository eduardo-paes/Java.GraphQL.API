package api.infrastrucure.data.identity;

import api.domain.account.IAuthenticate;

public class AuthenticateService implements IAuthenticate {
    @Override
    public boolean Authenticate(String email, String password) {
        return false;
    }

    @Override
    public boolean RegisterUser(String email, String password) {
        return false;
    }

    @Override
    public void Logout() {

    }
}
