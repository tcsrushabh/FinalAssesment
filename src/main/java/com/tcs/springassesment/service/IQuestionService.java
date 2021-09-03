package com.tcs.springassesment.service;

import javax.validation.Valid;

import com.tcs.springassesment.entity.Question;
import com.tcs.springassesment.entity.User;


public interface IQuestionService {

	Question saveQuestion(Question ques);

	Iterable<Question> getAll();

	void deleteQuestion(Integer id);

	String updateAnswers(Question ques, Integer id);

	String upvote(Question ques, Integer id);

	

}
