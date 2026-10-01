package latian_mojo1;

public class bank {
	String username;
	Integer pin;
	
	public bank(String username, Integer pin)
	{
		this.username=username;
		this.pin=pin;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

}
