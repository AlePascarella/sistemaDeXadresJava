package boardGame;

public class Position {
	
	private int row;
	private int column;
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColomn() {
		return column;
	}

	public void setColomn(int colomn) {
		this.column = colomn;
	}
	
	@Override
	public String toString(){
		return row + ", " + column;
	}
}
