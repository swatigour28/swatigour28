class MergeSortedArraySol {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ptr1 = m-1; 
        int ptr2 = n-1;
        int counter = nums1.length-1;
        while(ptr1>=0 && ptr2>=0) {
            nums1[counter--] = nums1[ptr1]>nums2[ptr2]?nums1[ptr1--]:nums2[ptr2--];
        }
        while(ptr2>=0) {
            nums1[counter--] = nums2[ptr2--];
        }
        
    }
}
