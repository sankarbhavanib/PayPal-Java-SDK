package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Card3dSecureInfo extends PayPalModel {

	/**
	 * Authorization status from 3ds provider. Should be echoed back in the response
	 */
	private String authStatus;

	/**
	 * Numeric flag to indicate how the payment should be processed in relationship to 3d-secure. If 0 then ignore all 3d values and process as non-3ds 
	 */
	private String eci;

	/**
	 * Cardholder Authentication Verification Value (used by VISA). 
	 */
	private String cavv;

	/**
	 * Transaction identifier from authenticator.
	 */
	private String xid;

	/**
	 * Name of the actual 3ds vendor who processed the 3ds request, e.g. Cardinal
	 */
	private String mpiVendor;

	/**
	 * Default Constructor
	 */
	public Card3dSecureInfo() {
	}
}
