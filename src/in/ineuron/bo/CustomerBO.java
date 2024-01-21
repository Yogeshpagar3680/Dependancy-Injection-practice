package in.ineuron.bo;

//Buisness object - it holds the actual data which needs to be persisted for future usage.
public class CustomerBO {
	
	private String customerName;
	private String customerAddressString;
	private Float pamt;
	private Float rate;
	private Float time;
	
	private Float interestAmt;

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

	public Float getInterestAmt() {
		return interestAmt;
	}

	public void setInterestAmt(Float interestAmt) {
		this.interestAmt = interestAmt;
	}

	@Override
	public String toString() {
		return "CustomerBO [customerName=" + customerName + ", customerAddressString=" + customerAddressString
				+ ", pamt=" + pamt + ", rate=" + rate + ", time=" + time + ", interestAmt=" + interestAmt + "]";
	}
	
	

}
