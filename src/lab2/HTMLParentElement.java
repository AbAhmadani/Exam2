package lab2;

import java.util.List;
import java.util.ArrayList;

public class HTMLParentElement extends HTMLTag {
	private String tagName;
	private String startTag;
	private String endTag;
	private List<HTMLTag>childrenTag;
	
	
	public HTMLParentElement(String tagName) {
		this.tagName = tagName;
		this.startTag = "";
		this.endTag = "";
		this.childrenTag = new ArrayList<>();
	}
	
	@Override
	public String getTagName() {
		return tagName;
	}
	@Override
	public void setStartTag(String tag) {
		this.startTag = tag;
	}
	@Override
	public void setEndTag(String tag) {
		this.endTag = tag;
	}
	@Override
	public void addChildTag(HTMLTag htmlTag) {
		childrenTag.add(htmlTag);
		
	}
	@Override
	public void removeChildTag(HTMLTag htmlTag) {
		childrenTag.remove(htmlTag);
	}
	@Override
	public List<HTMLTag> getChildren() {
		return childrenTag;
	}
	@Override
	public void generateHtml() {
		System.out.println(startTag);
		for(HTMLTag tag : childrenTag){
			tag.generateHtml();
		}
		System.out.println(endTag);
		
	}

	
}
