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
  * Memory : 9.3MB
  
**4 threads :** (The number of processing cores)
  * Total time : 40.696s
  * CPU : ![Click here](https://i.imgur.com/CLuc6Nh.png)
  * Memory : 9.3MB

**8 threads :** (2 x The number of processing cores)
 * Total time : 25.832s
 * CPU : ![](https://i.imgur.com/ruSgvJI.png)
 * Memory : 11.4MB
 
 **200 threads :**
  * Total time : 17.438s
  * CPU : ![](https://i.imgur.com/i5KEYWK.png)
  * Memory used : 12MB
  
 **500 threads :**
  * Total time : 17.171s
  * CPU : ![](https://i.imgur.com/IAftJrB.png)
  * Memory used : 13.5MB
  
  
  
  
  
  ### 1)
  
  The best performance is not achieved with 500 threads because, even though our program parallelize the problem with 500 threads, the CPU doesn't have the capacity to compute the 500 threads in parallel. Indeed, our CPU (i7-3770) only possesses 4 cores, and 8 threads.
  
  ### 2)
  
   Between the execution with 4 threads (the number of processing cores), and with 8, we can observe a shorter execution time with the 8 threads version. This is due to the fact that, with our CPU (i7-3770), each processing core owns two threads: Therefore, with our CPU, we can compute 8 threads at the same time, which explains the best perfomance in with the execution with 8 threads
   
### 3)

 It depends, if the CPU possesses 500 threads (which I don't think that exists), no. However, if the CPUs own less than 500 threads, then yes the performances would be better by using several CPUs, because a single CPU could not compute the 500 threads at the same time
  
