package app.repository;


import app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional //controller chiama service e service repository
public interface UserRepository extends JpaRepository<User, Integer>{

    User findByNome(String Nome);

    User findById(int id);

    User save(User u);

    void delete(User u);

}
