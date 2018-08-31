/* The following code was generated by JFlex 1.6.1 */

package minic_compis;
import static minic_compis.Token.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>C:/Users/Walter Rodriguez/Documents/NetBeansProjects/miniC_Compis/src/minic_compis/AnalizadorFlex.flex</tt>
 */
class AnalizadorFlex {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\22\1\22\1\63\1\22\1\22\22\0\1\3\1\4\1\60"+
    "\1\5\1\5\1\5\1\6\1\0\1\10\1\11\1\13\1\14\1\17"+
    "\1\14\1\20\1\7\1\54\11\2\1\5\1\17\1\4\1\12\1\4"+
    "\1\5\1\5\1\52\1\56\1\56\1\56\1\57\1\56\7\1\1\51"+
    "\11\1\1\55\2\1\1\15\1\0\1\16\1\0\1\21\1\0\1\41"+
    "\1\32\1\40\1\26\1\34\1\42\1\37\1\43\1\25\1\1\1\50"+
    "\1\33\1\45\1\27\1\24\1\46\1\1\1\36\1\35\1\30\1\31"+
    "\1\23\1\47\1\44\1\53\1\1\1\61\1\17\1\62\7\0\1\63"+
    "\33\0\1\5\12\0\1\5\3\0\1\5\16\0\1\5\21\0\1\1"+
    "\37\0\1\1\u1f36\0\1\63\1\63\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\1\1\6"+
    "\4\5\15\2\1\3\1\7\1\5\1\0\1\10\1\0"+
    "\1\10\2\2\1\11\20\2\1\0\1\12\1\13\1\0"+
    "\1\2\1\11\15\2\1\11\1\14\1\0\2\2\1\15"+
    "\22\2";

