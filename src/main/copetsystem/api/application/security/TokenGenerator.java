package api.application.security;

public interface TokenGenerator {
    String build(Object id, Object role);
}
