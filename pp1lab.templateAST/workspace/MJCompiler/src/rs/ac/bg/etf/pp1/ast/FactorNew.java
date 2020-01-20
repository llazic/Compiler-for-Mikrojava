// generated with ast extension for cup
// version 0.8
// 20/0/2020 15:45:3


package rs.ac.bg.etf.pp1.ast;

public class FactorNew extends Factor {

    private Type Type;
    private OptionalBracketsExpr OptionalBracketsExpr;

    public FactorNew (Type Type, OptionalBracketsExpr OptionalBracketsExpr) {
        this.Type=Type;
        if(Type!=null) Type.setParent(this);
        this.OptionalBracketsExpr=OptionalBracketsExpr;
        if(OptionalBracketsExpr!=null) OptionalBracketsExpr.setParent(this);
    }

    public Type getType() {
        return Type;
    }

    public void setType(Type Type) {
        this.Type=Type;
    }

    public OptionalBracketsExpr getOptionalBracketsExpr() {
        return OptionalBracketsExpr;
    }

    public void setOptionalBracketsExpr(OptionalBracketsExpr OptionalBracketsExpr) {
        this.OptionalBracketsExpr=OptionalBracketsExpr;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Type!=null) Type.accept(visitor);
        if(OptionalBracketsExpr!=null) OptionalBracketsExpr.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Type!=null) Type.traverseTopDown(visitor);
        if(OptionalBracketsExpr!=null) OptionalBracketsExpr.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Type!=null) Type.traverseBottomUp(visitor);
        if(OptionalBracketsExpr!=null) OptionalBracketsExpr.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FactorNew(\n");

        if(Type!=null)
            buffer.append(Type.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(OptionalBracketsExpr!=null)
            buffer.append(OptionalBracketsExpr.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FactorNew]");
        return buffer.toString();
    }
}
