

	// Add your code here

    
    Difference(int[] arr){
        elements = arr;
    }
    
    void computeDifference(){
        Arrays.sort(elements);
        maximumDifference = Math.abs(elements[0] - elements[elements.length-1]);
    }
  


