package com.aakula.Hibernate_2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Udayclass {
@Id
	private int serialnumber;
	private String firstname;
	private String lastname;
	
	public int getSerialnumber() {
		return serialnumber;
	}

	public void setSerialnumber(int serialnumber) {
		this.serialnumber = serialnumber;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
/*
 * If we want to fetch the data use Tostring method
 
	@Override
	public String toString() {
		return "Udayclass [serialnumber=" + serialnumber + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
*/
	public static void main(String[] args) {

	}

}
