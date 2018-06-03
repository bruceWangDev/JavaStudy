class ArrayToolDemo {

	public static void main(String[] args){

		int[] arr = {3,1,87,32,8};

		// ArrayTool tool = new ArrayTool();	// 无意义阿

		int max = ArrayTool.getMax(arr);
		System.out.println("max="+max);

		int min = ArrayTool.getMin(arr);
		System.out.println("min="+min);

		// tool.printArray(arr);
		// tool.selectSort(arr);
		// tool.printArray(arr);

		ArrayTool.printArray(arr);
		ArrayTool.bubbleSort(arr);
		ArrayTool.printArray(arr);

	}
}