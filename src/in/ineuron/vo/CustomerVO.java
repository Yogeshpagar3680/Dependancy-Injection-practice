package in.ineuron.vo;

//value object (to send the request) it holds the data entered by user. data would be always in String format
public class CustomerVO {

	private String customerName;
	private String customerAddressString;
	private String pamt;
	private String rate;
	private String time;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerAddress() {
		return customerAddressString;
	}
	public void setCustomerAddress(String customerAddressString) {
		this.customerAddressString = customerAddressString;
	}
	public String getPamt() {
		return pamt;
	}
	public void setPamt(String pamt) {
		this.pamt = pamt;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
