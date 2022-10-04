package org.example.myappliation.repository;

import org.example.myappliation.entity.UserAccountInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface AccountRepository extends CrudRepository<UserAccountInfo, String> {
}
