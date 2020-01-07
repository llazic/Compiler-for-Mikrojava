// generated with ast extension for cup
// version 0.8
// 7/0/2020 1:9:12


package rs.ac.bg.etf.pp1.ast;

public class OptionalBracesMethodAbstractMethodDeclarationList extends OptionalBracesMethodAbstractMethodDeclList {

    private MethodAbstractMethodDeclList MethodAbstractMethodDeclList;

    public OptionalBracesMethodAbstractMethodDeclarationList (MethodAbstractMethodDeclList MethodAbstractMethodDeclList) {
        this.MethodAbstractMethodDeclList=MethodAbstractMethodDeclList;
        if(MethodAbstractMethodDeclList!=null) MethodAbstractMethodDeclList.setParent(this);
    }

    public MethodAbstractMethodDeclList getMethodAbstractMethodDeclList() {
        return MethodAbstractMethodDeclList;
    }

    public void setMethodAbstractMethodDeclList(MethodAbstractMethodDeclList MethodAbstractMethodDeclList) {
        this.MethodAbstractMethodDeclList=MethodAbstractMethodDeclList;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MethodAbstractMethodDeclList!=null) MethodAbstractMethodDeclList.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MethodAbstractMethodDeclList!=null) MethodAbstractMethodDeclList.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MethodAbstractMethodDeclList!=null) MethodAbstractMethodDeclList.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("OptionalBracesMethodAbstractMethodDeclarationList(\n");

        if(MethodAbstractMethodDeclList!=null)
            buffer.append(MethodAbstractMethodDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [OptionalBracesMethodAbstractMethodDeclarationList]");
        return buffer.toString();
    }
}
