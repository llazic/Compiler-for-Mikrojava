// generated with ast extension for cup
// version 0.8
// 7/0/2020 1:9:13


package rs.ac.bg.etf.pp1.ast;

public class FactorDesignator extends Factor {

    private Designator Designator;
    private OptionalParenthesesActPars OptionalParenthesesActPars;

    public FactorDesignator (Designator Designator, OptionalParenthesesActPars OptionalParenthesesActPars) {
        this.Designator=Designator;
        if(Designator!=null) Designator.setParent(this);
        this.OptionalParenthesesActPars=OptionalParenthesesActPars;
        if(OptionalParenthesesActPars!=null) OptionalParenthesesActPars.setParent(this);
    }

    public Designator getDesignator() {
        return Designator;
    }

    public void setDesignator(Designator Designator) {
        this.Designator=Designator;
    }

    public OptionalParenthesesActPars getOptionalParenthesesActPars() {
        return OptionalParenthesesActPars;
    }

    public void setOptionalParenthesesActPars(OptionalParenthesesActPars OptionalParenthesesActPars) {
        this.OptionalParenthesesActPars=OptionalParenthesesActPars;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(Designator!=null) Designator.accept(visitor);
        if(OptionalParenthesesActPars!=null) OptionalParenthesesActPars.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(Designator!=null) Designator.traverseTopDown(visitor);
        if(OptionalParenthesesActPars!=null) OptionalParenthesesActPars.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(Designator!=null) Designator.traverseBottomUp(visitor);
        if(OptionalParenthesesActPars!=null) OptionalParenthesesActPars.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("FactorDesignator(\n");

        if(Designator!=null)
            buffer.append(Designator.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(OptionalParenthesesActPars!=null)
            buffer.append(OptionalParenthesesActPars.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [FactorDesignator]");
        return buffer.toString();
    }
}