  private static int [] zzUnpackAction() {
    int [] result = new int[94];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\u016c"+
    "\0\u01a0\0\64\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8"+
    "\0\u030c\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444\0\u0478"+
    "\0\u04ac\0\u04e0\0\u0514\0\u0548\0\u057c\0\u016c\0\u01d4\0\u01d4"+
    "\0\u05b0\0\u05e4\0\150\0\u0618\0\u064c\0\u0680\0\u06b4\0\u06e8"+
    "\0\u071c\0\u0750\0\u0784\0\u07b8\0\u07ec\0\u0820\0\u0854\0\u0888"+
    "\0\u08bc\0\u08f0\0\u0924\0\u0958\0\64\0\u098c\0\u09c0\0\u09f4"+
    "\0\u0a28\0\u0a5c\0\u0a90\0\u0ac4\0\u0af8\0\u0b2c\0\u0b60\0\u0b94"+
    "\0\u0bc8\0\u0bfc\0\u0c30\0\u0c64\0\u0c98\0\u0ccc\0\u0d00\0\u0958"+
    "\0\u098c\0\u0d34\0\u0d68\0\150\0\u0d9c\0\u0dd0\0\u0e04\0\u0e38"+
    "\0\u0e6c\0\u0ea0\0\u0ed4\0\u0f08\0\u0f3c\0\u0f70\0\u0fa4\0\u0fd8"+
    "\0\u100c\0\u1040\0\u1074\0\u10a8\0\u10dc\0\u1110";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[94];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\6\1\2\1\7\1\10"+
    "\1\11\1\12\1\6\1\13\1\12\1\14\3\12\1\2"+
    "\1\5\1\15\1\3\1\16\1\17\1\20\1\21\1\3"+
    "\1\22\1\3\1\23\1\24\1\25\1\3\1\26\1\3"+
    "\1\27\4\3\1\30\1\3\1\31\2\3\1\32\3\3"+
    "\1\33\1\34\1\12\66\0\2\3\16\0\1\3\1\0"+
    "\35\3\6\0\1\4\15\0\1\35\33\0\1\4\12\0"+
    "\1\5\16\0\1\5\53\0\1\12\57\0\1\12\56\0"+
    "\6\10\1\36\3\10\1\36\6\10\1\37\35\10\15\0"+
    "\1\12\53\0\6\37\1\40\3\37\1\40\44\37\22\0"+
    "\1\12\46\0\2\3\16\0\1\3\1\0\1\3\1\41"+
    "\33\3\5\0\2\3\16\0\1\3\1\0\4\3\1\42"+
    "\12\3\1\43\2\3\1\44\12\3\5\0\2\3\16\0"+
    "\1\3\1\0\1\3\1\45\33\3\5\0\2\3\16\0"+
    "\1\3\1\0\6\3\1\46\26\3\5\0\2\3\16\0"+
    "\1\3\1\0\13\3\1\47\4\3\1\50\14\3\5\0"+
    "\2\3\16\0\1\3\1\0\1\3\1\51\11\3\1\52"+
    "\21\3\5\0\2\3\16\0\1\3\1\0\10\3\1\53"+
    "\10\3\1\54\13\3\5\0\2\3\16\0\1\3\1\0"+
    "\5\3\1\55\27\3\5\0\2\3\16\0\1\3\1\0"+
    "\11\3\1\56\23\3\5\0\2\3\16\0\1\3\1\0"+
    "\10\3\1\57\24\3\5\0\2\3\16\0\1\3\1\0"+
    "\1\3\1\60\14\3\1\61\16\3\5\0\2\3\16\0"+
    "\1\3\1\0\20\3\1\62\14\3\5\0\2\3\16\0"+
    "\1\3\1\0\11\3\1\63\23\3\6\0\1\4\15\0"+
    "\1\35\23\0\1\64\7\0\1\4\1\64\7\0\21\33"+
    "\1\0\35\33\1\65\65\0\1\12\3\0\1\66\31\0"+
    "\1\67\17\0\1\66\2\0\1\67\5\0\2\3\16\0"+
    "\1\3\1\0\2\3\1\70\32\3\5\0\2\3\16\0"+
    "\1\3\1\0\5\3\1\71\27\3\5\0\2\3\16\0"+
    "\1\3\1\0\23\3\1\72\11\3\5\0\2\3\16\0"+
    "\1\3\1\0\6\3\1\73\26\3\5\0\2\3\16\0"+
    "\1\3\1\0\10\3\1\74\24\3\5\0\2\3\16\0"+
    "\1\3\1\0\6\3\1\75\26\3\5\0\2\3\16\0"+
    "\1\3\1\0\2\3\1\76\32\3\5\0\2\3\16\0"+
    "\1\3\1\0\1\3\1\74\33\3\5\0\2\3\16\0"+
    "\1\3\1\0\11\3\1\77\23\3\5\0\2\3\16\0"+
    "\1\3\1\0\12\3\1\100\22\3\5\0\2\3\16\0"+
    "\1\3\1\0\5\3\1\101\27\3\5\0\2\3\16\0"+
    "\1\3\1\0\13\3\1\102\21\3\5\0\2\3\16\0"+
    "\1\3\1\0\5\3\1\103\27\3\5\0\2\3\16\0"+
    "\1\3\1\0\16\3\1\104\16\3\5\0\2\3\16\0"+
    "\1\3\1\0\13\3\1\43\21\3\5\0\2\3\16\0"+
    "\1\3\1\0\10\3\1\105\24\3\5\0\2\3\16\0"+
    "\1\3\1\0\2\3\1\106\32\3\5\0\2\3\16\0"+
    "\1\3\1\0\24\3\1\107\10\3\6\0\1\110\23\0"+
    "\1\110\3\0\1\110\1\0\1\110\3\0\3\110\7\0"+
    "\1\110\1\0\1\110\1\0\2\110\6\0\1\66\51\0"+
    "\1\66\23\0\1\111\50\0\2\3\16\0\1\3\1\0"+
    "\3\3\1\43\31\3\5\0\2\3\16\0\1\3\1\0"+
    "\11\3\1\112\23\3\5\0\2\3\16\0\1\3\1\0"+
    "\10\3\1\113\24\3\5\0\2\3\16\0\1\3\1\0"+
    "\7\3\1\106\25\3\5\0\2\3\16\0\1\3\1\0"+
    "\10\3\1\43\24\3\5\0\2\3\16\0\1\3\1\0"+
    "\11\3\1\114\23\3\5\0\2\3\16\0\1\3\1\0"+
    "\12\3\1\43\22\3\5\0\2\3\16\0\1\3\1\0"+
    "\16\3\1\115\16\3\5\0\2\3\16\0\1\3\1\0"+
    "\11\3\1\43\23\3\5\0\2\3\16\0\1\3\1\0"+
    "\11\3\1\116\23\3\5\0\2\3\16\0\1\3\1\0"+
    "\2\3\1\117\32\3\5\0\2\3\16\0\1\3\1\0"+
    "\6\3\1\120\26\3\5\0\2\3\16\0\1\3\1\0"+
    "\12\3\1\76\22\3\5\0\2\3\16\0\1\3\1\0"+
    "\12\3\1\75\22\3\5\0\2\3\16\0\1\3\1\0"+
    "\10\3\1\100\24\3\5\0\2\3\16\0\1\3\1\0"+
    "\27\3\1\121\5\3\5\0\2\3\16\0\1\3\1\0"+
    "\13\3\1\122\21\3\5\0\2\3\16\0\1\3\1\0"+
    "\11\3\1\123\23\3\5\0\2\3\16\0\1\3\1\0"+
    "\25\3\1\43\7\3\5\0\2\3\16\0\1\3\1\0"+
    "\4\3\1\124\30\3\5\0\2\3\16\0\1\3\1\0"+
    "\4\3\1\125\30\3\5\0\2\3\16\0\1\3\1\0"+
    "\13\3\1\126\21\3\5\0\2\3\16\0\1\3\1\0"+
    "\13\3\1\127\21\3\5\0\2\3\16\0\1\3\1\0"+
    "\17\3\1\130\15\3\5\0\2\3\16\0\1\3\1\0"+
    "\22\3\1\131\12\3\5\0\2\3\16\0\1\3\1\0"+
    "\3\3\1\76\31\3\5\0\2\3\16\0\1\3\1\0"+
    "\14\3\1\43\20\3\5\0\2\3\16\0\1\3\1\0"+
    "\4\3\1\43\30\3\5\0\2\3\16\0\1\3\1\0"+
    "\13\3\1\132\21\3\5\0\2\3\16\0\1\3\1\0"+
    "\16\3\1\133\16\3\5\0\2\3\16\0\1\3\1\0"+
    "\11\3\1\134\23\3\5\0\2\3\16\0\1\3\1\0"+
    "\16\3\1\135\16\3\5\0\2\3\16\0\1\3\1\0"+
    "\15\3\1\100\17\3\5\0\2\3\16\0\1\3\1\0"+
    "\4\3\1\136\30\3\5\0\2\3\16\0\1\3\1\0"+
    "\30\3\1\43\4\3\5\0\2\3\16\0\1\3\1\0"+
    "\5\3\1\76\27\3\4\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4420];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\7\1\1\11\22\1\1\0\1\1\1\0"+
    "\24\1\1\0\1\11\1\1\1\0\21\1\1\0\25\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[94];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
    public String retornoToken;
    public int fila;
    public int columna;
    public int tamanio;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  AnalizadorFlex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 224) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return ERROR;
            }
          case 14: break;
          case 2: 
            { retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;            return Identificador;
            }
          case 15: break;
          case 3: 
            { retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;       return ConstEnteraDecimal;
            }
          case 16: break;
          case 4: 
            { /* Ignore */
            }
          case 17: break;
          case 5: 
            { retornoToken = yytext();  fila = yyline+1; columna = yycolumn+1;                return Operador;
            }
          case 18: break;
          case 6: 
            { retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;         return ComentarioLineal;
            }
          case 19: break;
          case 7: 
            { retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;         return CadenaIncompleta;
            }
          case 20: break;
          case 8: 
            { retornoToken = yytext();    fila = yyline+1; columna = yycolumn+1;  return ComentarioExtendido;
            }
          case 21: break;
          case 9: 
            { retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;              return P_Reservada;
            }
          case 22: break;
          case 10: 
            { retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;              return ConstString;
            }
          case 23: break;
          case 11: 
            { retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;              return ConstDouble;
            }
          case 24: break;
          case 12: 
            { retornoToken = yytext();   fila = yyline+1; columna = yycolumn+1;        return ConstEnteraHexa;
            }
          case 25: break;
          case 13: 
            { retornoToken = yytext(); fila = yyline+1; columna = yycolumn+1;            return ConstBooleana;
            }
          case 26: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
