import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums1={1,2};
		int[] nums2 = {3,4};
		double rel = findMedianSortedArrays(nums1,nums2);
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] arrTotal=new int[nums1.length + nums2.length];
		int i=0,j=0,k=0,l=0;
		int count=arrTotal.length;
		while(l++ < count && (i < nums1.length || j < nums2.length)){
			if(i == nums1.length) {
				arrTotal[k++] = nums2[j++];
			}else if(j == nums2.length){
				arrTotal[k++]=nums1[i++];
			}else{
				if(nums1[i] < nums2[j]){
					arrTotal[k++] = nums1[i++];
				}else if(nums1[i] > nums2[j]){
					arrTotal[k++] = nums2[j++];
				}else{
					arrTotal[k++] = nums1[i++];
					arrTotal[k++] = nums2[j++];
					l++;
				}

			}


		}
		System.out.print(Arrays.toString(arrTotal));
		if(count %2 == 0){
			return (arrTotal[count/2 - 1] + arrTotal[count/2])/2.0;
		}else{
			return arrTotal[count/2];
		}
	}
}