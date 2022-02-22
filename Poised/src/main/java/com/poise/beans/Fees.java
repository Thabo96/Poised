/**
 * 
 */
package com.poise.beans;

import javax.persistence.Column;

/**
 * @author thabo
 *
 */
public class Fees {
	
	
	@Column(name="totalCost")
	private float totalCost;
	
	@Column(name="deposit")
	private float deposit;
	
	@Column(name="balance")
	private float balance = totalCost - deposit;

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}

	public float getDeposit() {
		return deposit;
	}

	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}
	
	public float getBalance() {
		return balance;
			
	}
	
	
}
