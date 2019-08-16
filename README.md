# BBP-Formula-ARSW-2019-2

## Part I - Introduction to Java Threads

When executing using the *start()* method the output is not synchronized, so the numbers are not printed in order. Whereas zhen using the *run()* method, the numbers are printed in order.

This is because when using the *run()* method, the function will be executed in the same thread, so before printing the numbers from 100 to 199, the function printing the numbers from 0 to 99 has to be finished.

However, when using the *start()* method, the function will be executed in a thread. That is why the functions are not synchronized and the numbers are not printed in order.

## Part II - BBP Formula Exercise

*see the code*

## Part III - Performance Evaluation

*As executing the program to calculate the first 1000000 digits of Pi was a little too long, this number has been reduced to 50000*

### With : 

**A single thread :**
  * Total time: 1:25.113s
  * CPU Time : 12.5%
  * Memory : 128MB
  * Threads : 6
**8 threads :** (The number of prossessing cores)
  * Total time : 25.850s
  * CPU : ![](https://imgur.com/a/EEVhIl0)
  * Memory : 12MB
  * Threads : 12
