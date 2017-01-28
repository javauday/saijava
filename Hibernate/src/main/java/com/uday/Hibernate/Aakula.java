package com.uday.Hibernate;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aakula_table")

public class Aakula {

	@Id
		private int serialnumber;
	
	    private AakulaName locationname;
		private String Country;
		
		public int getSerialnumber() {
			return serialnumber;
		}
		public void setSerialnumber(int serialnumber) {
			this.serialnumber = serialnumber;
		}
		
		public AakulaName getLocationname() {
			return locationname;
		}
		public void setLocationname(AakulaName locationname) {
			this.locationname = locationname;
		}
		public String getCountry() {
			return Country;
		}
		public void setCountry(String country) {
			Country = country;
		}
@Override
public String toString() {
	return "Aakula [serialnumber=" + serialnumber + ", locationname=" + locationname + ", Country=" + Country
					+ "]";
		}
		
}
 