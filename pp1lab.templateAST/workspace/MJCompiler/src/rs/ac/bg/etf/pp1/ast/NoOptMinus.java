// generated with ast extension for cup
// version 0.8
// 7/0/2020 1:9:13


package rs.ac.bg.etf.pp1.ast;

public class NoOptMinus extends OptionalMinus {

    public NoOptMinus () {
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
        buffer.append("NoOptMinus(\n");

        buffer.append(tab);
        buffer.append(") [NoOptMinus]");
        return buffer.toString();
    }
}
