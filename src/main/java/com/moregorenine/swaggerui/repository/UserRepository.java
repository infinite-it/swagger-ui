package com.moregorenine.swaggerui.repository;

import com.moregorenine.swaggerui.domain.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
