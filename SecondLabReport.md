# Second CSE 15-L Report (Week 3)

## Part 1
### Writing a StringServer

* This program has the following feature:
When you have the following path "/add-message?s=<string>", the webpage prints out the string value.
Another feature to note is that this program keeps note of all the strings printed.
  
* Below is the code block for my StringServer:
  ![Image](Code.jpg)
  
  * When looking at the code used, I had to use the concept of different portions like path, query.
  
  * As you can see from above, I had to try to check whether path of URL was valid and when affirmed I had to check whether the query had an "s" to ensure
    printing of word on the website

## Part 2
### Exploring JUnit
  
 * In this part I shall be talking about the JUnit class
  
 * JUnit is responsible for ensuring unit testing in Java programs which is very beneficial to ensuring right running of methods within a program
  
 * We will be talking about ArrayReverseMethod which we(including our group) had to fix
  
  ```
# Buggy code block
 static void reverseInPlace(int[] arr) {
    for(int i = 0; i < arr.length; i += 1) {
      arr[i] = arr[arr.length - i - 1];
    }
  }
```
 
   * Below are the JUnit Tests
 
* Below is the first JUnit test which does not show the flaws in the program
                                  
 ```
# code block
 public void testAnotherTypeOfReverse()
 {
    int[] input = {3};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{3},input};                              
 }  
```
                                  
* Below two tests are tests which do show the flaws in the program     
                                  
 ```
# First JUnit Test
@Test
    public void testTypeOfReverse()
    {
        int[] input = {12,23,34,45};
        Array.reverseInPlace(input);
        assertArrayEquals(new int[]{45,34,23,12},input);
    }                               
```
                                  
  ```
# Second JUnit Test
@Test
    public void testTypeOfReverse()
    {
        int[] input = {12,23,34};
        Array.reverseInPlace(input);
        assertArrayEquals(new int[]{34,23,12},input);
    } 
```
                                  
* Below is an image which shows the message displayed in terminal due to incorrect implementation of reverseArray method
                                  
![Image](Exception.jpg)                              

  

                                  
                                  
* The original code had end counter variable at arr.length instead of arr.length/2
* The original code also forgot to use a temporary variable to store the value of original variable at a certain index
* To expose this, I used multivariable arrays with both odd and even lengths
* I amended the following stuff mentioned above and my code worked
                                  
 ## Part 3
### Reflection about lab 2 and lab 3                                
                                  
 * In lab 2, I did not have much of an idea about different parts of the URL. However, after doing lab 2, I understood what is a path, query and other parts of URL
  
 * In lab 3, I was able to use JUnit tests with much more profiency and I think I can do a better job at committing and pushing code to my GitHub repository 
                                  
                                  
