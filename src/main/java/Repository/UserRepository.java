package Repository;

import model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<AppUser,Long> {

    public AppUser findUsersByEmail(String email);
    @Query("select distinct u from AppUser u where u.firstName like %:query% Or u.lastName like %:query% or u.email like %:query%")
    public List<AppUser> searchUserBy(@Param("query") String query);


}
