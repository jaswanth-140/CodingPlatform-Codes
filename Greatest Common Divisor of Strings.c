char* gcdOfStrings(char* str1, char* str2) {
   int len1=strlen(str1);
   int len2=strlen(str2);

   char* concat1=(char*)malloc(len1+len2+1);
   char* concat2=(char*)malloc(len1+len2+1);

   strcpy(concat1,str1);
   strcat(concat1,str2);

   strcpy(concat2,str2);
   strcat(concat2,str1);

   if(strcmp(concat1,concat2)!=0)
   {
    free(concat1);
    free(concat2);
    char* result=(char*)malloc(1);
    result[0]='\0';
    return result;
   } 

   free(concat1);
   free(concat2);
   
   int a=len1;
   int b=len2;
   while(b!=0)
   {
    int temp=b;
    b=a%b;
    a=temp;
   }
   int gcdlen=a;
   char* result=(char*)malloc(gcdlen+1);
   strncpy(result,str1,gcdlen);
   result[gcdlen]='\0';
   return result;
}
