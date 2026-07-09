package Kiran.java.demo_usermanagement.dto;

public record UserDTO(Long id,
                      String firstName,
                      String lastName,
                      String email) {
}

// UserDTO (Data Transfer Object) is a simple class used to transfer data between layers
// (Controller ↔ Service ↔ Client) without exposing the actual entity.


// UserDTO is a Data Transfer Object used to send data between layers without exposing the actual entity.
// It improves security, maintains separation of concerns, and allows us to control what data is exposed in APIs.
// In this case, it's implemented as a Java record for immutability and simplicity.


