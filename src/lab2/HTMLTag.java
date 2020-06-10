package lab2;

import java.util.List;

public abstract class HTMLTag {
	public abstract String getTagName();
	public abstract void setStartTag(String tag);
	public abstract void setEndTag(String tag);
	public void setTagBody(String tagBody) {
	}
	public void addChildTag(HTMLTag htmlTag) {
	}
	public void removeChildTag(HTMLTag htmlTag) {
	}
	public List<HTMLTag> getChildren() {
		return null;
	}
	public abstract void generateHtml();

}
