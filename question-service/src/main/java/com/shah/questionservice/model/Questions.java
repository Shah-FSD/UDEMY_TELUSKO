package com.shah.questionservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "questions")
public class Questions {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
	
	    @Column(name = "question_title", unique = true)
	    private String questionTitle;
	    
	    @Column(name = "option_1")
	    private String option1;
	    
	    @Column(name = "option_2")
	    private String option2;
	    
	    @Column(name = "option_3")
	    private String option3;
	    
	    @Column(name = "option_4")
	    private String option4;
	    
	    @Column(name = "right_answer")
	    private String rightAnswer;
	    
	    @Column(name = "difficulty_level", columnDefinition = "VARCHAR(100) DEFAULT 'easy'")
	    private String difficultylevel;
	    
	    @Column(name = "category")
	    private String category;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getQuestionTitle() {
			return questionTitle;
		}

		public void setQuestionTitle(String questionTitle) {
			this.questionTitle = questionTitle;
		}

		public String getOption1() {
			return option1;
		}

		public void setOption1(String option1) {
			this.option1 = option1;
		}

		public String getOption2() {
			return option2;
		}

		public void setOption2(String option2) {
			this.option2 = option2;
		}

		public String getOption3() {
			return option3;
		}

		public void setOption3(String option3) {
			this.option3 = option3;
		}

		public String getOption4() {
			return option4;
		}

		public void setOption4(String option4) {
			this.option4 = option4;
		}

		public String getRightAnswer() {
			return rightAnswer;
		}

		public void setRightAnswer(String rightAnswer) {
			this.rightAnswer = rightAnswer;
		}

		public String getDifficultylevel() {
			return difficultylevel;
		}

		public void setDifficultylevel(String difficultylevel) {
			this.difficultylevel = difficultylevel;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}
 
	}
