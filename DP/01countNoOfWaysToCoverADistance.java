class Result
{
   static int count = 0;
   static void fxn(int d,int k,int sum){
       if(sum == d){
           count++;
           return;
       }
       if(sum > d){
           return;
       }
       for(int var = 1;var <= k; var++){
          fxn(d,k,sum+var);
       }
   }
   static int totalWaysToDistance(int d, int k){
      fxn(d,k,0);
      return count;
  }
}