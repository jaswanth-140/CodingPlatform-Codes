

char * mergeAlternately(char * word1, char * word2){
int x=strlen(word1);
int y=strlen(word2);
int i=0,resultindex=0;
char *result=(char*)malloc((x+y+1)*sizeof(char));
while(i<x||i<y)
{
    if(i<x)
    {
        result[resultindex]=word1[i];
        resultindex++;
    }
    if(i<y)
    {
        result[resultindex]=word2[i];
        resultindex++;
    }
    i++;
}
   result[resultindex]='\0';
   return result;
}
