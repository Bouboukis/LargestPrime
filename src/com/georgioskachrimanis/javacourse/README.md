**Largest Prime coding exercise**

_Write a method named getLargestPrime with one parameter
type int named number.
If the number is negative or does not have any prime numbers, the method should return -1 
to indicate an invalid value._

So in simple english the method should calculate the largest prime factor of a given number and return it.

The approach I took was to use 2 for loops that would check the if the product of i*j is equal the number value. 

Then if that is true there will be a check if the values of i, j are prime. 

Finally, there will be a chek which prime number of i or j is greater in each loop and will be save as the new maxPrime.

_I know it is not the most efficient code in the world, but it is my first try._