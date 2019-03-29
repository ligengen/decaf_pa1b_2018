/* This is auto-generated source by LL1-Parser-Gen.
 * Specification file: /Users/ligen/Desktop/decaf_PA1_B/src/decaf/frontend/Parser.spec
 * Options: unstrict mode
 * Generated at: Sun Nov 04 23:42:11 CST 2018
 * Please do NOT modify it!
 *
 * Project repository: https://github.com/paulzfm/LL1-Parser-Gen
 * Version: special version for decaf-PA1-B
 * Author: Zhu Fengmin (Paul)
 */

package decaf.frontend;

import decaf.Location;
import decaf.tree.Tree;
import decaf.tree.Tree.*;
import java.util.*;

public class Table
 {
    public static final int eof = -1;
    public static final int eos = 0;
    
    /* tokens and symbols */
    public static final int VOID = 257; //# line 13
    public static final int BOOL = 258; //# line 13
    public static final int INT = 259; //# line 13
    public static final int STRING = 260; //# line 13
    public static final int CLASS = 261; //# line 13
    public static final int NULL = 262; //# line 14
    public static final int EXTENDS = 263; //# line 14
    public static final int THIS = 264; //# line 14
    public static final int WHILE = 265; //# line 14
    public static final int FOR = 266; //# line 14
    public static final int IF = 267; //# line 15
    public static final int ELSE = 268; //# line 15
    public static final int RETURN = 269; //# line 15
    public static final int BREAK = 270; //# line 15
    public static final int NEW = 271; //# line 15
    public static final int PRINT = 272; //# line 16
    public static final int READ_INTEGER = 273; //# line 16
    public static final int READ_LINE = 274; //# line 16
    public static final int LITERAL = 275; //# line 17
    public static final int IDENTIFIER = 276; //# line 18
    public static final int AND = 277; //# line 18
    public static final int OR = 278; //# line 18
    public static final int STATIC = 279; //# line 18
    public static final int INSTANCEOF = 280; //# line 18
    public static final int LESS_EQUAL = 281; //# line 19
    public static final int GREATER_EQUAL = 282; //# line 19
    public static final int EQUAL = 283; //# line 19
    public static final int NOT_EQUAL = 284; //# line 19
    public static final int FOREACH = 285; //# line 20
    public static final int SEALED = 286; //# line 20
    public static final int CONCATARRAY = 287; //# line 20
    public static final int SCOPY = 288; //# line 20
    public static final int COLON = 289; //# line 20
    public static final int IN = 290; //# line 20
    public static final int INITARRAY = 291; //# line 21
    public static final int VAR = 292; //# line 21
    public static final int GUARD = 293; //# line 21
    public static final int DEFAULT = 294; //# line 21
    public static final int PYTHONLEFT = 295; //# line 21
    public static final int PYTHONRIGHT = 296; //# line 22
    
    public static final int ExprT44 = 297;
    public static final int VariableDef = 298;
    public static final int ExprT5 = 299;
    public static final int ArrayConstantSub = 300;
    public static final int BoundVariable = 301;
    public static final int Oper3 = 302;
    public static final int Oper6 = 303;
    public static final int VariableList = 304;
    public static final int Formals = 305;
    public static final int Oper7 = 306;
    public static final int ForeachSub = 307;
    public static final int IfSubStmt = 308;
    public static final int Expr8 = 309;
    public static final int AfterSimpleTypeExpr = 310;
    public static final int Expr41 = 311;
    public static final int Expr2 = 312;
    public static final int Oper2 = 313;
    public static final int ExprT8SubSub = 314;
    public static final int IfStmtTwoSub = 315;
    public static final int Expr6 = 316;
    public static final int IfBranchList = 317;
    public static final int BreakStmt = 318;
    public static final int ExprT2 = 319;
    public static final int StmtList = 320;
    public static final int Constant = 321;
    public static final int SubVariableList = 322;
    public static final int PrintStmt = 323;
    public static final int ConstantList = 324;
    public static final int ForStmt = 325;
    public static final int Expr9 = 326;
    public static final int Expr1 = 327;
    public static final int ForeachStmt = 328;
    public static final int ArrayConstant = 329;
    public static final int CompExprSub = 330;
    public static final int Oper1 = 331;
    public static final int ElseClause = 332;
    public static final int ExprT41 = 333;
    public static final int FieldList = 334;
    public static final int IfBranch = 335;
    public static final int SubExprList = 336;
    public static final int AfterParenExpr = 337;
    public static final int ClassDef = 338;
    public static final int ReturnStmt = 339;
    public static final int ExprList = 340;
    public static final int StmtBlock = 341;
    public static final int ConstantListSub = 342;
    public static final int FunctionField = 343;
    public static final int AfterIdentExpr = 344;
    public static final int Program = 345;
    public static final int Expr = 346;
    public static final int Type = 347;
    public static final int Expr5 = 348;
    public static final int Expr42 = 349;
    public static final int AfterNewExpr = 350;
    public static final int GuardedStmtSub = 351;
    public static final int Assignment = 352;
    public static final int ExtendsClause = 353;
    public static final int Oper5 = 354;
    public static final int Oper42 = 355;
    public static final int ArrayType = 356;
    public static final int Expr3 = 357;
    public static final int Actuals = 358;
    public static final int IfStmtTwo = 359;
    public static final int Variable = 360;
    public static final int ExprT3 = 361;
    public static final int Stmt = 362;
    public static final int SimpleStmt = 363;
    public static final int SimpleType = 364;
    public static final int Oper41 = 365;
    public static final int WhileStmt = 366;
    public static final int ExprT1 = 367;
    public static final int Expr4 = 368;
    public static final int ExprT4 = 369;
    public static final int ReturnExpr = 370;
    public static final int OCStmt = 371;
    public static final int ExprT6 = 372;
    public static final int ExprT8Sub = 373;
    public static final int ExprT8 = 374;
    public static final int Expr7 = 375;
    public static final int ClassList = 376;
    public static final int Oper4 = 377;
    public static final int Field = 378;
    
    /* start symbol */
    public final int start = Program;
    
    /**
      * Judge if a symbol (within valid range) is non-terminal.
      *
      * @param symbol the symbol to be judged.
      * @return true if and only if the symbol is non-terminal.
      */
        
    public boolean isNonTerminal(int symbol) {
        return symbol >= 297;
    }
    
    private final String[] allSymbols = {
        "VOID", "BOOL", "INT", "STRING", "CLASS",
        "NULL", "EXTENDS", "THIS", "WHILE", "FOR",
        "IF", "ELSE", "RETURN", "BREAK", "NEW",
        "PRINT", "READ_INTEGER", "READ_LINE", "LITERAL", "IDENTIFIER",
        "AND", "OR", "STATIC", "INSTANCEOF", "LESS_EQUAL",
        "GREATER_EQUAL", "EQUAL", "NOT_EQUAL", "FOREACH", "SEALED",
        "CONCATARRAY", "SCOPY", "COLON", "IN", "INITARRAY",
        "VAR", "GUARD", "DEFAULT", "PYTHONLEFT", "PYTHONRIGHT",
        "ExprT44", "VariableDef", "ExprT5", "ArrayConstantSub", "BoundVariable",
        "Oper3", "Oper6", "VariableList", "Formals", "Oper7",
        "ForeachSub", "IfSubStmt", "Expr8", "AfterSimpleTypeExpr", "Expr41",
        "Expr2", "Oper2", "ExprT8SubSub", "IfStmtTwoSub", "Expr6",
        "IfBranchList", "BreakStmt", "ExprT2", "StmtList", "Constant",
        "SubVariableList", "PrintStmt", "ConstantList", "ForStmt", "Expr9",
        "Expr1", "ForeachStmt", "ArrayConstant", "CompExprSub", "Oper1",
        "ElseClause", "ExprT41", "FieldList", "IfBranch", "SubExprList",
        "AfterParenExpr", "ClassDef", "ReturnStmt", "ExprList", "StmtBlock",
        "ConstantListSub", "FunctionField", "AfterIdentExpr", "Program", "Expr",
        "Type", "Expr5", "Expr42", "AfterNewExpr", "GuardedStmtSub",
        "Assignment", "ExtendsClause", "Oper5", "Oper42", "ArrayType",
        "Expr3", "Actuals", "IfStmtTwo", "Variable", "ExprT3",
        "Stmt", "SimpleStmt", "SimpleType", "Oper41", "WhileStmt",
        "ExprT1", "Expr4", "ExprT4", "ReturnExpr", "OCStmt",
        "ExprT6", "ExprT8Sub", "ExprT8", "Expr7", "ClassList",
        "Oper4", "Field",
    };
    
    /**
      * Debugging function (pretty print).
      * Get string presentation of some token or symbol.
      *
      * @param symbol either terminal or non-terminal.
      * @return its string presentation.
      */
        
    public String name(int symbol) {
        if (symbol == eof) return "<eof>";
        if (symbol == eos) return "<eos>";
        if (symbol > 0 && symbol <= 256) return "'" + (char) symbol + "'";
        return allSymbols[symbol - 257];
    }
    
    /* begin lookahead symbols */
    private ArrayList<Set<Integer>> begin = new ArrayList<Set<Integer>>();
    private final Integer[][] beginRaw = {
        {CONCATARRAY, LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('+'), Integer.valueOf('-'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, INITARRAY, EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {LITERAL, NULL, Integer.valueOf('['), Integer.valueOf(']')},
        {VAR, VOID, CLASS, INT, STRING, BOOL},
        {EQUAL, NOT_EQUAL},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%')},
        {VOID, CLASS, INT, STRING, BOOL},
        {VOID, CLASS, INT, STRING, BOOL, Integer.valueOf(')')},
        {Integer.valueOf('-'), Integer.valueOf('!')},
        {Integer.valueOf(')'), WHILE},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {PYTHONLEFT, READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf(']'), Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {AND},
        {DEFAULT, Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, INITARRAY, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('('), Integer.valueOf('{')},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {GUARD, Integer.valueOf('}')},
        {BREAK},
        {AND, Integer.valueOf(']'), FOR, Integer.valueOf(')'), COLON, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, IF, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), PYTHONLEFT, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{'), Integer.valueOf('}')},
        {LITERAL, NULL, Integer.valueOf('[')},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {PRINT},
        {LITERAL, NULL, Integer.valueOf('[')},
        {FOR},
        {LITERAL, NULL, Integer.valueOf('['), READ_INTEGER, READ_LINE, THIS, NEW, INSTANCEOF, Integer.valueOf('('), IDENTIFIER, PYTHONLEFT},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {FOREACH},
        {Integer.valueOf('[')},
        {IF, PYTHONRIGHT},
        {OR},
        {ELSE, PRINT, VOID, FOR, Integer.valueOf('!'), PYTHONLEFT, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {INITARRAY, LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {VOID, CLASS, INT, STRING, STATIC, BOOL, Integer.valueOf('}')},
        {GUARD},
        {Integer.valueOf(','), Integer.valueOf(')')},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, CLASS},
        {CLASS, SEALED},
        {RETURN},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('{')},
        {Integer.valueOf(','), Integer.valueOf(']')},
        {Integer.valueOf('('), Integer.valueOf(';')},
        {Integer.valueOf('('), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, INITARRAY, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {CLASS, SEALED},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {IDENTIFIER, VOID, CLASS, INT, STRING, BOOL},
        {Integer.valueOf('}'), Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('='), Integer.valueOf(';'), Integer.valueOf(')')},
        {EXTENDS, Integer.valueOf('{')},
        {Integer.valueOf('+'), Integer.valueOf('-')},
        {INITARRAY},
        {Integer.valueOf('['), IDENTIFIER},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, Integer.valueOf(')')},
        {IF},
        {VOID, CLASS, INT, STRING, BOOL},
        {EQUAL, NOT_EQUAL, Integer.valueOf(']'), FOR, Integer.valueOf(')'), COLON, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, AND, IF, Integer.valueOf(';')},
        {VOID, CLASS, INT, STRING, BOOL, Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, VAR, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), READ_INTEGER, IF, WHILE, FOR, RETURN, PRINT, BREAK, Integer.valueOf('{'), SCOPY, FOREACH},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, VAR, Integer.valueOf(';'), Integer.valueOf(')')},
        {INT, VOID, BOOL, STRING, CLASS},
        {CONCATARRAY},
        {WHILE},
        {OR, Integer.valueOf(']'), FOR, Integer.valueOf(')'), COLON, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf(']'), FOR, EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER, Integer.valueOf(';')},
        {SCOPY},
        {Integer.valueOf('*'), Integer.valueOf('/'), Integer.valueOf('%'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, INITARRAY, Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, Integer.valueOf('+'), AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {COLON, Integer.valueOf(']')},
        {Integer.valueOf('['), Integer.valueOf('.'), Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, INITARRAY, Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('-'), Integer.valueOf('!'), PYTHONLEFT, READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {CLASS, SEALED, eof, eos},
        {LESS_EQUAL, GREATER_EQUAL, Integer.valueOf('<'), Integer.valueOf('>')},
        {STATIC, VOID, CLASS, INT, STRING, BOOL},
    };
    
    /**
      * Get begin lookahead tokens for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its begin lookahead tokens.
      */
        
    public Set<Integer> beginSet(int symbol) {
        return begin.get(symbol - 297);
    }
    
    /* follow set */
    private ArrayList<Set<Integer>> follow = new ArrayList<Set<Integer>>();
    private final Integer[][] followRaw = {
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), PYTHONLEFT, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, INITARRAY, EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf(']')},
        {IN},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf(')')},
        {Integer.valueOf(')')},
        {PYTHONLEFT, READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), PYTHONLEFT, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {GUARD, Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, INITARRAY, Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, INITARRAY, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(')'), COLON, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, IF, Integer.valueOf(';')},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, INITARRAY, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), PYTHONLEFT, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, INITARRAY, Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, Integer.valueOf('+'), AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('}')},
        {Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(')'), COLON, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, IF, Integer.valueOf(';')},
        {Integer.valueOf('}')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, INITARRAY, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(')')},
        {Integer.valueOf(';')},
        {Integer.valueOf(']')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), PYTHONLEFT, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, INITARRAY, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(')'), COLON, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, IF, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), PYTHONLEFT, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, INITARRAY, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {PYTHONRIGHT},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), PYTHONLEFT, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('}')},
        {GUARD, Integer.valueOf('}')},
        {Integer.valueOf(')')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, INITARRAY, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {CLASS, SEALED, eof, eos},
        {Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), PYTHONLEFT, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, STATIC, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']')},
        {VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, INITARRAY, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {eof, eos},
        {Integer.valueOf(']'), FOR, Integer.valueOf(')'), COLON, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, IF, Integer.valueOf(';')},
        {IDENTIFIER},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, INITARRAY, EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, INITARRAY, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), PYTHONLEFT, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('{')},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {IDENTIFIER},
        {Integer.valueOf(']'), FOR, Integer.valueOf(')'), COLON, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(')')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), PYTHONLEFT, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(';'), Integer.valueOf(','), Integer.valueOf(')')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(')'), COLON, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, AND, IF, Integer.valueOf(';')},
        {PRINT, VOID, FOR, Integer.valueOf('!'), PYTHONLEFT, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(';'), Integer.valueOf(')')},
        {Integer.valueOf('['), IDENTIFIER},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {PRINT, VOID, FOR, Integer.valueOf('!'), PYTHONLEFT, FOREACH, Integer.valueOf('-'), CLASS, READ_LINE, WHILE, RETURN, NULL, INT, SCOPY, Integer.valueOf('}'), GUARD, IDENTIFIER, NEW, IF, VAR, THIS, INSTANCEOF, STRING, LITERAL, ELSE, Integer.valueOf('('), Integer.valueOf(';'), Integer.valueOf('['), BOOL, BREAK, READ_INTEGER, Integer.valueOf('{')},
        {Integer.valueOf(']'), FOR, Integer.valueOf(')'), COLON, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, IF, Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(']'), FOR, EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, AND, IF, Integer.valueOf(';')},
        {Integer.valueOf(';')},
        {Integer.valueOf(';')},
        {LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, INITARRAY, Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, Integer.valueOf('+'), AND, IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, INITARRAY, Integer.valueOf('.'), Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('['), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, INITARRAY, Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {Integer.valueOf('/'), LESS_EQUAL, Integer.valueOf(']'), FOR, GREATER_EQUAL, INITARRAY, Integer.valueOf('-'), EQUAL, Integer.valueOf(')'), COLON, NOT_EQUAL, Integer.valueOf(','), WHILE, Integer.valueOf('='), PYTHONRIGHT, OR, CONCATARRAY, Integer.valueOf('+'), AND, Integer.valueOf('*'), IF, Integer.valueOf(';'), Integer.valueOf('<'), Integer.valueOf('>'), Integer.valueOf('%')},
        {eof, eos},
        {Integer.valueOf('!'), PYTHONLEFT, Integer.valueOf('-'), READ_LINE, NULL, IDENTIFIER, NEW, THIS, INSTANCEOF, LITERAL, Integer.valueOf('('), Integer.valueOf('['), READ_INTEGER},
        {VOID, CLASS, INT, Integer.valueOf('}'), STRING, STATIC, BOOL},
    };
    
    /**
      * Get follow set for `symbol`.
      *
      * @param symbol the non-terminal.
      * @return its follow set.
      */
        
    public Set<Integer> followSet(int symbol) {
        return follow.get(symbol - 297);
    }
    
    public Table() {
        for (int i = 0; i < 82; i++) {
            begin.add(new HashSet<>(Arrays.asList(beginRaw[i])));
            follow.add(new HashSet<>(Arrays.asList(followRaw[i])));
        }
    }
    
    /**
      * Predictive table `M` query function.
      * `query(A, a)` will return the corresponding term `M(A, a)`, i.e., the target production
      * for non-terminal `A` when the lookahead token is `a`.
      *
      * @param nonTerminal   the non-terminal.
      * @param lookahead     the lookahead symbol.
      * @return a pair `<id, right>` where `right` is the right-hand side of the target
      * production `nonTerminal -> right`, and `id` is the corresponding action id. To execute
      * such action, call `act(id, params)`.
      * If the corresponding term is undefined in the table, `null` will be returned.
      */
        
    public Map.Entry<Integer, List<Integer>> query(int nonTerminal, int lookahead) {
        switch (nonTerminal) {
            //# line 583
            case ExprT44: {
                switch (lookahead) {
                    case CONCATARRAY:
                        return new AbstractMap.SimpleEntry<>(0, Arrays.asList(Oper41, Expr42, ExprT44));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case EQUAL:
                    case ')':
                    case COLON:
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case PYTHONRIGHT:
                    case OR:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList());
                    default: return null;
                }
            }
            //# line 50
            case VariableDef: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(2, Arrays.asList(Variable, Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 640
            case ExprT5: {
                switch (lookahead) {
                    case '+':
                    case '-':
                        return new AbstractMap.SimpleEntry<>(3, Arrays.asList(Oper5, Expr6, ExprT5));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case INITARRAY:
                    case EQUAL:
                    case ')':
                    case COLON:
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case PYTHONRIGHT:
                    case OR:
                    case CONCATARRAY:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList());
                    default: return null;
                }
            }
            //# line 1003
            case ArrayConstantSub: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                    case '[':
                        return new AbstractMap.SimpleEntry<>(5, Arrays.asList(ConstantList));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(6, Arrays.asList());
                    default: return null;
                }
            }
            //# line 985
            case BoundVariable: {
                switch (lookahead) {
                    case VAR:
                        return new AbstractMap.SimpleEntry<>(7, Arrays.asList(VAR, IDENTIFIER));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(8, Arrays.asList(Type, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 354
            case Oper3: {
                switch (lookahead) {
                    case EQUAL:
                        return new AbstractMap.SimpleEntry<>(9, Arrays.asList(EQUAL));
                    case NOT_EQUAL:
                        return new AbstractMap.SimpleEntry<>(10, Arrays.asList(NOT_EQUAL));
                    default: return null;
                }
            }
            //# line 415
            case Oper6: {
                switch (lookahead) {
                    case '*':
                        return new AbstractMap.SimpleEntry<>(11, Arrays.asList(Integer.valueOf('*')));
                    case '/':
                        return new AbstractMap.SimpleEntry<>(12, Arrays.asList(Integer.valueOf('/')));
                    case '%':
                        return new AbstractMap.SimpleEntry<>(13, Arrays.asList(Integer.valueOf('%')));
                    default: return null;
                }
            }
            //# line 170
            case VariableList: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(14, Arrays.asList(Variable, SubVariableList));
                    default: return null;
                }
            }
            //# line 160
            case Formals: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(15, Arrays.asList(VariableList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(16, Arrays.asList());
                    default: return null;
                }
            }
            //# line 432
            case Oper7: {
                switch (lookahead) {
                    case '-':
                        return new AbstractMap.SimpleEntry<>(17, Arrays.asList(Integer.valueOf('-')));
                    case '!':
                        return new AbstractMap.SimpleEntry<>(18, Arrays.asList(Integer.valueOf('!')));
                    default: return null;
                }
            }
            //# line 973
            case ForeachSub: {
                switch (lookahead) {
                    case ')':
                        return new AbstractMap.SimpleEntry<>(19, Arrays.asList(Integer.valueOf(')'), Stmt));
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(20, Arrays.asList(WHILE, Expr, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 310
            case IfSubStmt: {
                switch (lookahead) {
                    case '!':
                    case PYTHONLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(21, Arrays.asList(Expr, COLON, Stmt));
                    default: return null;
                }
            }
            //# line 696
            case Expr8: {
                switch (lookahead) {
                    case PYTHONLEFT:
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(22, Arrays.asList(Expr9, ExprT8));
                    default: return null;
                }
            }
            //# line 848
            case AfterSimpleTypeExpr: {
                switch (lookahead) {
                    case ']':
                        return new AbstractMap.SimpleEntry<>(23, Arrays.asList(Integer.valueOf(']'), Integer.valueOf('['), AfterSimpleTypeExpr));
                    case '!':
                    case PYTHONLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(24, Arrays.asList(Expr, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 568
            case Expr41: {
                switch (lookahead) {
                    case '!':
                    case PYTHONLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(25, Arrays.asList(Expr42, ExprT44));
                    default: return null;
                }
            }
            //# line 480
            case Expr2: {
                switch (lookahead) {
                    case '!':
                    case PYTHONLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(26, Arrays.asList(Expr3, ExprT2));
                    default: return null;
                }
            }
            //# line 347
            case Oper2: {
                switch (lookahead) {
                    case AND:
                        return new AbstractMap.SimpleEntry<>(27, Arrays.asList(AND));
                    default: return null;
                }
            }
            //# line 767
            case ExprT8SubSub: {
                switch (lookahead) {
                    case DEFAULT:
                        return new AbstractMap.SimpleEntry<>(28, Arrays.asList(DEFAULT, Expr9));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case INITARRAY:
                    case '.':
                    case '-':
                    case EQUAL:
                    case ')':
                    case COLON:
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case PYTHONRIGHT:
                    case OR:
                    case CONCATARRAY:
                    case '+':
                    case AND:
                    case '*':
                    case IF:
                    case ';':
                    case '<':
                    case '[':
                    case '>':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList());
                    default: return null;
                }
            }
            //# line 267
            case IfStmtTwoSub: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(30, Arrays.asList(Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt, ElseClause));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(31, Arrays.asList(Integer.valueOf('{'), GuardedStmtSub));
                    default: return null;
                }
            }
            //# line 657
            case Expr6: {
                switch (lookahead) {
                    case '!':
                    case PYTHONLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(32, Arrays.asList(Expr7, ExprT6));
                    default: return null;
                }
            }
            //# line 292
            case IfBranchList: {
                switch (lookahead) {
                    case GUARD:
                        return new AbstractMap.SimpleEntry<>(33, Arrays.asList(IfBranch, IfBranchList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(34, Arrays.asList());
                    default: return null;
                }
            }
            //# line 929
            case BreakStmt: {
                switch (lookahead) {
                    case BREAK:
                        return new AbstractMap.SimpleEntry<>(35, Arrays.asList(BREAK));
                    default: return null;
                }
            }
            //# line 492
            case ExprT2: {
                switch (lookahead) {
                    case AND:
                        return new AbstractMap.SimpleEntry<>(36, Arrays.asList(Oper2, Expr3, ExprT2));
                    case ']':
                    case FOR:
                    case ')':
                    case COLON:
                    case ',':
                    case WHILE:
                    case '=':
                    case PYTHONRIGHT:
                    case OR:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList());
                    default: return null;
                }
            }
            //# line 197
            case StmtList: {
                switch (lookahead) {
                    case PRINT:
                    case VOID:
                    case FOR:
                    case '!':
                    case PYTHONLEFT:
                    case FOREACH:
                    case '-':
                    case CLASS:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case SCOPY:
                    case IDENTIFIER:
                    case NEW:
                    case IF:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case BOOL:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new AbstractMap.SimpleEntry<>(38, Arrays.asList(Stmt, StmtList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList());
                    default: return null;
                }
            }
            //# line 872
            case Constant: {
                switch (lookahead) {
                    case LITERAL:
                        return new AbstractMap.SimpleEntry<>(40, Arrays.asList(LITERAL));
                    case NULL:
                        return new AbstractMap.SimpleEntry<>(41, Arrays.asList(NULL));
                    case '[':
                        return new AbstractMap.SimpleEntry<>(42, Arrays.asList(ArrayConstant));
                    default: return null;
                }
            }
            //# line 180
            case SubVariableList: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(43, Arrays.asList(Integer.valueOf(','), Variable, SubVariableList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList());
                    default: return null;
                }
            }
            //# line 955
            case PrintStmt: {
                switch (lookahead) {
                    case PRINT:
                        return new AbstractMap.SimpleEntry<>(45, Arrays.asList(PRINT, Integer.valueOf('('), ExprList, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 1013
            case ConstantList: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                    case '[':
                        return new AbstractMap.SimpleEntry<>(46, Arrays.asList(Constant, ConstantListSub));
                    default: return null;
                }
            }
            //# line 923
            case ForStmt: {
                switch (lookahead) {
                    case FOR:
                        return new AbstractMap.SimpleEntry<>(47, Arrays.asList(FOR, Integer.valueOf('('), SimpleStmt, Integer.valueOf(';'), Expr, Integer.valueOf(';'), SimpleStmt, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 781
            case Expr9: {
                switch (lookahead) {
                    case LITERAL:
                    case NULL:
                    case '[':
                        return new AbstractMap.SimpleEntry<>(48, Arrays.asList(Constant));
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(49, Arrays.asList(READ_INTEGER, Integer.valueOf('('), Integer.valueOf(')')));
                    case READ_LINE:
                        return new AbstractMap.SimpleEntry<>(50, Arrays.asList(READ_LINE, Integer.valueOf('('), Integer.valueOf(')')));
                    case THIS:
                        return new AbstractMap.SimpleEntry<>(51, Arrays.asList(THIS));
                    case NEW:
                        return new AbstractMap.SimpleEntry<>(52, Arrays.asList(NEW, AfterNewExpr));
                    case INSTANCEOF:
                        return new AbstractMap.SimpleEntry<>(53, Arrays.asList(INSTANCEOF, Integer.valueOf('('), Expr, Integer.valueOf(','), IDENTIFIER, Integer.valueOf(')')));
                    case '(':
                        return new AbstractMap.SimpleEntry<>(54, Arrays.asList(Integer.valueOf('('), AfterParenExpr));
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(55, Arrays.asList(IDENTIFIER, AfterIdentExpr));
                    case PYTHONLEFT:
                        return new AbstractMap.SimpleEntry<>(56, Arrays.asList(PYTHONLEFT, Expr, FOR, IDENTIFIER, IN, Expr, CompExprSub, PYTHONRIGHT));
                    default: return null;
                }
            }
            //# line 451
            case Expr1: {
                switch (lookahead) {
                    case '!':
                    case PYTHONLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(57, Arrays.asList(Expr2, ExprT1));
                    default: return null;
                }
            }
            //# line 967
            case ForeachStmt: {
                switch (lookahead) {
                    case FOREACH:
                        return new AbstractMap.SimpleEntry<>(58, Arrays.asList(FOREACH, Integer.valueOf('('), BoundVariable, IN, Expr, ForeachSub));
                    default: return null;
                }
            }
            //# line 997
            case ArrayConstant: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(59, Arrays.asList(Integer.valueOf('['), ArrayConstantSub, Integer.valueOf(']')));
                    default: return null;
                }
            }
            //# line 827
            case CompExprSub: {
                switch (lookahead) {
                    case IF:
                        return new AbstractMap.SimpleEntry<>(60, Arrays.asList(IF, Expr));
                    case PYTHONRIGHT:
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList());
                    default: return null;
                }
            }
            //# line 340
            case Oper1: {
                switch (lookahead) {
                    case OR:
                        return new AbstractMap.SimpleEntry<>(62, Arrays.asList(OR));
                    default: return null;
                }
            }
            //# line 935
            case ElseClause: {
                switch (lookahead) {
                    case ELSE:
                        return new AbstractMap.SimpleEntry<>(63, Arrays.asList(ELSE, Stmt));
                    case PRINT:
                    case VOID:
                    case FOR:
                    case '!':
                    case PYTHONLEFT:
                    case FOREACH:
                    case '-':
                    case CLASS:
                    case READ_LINE:
                    case WHILE:
                    case RETURN:
                    case NULL:
                    case INT:
                    case SCOPY:
                    case '}':
                    case GUARD:
                    case IDENTIFIER:
                    case NEW:
                    case IF:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case STRING:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case BOOL:
                    case BREAK:
                    case READ_INTEGER:
                    case '{':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList());
                    default: return null;
                }
            }
            //# line 611
            case ExprT41: {
                switch (lookahead) {
                    case INITARRAY:
                        return new AbstractMap.SimpleEntry<>(65, Arrays.asList(Oper42, Expr5, ExprT41));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case EQUAL:
                    case ')':
                    case COLON:
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case PYTHONRIGHT:
                    case OR:
                    case CONCATARRAY:
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList());
                    default: return null;
                }
            }
            //# line 120
            case FieldList: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case STATIC:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(67, Arrays.asList(Field, FieldList));
                    case '}':
                        return new AbstractMap.SimpleEntry<>(68, Arrays.asList());
                    default: return null;
                }
            }
            //# line 304
            case IfBranch: {
                switch (lookahead) {
                    case GUARD:
                        return new AbstractMap.SimpleEntry<>(69, Arrays.asList(GUARD, IfSubStmt));
                    default: return null;
                }
            }
            //# line 904
            case SubExprList: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(70, Arrays.asList(Integer.valueOf(','), Expr, SubExprList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(71, Arrays.asList());
                    default: return null;
                }
            }
            //# line 860
            case AfterParenExpr: {
                switch (lookahead) {
                    case '!':
                    case PYTHONLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(72, Arrays.asList(Expr, Integer.valueOf(')')));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(73, Arrays.asList(CLASS, IDENTIFIER, Integer.valueOf(')'), Expr9));
                    default: return null;
                }
            }
            //# line 103
            case ClassDef: {
                switch (lookahead) {
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(74, Arrays.asList(CLASS, IDENTIFIER, ExtendsClause, Integer.valueOf('{'), FieldList, Integer.valueOf('}')));
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(75, Arrays.asList(SEALED, CLASS, IDENTIFIER, ExtendsClause, Integer.valueOf('{'), FieldList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 942
            case ReturnStmt: {
                switch (lookahead) {
                    case RETURN:
                        return new AbstractMap.SimpleEntry<>(76, Arrays.asList(RETURN, ReturnExpr));
                    default: return null;
                }
            }
            //# line 896
            case ExprList: {
                switch (lookahead) {
                    case '!':
                    case PYTHONLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(77, Arrays.asList(Expr, SubExprList));
                    default: return null;
                }
            }
            //# line 191
            case StmtBlock: {
                switch (lookahead) {
                    case '{':
                        return new AbstractMap.SimpleEntry<>(78, Arrays.asList(Integer.valueOf('{'), StmtList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 1020
            case ConstantListSub: {
                switch (lookahead) {
                    case ',':
                        return new AbstractMap.SimpleEntry<>(79, Arrays.asList(Integer.valueOf(','), Constant, ConstantListSub));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(80, Arrays.asList());
                    default: return null;
                }
            }
            //# line 152
            case FunctionField: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(81, Arrays.asList(Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case ';':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList(Integer.valueOf(';')));
                    default: return null;
                }
            }
            //# line 774
            case AfterIdentExpr: {
                switch (lookahead) {
                    case '(':
                        return new AbstractMap.SimpleEntry<>(83, Arrays.asList(Integer.valueOf('('), Actuals, Integer.valueOf(')')));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case INITARRAY:
                    case '.':
                    case '-':
                    case EQUAL:
                    case ')':
                    case COLON:
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case PYTHONRIGHT:
                    case OR:
                    case CONCATARRAY:
                    case '+':
                    case AND:
                    case '*':
                    case IF:
                    case ';':
                    case '<':
                    case '[':
                    case '>':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList());
                    default: return null;
                }
            }
            //# line 28
            case Program: {
                switch (lookahead) {
                    case CLASS:
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(85, Arrays.asList(ClassDef, ClassList));
                    default: return null;
                }
            }
            //# line 445
            case Expr: {
                switch (lookahead) {
                    case '!':
                    case PYTHONLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(86, Arrays.asList(Expr1));
                    default: return null;
                }
            }
            //# line 84
            case Type: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(87, Arrays.asList(SimpleType, ArrayType));
                    default: return null;
                }
            }
            //# line 628
            case Expr5: {
                switch (lookahead) {
                    case '!':
                    case PYTHONLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(88, Arrays.asList(Expr6, ExprT5));
                    default: return null;
                }
            }
            //# line 600
            case Expr42: {
                switch (lookahead) {
                    case '!':
                    case PYTHONLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(89, Arrays.asList(Expr5, ExprT41));
                    default: return null;
                }
            }
            //# line 834
            case AfterNewExpr: {
                switch (lookahead) {
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(90, Arrays.asList(IDENTIFIER, Integer.valueOf('('), Integer.valueOf(')')));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(91, Arrays.asList(SimpleType, Integer.valueOf('['), AfterSimpleTypeExpr));
                    default: return null;
                }
            }
            //# line 280
            case GuardedStmtSub: {
                switch (lookahead) {
                    case '}':
                        return new AbstractMap.SimpleEntry<>(92, Arrays.asList(Integer.valueOf('}')));
                    case '!':
                    case PYTHONLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(93, Arrays.asList(IfSubStmt, IfBranchList, Integer.valueOf('}')));
                    default: return null;
                }
            }
            //# line 331
            case Assignment: {
                switch (lookahead) {
                    case '=':
                        return new AbstractMap.SimpleEntry<>(94, Arrays.asList(Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList());
                    default: return null;
                }
            }
            //# line 113
            case ExtendsClause: {
                switch (lookahead) {
                    case EXTENDS:
                        return new AbstractMap.SimpleEntry<>(96, Arrays.asList(EXTENDS, IDENTIFIER));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList());
                    default: return null;
                }
            }
            //# line 403
            case Oper5: {
                switch (lookahead) {
                    case '+':
                        return new AbstractMap.SimpleEntry<>(98, Arrays.asList(Integer.valueOf('+')));
                    case '-':
                        return new AbstractMap.SimpleEntry<>(99, Arrays.asList(Integer.valueOf('-')));
                    default: return null;
                }
            }
            //# line 396
            case Oper42: {
                switch (lookahead) {
                    case INITARRAY:
                        return new AbstractMap.SimpleEntry<>(100, Arrays.asList(INITARRAY));
                    default: return null;
                }
            }
            //# line 93
            case ArrayType: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(101, Arrays.asList(Integer.valueOf('['), Integer.valueOf(']'), ArrayType));
                    case IDENTIFIER:
                        return new AbstractMap.SimpleEntry<>(102, Arrays.asList());
                    default: return null;
                }
            }
            //# line 509
            case Expr3: {
                switch (lookahead) {
                    case '!':
                    case PYTHONLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(103, Arrays.asList(Expr4, ExprT3));
                    default: return null;
                }
            }
            //# line 886
            case Actuals: {
                switch (lookahead) {
                    case '!':
                    case PYTHONLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(104, Arrays.asList(ExprList));
                    case ')':
                        return new AbstractMap.SimpleEntry<>(105, Arrays.asList());
                    default: return null;
                }
            }
            //# line 256
            case IfStmtTwo: {
                switch (lookahead) {
                    case IF:
                        return new AbstractMap.SimpleEntry<>(106, Arrays.asList(IF, IfStmtTwoSub));
                    default: return null;
                }
            }
            //# line 56
            case Variable: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(107, Arrays.asList(Type, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 521
            case ExprT3: {
                switch (lookahead) {
                    case EQUAL:
                    case NOT_EQUAL:
                        return new AbstractMap.SimpleEntry<>(108, Arrays.asList(Oper3, Expr4, ExprT3));
                    case ']':
                    case FOR:
                    case ')':
                    case COLON:
                    case ',':
                    case WHILE:
                    case '=':
                    case PYTHONRIGHT:
                    case OR:
                    case AND:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList());
                    default: return null;
                }
            }
            //# line 205
            case Stmt: {
                switch (lookahead) {
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(110, Arrays.asList(VariableDef));
                    case '!':
                    case PYTHONLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case VAR:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case ';':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(111, Arrays.asList(SimpleStmt, Integer.valueOf(';')));
                    case IF:
                        return new AbstractMap.SimpleEntry<>(112, Arrays.asList(IfStmtTwo));
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(113, Arrays.asList(WhileStmt));
                    case FOR:
                        return new AbstractMap.SimpleEntry<>(114, Arrays.asList(ForStmt));
                    case RETURN:
                        return new AbstractMap.SimpleEntry<>(115, Arrays.asList(ReturnStmt, Integer.valueOf(';')));
                    case PRINT:
                        return new AbstractMap.SimpleEntry<>(116, Arrays.asList(PrintStmt, Integer.valueOf(';')));
                    case BREAK:
                        return new AbstractMap.SimpleEntry<>(117, Arrays.asList(BreakStmt, Integer.valueOf(';')));
                    case '{':
                        return new AbstractMap.SimpleEntry<>(118, Arrays.asList(StmtBlock));
                    case SCOPY:
                        return new AbstractMap.SimpleEntry<>(119, Arrays.asList(OCStmt, Integer.valueOf(';')));
                    case FOREACH:
                        return new AbstractMap.SimpleEntry<>(120, Arrays.asList(ForeachStmt));
                    default: return null;
                }
            }
            //# line 316
            case SimpleStmt: {
                switch (lookahead) {
                    case '!':
                    case PYTHONLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(121, Arrays.asList(Expr, Assignment));
                    case VAR:
                        return new AbstractMap.SimpleEntry<>(122, Arrays.asList(VAR, IDENTIFIER, Integer.valueOf('='), Expr));
                    case ';':
                    case ')':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList());
                    default: return null;
                }
            }
            //# line 62
            case SimpleType: {
                switch (lookahead) {
                    case INT:
                        return new AbstractMap.SimpleEntry<>(124, Arrays.asList(INT));
                    case VOID:
                        return new AbstractMap.SimpleEntry<>(125, Arrays.asList(VOID));
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(126, Arrays.asList(BOOL));
                    case STRING:
                        return new AbstractMap.SimpleEntry<>(127, Arrays.asList(STRING));
                    case CLASS:
                        return new AbstractMap.SimpleEntry<>(128, Arrays.asList(CLASS, IDENTIFIER));
                    default: return null;
                }
            }
            //# line 389
            case Oper41: {
                switch (lookahead) {
                    case CONCATARRAY:
                        return new AbstractMap.SimpleEntry<>(129, Arrays.asList(CONCATARRAY));
                    default: return null;
                }
            }
            //# line 917
            case WhileStmt: {
                switch (lookahead) {
                    case WHILE:
                        return new AbstractMap.SimpleEntry<>(130, Arrays.asList(WHILE, Integer.valueOf('('), Expr, Integer.valueOf(')'), Stmt));
                    default: return null;
                }
            }
            //# line 463
            case ExprT1: {
                switch (lookahead) {
                    case OR:
                        return new AbstractMap.SimpleEntry<>(131, Arrays.asList(Oper1, Expr2, ExprT1));
                    case ']':
                    case FOR:
                    case ')':
                    case COLON:
                    case ',':
                    case WHILE:
                    case '=':
                    case PYTHONRIGHT:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList());
                    default: return null;
                }
            }
            //# line 538
            case Expr4: {
                switch (lookahead) {
                    case '!':
                    case PYTHONLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(133, Arrays.asList(Expr41, ExprT4));
                    default: return null;
                }
            }
            //# line 550
            case ExprT4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                    case GREATER_EQUAL:
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(134, Arrays.asList(Oper4, Expr41, ExprT4));
                    case ']':
                    case FOR:
                    case EQUAL:
                    case ')':
                    case COLON:
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case PYTHONRIGHT:
                    case OR:
                    case AND:
                    case IF:
                    case ';':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList());
                    default: return null;
                }
            }
            //# line 948
            case ReturnExpr: {
                switch (lookahead) {
                    case '!':
                    case PYTHONLEFT:
                    case '-':
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(136, Arrays.asList(Expr));
                    case ';':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList());
                    default: return null;
                }
            }
            //# line 961
            case OCStmt: {
                switch (lookahead) {
                    case SCOPY:
                        return new AbstractMap.SimpleEntry<>(138, Arrays.asList(SCOPY, Integer.valueOf('('), IDENTIFIER, Integer.valueOf(','), Expr, Integer.valueOf(')')));
                    default: return null;
                }
            }
            //# line 669
            case ExprT6: {
                switch (lookahead) {
                    case '*':
                    case '/':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(139, Arrays.asList(Oper6, Expr7, ExprT6));
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case INITARRAY:
                    case '-':
                    case EQUAL:
                    case ')':
                    case COLON:
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case PYTHONRIGHT:
                    case OR:
                    case CONCATARRAY:
                    case '+':
                    case AND:
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList());
                    default: return null;
                }
            }
            //# line 755
            case ExprT8Sub: {
                switch (lookahead) {
                    case COLON:
                        return new AbstractMap.SimpleEntry<>(141, Arrays.asList(COLON, Expr, Integer.valueOf(']')));
                    case ']':
                        return new AbstractMap.SimpleEntry<>(142, Arrays.asList(Integer.valueOf(']'), ExprT8SubSub));
                    default: return null;
                }
            }
            //# line 723
            case ExprT8: {
                switch (lookahead) {
                    case '[':
                        return new AbstractMap.SimpleEntry<>(143, Arrays.asList(Integer.valueOf('['), Expr, ExprT8Sub, ExprT8));
                    case '.':
                        return new AbstractMap.SimpleEntry<>(144, Arrays.asList(Integer.valueOf('.'), IDENTIFIER, AfterIdentExpr, ExprT8));
                    case '/':
                    case LESS_EQUAL:
                    case ']':
                    case FOR:
                    case GREATER_EQUAL:
                    case INITARRAY:
                    case '-':
                    case EQUAL:
                    case ')':
                    case COLON:
                    case NOT_EQUAL:
                    case ',':
                    case WHILE:
                    case '=':
                    case PYTHONRIGHT:
                    case OR:
                    case CONCATARRAY:
                    case '+':
                    case AND:
                    case '*':
                    case IF:
                    case ';':
                    case '<':
                    case '>':
                    case '%':
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList());
                    default: return null;
                }
            }
            //# line 686
            case Expr7: {
                switch (lookahead) {
                    case '-':
                    case '!':
                        return new AbstractMap.SimpleEntry<>(146, Arrays.asList(Oper7, Expr8));
                    case PYTHONLEFT:
                    case READ_LINE:
                    case NULL:
                    case IDENTIFIER:
                    case NEW:
                    case THIS:
                    case INSTANCEOF:
                    case LITERAL:
                    case '(':
                    case '[':
                    case READ_INTEGER:
                        return new AbstractMap.SimpleEntry<>(147, Arrays.asList(Expr8));
                    default: return null;
                }
            }
            //# line 39
            case ClassList: {
                switch (lookahead) {
                    case CLASS:
                    case SEALED:
                        return new AbstractMap.SimpleEntry<>(148, Arrays.asList(ClassDef, ClassList));
                    case eof:
                    case eos:
                        return new AbstractMap.SimpleEntry<>(149, Arrays.asList());
                    default: return null;
                }
            }
            //# line 366
            case Oper4: {
                switch (lookahead) {
                    case LESS_EQUAL:
                        return new AbstractMap.SimpleEntry<>(150, Arrays.asList(LESS_EQUAL));
                    case GREATER_EQUAL:
                        return new AbstractMap.SimpleEntry<>(151, Arrays.asList(GREATER_EQUAL));
                    case '<':
                        return new AbstractMap.SimpleEntry<>(152, Arrays.asList(Integer.valueOf('<')));
                    case '>':
                        return new AbstractMap.SimpleEntry<>(153, Arrays.asList(Integer.valueOf('>')));
                    default: return null;
                }
            }
            //# line 136
            case Field: {
                switch (lookahead) {
                    case STATIC:
                        return new AbstractMap.SimpleEntry<>(154, Arrays.asList(STATIC, Type, IDENTIFIER, Integer.valueOf('('), Formals, Integer.valueOf(')'), StmtBlock));
                    case VOID:
                    case CLASS:
                    case INT:
                    case STRING:
                    case BOOL:
                        return new AbstractMap.SimpleEntry<>(155, Arrays.asList(Type, IDENTIFIER, FunctionField));
                    default: return null;
                }
            }
            default: return null;
        }
    }
    
    /**
      * Execute some user-defined semantic action on the specification file.
      * Note that `$$ = params[0], $1 = params[1], ...`. Nothing will be returned, so please
      * do not forget to store the parsed AST result in `params[0]`.
      *
      * @param id      the action id.
      * @param params  parameter array.
      */
        
    public void act(int id, SemValue[] params) {
        switch (id) {
            case 0: {
                //# line 584
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 1: {
                /* no action */
                return;
            }
            case 2: {
                //# line 51
                params[0].vdef = params[1].vdef;
                return;
            }
            case 3: {
                //# line 641
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 4: {
                /* no action */
                return;
            }
            case 5: {
                //# line 1004
                params[0].elist = params[1].elist;
                return;
            }
            case 6: {
                //# line 1008
                params[0].elist = null;
                return;
            }
            case 7: {
                //# line 986
                params[0].ident = params[2].ident;
                params[0].type = null;
                return;
            }
            case 8: {
                //# line 991
                params[0].ident = params[2].ident;
                params[0].type = params[1].type;
                return;
            }
            case 9: {
                //# line 355
                params[0].counter = Tree.EQ;
                params[0].loc = params[1].loc;
                return;
            }
            case 10: {
                //# line 360
                params[0].counter = Tree.NE;
                params[0].loc = params[1].loc;
                return;
            }
            case 11: {
                //# line 416
                params[0].counter = Tree.MUL;
                params[0].loc = params[1].loc;
                return;
            }
            case 12: {
                //# line 421
                params[0].counter = Tree.DIV;
                params[0].loc = params[1].loc;
                return;
            }
            case 13: {
                //# line 426
                params[0].counter = Tree.MOD;
                params[0].loc = params[1].loc;
                return;
            }
            case 14: {
                //# line 171
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[1].vdef);
                if (params[2].vlist != null) {
                    params[0].vlist.addAll(params[2].vlist);
                }
                return;
            }
            case 15: {
                //# line 161
                params[0].vlist = params[1].vlist;
                return;
            }
            case 16: {
                //# line 165
                params[0].vlist = new ArrayList<VarDef>();
                return;
            }
            case 17: {
                //# line 433
                params[0].counter = Tree.NEG;
                params[0].loc = params[1].loc;
                return;
            }
            case 18: {
                //# line 438
                params[0].counter = Tree.NOT;
                params[0].loc = params[1].loc;
                return;
            }
            case 19: {
                //# line 974
                params[0].stmt = params[2].stmt;
                params[0].expr = null;
                return;
            }
            case 20: {
                //# line 979
                params[0].expr = params[2].expr;
                params[0].stmt = params[4].stmt;
                return;
            }
            case 21: {
                //# line 311
                params[0].stmt = new Tree.Guard(params[2].loc, params[1].expr, params[3].stmt, true);
                return;
            }
            case 22: {
                //# line 697
                params[0].expr = params[1].expr;
                params[0].loc = params[1].loc;
                if (params[2].vec != null) {
                    for (SemValue v : params[2].vec) {
                        if (v.expr != null) {
                            if (v.slist.size() > 0) {
                                params[0].expr = new Tree.DynamicAccess(params[0].loc, params[0].expr, v.expr, (Expr)v.slist.get(0));
                            }
                            else if (v.stmt != null) {
                                params[0].expr = new Tree.SubArray(params[0].loc, params[0].expr, v.expr, (Expr)v.stmt);
                            }
                            else
                                params[0].expr = new Tree.Indexed(params[0].expr, v.expr, params[0].loc);
                        } else if (v.elist != null) {
                            params[0].expr = new Tree.CallExpr(params[0].expr, v.ident, v.elist, v.loc);
                            params[0].loc = v.loc;
                        } else {
                            params[0].expr = new Tree.Ident(params[0].expr, v.ident, v.loc);
                            params[0].loc = v.loc;
                        }
                    }
                }
                return;
            }
            case 23: {
                //# line 849
                params[0].expr = params[3].expr;
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 24: {
                //# line 854
                params[0].expr = params[1].expr;
                params[0].counter = 0;
                return;
            }
            case 25: {
                //# line 569
                if (params[2].svec != null && !params[2].svec.isEmpty()) {
                    params[0].expr = params[2].evec.get(params[2].svec.size() - 1);
                    for (int i = params[2].svec.size() - 2; i >= 0; i--) {
                        params[0].expr = new Tree.ArrayConcat(params[2].lvec.get(i + 1), params[2].evec.get(i), params[0].expr);
                    }
                    params[0].expr = new Tree.ArrayConcat(params[2].lvec.get(0), params[1].expr, params[0].expr);
                }
                else {
                    params[0].expr = params[1].expr;
                }
                return;
            }
            case 26: {
                //# line 481
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 27: {
                //# line 348
                params[0].counter = Tree.AND;
                params[0].loc = params[1].loc;
                return;
            }
            case 28: {
                //# line 768
                params[0].expr = params[2].expr;
                return;
            }
            case 29: {
                /* no action */
                return;
            }
            case 30: {
                //# line 268
                params[0].stmt = null;
                params[0].expr = params[2].expr;
                params[0].stmt1 = params[4].stmt;
                params[0].stmt2 = params[5].stmt;
                return;
            }
            case 31: {
                //# line 275
                params[0].stmt = new Tree.Guard(params[1].loc, params[2].slist, params[2].stmt);
                return;
            }
            case 32: {
                //# line 658
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 33: {
                //# line 293
                params[0].slist = params[2].slist;
                params[0].slist.add(params[1].stmt);
                return;
            }
            case 34: {
                //# line 298
                params[0] = new SemValue();
                params[0].slist = new ArrayList<Tree>();
                return;
            }
            case 35: {
                //# line 930
                params[0].stmt = new Tree.Break(params[1].loc);
                return;
            }
            case 36: {
                //# line 493
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 37: {
                /* no action */
                return;
            }
            case 38: {
                //# line 198
                params[0].slist.add(params[1].stmt);
                params[0].slist.addAll(params[2].slist);
                return;
            }
            case 39: {
                /* no action */
                return;
            }
            case 40: {
                //# line 873
                params[0].expr = new Tree.Literal(params[1].typeTag, params[1].literal, params[1].loc);
                return;
            }
            case 41: {
                //# line 877
                params[0].expr = new Null(params[1].loc);
                return;
            }
            case 42: {
                //# line 881
                params[0].expr = params[1].expr;
                return;
            }
            case 43: {
                //# line 181
                params[0].vlist = new ArrayList<VarDef>();
                params[0].vlist.add(params[2].vdef);
                if (params[3].vlist != null) {
                    params[0].vlist.addAll(params[3].vlist);
                }
                return;
            }
            case 44: {
                /* no action */
                return;
            }
            case 45: {
                //# line 956
                params[0].stmt = new Tree.Print(params[3].elist, params[1].loc);
                return;
            }
            case 46: {
                //# line 1014
                params[0].elist = params[2].elist;
                params[0].elist.add(params[1].expr);
                return;
            }
            case 47: {
                //# line 924
                params[0].stmt = new Tree.ForLoop(params[3].stmt, params[5].expr, params[7].stmt, params[9].stmt, params[1].loc);
                return;
            }
            case 48: {
                //# line 782
                params[0].expr = params[1].expr;
                return;
            }
            case 49: {
                //# line 786
                params[0].expr = new Tree.ReadIntExpr(params[1].loc);
                return;
            }
            case 50: {
                //# line 790
                params[0].expr = new Tree.ReadLineExpr(params[1].loc);
                return;
            }
            case 51: {
                //# line 794
                params[0].expr = new Tree.ThisExpr(params[1].loc);
                return;
            }
            case 52: {
                //# line 798
                if (params[2].ident != null) {
                    params[0].expr = new Tree.NewClass(params[2].ident, params[1].loc);
                } else {
                    params[0].expr = new Tree.NewArray(params[2].type, params[2].expr, params[1].loc);
                }
                return;
            }
            case 53: {
                //# line 806
                params[0].expr = new Tree.TypeTest(params[3].expr, params[5].ident, params[1].loc);
                return;
            }
            case 54: {
                //# line 810
                params[0].expr = params[2].expr;
                return;
            }
            case 55: {
                //# line 814
                if (params[2].elist != null) {
                    params[0].expr = new Tree.CallExpr(null, params[1].ident, params[2].elist, params[1].loc);
                } else {
                    params[0].expr = new Tree.Ident(null, params[1].ident, params[1].loc);
                }
                return;
            }
            case 56: {
                //# line 822
                params[0].expr = new Tree.PythonArr(params[5].loc, params[2].expr, params[4].ident, params[6].expr, params[7].expr);
                return;
            }
            case 57: {
                //# line 452
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 58: {
                //# line 968
                params[0].stmt = new Tree.Foreach(params[1].loc, params[3].type, params[3].ident, params[5].expr, params[6].expr, params[6].stmt);
                return;
            }
            case 59: {
                //# line 998
                params[0].expr = new Tree.ArrayConstant(params[1].loc, params[2].elist);
                return;
            }
            case 60: {
                //# line 828
                params[0].expr = params[2].expr;
                return;
            }
            case 61: {
                /* no action */
                return;
            }
            case 62: {
                //# line 341
                params[0].counter = Tree.OR;
                params[0].loc = params[1].loc;
                return;
            }
            case 63: {
                //# line 936
                params[0].stmt = params[2].stmt;
                return;
            }
            case 64: {
                /* no action */
                return;
            }
            case 65: {
                //# line 612
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 66: {
                /* no action */
                return;
            }
            case 67: {
                //# line 121
                params[0].flist = new ArrayList<Tree>();
                if (params[1].vdef != null) {
                    params[0].flist.add(params[1].vdef);
                } else {
                    params[0].flist.add(params[1].fdef);
                }
                params[0].flist.addAll(params[2].flist);
                return;
            }
            case 68: {
                //# line 131
                params[0].flist = new ArrayList<Tree>();
                return;
            }
            case 69: {
                //# line 305
                params[0].stmt = new Tree.Guard(params[1].loc, params[2].stmt, true);
                return;
            }
            case 70: {
                //# line 905
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[2].expr);
                params[0].elist.addAll(params[3].elist);
                return;
            }
            case 71: {
                //# line 911
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 72: {
                //# line 861
                params[0].expr = params[1].expr;
                return;
            }
            case 73: {
                //# line 865
                params[0].expr = new Tree.TypeCast(params[2].ident, params[4].expr, params[4].loc);
                return;
            }
            case 74: {
                //# line 104
                params[0].cdef = new Tree.ClassDef(params[2].ident, params[3].ident, params[5].flist, params[1].loc);
                return;
            }
            case 75: {
                //# line 108
                params[0].cdef = new Tree.ClassDef(params[3].ident, params[4].ident, params[6].flist, params[2].loc, true);
                return;
            }
            case 76: {
                //# line 943
                params[0].stmt = new Tree.Return(params[2].expr, params[1].loc);
                return;
            }
            case 77: {
                //# line 897
                params[0].elist = new ArrayList<Tree.Expr>();
                params[0].elist.add(params[1].expr);
                params[0].elist.addAll(params[2].elist);
                return;
            }
            case 78: {
                //# line 192
                params[0].stmt = new Tree.Block(params[2].slist, params[1].loc);
                return;
            }
            case 79: {
                //# line 1021
                params[0].elist = params[3].elist;
                params[0].elist.add(params[2].expr);
                return;
            }
            case 80: {
                //# line 1026
                params[0] = new SemValue();
                params[0].elist = new ArrayList<Expr>();
                return;
            }
            case 81: {
                //# line 153
                params[0].vlist = params[2].vlist;
                params[0].stmt = params[4].stmt;
                return;
            }
            case 82: {
                /* no action */
                return;
            }
            case 83: {
                //# line 775
                params[0].elist = params[2].elist;
                return;
            }
            case 84: {
                /* no action */
                return;
            }
            case 85: {
                //# line 29
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                params[0].prog = new Tree.TopLevel(params[0].clist, params[0].loc);
                return;
            }
            case 86: {
                //# line 446
                params[0].expr = params[1].expr;
                return;
            }
            case 87: {
                //# line 85
                params[0].type = params[1].type;
                for (int i = 0; i < params[2].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                return;
            }
            case 88: {
                //# line 629
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 89: {
                //# line 601
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.ArrayRepeat(params[2].lvec.get(i), params[0].expr, params[2].evec.get(i));
                    }
                }
                return;
            }
            case 90: {
                //# line 835
                params[0].ident = params[1].ident;
                return;
            }
            case 91: {
                //# line 839
                params[0].type = params[1].type;
                for (int i = 0; i < params[3].counter; ++i) {
                    params[0].type = new Tree.TypeArray(params[0].type, params[1].loc);
                }
                params[0].expr = params[3].expr;
                return;
            }
            case 92: {
                //# line 281
                params[0].slist = null;
                params[0].stmt = null;
                return;
            }
            case 93: {
                //# line 286
                params[0].slist = params[2].slist;
                params[0].stmt = params[1].stmt;
                return;
            }
            case 94: {
                //# line 332
                params[0].loc = params[1].loc;
                params[0].expr = params[2].expr;
                return;
            }
            case 95: {
                /* no action */
                return;
            }
            case 96: {
                //# line 114
                params[0].ident = params[2].ident;
                return;
            }
            case 97: {
                /* no action */
                return;
            }
            case 98: {
                //# line 404
                params[0].counter = Tree.PLUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 99: {
                //# line 409
                params[0].counter = Tree.MINUS;
                params[0].loc = params[1].loc;
                return;
            }
            case 100: {
                //# line 397
                params[0].counter = Tree.ARRAYREPEAT;
                params[0].loc = params[1].loc;
                return;
            }
            case 101: {
                //# line 94
                params[0].counter = 1 + params[3].counter;
                return;
            }
            case 102: {
                //# line 98
                params[0].counter = 0;
                return;
            }
            case 103: {
                //# line 510
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 104: {
                //# line 887
                params[0].elist = params[1].elist;
                return;
            }
            case 105: {
                //# line 891
                params[0].elist = new ArrayList<Tree.Expr>();
                return;
            }
            case 106: {
                //# line 257
                if(params[2].stmt == null) {
                    params[0].stmt = new Tree.If(params[2].expr, params[2].stmt1, params[2].stmt2, params[1].loc);
                }
                else {
                    params[0].stmt = params[2].stmt;
                }
                return;
            }
            case 107: {
                //# line 57
                params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                return;
            }
            case 108: {
                //# line 522
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 109: {
                /* no action */
                return;
            }
            case 110: {
                //# line 206
                params[0].stmt = params[1].vdef;
                return;
            }
            case 111: {
                //# line 210
                if (params[1].stmt == null) {
                    params[0].stmt = new Tree.Skip(params[2].loc);
                } else {
                    params[0].stmt = params[1].stmt;
                }
                return;
            }
            case 112: {
                //# line 218
                params[0].stmt = params[1].stmt;
                return;
            }
            case 113: {
                //# line 222
                params[0].stmt = params[1].stmt;
                return;
            }
            case 114: {
                //# line 226
                params[0].stmt = params[1].stmt;
                return;
            }
            case 115: {
                //# line 230
                params[0].stmt = params[1].stmt;
                return;
            }
            case 116: {
                //# line 234
                params[0].stmt = params[1].stmt;
                return;
            }
            case 117: {
                //# line 238
                params[0].stmt = params[1].stmt;
                return;
            }
            case 118: {
                //# line 242
                params[0].stmt = params[1].stmt;
                return;
            }
            case 119: {
                //# line 246
                params[0].stmt = params[1].stmt;
                return;
            }
            case 120: {
                //# line 250
                params[0].stmt = params[1].stmt;
                return;
            }
            case 121: {
                //# line 317
                if (params[2].expr == null) {
                    params[0].stmt = new Tree.Calculate(params[1].expr, params[1].loc);
                } else {
                    params[0].stmt = new Tree.Assign(params[1].expr, params[2].expr, params[2].loc);
                }
                return;
            }
            case 122: {
                //# line 325
                params[0].stmt = new Tree.Assign(params[2].ident, params[4].expr, params[3].loc);
                return;
            }
            case 123: {
                /* no action */
                return;
            }
            case 124: {
                //# line 63
                params[0].type = new Tree.TypeIdent(Tree.INT, params[1].loc);
                return;
            }
            case 125: {
                //# line 67
                params[0].type = new Tree.TypeIdent(Tree.VOID, params[1].loc);
                return;
            }
            case 126: {
                //# line 71
                params[0].type = new Tree.TypeIdent(Tree.BOOL, params[1].loc);
                return;
            }
            case 127: {
                //# line 75
                params[0].type = new Tree.TypeIdent(Tree.STRING, params[1].loc);
                return;
            }
            case 128: {
                //# line 79
                params[0].type = new Tree.TypeClass(params[2].ident, params[1].loc);
                return;
            }
            case 129: {
                //# line 390
                params[0].counter = Tree.ARRAYCONCAT;
                params[0].loc = params[1].loc;
                return;
            }
            case 130: {
                //# line 918
                params[0].stmt = new Tree.WhileLoop(params[3].expr, params[5].stmt, params[1].loc);
                return;
            }
            case 131: {
                //# line 464
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 132: {
                /* no action */
                return;
            }
            case 133: {
                //# line 539
                params[0].expr = params[1].expr;
                if (params[2].svec != null) {
                    for (int i = 0; i < params[2].svec.size(); ++i) {
                        params[0].expr = new Tree.Binary(params[2].svec.get(i), params[0].expr,
                            params[2].evec.get(i), params[2].lvec.get(i));
                    }
                }
                return;
            }
            case 134: {
                //# line 551
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 135: {
                /* no action */
                return;
            }
            case 136: {
                //# line 949
                params[0].expr = params[1].expr;
                return;
            }
            case 137: {
                /* no action */
                return;
            }
            case 138: {
                //# line 962
                params[0].stmt = new Tree.Scopy(params[3].ident, params[5].expr, params[1].loc);
                return;
            }
            case 139: {
                //# line 670
                params[0].svec = new Vector<Integer>();
                params[0].lvec = new Vector<Location>();
                params[0].evec = new Vector<Expr>();
                params[0].svec.add(params[1].counter);
                params[0].lvec.add(params[1].loc);
                params[0].evec.add(params[2].expr);
                if (params[3].svec != null) {
                    params[0].svec.addAll(params[3].svec);
                    params[0].lvec.addAll(params[3].lvec);
                    params[0].evec.addAll(params[3].evec);
                }
                return;
            }
            case 140: {
                /* no action */
                return;
            }
            case 141: {
                //# line 756
                params[0].expr = params[2].expr;
                return;
            }
            case 142: {
                //# line 760
                if (params[2].expr != null) {
                    params[0].stmt = params[2].expr;
                }
                return;
            }
            case 143: {
                //# line 724
                SemValue sem = new SemValue();
                sem.expr = params[2].expr;
                if (params[3].expr != null) {
                    sem.stmt = params[3].expr;
                }
                if (params[3].stmt != null) {
                    sem.slist = new ArrayList<Tree>();
                    sem.slist.add(params[3].stmt);
                }
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[4].vec != null) {
                    params[0].vec.addAll(params[4].vec);
                }
                return;
            }
            case 144: {
                //# line 741
                SemValue sem = new SemValue();
                sem.ident = params[2].ident;
                sem.loc = params[2].loc;
                sem.elist = params[3].elist;
                params[0].vec = new Vector<SemValue>();
                params[0].vec.add(sem);
                if (params[4].vec != null) {
                    params[0].vec.addAll(params[4].vec);
                }
                return;
            }
            case 145: {
                /* no action */
                return;
            }
            case 146: {
                //# line 687
                params[0].expr = new Tree.Unary(params[1].counter, params[2].expr, params[1].loc);
                return;
            }
            case 147: {
                //# line 691
                params[0].expr = params[1].expr;
                return;
            }
            case 148: {
                //# line 40
                params[0].clist = new ArrayList<ClassDef>();
                params[0].clist.add(params[1].cdef);
                if (params[2].clist != null) {
                    params[0].clist.addAll(params[2].clist);
                }
                return;
            }
            case 149: {
                /* no action */
                return;
            }
            case 150: {
                //# line 367
                params[0].counter = Tree.LE;
                params[0].loc = params[1].loc;
                return;
            }
            case 151: {
                //# line 372
                params[0].counter = Tree.GE;
                params[0].loc = params[1].loc;
                return;
            }
            case 152: {
                //# line 377
                params[0].counter = Tree.LT;
                params[0].loc = params[1].loc;
                return;
            }
            case 153: {
                //# line 382
                params[0].counter = Tree.GT;
                params[0].loc = params[1].loc;
                return;
            }
            case 154: {
                //# line 137
                params[0].fdef = new Tree.MethodDef(true, params[3].ident, params[2].type, params[5].vlist,
                    (Block) params[7].stmt, params[3].loc);
                return;
            }
            case 155: {
                //# line 142
                if (params[3].vlist != null) {
                    params[0].fdef = new Tree.MethodDef(false, params[2].ident, params[1].type, params[3].vlist,
                        (Block) params[3].stmt, params[2].loc);
                } else {
                    params[0].vdef = new Tree.VarDef(params[2].ident, params[1].type, params[2].loc);
                }
                return;
            }
        }
    }
}
/* end of file */
