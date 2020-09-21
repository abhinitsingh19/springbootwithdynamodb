package com.springboot.aws.dynamodb.entity;

import java.io.Serializable;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBDocument;

@DynamoDBDocument
public class Address implements Serializable {

	@DynamoDBAttribute
	private String city;
	@DynamoDBAttribute
	private String state;
	@DynamoDBAttribute
	private long pinCode;


	public Address(String city, String state, long pinCode) {
		super();
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}


	public Address() {
		super();
	}


	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
}
