// generated with ast extension for cup
// version 0.8
// 20/0/2020 15:45:3


package rs.ac.bg.etf.pp1.ast;

public class ClassDeclarat extends ClassDecl {

    private String I1;
    private ClassExtendsError ClassExtendsError;
    private OptionalExtendsType OptionalExtendsType;
    private VarDeclList VarDeclList;
    private OptionalBracesMethodDeclList OptionalBracesMethodDeclList;

    public ClassDeclarat (String I1, ClassExtendsError ClassExtendsError, OptionalExtendsType OptionalExtendsType, VarDeclList VarDeclList, OptionalBracesMethodDeclList OptionalBracesMethodDeclList) {
        this.I1=I1;
        this.ClassExtendsError=ClassExtendsError;
        if(ClassExtendsError!=null) ClassExtendsError.setParent(this);
        this.OptionalExtendsType=OptionalExtendsType;
        if(OptionalExtendsType!=null) OptionalExtendsType.setParent(this);
        this.VarDeclList=VarDeclList;
        if(VarDeclList!=null) VarDeclList.setParent(this);
        this.OptionalBracesMethodDeclList=OptionalBracesMethodDeclList;
        if(OptionalBracesMethodDeclList!=null) OptionalBracesMethodDeclList.setParent(this);
    }

    public String getI1() {
        return I1;
    }

    public void setI1(String I1) {
        this.I1=I1;
    }

    public ClassExtendsError getClassExtendsError() {
        return ClassExtendsError;
    }

    public void setClassExtendsError(ClassExtendsError ClassExtendsError) {
        this.ClassExtendsError=ClassExtendsError;
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

    public OptionalBracesMethodDeclList getOptionalBracesMethodDeclList() {
        return OptionalBracesMethodDeclList;
    }

    public void setOptionalBracesMethodDeclList(OptionalBracesMethodDeclList OptionalBracesMethodDeclList) {
        this.OptionalBracesMethodDeclList=OptionalBracesMethodDeclList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(ClassExtendsError!=null) ClassExtendsError.accept(visitor);
        if(OptionalExtendsType!=null) OptionalExtendsType.accept(visitor);
        if(VarDeclList!=null) VarDeclList.accept(visitor);
        if(OptionalBracesMethodDeclList!=null) OptionalBracesMethodDeclList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(ClassExtendsError!=null) ClassExtendsError.traverseTopDown(visitor);
        if(OptionalExtendsType!=null) OptionalExtendsType.traverseTopDown(visitor);
        if(VarDeclList!=null) VarDeclList.traverseTopDown(visitor);
        if(OptionalBracesMethodDeclList!=null) OptionalBracesMethodDeclList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(ClassExtendsError!=null) ClassExtendsError.traverseBottomUp(visitor);
        if(OptionalExtendsType!=null) OptionalExtendsType.traverseBottomUp(visitor);
        if(VarDeclList!=null) VarDeclList.traverseBottomUp(visitor);
        if(OptionalBracesMethodDeclList!=null) OptionalBracesMethodDeclList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("ClassDeclarat(\n");

        buffer.append(" "+tab+I1);
        buffer.append("\n");

        if(ClassExtendsError!=null)
            buffer.append(ClassExtendsError.toString("  "+tab));
        else
            buffer.append(tab+"  null");
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

        if(OptionalBracesMethodDeclList!=null)
            buffer.append(OptionalBracesMethodDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [ClassDeclarat]");
        return buffer.toString();
    }
}
