package com.paypal.api.payments;

import com.paypal.base.rest.PayPalModel;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AgreementDetails  extends PayPalModel {

	/**
	 * The outstanding balance for this agreement.
	 */
	private Currency outstandingBalance;

	/**
	 * Number of cycles remaining for this agreement.
	 */
	private String cyclesRemaining;

	/**
	 * Number of cycles completed for this agreement.
	 */
	private String cyclesCompleted;

	/**
	 * The next billing date for this agreement, represented as 2014-02-19T10:00:00Z format.
	 */
	private String nextBillingDate;

	/**
	 * Last payment date for this agreement, represented as 2014-06-09T09:42:31Z format.
	 */
	private String lastPaymentDate;

	/**
	 * Last payment amount for this agreement.
	 */
	private Currency lastPaymentAmount;

	/**
	 * Last payment date for this agreement, represented as 2015-02-19T10:00:00Z format.
	 */
	private String finalPaymentDate;

	/**
	 * Total number of failed payments for this agreement.
	 */
	private String failedPaymentCount;

	/**
	 * Default Constructor
	 */
	public AgreementDetails() {
	}
}
