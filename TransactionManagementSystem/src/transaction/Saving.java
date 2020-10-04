package transaction;

public class Saving extends Account {
	private boolean isLoyal;

	public Saving(Profile holder, double balance, Date dateOpen, boolean isLoyal) {
		super(holder, balance, dateOpen);
		this.isLoyal = isLoyal;
	}

	@Override
	public double monthlyInterest() {

		
		return this.getBalance()*(12/0.0025);
	}

	@Override
	public double monthlyFee() {
		
		if(this.isLoyal==true || this.getBalance()>=300) {
			return 0;
		}
		return 5;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Saving) {
			Saving comparison = (Saving) obj;
			/*
			 * return this.getHolder().equals(comparison.getHolder()) && this.getBalance()
			 * == comparison.getBalance()&&
			 * this.getDateOpen().toString().equals(comparison.getDateOpen().toString()) &&
			 * this.isLoyal==comparison.isLoyal;
			 */
			return this.getHolder().equals(comparison.getHolder());
		}
		return false;
	}

	@Override
	public String toString() {

		return super.toString() + " " + this.isLoyal;

	}

}
