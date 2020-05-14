package boardGame;

public class Board {
	
	private int rows;
	private int columns;
	private Piece [][] pieces;
	
	public Board(int rows, int columns) {
		if(rows < 1 || columns < 1 ) {
			throw new BoardException("Erro na criaçao do tabuleiro");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	
	public int getColumns() {
		return columns;
	}

		
	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Sem posicao no tabuleiro");
		}
		return pieces[row][column];
	}
	
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Sem posicao no tabuleiro");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if (thereIsPiece(position)) {
			throw new BoardException("existe uma peca na posicao");
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
		
	}
	
	private boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Sem posicao no tabuleiro");
		}
		return piece(position) != null;
	}
}
