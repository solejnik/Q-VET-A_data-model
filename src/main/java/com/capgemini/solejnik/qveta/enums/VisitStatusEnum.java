package com.capgemini.solejnik.qveta.enums;

public enum VisitStatusEnum {
	FINITE("FINITE"), CANCALLED("CANCALLED");

	private String status;

	private VisitStatusEnum(String status) {
		this.status = status;
	}

	public String getRole() {
		return status;
	}

	public void setRole(String role) {
		this.status = role;
	}

	public static VisitStatusEnum getVisitStatusEnum(String role) {
		if (role == null) {
			return null;
		}
		for (VisitStatusEnum roleEnum : VisitStatusEnum.values()) {
			if (roleEnum.getRole().equals(role)) {
				return roleEnum;
			}
		}
		return null;
	}

}
