package com.tcs.springassesment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.springassesment.entity.Question;
import com.tcs.springassesment.repository.IQuestionRepository;

@Service
public class QuestionService implements IQuestionService {

	@Autowired
	IQuestionRepository questionRepo;
	
	@Override
	public Question saveQuestion(Question ques) {	
		return questionRepo.save(ques);
	}

}