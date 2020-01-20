// generated with ast extension for cup
// version 0.8
// 20/0/2020 15:45:3


package rs.ac.bg.etf.pp1.ast;

public class Variab extends Var {

    private String I1;
    private OptionalBrackets OptionalBrackets;

    public Variab (String I1, OptionalBrackets OptionalBrackets) {
        this.I1=I1;
        this.OptionalBrackets=OptionalBrackets;
        if(OptionalBrackets!=null) OptionalBrackets.setParent(this);
    }

    public String getI1() {
        return I1;
    }

    public void setI1(String I1) {
        this.I1=I1;
    }

    public OptionalBrackets getOptionalBrackets() {
        return OptionalBrackets;
    }

    public void setOptionalBrackets(OptionalBrackets OptionalBrackets) {
        this.OptionalBrackets=OptionalBrackets;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(OptionalBrackets!=null) OptionalBrackets.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(OptionalBrackets!=null) OptionalBrackets.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(OptionalBrackets!=null) OptionalBrackets.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("Variab(\n");

        buffer.append(" "+tab+I1);
        buffer.append("\n");

        if(OptionalBrackets!=null)
            buffer.append(OptionalBrackets.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [Variab]");
        return buffer.toString();
    }
}
