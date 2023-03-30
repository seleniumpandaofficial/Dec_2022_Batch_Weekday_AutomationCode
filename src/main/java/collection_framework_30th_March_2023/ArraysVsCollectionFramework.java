package collection_framework_30th_March_2023;

import java.util.ArrayList;
import java.util.List;

public class ArraysVsCollectionFramework {

	public static void main(String[] args) {
		
		//Arrays can store primitive data types
		//Arrays can store objects ?
		ArraysVsCollectionFramework obj1 = new ArraysVsCollectionFramework();
		ArraysVsCollectionFramework obj2 = new ArraysVsCollectionFramework();
		ArraysVsCollectionFramework obj3 = new ArraysVsCollectionFramework();
		
		ArraysVsCollectionFramework[] objall = {obj1, obj2, obj3};
		

		List<Integer> list1 = new ArrayList<Integer>();
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Mousa");
		list.add("Milos");
		list.add("Sabin");
		list.add("Mousa");
		
				
	}

}
