

package Solid_Principle;

/**
 * Represents a user with basic personal information.
 */
public class User {
    private String name;
    private String email;

    /**
     * Constructs a new user with the specified name and email.
     * @param name
     * @param email
     */
    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * Returns the name of the user.
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the user.
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the email address of the user.
     * @return 
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the user.
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }
}

