package com.example.twitterMami.repository;

import com.example.twitterMami.entity.TwitEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TwitRepository extends JpaRepository<TwitEntity,Integer> {

}
