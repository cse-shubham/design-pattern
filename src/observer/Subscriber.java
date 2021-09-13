package observer;

public class Subscriber {
	
	private Long id;
	private String updateLink;
	private String authCode;
	private String dataParam;
	private boolean isActive;
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUpdateLink() {
		return updateLink;
	}
	public void setUpdateLink(String updateLink) {
		this.updateLink = updateLink;
	}
	public String getAuthCode() {
		return authCode;
	}
	public void setAuthCode(String authCode) {
		this.authCode = authCode;
	}
	public String getDataParam() {
		return dataParam;
	}
	public void setDataParam(String dataParam) {
		this.dataParam = dataParam;
	}	
}
