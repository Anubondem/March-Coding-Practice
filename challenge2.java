public int distributeCandies(int[] candyType) {
        //n==candyType.length
        int n=candyType.length;
       HashSet<Integer> candytypes=new HashSet(); //collect candytypes in a hashset without repetition
       for(int i=0;i<n;i++){
           candytypes.add(candyType[i]);
       }
        if(candytypes.size()<(n/2)) return candytypes.size(); 
        else{
            return (n/2);
        }

    }
