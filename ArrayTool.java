/*
	静态的应用

	每一个应用程序中都有共性的功能，可以讲这些功能进行抽取，独立封装。以便复用。

	虽然可以通过建立ArrayTool的对象使用这些工具方法，对数组进行操作。
	发现了问题：
	1.对象是用于封装数据的，可是ArrayTool对象并未封装特有数据。
	2.操作数组的每一个方法都没有用到ArrayTool对象中的特有数据。

	这时就考虑，让程序更严谨，是不需要对象的。
	可以将ArrayTool中的方法都定义成static的。可以通过类名直接调用。

	将方法都静态后，可以方便于使用，但是该类可以被其他程序建立对象的。
	为了更为严谨，强制让该类不能建立对象！
	可以通过将构造函数私有化完成
 */

class ArrayTool { // 数组工具

	// 构造函数私有化 .. 
	private ArrayTool(){

	}

	public static int getMax(int[] arr){
		
		int max = 0;
		for(int x = 1; x < arr.length; x++){
			if(arr[x] > arr[max]){
				max = x;
			}
		}
		return arr[max];
	}

	public static int getMin(int[] arr){
		
		int min = 0;
		for(int x = 1; x < arr.length; x++){
			if(arr[x] < arr[min]){
				min = x;
			}
		}
		return arr[min];
	}

	public static void selectSort(int[] arr){

		for(int i = 0; i < arr.length - 1; i++){
			int index = i;
			for(int j = i + 1; j < arr.length; j++){
				if(arr[index] > arr[j]){
					index = j;
				}
			}
			if(index != i){
				swap(arr, index, i);
			}
		}
	}

	public static void bubbleSort(int[] arr){

		for(int i = 0; i < arr.length - 1; i++){
			for(int j = 0; j < arr.length - i - 1; j++){
				if(arr[j] > arr[j + 1]) {
					swap(arr,j,j + 1);
				}
			}
		}
	}

	public static void swap(int[] arr, int a, int b){
		int temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void printArray(int[] arr){

		System.out.print("[");
		for(int i = 0; i < arr.length; i++){
			if(i != arr.length - 1){
				System.out.print(arr[i]+", ");
			}else{
				System.out.print(arr[i]+"]");
			}
		}
	}
}