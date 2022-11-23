package api.domain.entities;

import api.domain.enums.ERole;
import lombok.Getter;
import lombok.Setter;
import org.junit.platform.commons.util.ToStringBuilder;

import javax.persistence.*;
import java.util.Optional;

@Setter
@Getter
@Entity
@Table(name = "USER_TB")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private ERole role;

    public User() { }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public void setUserAsAdmin(){
        this.role = ERole.ADMIN;
    }

    public void setUserAsProfessor(){
        this.role = ERole.ADMIN;
    }

    public void setUserAsStudent(){
        this.role = ERole.ADMIN;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("email", email)
                .append("role", role)
                .toString();
    }

    public User merge(User updateRequest) {
        Optional.ofNullable(updateRequest.getEmail()).ifPresent(this::setEmail);
        Optional.ofNullable(updateRequest.getPassword()).ifPresent(this::setPassword);
        Optional.ofNullable(updateRequest.getRole()).ifPresent(this::setRole);
        return this;
    }
}
