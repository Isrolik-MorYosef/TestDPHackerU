public interface Mediator {
    void send(String message);
    void sendWithUser(String message, User user);
    void accept(String from, String message);
}
