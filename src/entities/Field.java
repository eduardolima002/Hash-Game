package entities;

public class Field {

	private char simble;

	public Field() {
		this.simble = 0;
	}

	public char getField() {
		return this.simble;
	}

	public void setField(char x) {
		
		if (simble == 0) {
			this.simble = x;
		} else {
			throw new hashException("field already teked");
		}

	}

}
