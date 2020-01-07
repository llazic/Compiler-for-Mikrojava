// generated with ast extension for cup
// version 0.8
// 7/0/2020 1:9:12


package rs.ac.bg.etf.pp1.ast;

public class AbstractClassDeclarat extends AbstractClassDecl {

    private String I1;
    private OptionalExtendsType OptionalExtendsType;
    private VarDeclList VarDeclList;
    private OptionalBracesMethodAbstractMethodDeclList OptionalBracesMethodAbstractMethodDeclList;

    public AbstractClassDeclarat (String I1, OptionalExtendsType OptionalExtendsType, VarDeclList VarDeclList, OptionalBracesMethodAbstractMethodDeclList OptionalBracesMethodAbstractMethodDeclList) {
        this.I1=I1;
        this.OptionalExtendsType=OptionalExtendsType;
        if(OptionalExtendsType!=null) OptionalExtendsType.setParent(this);
        this.VarDeclList=VarDeclList;
        if(VarDeclList!=null) VarDeclList.setParent(this);
        this.OptionalBracesMethodAbstractMethodDeclList=OptionalBracesMethodAbstractMethodDeclList;
        if(OptionalBracesMethodAbstractMethodDeclList!=null) OptionalBracesMethodAbstractMethodDeclList.setParent(this);
    }

    public String getI1() {
        return I1;
    }

    public void setI1(String I1) {
        this.I1=I1;
    }

    public OptionalExtendsType getOptionalExtendsType() {
        return OptionalExtendsType;
    }

    public void setOptionalExtendsType(OptionalExtendsType OptionalExtendsType) {
        this.OptionalExtendsType=OptionalExtendsType;
    }

    public VarDeclList getVarDeclList() {
        return VarDeclList;
    }

    public void setVarDeclList(VarDeclList VarDeclList) {
        this.VarDeclList=VarDeclList;
    }

    public OptionalBracesMethodAbstractMethodDeclList getOptionalBracesMethodAbstractMethodDeclList() {
        return OptionalBracesMethodAbstractMethodDeclList;
    }

    public void setOptionalBracesMethodAbstractMethodDeclList(OptionalBracesMethodAbstractMethodDeclList OptionalBracesMethodAbstractMethodDeclList) {
        this.OptionalBracesMethodAbstractMethodDeclList=OptionalBracesMethodAbstractMethodDeclList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(OptionalExtendsType!=null) OptionalExtendsType.accept(visitor);
        if(VarDeclList!=null) VarDeclList.accept(visitor);
        if(OptionalBracesMethodAbstractMethodDeclList!=null) OptionalBracesMethodAbstractMethodDeclList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(OptionalExtendsType!=null) OptionalExtendsType.traverseTopDown(visitor);
        if(VarDeclList!=null) VarDeclList.traverseTopDown(visitor);
        if(OptionalBracesMethodAbstractMethodDeclList!=null) OptionalBracesMethodAbstractMethodDeclList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(OptionalExtendsType!=null) OptionalExtendsType.traverseBottomUp(visitor);
        if(VarDeclList!=null) VarDeclList.traverseBottomUp(visitor);
        if(OptionalBracesMethodAbstractMethodDeclList!=null) OptionalBracesMethodAbstractMethodDeclList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("AbstractClassDeclarat(\n");

        buffer.append(" "+tab+I1);
        buffer.append("\n");

        if(OptionalExtendsType!=null)
            buffer.append(OptionalExtendsType.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(VarDeclList!=null)
            buffer.append(VarDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(OptionalBracesMethodAbstractMethodDeclList!=null)
            buffer.append(OptionalBracesMethodAbstractMethodDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [AbstractClassDeclarat]");
        return buffer.toString();
    }
}