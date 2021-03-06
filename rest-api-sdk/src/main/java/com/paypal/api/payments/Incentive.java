package com.paypal.api.payments;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Incentive  {

	/**
	 * Identifier of the instrument in PayPal Wallet
	 */
	private String id;

	/**
	 * Code that identifies the incentive.
	 */
	private String code;

	/**
	 * Name of the incentive.
	 */
	private String name;

	/**
	 * Description of the incentive.
	 */
	private String description;

	/**
	 * Indicates incentive is applicable for this minimum purchase amount.
	 */
	private Currency minimumPurchaseAmount;

	/**
	 * Logo image url for the incentive.
	 */
	private String logoImageUrl;

	/**
	 * expiry date of the incentive.
	 */
	private String expiryDate;

	/**
	 * Specifies type of incentive
	 */
	private String type;

	/**
	 * URI to the associated terms
	 */
	private String terms;

	/**
	 * Default Constructor
	 */
	public Incentive() {
	}
}
