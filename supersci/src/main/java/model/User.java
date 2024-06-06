package model;
import java.util.UUID;

public class User {
    private UUID id;
    private String userName;
    private String password;
    private String phoneNumber;
    private String email;
    private Level level;  
    private Hero hero;    

    /**
     * Constructs a User with only the essential fields.
     * @param id Unique identifier for the user.
     * @param userName Username of the user.
     * @param password Password of the user.
     */
    public User(UUID id, String userName, String password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = "";
        this.email = "";
        this.level = null;
        this.hero = null;
    }

    /**
     * Constructs a User with all fields.
     * @param id Unique identifier for the user.
     * @param userName Username of the user.
     * @param password Password of the user.
     * @param phoneNumber Phone number of the user.
     * @param email Email address of the user.
     */
    public User(UUID id, String userName, String password, String phoneNumber, String email) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.level = null;
        this.hero = null;
    }

    // Getter for the user's ID
    public UUID getId() {
        return id;
    }

    // Getter for the user's username
    public String getUserName() {
        return userName;
    }

    // Getter for the user's password
    public String getPassword() {
        return password;
    }

    // Getter for the user's phone number
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Getter for the user's email
    public String getEmail() {
        return email;
    }

    // Getter for the user's hero
    public Hero getHero() {
        return hero;
    }

    // Getter for the user's level
    public Level getLevel() {
        return level;
    }
}
