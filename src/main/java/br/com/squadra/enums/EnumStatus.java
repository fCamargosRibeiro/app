package br.com.squadra.enums;

public enum EnumStatus {
	ATIVO("Ativo"), CANCELADO("Cancelado");

	private EnumStatus(String status) {
		setStatus(status);
	}
	
	public static EnumStatus findEnumStatusByString(String value) {
		EnumStatus[] status = EnumStatus.values();
		for (EnumStatus sts : status) {
			if (sts.name().equalsIgnoreCase(value)) {
				return sts;
			}
		}
		return null;
	}
	
	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
