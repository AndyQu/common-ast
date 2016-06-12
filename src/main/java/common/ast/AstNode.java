package common.ast;

import java.util.List;

public abstract class AstNode {
	private List<AstNode> children;
	private AstNode parent;
	private Interval sourceInterval;

	public List<AstNode> getChildren() {
		return children;
	}

	public void setChildren(List<AstNode> children) {
		this.children = children;
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
	
}
