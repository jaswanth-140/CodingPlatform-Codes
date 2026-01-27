
bool* kidsWithCandies(int* candies, int candiesSize, int extraCandies, int* returnSize) {
    bool* result=(bool*)malloc(candiesSize*sizeof(bool));
    *returnSize=candiesSize;
    int i;
    int max=candies[0];
    for (i=1;i<candiesSize;i++)
    {
       if(candies[i]>max)
       {
        max=candies[i];
       }
    }

    for(i=0;i<candiesSize;i++)
    {
        if((candies[i]+extraCandies)>=max)
        {
            result[i]=true;
        }
        else
        {
            result[i]=false;
        }
    }
    return result;
}
