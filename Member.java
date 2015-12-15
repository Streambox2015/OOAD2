package ooadStreamboxIteration1;

/**
 * Created by Colin on 11/12/2015.
 */
public class Member {
    private String username;
    private String passwordHash;
    private String forename;
    private String surname;
    private String email;

    public Member(String username, String passwordHash, String forename, String surname, String email) {
        this.username = username;
        this.passwordHash = passwordHash;
        this.forename = forename;
        this.surname = surname;
        this.email = email;

    }

    public String getUsername() {

        return username;
    }

    public String getPasswordHash() {
        return passwordHash;
    }
    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Member{" +
                "username='" + username + '\'' +
                ", passwordHash='" + passwordHash + '\'' +
                ", forename='" + forename + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
