// generated with ast extension for cup
// version 0.8
// 20/0/2020 15:45:3


package rs.ac.bg.etf.pp1.ast;

public class NoOptionalBracketsExpression extends OptionalBracketsExpr {

    public NoOptionalBracketsExpression () {
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("NoOptionalBracketsExpression(\n");

        buffer.append(tab);
        buffer.append(") [NoOptionalBracketsExpression]");
        return buffer.toString();
    }
}
