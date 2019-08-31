package com.wp.Collections;

public class Employees {
	
	public int empno;
	public String empName;
	public int empSal;
	public String empDesig;
	
	
	public Employees(int empno, String empName, int empSal, String empDesig) {
		super();
		this.empno = empno;
		this.empName = empName;
		this.empSal = empSal;
		this.empDesig = empDesig;
	}
	@Override
	public String toString() {
		return "Employees [empno=" + empno + ", empName=" + empName + ", empSal=" + empSal + ", empDesig=" + empDesig
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empDesig == null) ? 0 : empDesig.hashCode());
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + empSal;
		result = prime * result + empno;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		if (empDesig == null) {
			if (other.empDesig != null)
				return false;
		} else if (!empDesig.equals(other.empDesig))
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empSal != other.empSal)
			return false;
		if (empno != other.empno)
			return false;
		return true;
	}
	
	
	
	
	

}
