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
                                  
    ```
# Flawed JUnit which does not show the flaw
 public void testAnotherTypeOfReverse()
 {
    int[] input = {3};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{3},input};                              
                                                                                                    
```                               
                                  
```
# JUnit which show the flaw
 public void testAnotherTypeOfReverse()
 {
    int[] input = {12,23,34,45};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{45,34,23,12},input};                                                                                                                                  
``` 
    
 ```
# Another JUnit which show the flaw
 public void testAnotherTypeOfReverse()
 {
    int[] input = {12,23,34};
    ArrayExamples.reverseInPlace(input);
    assertArrayEquals(new int[]{34,23,12},input};                                                                                                                                  
```
                                  
