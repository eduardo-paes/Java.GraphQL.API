package api.application.security;


import api.domain.enums.ERole;
import lombok.Getter;
import org.junit.platform.commons.util.ToStringBuilder;

@Getter
public class TokenPayload {
    private final String userName;
    private final ERole role;

    public TokenPayload(String userName, ERole role) {
        this.userName = userName;
        this.role = role;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("userName", userName)
                .append("role", role)
                .toString();
    }
}