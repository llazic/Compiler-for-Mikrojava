// generated with ast extension for cup
// version 0.8
// 7/0/2020 1:9:13


package rs.ac.bg.etf.pp1.ast;

public class DesigList extends DesignatorList {

    private DesignatorList DesignatorList;
    private DesignatorDotIndex DesignatorDotIndex;

    public DesigList (DesignatorList DesignatorList, DesignatorDotIndex DesignatorDotIndex) {
        this.DesignatorList=DesignatorList;
        if(DesignatorList!=null) DesignatorList.setParent(this);
        this.DesignatorDotIndex=DesignatorDotIndex;
        if(DesignatorDotIndex!=null) DesignatorDotIndex.setParent(this);
    }

    public DesignatorList getDesignatorList() {
        return DesignatorList;
    }

    public void setDesignatorList(DesignatorList DesignatorList) {
        this.DesignatorList=DesignatorList;
    }

    public DesignatorDotIndex getDesignatorDotIndex() {
        return DesignatorDotIndex;
    }

    public void setDesignatorDotIndex(DesignatorDotIndex DesignatorDotIndex) {
        this.DesignatorDotIndex=DesignatorDotIndex;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public void childrenAccept(Visitor visitor) {
        if(DesignatorList!=null) DesignatorList.accept(visitor);
        if(DesignatorDotIndex!=null) DesignatorDotIndex.accept(visitor);
    }

    public void traverseTopDown(Visitor visitor) {
        accept(visitor);
        if(DesignatorList!=null) DesignatorList.traverseTopDown(visitor);
        if(DesignatorDotIndex!=null) DesignatorDotIndex.traverseTopDown(visitor);
    }

    public void traverseBottomUp(Visitor visitor) {
        if(DesignatorList!=null) DesignatorList.traverseBottomUp(visitor);
        if(DesignatorDotIndex!=null) DesignatorDotIndex.traverseBottomUp(visitor);
        accept(visitor);
    }

    public String toString(String tab) {
        StringBuffer buffer=new StringBuffer();
        buffer.append(tab);
        buffer.append("DesigList(\n");

        if(DesignatorList!=null)
            buffer.append(DesignatorList.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        if(DesignatorDotIndex!=null)
            buffer.append(DesignatorDotIndex.toString("  "+tab));
        else
            buffer.append(tab+"  null");
        buffer.append("\n");

        buffer.append(tab);
        buffer.append(") [DesigList]");
        return buffer.toString();
    }
}
