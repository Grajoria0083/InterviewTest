package com.masai;

import java.util.List;

public class AllData {
	
	private int count;
	
	private List<Entry> entries;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<Entry> getEntries() {
		return entries;
	}

	public void setEntries(List<Entry> entries) {
		this.entries = entries;
	}

	public AllData() {

	}
	
	public AllData(int count, List<Entry> entries) {
		super();
		this.count = count;
		this.entries = entries;
	}

	@Override
	public String toString() {
		return "AllData [count=" + count + ", entries=" + entries + "]";
	}
	
	
	
}
