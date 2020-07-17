package com.kodilla.ecommercee.repositories;

import com.kodilla.ecommercee.domains.Cart;
import com.kodilla.ecommercee.domains.Group;
import com.kodilla.ecommercee.domains.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
@Transactional
public interface CartRepository extends CrudRepository<Cart, Long> {
    @Override
    List<Cart> findAll();

    @Override
    Cart save(Cart cart);

    @Override
    Optional<Cart> findById(Long id);

    @Override
    void deleteById(Long id);

    @Override
    long count();
}
