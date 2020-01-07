// generated with ast extension for cup
// version 0.8
// 7/0/2020 1:9:12


package rs.ac.bg.etf.pp1.ast;

public class MethodAbstractMethodDeclarationList extends MethodAbstractMethodDeclList {

    private MethodAbstractMethodDeclList MethodAbstractMethodDeclList;
    private MethodAbstractMethodDecl MethodAbstractMethodDecl;

    public MethodAbstractMethodDeclarationList (MethodAbstractMethodDeclList MethodAbstractMethodDeclList, MethodAbstractMethodDecl MethodAbstractMethodDecl) {
        this.MethodAbstractMethodDeclList=MethodAbstractMethodDeclList;
        if(MethodAbstractMethodDeclList!=null) MethodAbstractMethodDeclList.setParent(this);
        this.MethodAbstractMethodDecl=MethodAbstractMethodDecl;
        if(MethodAbstractMethodDecl!=null) MethodAbstractMethodDecl.setParent(this);
    }

    public MethodAbstractMethodDeclList getMethodAbstractMethodDeclList() {
        return MethodAbstractMethodDeclList;
    }

    public void setMethodAbstractMethodDeclList(MethodAbstractMethodDeclList MethodAbstractMethodDeclList) {
        this.MethodAbstractMethodDeclList=MethodAbstractMethodDeclList;
    }

    public MethodAbstractMethodDecl getMethodAbstractMethodDecl() {
        return MethodAbstractMethodDecl;
    }

    public void setMethodAbstractMethodDecl(MethodAbstractMethodDecl MethodAbstractMethodDecl) {
        this.MethodAbstractMethodDecl=MethodAbstractMethodDecl;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(MethodAbstractMethodDeclList!=null) MethodAbstractMethodDeclList.accept(visitor);
        if(MethodAbstractMethodDecl!=null) MethodAbstractMethodDecl.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(MethodAbstractMethodDeclList!=null) MethodAbstractMethodDeclList.traverseTopDown(visitor);
        if(MethodAbstractMethodDecl!=null) MethodAbstractMethodDecl.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(MethodAbstractMethodDeclList!=null) MethodAbstractMethodDeclList.traverseBottomUp(visitor);
        if(MethodAbstractMethodDecl!=null) MethodAbstractMethodDecl.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("MethodAbstractMethodDeclarationList(\n");

        if(MethodAbstractMethodDeclList!=null)
            buffer.append(MethodAbstractMethodDeclList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(MethodAbstractMethodDecl!=null)
            buffer.append(MethodAbstractMethodDecl.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [MethodAbstractMethodDeclarationList]");
        return buffer.toString();
    }
}
