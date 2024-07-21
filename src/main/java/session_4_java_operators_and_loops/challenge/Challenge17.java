package sesion4_java_operators_and_loops.challenge;

public class Challenge17 {
    private boolean hasUsername, hasPassword;

    public Challenge17(boolean hasUsername, boolean hasPassword) {
        this.hasPassword = hasPassword;
        this.hasUsername = hasUsername;
    }

    public String authentication() {
        return ((hasUsername == true) ?
                (hasPassword == true) ? "Authentication successful" : "Password incorrect"
                : "Authentication failed");
    }
}
/*
if hasUsername==true if hasPassword==true System.out.print("Authentication successfull");
                                    else System.out.println("Pasword incorrect");
                     else System.out.print("Auth failed");   */
