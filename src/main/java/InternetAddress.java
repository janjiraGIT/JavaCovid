public class InternetAddress {
    String emailAddress;

    public InternetAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    @Override
    public String toString() {
        return "InternetAddress{" +
                "emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
