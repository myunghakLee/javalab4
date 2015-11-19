package kr.ac.embedded.kookmin.sales;

/**
 * Class for a sale of one item with discount expressed as a percent of the
 * price, but no other adjustments. Class invariant: The price is always
 * nonnegative; the name is a nonempty string; the discount is always
 * nonnegative.
 */

public class DiscountSale extends Sale {

	private double discount; // A percent of the price. Cannot be negative.

	public DiscountSale() {
		discount = 0;
	}

	/**
	 * Precondition: theName is a nonempty string; thePrice is nonnegative;
	 * theDiscount is expressed as a percent of the price and is nonnegative.
	 */
	public DiscountSale(String theName, double thePrice, double theDiscount) {
		discount = theDiscount;
		this.setPrice(thePrice);
		this.setName(theName);
	}

	public DiscountSale(DiscountSale originalObject) {
		discount = originalObject.discount;
		this.setPrice(originalObject.getPrice());
		this.setName(originalObject.getName());
	}

	public static void announcement() {

	}

	public double bill() {
		return this.getPrice() * (1 - (discount / 100));
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double newDiscount) {
		discount = newDiscount;
	}

	public String toString() {
		return (this.getName() + " price = $" + this.getPrice() + "Discount = " + discount + "%\n\t Total coast = $"
				+ this.bill());
	}

	public boolean equals(Object otherObject) {

		return (this == otherObject);
	}

	public DiscountSale clone() {

		return this;

		/** 援ы쁽 �븯�떆�삤.... �엫�떆�깮�꽦�옄 �궗�슜 **/
	}
}
