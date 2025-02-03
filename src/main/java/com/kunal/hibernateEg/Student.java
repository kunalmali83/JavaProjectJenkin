package com.kunal.hibernateEg;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
@Entity(name="student")
 
public class Student {
	
		@Id
		public int roll;
	
		private fullname name;
		public int getRoll() {
			return roll;
		}
		public fullname getName() {
			return name;
		}
		public void setName(fullname name) {
			this.name = name;
		}
		public void setRoll(int roll) {
			this.roll = roll;
		}
		
		@Override
		public String toString() {
			return "student [roll=" + roll + ", name=" + name + "]";
		}
		
		
}
