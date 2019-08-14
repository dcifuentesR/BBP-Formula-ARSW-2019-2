# BBP-Formula-ARSW-2019-2

## Part I - Introduction to Java Threads

When executing using the "start()" method the output is not synchronized, so the numbers are not printed in order. Whereas zhen using the "run()" method, the numbers are printed in order.

This is because when using the run() method, the function will be executed in the same thread, so before printing the numbers from 100 to 199, the function printing the numbers from 0 to 99 has to be finished.

However, when using the start() method, the function will be executed in a thread. That is why the functions are not synchronized and the numbers are not printed in order.

