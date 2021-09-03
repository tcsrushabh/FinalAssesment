package com.tcs.springassesment.repository;

import org.springframework.data.repository.CrudRepository;

import com.tcs.springassesment.entity.User;


public interface IQuestionRepository extends CrudRepository<User, Integer> {

}