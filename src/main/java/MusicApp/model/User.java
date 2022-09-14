package MusicApp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
    @OneToOne
    @JoinColumn(name = "city_id", referencedColumnName = "id")
    private City city;
    @OneToOne
    @JoinColumn(name = "subscription_id", referencedColumnName = "id")
    private Subscription subscriptionId;
    @ManyToOne
    @JoinColumn(name = "role", referencedColumnName = "id")
    private Role role;
}
