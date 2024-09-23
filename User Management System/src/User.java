public class User {
    private String username;
    private String password;
    private String email;
    private String secretQuestion;
    private String secretAnswer;

    // Constructor
    public User(String username,
                String password,
                String email,
                String secretQuestion,
                String secretAnswer) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.secretQuestion = secretQuestion;
        this.secretAnswer = secretAnswer;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getSecretQuestion() {
        return secretQuestion;
    }

    public String getSecretAnswer() {
        return secretAnswer;
    }

    // Method to update password
    public void setPassword(String password) {
        this.password = password;
    }
}