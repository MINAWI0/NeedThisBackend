package model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String Location;
    private String birthDate;
    private String email;
    private String passWord;
    private String mobile;
    private String ProfileImage;
    private String BackgroundImage;
    private boolean reqUser;
    private boolean   LoginWithGoogle;


    @JsonIgnore
    @OneToMany(
            mappedBy = "user",
            cascade = CascadeType.ALL
    )
    private List<Request> Requests = new ArrayList<>();

    @OneToMany(
            mappedBy = "user",
            cascade = CascadeType.ALL
    )
    private List<Like> likes = new ArrayList<>();

    @JsonIgnore
    @ManyToMany
    private List<AppUser>  Trackers =  new ArrayList<>();

    @JsonIgnore
    @ManyToMany
    private List<AppUser> Trackings = new ArrayList<>();



}
