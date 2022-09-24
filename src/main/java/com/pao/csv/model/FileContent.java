package com.pao.csv.model;

import com.pao.csv.util.EntityUtil;

public class FileContent implements Comparable<FileContent> {

	private String userId;
	private String firstAndLastName;
	private int version;
	private String insuranceCompany;

	public FileContent() {
		super();
	}

	public FileContent(String userId, String firstAndLastName, int version, String insuranceCompany) {
		this.userId = userId;
		this.firstAndLastName = firstAndLastName;
		this.version = version;
		this.insuranceCompany = insuranceCompany;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstAndLastName() {
		return firstAndLastName;
	}

	public void setFirstAndLastName(String firstAndLastName) {
		this.firstAndLastName = firstAndLastName;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getInsuranceCompany() {
		return insuranceCompany;
	}

	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}

	@Override
	public int compareTo(FileContent o) {
		return o.getVersion() >= this.getVersion() ? 1 : -1;//highest version (Descending)
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj.getClass() != getClass()) {
			return false;
		}
		FileContent o = (FileContent) obj;
		return (EntityUtil.equalsIgnoreCase(this.getUserId(), o.getUserId()) &&
				EntityUtil.equalsIgnoreCase(this.getFirstAndLastName(), o.getFirstAndLastName()) &&
				this.getVersion() == o.getVersion() &&
				EntityUtil.equalsIgnoreCase(this.getInsuranceCompany(), o.getInsuranceCompany())
		);
	}
}
