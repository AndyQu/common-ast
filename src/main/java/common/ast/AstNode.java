package common.ast;

import java.util.List;

public abstract class AstNode {
	private List<AstNode> children;
	private transient AstNode parent;
	private Interval sourceInterval;
	private String name;

	public List<AstNode> getChildren() {
		return children;
	}

	public void setChildren(List<AstNode> children) {
		this.children = children;
	}
	
	public int getChildCount(){
		if(children==null){
			return 0;
		}else {
			return children.size();
		}
	}

	public AstNode getParent() {
		return parent;
	}

	public void setParent(AstNode parent) {
		this.parent = parent;
	}

	public Interval getSourceInterval() {
		return sourceInterval;
	}

	public void setSourceInterval(Interval sourceInterval) {
		this.sourceInterval = sourceInterval;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
