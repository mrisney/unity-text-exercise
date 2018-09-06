package com.risney.unity.text;

public class Word {

	private String text = "";
	private int length = 0;
	private int count = 0;

	public Word(String text) {
		super();
		this.text = text;
		this.length = text.length();
		this.count = 1;
	}

	public Word(String text, int length, int count) {
		super();
		this.text = text;
		this.length = length;
		this.count = count;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (count != other.count)
			return false;
		if (length != other.length)
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + length;
		result = prime * result + ((text == null) ? 0 : text.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Word [text=" + text + ", length=" + length + ", count=" + count + "]";
	}
}