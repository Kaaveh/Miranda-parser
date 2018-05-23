

public class MirandaSymbol extends java_cup.runtime.Symbol {
  private int line;
  private int column;

  public MirandaSymbol(int type, int line, int column) {
    this(type, line, column, -1, -1, null);
  }

  public MirandaSymbol(int type, int line, int column, Object value) {
    this(type, line, column, -1, -1, value);
  }

  public MirandaSymbol(int type, int line, int column, int left, int right, Object value) {
    super(type, left, right, value);
    this.line = line;
    this.column = column;
  }

 
}
