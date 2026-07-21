import jakarta.persistence.*;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String subject;

    @Column(length = 1000)
    private String message;

    // Getters and Setters
}