package stack;

import java.util.Stack;

class MemoryBlock {
	String processName;
	int memorySize; // in kilobytes
	int memoryAddress; // just a simulated memory address

	public MemoryBlock(String processName, int memorySize, int memoryAddress) {
		this.processName = processName;
		this.memorySize = memorySize;
		this.memoryAddress = memoryAddress;
	}

	@Override
	public String toString() {
		return "Process: " + processName + ", Size: " + memorySize + "KB, Address: " + memoryAddress;
	}	
}

