package in.ineuron.dto;

//data transfer object - it holds the data in required type for processing
public class CustomerDTO {
	
	private String customerName;
	private String customerAddressString;
	private Float pamt;
	private Float rate;
	private Float time;
	
	@Override
	public String toString() {
		return "CustomerDTO [customerName=" + customerName + ", customerAddressString=" + customerAddressString
				+ ", pamt=" + pamt + ", rate=" + rate + ", time=" + time + "]";
	}

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

	public Float getPamt() {
		return pamt;
	}

	public void setPamt(Float pamt) {
		this.pamt = pamt;
	}

	public Float getRate() {
		return rate;
	}

	public void setRate(Float rate) {
		this.rate = rate;
	}

	public Float getTime() {
		return time;
	}

	public void setTime(Float time) {
		this.time = time;
	}
}
