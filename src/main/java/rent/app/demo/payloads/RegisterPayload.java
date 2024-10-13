package rent.app.demo.payloads;

public record RegisterPayload(
        String username,
        String password,
        String email,
        String firstName,
        String lastName
) {

}
