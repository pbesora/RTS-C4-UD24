package com.example.demo.dto;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	//Attributes
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(name = "name")
		private String name;
		@Column(name = "job")
		private String job;
		@Column(name = "salary")
		private Double salary;
		
		
		//Constructors
		
		public Employee() {
		}


		/**
		 * @param name
		 * @param job
		 * @param salary
		 */
		public Employee(String name, String job) {
			this.name = name;
			this.job = job;
			this.salary = calculateSalary(job);
		}

		private Double calculateSalary(String job) {
			switch(Job.valueOf(job)) {
			case BackendDev:
				return 1600.0;
			case FrontendDev:
				return 1800.0;
			case FullstackDev:
				return 2000.0;
			default:
				return 1000.0;
			}

		}

		//Getters and Setters

		/**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}


		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}


		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}


		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}


		/**
		 * @return the job
		 */
		public String getJob() {
			return job;
		}


		/**
		 * @param job the job to set
		 */
		public void setJob(String job) {
			this.job = job;
			this.salary = calculateSalary(job);
		}


		/**
		 * @return the salary
		 */
		public Double getSalary() {
			return salary;
		}

	
		
}
