package api.application.security;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;

@Getter
public abstract class TokenUtils {
    @Value("${token.header-name}")
    private String headerString;
    @Value("${token.prefix}")
    private String tokenPrefix;
    @Value("${token.secret-password}")
    private String secret;
    @Value("${token.duration-ms}")
    private long expirationTime;

    abstract public TokenPayload decodeToken(String authorizationHeader);
}