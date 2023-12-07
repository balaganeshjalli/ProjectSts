package in.italent.binding;

public class response {

	private String status;
	@Override
	public String toString() {
		return "response [status=" + status + ", value=" + value + "]";
	}
	private value  value;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public value getValue() {
		return value;
	}
	public void setValue(value value) {
		this.value = value;
	}
	
	
	
	

}
