
class Vowels{

  public static void main(String args[]){
  
    String str = "Hello Shakil, how are you?";
    
	System.out.println("Vowels are ");
	int count=0;
    for(int i=0;i<str.length()-1;i++){
        if(str.charAt(i)=='a' || str.charAt(i)=='A' || str.charAt(i)=='e' || str.charAt(i)=='E' || str.charAt(i)=='i' || str.charAt(i)=='I' ||
        str.charAt(i)=='o' || str.charAt(i)=='O' ||str.charAt(i)=='u' || str.charAt(i)=='U')
        {
            System.out.print(str.charAt(i)+" ");
		count++;
        }
    }
	System.out.println();
	System.out.println("Total vowels count is : "+count);
  }
}
