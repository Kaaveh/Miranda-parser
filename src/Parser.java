
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20150326 (SVN rev 63)
//----------------------------------------------------

import java_cup.runtime.*;
import java.util.HashMap;
import java.util.ArrayList;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20150326 (SVN rev 63) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\062\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\026\006\000\002\026\002\000\002\027\003" +
    "\000\002\027\003\000\002\027\003\000\002\003\004\000" +
    "\002\004\011\000\002\010\005\000\002\010\003\000\002" +
    "\007\005\000\002\007\003\000\002\021\003\000\002\021" +
    "\003\000\002\021\003\000\002\022\003\000\002\022\003" +
    "\000\002\022\003\000\002\023\003\000\002\023\003\000" +
    "\002\023\003\000\002\023\003\000\002\023\003\000\002" +
    "\012\005\000\002\005\003\000\002\013\010\000\002\024" +
    "\003\000\002\024\003\000\002\017\007\000\002\020\013" +
    "\000\002\016\007\000\002\016\005\000\002\025\003\000" +
    "\002\025\003\000\002\025\003\000\002\025\003\000\002" +
    "\025\003\000\002\014\003\000\002\014\003\000\002\014" +
    "\003\000\002\015\006\000\002\006\006\000\002\006\002" +
    "\000\002\011\005\000\002\011\003\000\002\030\003\000" +
    "\002\030\003\000\002\030\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\131\000\010\002\ufffd\027\007\030\005\001\002\000" +
    "\004\002\133\001\002\000\004\023\125\001\002\000\004" +
    "\027\046\001\002\000\004\024\025\001\002\000\004\002" +
    "\uffff\001\002\000\006\002\uffd5\027\012\001\002\000\004" +
    "\013\014\001\002\000\004\002\000\001\002\000\010\004" +
    "\017\005\015\006\020\001\002\000\006\012\uffd0\014\uffd0" +
    "\001\002\000\004\014\024\001\002\000\006\012\uffd2\014" +
    "\uffd2\001\002\000\006\012\uffd1\014\uffd1\001\002\000\006" +
    "\012\022\014\uffd3\001\002\000\010\004\017\005\015\006" +
    "\020\001\002\000\004\014\uffd4\001\002\000\004\002\uffd6" +
    "\001\002\000\004\013\026\001\002\000\010\007\031\010" +
    "\030\011\027\001\002\000\006\012\ufff1\014\ufff1\001\002" +
    "\000\006\012\ufff2\014\ufff2\001\002\000\006\012\ufff3\014" +
    "\ufff3\001\002\000\004\014\036\001\002\000\006\012\034" +
    "\014\ufff6\001\002\000\010\007\031\010\030\011\027\001" +
    "\002\000\004\014\ufff7\001\002\000\004\025\037\001\002" +
    "\000\010\007\042\010\041\011\040\001\002\000\004\027" +
    "\uffee\001\002\000\004\027\uffef\001\002\000\004\027\ufff0" +
    "\001\002\000\004\027\ufff8\001\002\000\006\002\ufff9\027" +
    "\ufff9\001\002\000\006\002\uffe7\027\uffe7\001\002\000\004" +
    "\013\047\001\002\000\012\004\054\005\051\006\056\030" +
    "\052\001\002\000\006\012\123\014\ufff4\001\002\000\006" +
    "\012\uffea\014\uffea\001\002\000\010\012\uffed\014\uffed\026" +
    "\121\001\002\000\004\014\057\001\002\000\006\012\uffec" +
    "\014\uffec\001\002\000\006\012\uffe9\014\uffe9\001\002\000" +
    "\006\012\uffeb\014\uffeb\001\002\000\004\023\060\001\002" +
    "\000\010\004\063\005\061\006\065\001\002\000\006\012" +
    "\uffda\027\uffda\001\002\000\006\002\uffe6\027\uffe6\001\002" +
    "\000\006\012\uffd9\027\uffd9\001\002\000\004\027\070\001" +
    "\002\000\006\012\uffd8\027\uffd8\001\002\000\006\002\uffe5" +
    "\027\uffe5\001\002\000\006\002\uffe4\027\uffe4\001\002\000" +
    "\004\013\116\001\002\000\004\012\072\001\002\000\004" +
    "\015\073\001\002\000\006\013\075\030\074\001\002\000" +
    "\014\017\105\020\106\021\111\022\107\023\104\001\002" +
    "\000\004\030\103\001\002\000\010\002\uffe3\023\077\027" +
    "\uffe3\001\002\000\010\004\063\005\061\006\065\001\002" +
    "\000\004\012\101\001\002\000\004\016\102\001\002\000" +
    "\006\002\uffe2\027\uffe2\001\002\000\014\017\105\020\106" +
    "\021\111\022\107\023\104\001\002\000\004\030\uffdf\001" +
    "\002\000\004\030\uffde\001\002\000\004\030\uffdd\001\002" +
    "\000\004\030\uffdb\001\002\000\004\030\112\001\002\000" +
    "\004\030\uffdc\001\002\000\004\014\113\001\002\000\010" +
    "\002\uffe1\023\uffe1\027\uffe1\001\002\000\004\030\115\001" +
    "\002\000\010\002\uffe0\023\uffe0\027\uffe0\001\002\000\012" +
    "\004\054\005\051\006\056\030\052\001\002\000\004\014" +
    "\120\001\002\000\004\012\uffd7\001\002\000\004\004\122" +
    "\001\002\000\006\012\uffe8\014\uffe8\001\002\000\012\004" +
    "\054\005\051\006\056\030\052\001\002\000\004\014\ufff5" +
    "\001\002\000\010\004\130\005\126\006\131\001\002\000" +
    "\006\002\ufffa\030\ufffa\001\002\000\006\002\ufffd\030\005" +
    "\001\002\000\006\002\ufffc\030\ufffc\001\002\000\006\002" +
    "\ufffb\030\ufffb\001\002\000\004\002\ufffe\001\002\000\004" +
    "\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\131\000\012\002\003\003\010\004\005\026\007\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\005\043" +
    "\013\044\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\006\012\001\001\000\002\001\001\000\002\001\001" +
    "\000\006\011\015\030\020\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\011\022\030\020\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\006\010\031" +
    "\021\032\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\006" +
    "\010\034\021\032\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\022\042\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\010\007\052" +
    "\012\054\023\047\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\012\014\063\017\065\020\066\024\061\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\015" +
    "\070\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\016\075\001\001\000\004\025\113\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\014\077\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\004\025\107\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\007\116\012\054" +
    "\023\047\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\007\123\012\054" +
    "\023\047\001\001\000\002\001\001\000\004\027\126\001" +
    "\001\000\002\001\001\000\004\026\131\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {


    HashMap<String, String> symbolTable = new HashMap();
    HashMap<String, ArrayList<String>> functionTable = new HashMap();
    ArrayList<String> arguments = new ArrayList<>();
    ArrayList<String> executionArguments = new ArrayList<>();
    String temp;

    public boolean isStringNat(String s) {
            try {
                Integer.parseInt(s);
                return true;
            } catch (NumberFormatException ex) {
                return false;
            }
        }
        public boolean isStringFloat(String s) {
            try {
                Float.parseFloat(s);
                return true;
            } catch (NumberFormatException ex) {
                return false;
            }
        }

  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= goal EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // goal ::= method_declaration method_execution 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("goal",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // goal ::= assignment 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("goal",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // assignment ::= identifier EQ value assignment 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object id = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
            String type;
            String idName = id.toString();
            String value = n.toString();
            if (isStringNat(value)){
                type =  "nat";
            }else if (isStringFloat(value)){
                type =  "float";
            }else {
                type =  "string";
            }

            if (!symbolTable.containsKey(idName)){
                if (type.equals("nat")){
                    symbolTable.put(idName, "nat");
                }else if (type.equals("float")){
                     symbolTable.put(idName, "float");
                }else {
                    symbolTable.put(idName, "string");
                }
            }else {
                if (!symbolTable.get(idName).equals(type)){
                    System.err.println("You can't assign a " + symbolTable.get(id) + " value to a " + type + " Variable!");
                    System.exit(1);
                }
            }
		  
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("assignment",20, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // assignment ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("assignment",20, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // value ::= NAT 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",21, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // value ::= FLOAT 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",21, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // value ::= STRING 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object n = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		 RESULT = n; 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value",21, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // method_declaration ::= method_header method_body 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("method_declaration",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // method_header ::= IDENTIFIER ASSIGN_BODY_METHOD LPAREN formal_parameter_list_header RPAREN ARROWS parameter_header_return 
            {
              Object RESULT =null;
		int idFunctionleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int idFunctionright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Object idFunction = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		

        temp = idFunction.toString();
        functionTable.put(temp , arguments);
		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("method_header",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // formal_parameter_list_header ::= parameter_header COMMA formal_parameter_list_header 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("formal_parameter_list_header",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // formal_parameter_list_header ::= parameter_header 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("formal_parameter_list_header",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // formal_parameter_list_body ::= parameter_body COMMA formal_parameter_list_body 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("formal_parameter_list_body",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // formal_parameter_list_body ::= parameter_body 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("formal_parameter_list_body",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // parameter_header ::= NAT_KEYWORD 
            {
              Object RESULT =null;
		 arguments.add("nat"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parameter_header",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // parameter_header ::= STRING_KEYWORD 
            {
              Object RESULT =null;
		 arguments.add("string"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parameter_header",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // parameter_header ::= FLOAT_KEYWORD 
            {
              Object RESULT =null;
		 arguments.add("float"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parameter_header",15, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // parameter_header_return ::= NAT_KEYWORD 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parameter_header_return",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // parameter_header_return ::= STRING_KEYWORD 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parameter_header_return",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // parameter_header_return ::= FLOAT_KEYWORD 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parameter_header_return",16, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // parameter_body ::= identifier 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parameter_body",17, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // parameter_body ::= NAT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parameter_body",17, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // parameter_body ::= FLOAT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parameter_body",17, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // parameter_body ::= STRING 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parameter_body",17, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // parameter_body ::= additive_expression 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("parameter_body",17, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // additive_expression ::= identifier MINUS NAT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("additive_expression",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // method_body ::= initial_condition 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("method_body",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // initial_condition ::= IDENTIFIER LPAREN formal_parameter_list_body RPAREN EQ statment 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("initial_condition",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // statment ::= if_then_statement 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statment",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // statment ::= if_then_else_statement 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("statment",18, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // if_then_statement ::= return_statement recursive_call COMMA IF condition 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("if_then_statement",13, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // if_then_else_statement ::= return_statement recursive_call COMMA IF condition EQ return_statement COMMA OTHERWISE 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("if_then_else_statement",14, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // condition ::= LPAREN identifier relational_expression identifier RPAREN 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("condition",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // condition ::= identifier relational_expression identifier 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("condition",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // relational_expression ::= EQ 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("relational_expression",19, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // relational_expression ::= LT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("relational_expression",19, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // relational_expression ::= GT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("relational_expression",19, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 37: // relational_expression ::= LTEQ 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("relational_expression",19, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 38: // relational_expression ::= GTEQ 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("relational_expression",19, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 39: // return_statement ::= STRING 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("return_statement",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 40: // return_statement ::= NAT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("return_statement",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 41: // return_statement ::= FLOAT 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("return_statement",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 42: // recursive_call ::= IDENTIFIER LPAREN formal_parameter_list_body RPAREN 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("recursive_call",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 43: // method_execution ::= IDENTIFIER LPAREN execution_parameter_list_body RPAREN 
            {
              Object RESULT =null;
		int idFunctionleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int idFunctionright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object idFunction = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		

		    temp = idFunction.toString();
		    ArrayList<String> tempArguments = functionTable.get(temp);

		    if (!functionTable.containsKey(temp)){
                System.err.println("Function " + temp + " have not been declared!");
                System.exit(100);
            } else if (tempArguments.size() != executionArguments.size()){
                System.err.println("For method " + temp + ", number of arguments does not match!");
                System.exit(101);
            }

            for (int i=0; i<executionArguments.size(); i++){
                if (!executionArguments.get(i).equals(tempArguments.get(i))){
                    System.err.println("The Type of arguments \"" + temp + "\" and it's call does not match!");
                    System.exit(102);
                }
            }
		
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("method_execution",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 44: // method_execution ::= 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("method_execution",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 45: // execution_parameter_list_body ::= value_function COMMA execution_parameter_list_body 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("execution_parameter_list_body",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 46: // execution_parameter_list_body ::= value_function 
            {
              Object RESULT =null;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("execution_parameter_list_body",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 47: // value_function ::= NAT 
            {
              Object RESULT =null;
		 executionArguments.add("nat"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value_function",22, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 48: // value_function ::= FLOAT 
            {
              Object RESULT =null;
		 executionArguments.add("float"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value_function",22, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 49: // value_function ::= STRING 
            {
              Object RESULT =null;
		 executionArguments.add("String"); 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("value_function",22, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}