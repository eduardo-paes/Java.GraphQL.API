package api.domain.entities;

import api.domain.enums.ERole;
import lombok.Getter;

@Getter
public class Auth {
    private final String token;
    private final Long userId;
    private final String userName;
    private final ERole userRole;

    public Auth(String token, Long userId, String userName, ERole userRole) {
        this.token = token;
        this.userId = userId;
        this.userName = userName;
        this.userRole = userRole;
    }
}
