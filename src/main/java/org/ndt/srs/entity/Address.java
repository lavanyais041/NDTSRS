package org.ndt.srs.entity;

public class Address 
{

	int addressId;
	String line1;
	String city;
	String state;
	String zipcode;
	
	public int getAddressId() 
	{
		return addressId;
	}
	public void setAddressId(int addressId) 
	{
		this.addressId = addressId;
	}
	public String getLine1()
	{
		return line1;
	}
	public void setLine1(String line1) 
	{
		this.line1 = line1;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getState() 
	{
		return state;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public String getZipcode() 
	{
		return zipcode;
	}
	public void setZipcode(String zipcode) 
	{
		this.zipcode = zipcode;
	}
	
	public Address()
	{
		
	}
	
	public Address(int addressId, String line1, String city, String state,String zipcode) 
	{
		super();
		this.addressId = addressId;
		this.line1 = line1;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
	}
	
	
	
	@Override
	public String toString()
	{
		return "Address [addressId=" + addressId + ", line1=" + line1
				+ ", city=" + city + ", state=" + state + ", zipcode="
				+ zipcode + "]";
	}
	

}
