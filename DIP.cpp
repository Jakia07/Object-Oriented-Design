
/**
 * Interface for user data access.
 */
public interface UserDataAccess {
    User getUser(int id);
}
public class DatabaseUserDataAccess implements UserDataAccess {
    /**
     * Get a user by ID from the database.
     *
     * @param id the user ID
     * @return the retrieved user
     */
    @Override
    public User getUser(int id) {
        // Implementation code here
        return new User("John Doe", "john@example.com");  // Dummy user
    }
}

/**
 * High-level module for handling user reports.
 */
public class UserReport {
    private UserDataAccess userDataAccess;

    /**
     * Constructor for UserReport that requires a UserDataAccess implementation.
     *
     * @param userDataAccess the data access mechanism to use
     */
    public UserReport(UserDataAccess userDataAccess) {
        this.userDataAccess = userDataAccess;
    }

    /**
     * Generate a report for a user.
     *
     * @param userId the ID of the user to generate a report for
     */
    public void generateReport(int userId) {
        User user = userDataAccess.getUser(userId);
        System.out.println("Report for " + user.getName());
    }
}
