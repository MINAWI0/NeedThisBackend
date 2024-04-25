package model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.coyote.Response;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @ManyToOne
    private AppUser user;
    private String content;
    private String image;
    private String video;
    @OneToMany(
            mappedBy = "request",
            cascade = CascadeType.ALL
    )
    private List<Like> likes = new ArrayList<>();

    @OneToMany
    private List<Offer> offers = new ArrayList<>();

    @ManyToMany
    private List<AppUser> CopieUser = new ArrayList<>();

    private boolean isCopy;
    private boolean isReuest;

}
