# mapstruct-beanutils-benchmark

```
C:\java\open\jdk-18.0.2\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\lib\idea_rt.jar=65160:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\bin" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\work\experimental\mapstruct-beanutils-benchmark\target\classes;C:\Users\golsh\.m2\repository\org\mapstruct\mapstruct\1.5.2.Final\mapstruct-1.5.2.Final.jar;C:\Users\golsh\.m2\repository\org\mapstruct\mapstruct-processor\1.5.2.Final\mapstruct-processor-1.5.2.Final.jar;C:\Users\golsh\.m2\repository\commons-beanutils\commons-beanutils\1.9.4\commons-beanutils-1.9.4.jar;C:\Users\golsh\.m2\repository\commons-logging\commons-logging\1.2\commons-logging-1.2.jar;C:\Users\golsh\.m2\repository\commons-collections\commons-collections\3.2.2\commons-collections-3.2.2.jar;C:\Users\golsh\.m2\repository\org\springframework\spring-beans\6.0.8\spring-beans-6.0.8.jar;C:\Users\golsh\.m2\repository\org\springframework\spring-core\6.0.8\spring-core-6.0.8.jar;C:\Users\golsh\.m2\repository\org\springframework\spring-jcl\6.0.8\spring-jcl-6.0.8.jar;C:\Users\golsh\.m2\repository\org\openjdk\jmh\jmh-core\1.35\jmh-core-1.35.jar;C:\Users\golsh\.m2\repository\net\sf\jopt-simple\jopt-simple\5.0.4\jopt-simple-5.0.4.jar;C:\Users\golsh\.m2\repository\org\apache\commons\commons-math3\3.2\commons-math3-3.2.jar;C:\Users\golsh\.m2\repository\org\openjdk\jmh\jmh-generator-annprocess\1.35\jmh-generator-annprocess-1.35.jar org.example.Main
# JMH version: 1.35
# VM version: JDK 18.0.2, OpenJDK 64-Bit Server VM, 18.0.2+9-61
# VM invoker: C:\java\open\jdk-18.0.2\bin\java.exe
# VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\lib\idea_rt.jar=65160:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.example.Main.apacheBeanutils

# Run progress: 0,00% complete, ETA 01:15:00
# Fork: 1 of 5
# Warmup Iteration   1: ≈ 10⁻⁴ ops/ns
# Warmup Iteration   2: ≈ 10⁻⁴ ops/ns
# Warmup Iteration   3: ≈ 10⁻⁴ ops/ns
# Warmup Iteration   4: ≈ 10⁻⁴ ops/ns
# Warmup Iteration   5: ≈ 10⁻⁴ ops/ns
Iteration   1: ≈ 10⁻⁴ ops/ns
Iteration   2: ≈ 10⁻⁴ ops/ns
Iteration   3: ≈ 10⁻⁴ ops/ns
Iteration   4: ≈ 10⁻⁴ ops/ns
Iteration   5: ≈ 10⁻⁴ ops/ns

# Run progress: 2,22% complete, ETA 01:13:55
# Fork: 2 of 5
# Warmup Iteration   1: ≈ 10⁻⁴ ops/ns
# Warmup Iteration   2: ≈ 10⁻⁴ ops/ns
# Warmup Iteration   3: ≈ 10⁻⁴ ops/ns
# Warmup Iteration   4: ≈ 10⁻⁴ ops/ns
# Warmup Iteration   5: ≈ 10⁻⁴ ops/ns
Iteration   1: ≈ 10⁻⁴ ops/ns
Iteration   2: ≈ 10⁻⁴ ops/ns
Iteration   3: ≈ 10⁻⁴ ops/ns
Iteration   4: ≈ 10⁻⁴ ops/ns
Iteration   5: ≈ 10⁻⁴ ops/ns

# Run progress: 4,44% complete, ETA 01:12:13
# Fork: 3 of 5
# Warmup Iteration   1: ≈ 10⁻⁴ ops/ns
# Warmup Iteration   2: ≈ 10⁻⁴ ops/ns
# Warmup Iteration   3: ≈ 10⁻⁴ ops/ns
# Warmup Iteration   4: ≈ 10⁻⁴ ops/ns
# Warmup Iteration   5: ≈ 10⁻⁴ ops/ns
Iteration   1: ≈ 10⁻⁴ ops/ns
Iteration   2: ≈ 10⁻⁴ ops/ns
Iteration   3: ≈ 10⁻⁴ ops/ns
Iteration   4: ≈ 10⁻⁴ ops/ns
Iteration   5: ≈ 10⁻⁴ ops/ns

# Run progress: 6,67% complete, ETA 01:10:32
# Fork: 4 of 5
# Warmup Iteration   1: ≈ 10⁻⁴ ops/ns
# Warmup Iteration   2: ≈ 10⁻⁴ ops/ns
# Warmup Iteration   3: ≈ 10⁻⁴ ops/ns
# Warmup Iteration   4: ≈ 10⁻⁴ ops/ns
# Warmup Iteration   5: ≈ 10⁻⁴ ops/ns
Iteration   1: ≈ 10⁻⁴ ops/ns
Iteration   2: ≈ 10⁻⁴ ops/ns
Iteration   3: ≈ 10⁻⁴ ops/ns
Iteration   4: ≈ 10⁻⁴ ops/ns
Iteration   5: ≈ 10⁻⁴ ops/ns

# Run progress: 8,89% complete, ETA 01:08:51
# Fork: 5 of 5
# Warmup Iteration   1: ≈ 10⁻⁴ ops/ns
# Warmup Iteration   2: ≈ 10⁻⁴ ops/ns
# Warmup Iteration   3: ≈ 10⁻⁴ ops/ns
# Warmup Iteration   4: ≈ 10⁻⁴ ops/ns
# Warmup Iteration   5: ≈ 10⁻⁴ ops/ns
Iteration   1: ≈ 10⁻⁴ ops/ns
Iteration   2: ≈ 10⁻⁴ ops/ns
Iteration   3: ≈ 10⁻⁴ ops/ns
Iteration   4: ≈ 10⁻⁴ ops/ns
Iteration   5: ≈ 10⁻⁴ ops/ns


Result "org.example.Main.apacheBeanutils":
  ≈ 10⁻⁴ ops/ns


# JMH version: 1.35
# VM version: JDK 18.0.2, OpenJDK 64-Bit Server VM, 18.0.2+9-61
# VM invoker: C:\java\open\jdk-18.0.2\bin\java.exe
# VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\lib\idea_rt.jar=65160:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.example.Main.mapstruct

# Run progress: 11,11% complete, ETA 01:07:10
# Fork: 1 of 5
# Warmup Iteration   1: 0,015 ops/ns
# Warmup Iteration   2: 0,015 ops/ns
# Warmup Iteration   3: 0,015 ops/ns
# Warmup Iteration   4: 0,014 ops/ns
# Warmup Iteration   5: 0,014 ops/ns
Iteration   1: 0,015 ops/ns
Iteration   2: 0,015 ops/ns
Iteration   3: 0,015 ops/ns
Iteration   4: 0,015 ops/ns
Iteration   5: 0,014 ops/ns

# Run progress: 13,33% complete, ETA 01:05:29
# Fork: 2 of 5
# Warmup Iteration   1: 0,015 ops/ns
# Warmup Iteration   2: 0,014 ops/ns
# Warmup Iteration   3: 0,014 ops/ns
# Warmup Iteration   4: 0,014 ops/ns
# Warmup Iteration   5: 0,014 ops/ns
Iteration   1: 0,014 ops/ns
Iteration   2: 0,014 ops/ns
Iteration   3: 0,014 ops/ns
Iteration   4: 0,014 ops/ns
Iteration   5: 0,014 ops/ns

# Run progress: 15,56% complete, ETA 01:03:49
# Fork: 3 of 5
# Warmup Iteration   1: 0,014 ops/ns
# Warmup Iteration   2: 0,013 ops/ns
# Warmup Iteration   3: 0,014 ops/ns
# Warmup Iteration   4: 0,013 ops/ns
# Warmup Iteration   5: 0,013 ops/ns
Iteration   1: 0,013 ops/ns
Iteration   2: 0,013 ops/ns
Iteration   3: 0,013 ops/ns
Iteration   4: 0,013 ops/ns
Iteration   5: 0,014 ops/ns

# Run progress: 17,78% complete, ETA 01:02:08
# Fork: 4 of 5
# Warmup Iteration   1: 0,015 ops/ns
# Warmup Iteration   2: 0,014 ops/ns
# Warmup Iteration   3: 0,014 ops/ns
# Warmup Iteration   4: 0,014 ops/ns
# Warmup Iteration   5: 0,014 ops/ns
Iteration   1: 0,014 ops/ns
Iteration   2: 0,014 ops/ns
Iteration   3: 0,014 ops/ns
Iteration   4: 0,014 ops/ns
Iteration   5: 0,014 ops/ns

# Run progress: 20,00% complete, ETA 01:00:27
# Fork: 5 of 5
# Warmup Iteration   1: 0,015 ops/ns
# Warmup Iteration   2: 0,014 ops/ns
# Warmup Iteration   3: 0,014 ops/ns
# Warmup Iteration   4: 0,015 ops/ns
# Warmup Iteration   5: 0,015 ops/ns
Iteration   1: 0,015 ops/ns
Iteration   2: 0,015 ops/ns
Iteration   3: 0,015 ops/ns
Iteration   4: 0,015 ops/ns
Iteration   5: 0,015 ops/ns


Result "org.example.Main.mapstruct":
  0,014 ±(99.9%) 0,001 ops/ns [Average]
  (min, avg, max) = (0,013, 0,014, 0,015), stdev = 0,001
  CI (99.9%): [0,014, 0,015] (assumes normal distribution)


# JMH version: 1.35
# VM version: JDK 18.0.2, OpenJDK 64-Bit Server VM, 18.0.2+9-61
# VM invoker: C:\java\open\jdk-18.0.2\bin\java.exe
# VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\lib\idea_rt.jar=65160:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.example.Main.springBeanutils

# Run progress: 22,22% complete, ETA 00:58:46
# Fork: 1 of 5
# Warmup Iteration   1: ≈ 10⁻³ ops/ns
# Warmup Iteration   2: ≈ 10⁻³ ops/ns
# Warmup Iteration   3: ≈ 10⁻³ ops/ns
# Warmup Iteration   4: ≈ 10⁻³ ops/ns
# Warmup Iteration   5: ≈ 10⁻³ ops/ns
Iteration   1: ≈ 10⁻³ ops/ns
Iteration   2: ≈ 10⁻³ ops/ns
Iteration   3: ≈ 10⁻³ ops/ns
Iteration   4: ≈ 10⁻³ ops/ns
Iteration   5: ≈ 10⁻³ ops/ns

# Run progress: 24,44% complete, ETA 00:57:05
# Fork: 2 of 5
# Warmup Iteration   1: ≈ 10⁻³ ops/ns
# Warmup Iteration   2: ≈ 10⁻³ ops/ns
# Warmup Iteration   3: ≈ 10⁻³ ops/ns
# Warmup Iteration   4: ≈ 10⁻³ ops/ns
# Warmup Iteration   5: ≈ 10⁻³ ops/ns
Iteration   1: ≈ 10⁻³ ops/ns
Iteration   2: ≈ 10⁻³ ops/ns
Iteration   3: ≈ 10⁻³ ops/ns
Iteration   4: ≈ 10⁻³ ops/ns
Iteration   5: ≈ 10⁻³ ops/ns

# Run progress: 26,67% complete, ETA 00:55:24
# Fork: 3 of 5
# Warmup Iteration   1: ≈ 10⁻³ ops/ns
# Warmup Iteration   2: ≈ 10⁻³ ops/ns
# Warmup Iteration   3: ≈ 10⁻³ ops/ns
# Warmup Iteration   4: ≈ 10⁻³ ops/ns
# Warmup Iteration   5: ≈ 10⁻³ ops/ns
Iteration   1: ≈ 10⁻³ ops/ns
Iteration   2: ≈ 10⁻³ ops/ns
Iteration   3: ≈ 10⁻³ ops/ns
Iteration   4: ≈ 10⁻³ ops/ns
Iteration   5: ≈ 10⁻³ ops/ns

# Run progress: 28,89% complete, ETA 00:53:44
# Fork: 4 of 5
# Warmup Iteration   1: ≈ 10⁻³ ops/ns
# Warmup Iteration   2: ≈ 10⁻³ ops/ns
# Warmup Iteration   3: ≈ 10⁻³ ops/ns
# Warmup Iteration   4: ≈ 10⁻³ ops/ns
# Warmup Iteration   5: ≈ 10⁻³ ops/ns
Iteration   1: ≈ 10⁻³ ops/ns
Iteration   2: ≈ 10⁻³ ops/ns
Iteration   3: ≈ 10⁻³ ops/ns
Iteration   4: ≈ 10⁻³ ops/ns
Iteration   5: ≈ 10⁻³ ops/ns

# Run progress: 31,11% complete, ETA 00:52:03
# Fork: 5 of 5
# Warmup Iteration   1: ≈ 10⁻³ ops/ns
# Warmup Iteration   2: ≈ 10⁻³ ops/ns
# Warmup Iteration   3: ≈ 10⁻³ ops/ns
# Warmup Iteration   4: ≈ 10⁻³ ops/ns
# Warmup Iteration   5: ≈ 10⁻³ ops/ns
Iteration   1: ≈ 10⁻³ ops/ns
Iteration   2: ≈ 10⁻³ ops/ns
Iteration   3: ≈ 10⁻³ ops/ns
Iteration   4: ≈ 10⁻³ ops/ns
Iteration   5: ≈ 10⁻³ ops/ns


Result "org.example.Main.springBeanutils":
  ≈ 10⁻³ ops/ns


# JMH version: 1.35
# VM version: JDK 18.0.2, OpenJDK 64-Bit Server VM, 18.0.2+9-61
# VM invoker: C:\java\open\jdk-18.0.2\bin\java.exe
# VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\lib\idea_rt.jar=65160:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.example.Main.apacheBeanutils

# Run progress: 33,33% complete, ETA 00:50:22
# Fork: 1 of 5
# Warmup Iteration   1: 8304,714 ns/op
# Warmup Iteration   2: 8019,414 ns/op
# Warmup Iteration   3: 8018,100 ns/op
# Warmup Iteration   4: 8144,741 ns/op
# Warmup Iteration   5: 8034,516 ns/op
Iteration   1: 8049,741 ns/op
Iteration   2: 8046,099 ns/op
Iteration   3: 8021,645 ns/op
Iteration   4: 8008,106 ns/op
Iteration   5: 8008,869 ns/op

# Run progress: 35,56% complete, ETA 00:48:41
# Fork: 2 of 5
# Warmup Iteration   1: 7952,406 ns/op
# Warmup Iteration   2: 7698,688 ns/op
# Warmup Iteration   3: 7712,468 ns/op
# Warmup Iteration   4: 7717,069 ns/op
# Warmup Iteration   5: 7680,433 ns/op
Iteration   1: 7674,674 ns/op
Iteration   2: 7683,165 ns/op
Iteration   3: 7679,047 ns/op
Iteration   4: 7805,714 ns/op
Iteration   5: 7717,987 ns/op

# Run progress: 37,78% complete, ETA 00:47:01
# Fork: 3 of 5
# Warmup Iteration   1: 7886,959 ns/op
# Warmup Iteration   2: 7619,883 ns/op
# Warmup Iteration   3: 7623,625 ns/op
# Warmup Iteration   4: 7595,251 ns/op
# Warmup Iteration   5: 7616,856 ns/op
Iteration   1: 7596,773 ns/op
Iteration   2: 7625,991 ns/op
Iteration   3: 7596,686 ns/op
Iteration   4: 7581,400 ns/op
Iteration   5: 7583,809 ns/op

# Run progress: 40,00% complete, ETA 00:45:20
# Fork: 4 of 5
# Warmup Iteration   1: 7959,800 ns/op
# Warmup Iteration   2: 7660,276 ns/op
# Warmup Iteration   3: 7672,483 ns/op
# Warmup Iteration   4: 7630,928 ns/op
# Warmup Iteration   5: 7652,944 ns/op
Iteration   1: 7652,673 ns/op
Iteration   2: 7688,076 ns/op
Iteration   3: 7665,401 ns/op
Iteration   4: 7647,597 ns/op
Iteration   5: 7520,257 ns/op

# Run progress: 42,22% complete, ETA 00:43:39
# Fork: 5 of 5
# Warmup Iteration   1: 7752,873 ns/op
# Warmup Iteration   2: 7481,654 ns/op
# Warmup Iteration   3: 7580,883 ns/op
# Warmup Iteration   4: 7593,434 ns/op
# Warmup Iteration   5: 7571,748 ns/op
Iteration   1: 7587,984 ns/op
Iteration   2: 7623,404 ns/op
Iteration   3: 7839,431 ns/op
Iteration   4: 7907,984 ns/op
Iteration   5: 7876,171 ns/op


Result "org.example.Main.apacheBeanutils":
  7747,547 ±(99.9%) 127,691 ns/op [Average]
  (min, avg, max) = (7520,257, 7747,547, 8049,741), stdev = 170,464
  CI (99.9%): [7619,857, 7875,238] (assumes normal distribution)


# JMH version: 1.35
# VM version: JDK 18.0.2, OpenJDK 64-Bit Server VM, 18.0.2+9-61
# VM invoker: C:\java\open\jdk-18.0.2\bin\java.exe
# VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\lib\idea_rt.jar=65160:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.example.Main.mapstruct

# Run progress: 44,44% complete, ETA 00:41:58
# Fork: 1 of 5
# Warmup Iteration   1: 67,890 ns/op
# Warmup Iteration   2: 68,286 ns/op
# Warmup Iteration   3: 68,171 ns/op
# Warmup Iteration   4: 66,749 ns/op
# Warmup Iteration   5: 65,646 ns/op
Iteration   1: 65,062 ns/op
Iteration   2: 65,326 ns/op
Iteration   3: 65,538 ns/op
Iteration   4: 64,933 ns/op
Iteration   5: 65,468 ns/op

# Run progress: 46,67% complete, ETA 00:40:18
# Fork: 2 of 5
# Warmup Iteration   1: 66,148 ns/op
# Warmup Iteration   2: 65,283 ns/op
# Warmup Iteration   3: 65,681 ns/op
# Warmup Iteration   4: 65,357 ns/op
# Warmup Iteration   5: 65,155 ns/op
Iteration   1: 66,122 ns/op
Iteration   2: 65,506 ns/op
Iteration   3: 66,694 ns/op
Iteration   4: 65,540 ns/op
Iteration   5: 66,435 ns/op

# Run progress: 48,89% complete, ETA 00:38:37
# Fork: 3 of 5
# Warmup Iteration   1: 67,120 ns/op
# Warmup Iteration   2: 66,571 ns/op
# Warmup Iteration   3: 66,230 ns/op
# Warmup Iteration   4: 66,415 ns/op
# Warmup Iteration   5: 66,815 ns/op
Iteration   1: 66,594 ns/op
Iteration   2: 67,076 ns/op
Iteration   3: 67,129 ns/op
Iteration   4: 68,282 ns/op
Iteration   5: 68,495 ns/op

# Run progress: 51,11% complete, ETA 00:36:56
# Fork: 4 of 5
# Warmup Iteration   1: 71,426 ns/op
# Warmup Iteration   2: 70,130 ns/op
# Warmup Iteration   3: 66,758 ns/op
# Warmup Iteration   4: 70,591 ns/op
# Warmup Iteration   5: 70,090 ns/op
Iteration   1: 70,270 ns/op
Iteration   2: 70,162 ns/op
Iteration   3: 70,156 ns/op
Iteration   4: 69,982 ns/op
Iteration   5: 66,554 ns/op

# Run progress: 53,33% complete, ETA 00:35:15
# Fork: 5 of 5
# Warmup Iteration   1: 66,995 ns/op
# Warmup Iteration   2: 66,998 ns/op
# Warmup Iteration   3: 66,290 ns/op
# Warmup Iteration   4: 66,928 ns/op
# Warmup Iteration   5: 66,877 ns/op
Iteration   1: 67,157 ns/op
Iteration   2: 66,836 ns/op
Iteration   3: 66,771 ns/op
Iteration   4: 66,554 ns/op
Iteration   5: 66,289 ns/op


Result "org.example.Main.mapstruct":
  66,997 ±(99.9%) 1,237 ns/op [Average]
  (min, avg, max) = (64,933, 66,997, 70,270), stdev = 1,652
  CI (99.9%): [65,760, 68,235] (assumes normal distribution)


# JMH version: 1.35
# VM version: JDK 18.0.2, OpenJDK 64-Bit Server VM, 18.0.2+9-61
# VM invoker: C:\java\open\jdk-18.0.2\bin\java.exe
# VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\lib\idea_rt.jar=65160:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.example.Main.springBeanutils

# Run progress: 55,56% complete, ETA 00:33:35
# Fork: 1 of 5
# Warmup Iteration   1: 2456,430 ns/op
# Warmup Iteration   2: 2413,705 ns/op
# Warmup Iteration   3: 2405,422 ns/op
# Warmup Iteration   4: 2411,240 ns/op
# Warmup Iteration   5: 2409,709 ns/op
Iteration   1: 2403,979 ns/op
Iteration   2: 2408,758 ns/op
Iteration   3: 2409,165 ns/op
Iteration   4: 2403,007 ns/op
Iteration   5: 2405,815 ns/op

# Run progress: 57,78% complete, ETA 00:31:54
# Fork: 2 of 5
# Warmup Iteration   1: 2476,436 ns/op
# Warmup Iteration   2: 2495,143 ns/op
# Warmup Iteration   3: 2583,014 ns/op
# Warmup Iteration   4: 2588,217 ns/op
# Warmup Iteration   5: 2604,659 ns/op
Iteration   1: 2618,670 ns/op
Iteration   2: 2480,041 ns/op
Iteration   3: 2392,220 ns/op
Iteration   4: 2408,435 ns/op
Iteration   5: 2429,640 ns/op

# Run progress: 60,00% complete, ETA 00:30:13
# Fork: 3 of 5
# Warmup Iteration   1: 2421,359 ns/op
# Warmup Iteration   2: 2381,195 ns/op
# Warmup Iteration   3: 2375,246 ns/op
# Warmup Iteration   4: 2419,460 ns/op
# Warmup Iteration   5: 2431,486 ns/op
Iteration   1: 2434,721 ns/op
Iteration   2: 2424,911 ns/op
Iteration   3: 2425,334 ns/op
Iteration   4: 2397,898 ns/op
Iteration   5: 2438,542 ns/op

# Run progress: 62,22% complete, ETA 00:28:32
# Fork: 4 of 5
# Warmup Iteration   1: 2455,489 ns/op
# Warmup Iteration   2: 2487,762 ns/op
# Warmup Iteration   3: 2459,539 ns/op
# Warmup Iteration   4: 2386,495 ns/op
# Warmup Iteration   5: 2403,771 ns/op
Iteration   1: 2379,544 ns/op
Iteration   2: 2396,807 ns/op
Iteration   3: 2407,003 ns/op
Iteration   4: 2389,121 ns/op
Iteration   5: 2399,775 ns/op

# Run progress: 64,44% complete, ETA 00:26:52
# Fork: 5 of 5
# Warmup Iteration   1: 2459,659 ns/op
# Warmup Iteration   2: 2402,916 ns/op
# Warmup Iteration   3: 2417,135 ns/op
# Warmup Iteration   4: 2414,375 ns/op
# Warmup Iteration   5: 2399,129 ns/op
Iteration   1: 2429,653 ns/op
Iteration   2: 2411,820 ns/op
Iteration   3: 2409,188 ns/op
Iteration   4: 2425,434 ns/op
Iteration   5: 2412,745 ns/op


Result "org.example.Main.springBeanutils":
  2421,689 ±(99.9%) 34,245 ns/op [Average]
  (min, avg, max) = (2379,544, 2421,689, 2618,670), stdev = 45,716
  CI (99.9%): [2387,444, 2455,934] (assumes normal distribution)


# JMH version: 1.35
# VM version: JDK 18.0.2, OpenJDK 64-Bit Server VM, 18.0.2+9-61
# VM invoker: C:\java\open\jdk-18.0.2\bin\java.exe
# VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\lib\idea_rt.jar=65160:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.apacheBeanutils

# Run progress: 66,67% complete, ETA 00:25:11
# Fork: 1 of 5
# Warmup Iteration   1: 8219,505 ±(99.9%) 351,070 ns/op
# Warmup Iteration   2: 7792,040 ±(99.9%) 29,931 ns/op
# Warmup Iteration   3: 7794,628 ±(99.9%) 29,406 ns/op
# Warmup Iteration   4: 7798,306 ±(99.9%) 27,762 ns/op
# Warmup Iteration   5: 7802,886 ±(99.9%) 29,001 ns/op
Iteration   1: 7790,853 ±(99.9%) 29,774 ns/op
                 apacheBeanutils·p0.00:   7000,000 ns/op
                 apacheBeanutils·p0.50:   7696,000 ns/op
                 apacheBeanutils·p0.90:   7992,000 ns/op
                 apacheBeanutils·p0.95:   8000,000 ns/op
                 apacheBeanutils·p0.99:   9696,000 ns/op
                 apacheBeanutils·p0.999:  13200,000 ns/op
                 apacheBeanutils·p0.9999: 435378,790 ns/op
                 apacheBeanutils·p1.00:   617472,000 ns/op

Iteration   2: 7847,227 ±(99.9%) 30,758 ns/op
                 apacheBeanutils·p0.00:   6992,000 ns/op
                 apacheBeanutils·p0.50:   7696,000 ns/op
                 apacheBeanutils·p0.90:   8000,000 ns/op
                 apacheBeanutils·p0.95:   8096,000 ns/op
                 apacheBeanutils·p0.99:   11488,000 ns/op
                 apacheBeanutils·p0.999:  16800,000 ns/op
                 apacheBeanutils·p0.9999: 444429,619 ns/op
                 apacheBeanutils·p1.00:   608256,000 ns/op

Iteration   3: 7790,724 ±(99.9%) 29,521 ns/op
                 apacheBeanutils·p0.00:   7000,000 ns/op
                 apacheBeanutils·p0.50:   7696,000 ns/op
                 apacheBeanutils·p0.90:   7992,000 ns/op
                 apacheBeanutils·p0.95:   8000,000 ns/op
                 apacheBeanutils·p0.99:   9696,000 ns/op
                 apacheBeanutils·p0.999:  13888,000 ns/op
                 apacheBeanutils·p0.9999: 404074,496 ns/op
                 apacheBeanutils·p1.00:   607232,000 ns/op

Iteration   4: 7804,977 ±(99.9%) 30,590 ns/op
                 apacheBeanutils·p0.00:   6992,000 ns/op
                 apacheBeanutils·p0.50:   7696,000 ns/op
                 apacheBeanutils·p0.90:   7992,000 ns/op
                 apacheBeanutils·p0.95:   8000,000 ns/op
                 apacheBeanutils·p0.99:   9600,000 ns/op
                 apacheBeanutils·p0.999:  13250,976 ns/op
                 apacheBeanutils·p0.9999: 440531,149 ns/op
                 apacheBeanutils·p1.00:   670720,000 ns/op

Iteration   5: 7787,565 ±(99.9%) 31,080 ns/op
                 apacheBeanutils·p0.00:   7000,000 ns/op
                 apacheBeanutils·p0.50:   7696,000 ns/op
                 apacheBeanutils·p0.90:   7992,000 ns/op
                 apacheBeanutils·p0.95:   8000,000 ns/op
                 apacheBeanutils·p0.99:   9488,000 ns/op
                 apacheBeanutils·p0.999:  12800,000 ns/op
                 apacheBeanutils·p0.9999: 447930,061 ns/op
                 apacheBeanutils·p1.00:   645120,000 ns/op


# Run progress: 68,89% complete, ETA 00:23:30
# Fork: 2 of 5
# Warmup Iteration   1: 8066,506 ±(99.9%) 340,897 ns/op
# Warmup Iteration   2: 7575,500 ±(99.9%) 33,567 ns/op
# Warmup Iteration   3: 7636,398 ±(99.9%) 34,536 ns/op
# Warmup Iteration   4: 7550,458 ±(99.9%) 31,197 ns/op
# Warmup Iteration   5: 7557,499 ±(99.9%) 29,880 ns/op
Iteration   1: 7620,244 ±(99.9%) 32,980 ns/op
                 apacheBeanutils·p0.00:   6696,000 ns/op
                 apacheBeanutils·p0.50:   7296,000 ns/op
                 apacheBeanutils·p0.90:   7696,000 ns/op
                 apacheBeanutils·p0.95:   8496,000 ns/op
                 apacheBeanutils·p0.99:   12192,000 ns/op
                 apacheBeanutils·p0.999:  35963,968 ns/op
                 apacheBeanutils·p0.9999: 438268,774 ns/op
                 apacheBeanutils·p1.00:   724992,000 ns/op

Iteration   2: 7590,690 ±(99.9%) 31,642 ns/op
                 apacheBeanutils·p0.00:   6696,000 ns/op
                 apacheBeanutils·p0.50:   7296,000 ns/op
                 apacheBeanutils·p0.90:   7696,000 ns/op
                 apacheBeanutils·p0.95:   8000,000 ns/op
                 apacheBeanutils·p0.99:   12192,000 ns/op
                 apacheBeanutils·p0.999:  24424,032 ns/op
                 apacheBeanutils·p0.9999: 110648,794 ns/op
                 apacheBeanutils·p1.00:   692224,000 ns/op

Iteration   3: 7663,916 ±(99.9%) 34,521 ns/op
                 apacheBeanutils·p0.00:   6792,000 ns/op
                 apacheBeanutils·p0.50:   7296,000 ns/op
                 apacheBeanutils·p0.90:   7792,800 ns/op
                 apacheBeanutils·p0.95:   9488,000 ns/op
                 apacheBeanutils·p0.99:   12384,000 ns/op
                 apacheBeanutils·p0.999:  25022,912 ns/op
                 apacheBeanutils·p0.9999: 477292,442 ns/op
                 apacheBeanutils·p1.00:   779264,000 ns/op

Iteration   4: 7597,207 ±(99.9%) 34,220 ns/op
                 apacheBeanutils·p0.00:   6696,000 ns/op
                 apacheBeanutils·p0.50:   7296,000 ns/op
                 apacheBeanutils·p0.90:   7696,000 ns/op
                 apacheBeanutils·p0.95:   8000,000 ns/op
                 apacheBeanutils·p0.99:   12096,000 ns/op
                 apacheBeanutils·p0.999:  41982,464 ns/op
                 apacheBeanutils·p0.9999: 199997,952 ns/op
                 apacheBeanutils·p1.00:   760832,000 ns/op

Iteration   5: 7637,645 ±(99.9%) 34,156 ns/op
                 apacheBeanutils·p0.00:   6696,000 ns/op
                 apacheBeanutils·p0.50:   7296,000 ns/op
                 apacheBeanutils·p0.90:   7696,000 ns/op
                 apacheBeanutils·p0.95:   8400,000 ns/op
                 apacheBeanutils·p0.99:   12288,000 ns/op
                 apacheBeanutils·p0.999:  43136,000 ns/op
                 apacheBeanutils·p0.9999: 441457,357 ns/op
                 apacheBeanutils·p1.00:   673792,000 ns/op


# Run progress: 71,11% complete, ETA 00:21:49
# Fork: 3 of 5
# Warmup Iteration   1: 8362,716 ±(99.9%) 368,674 ns/op
# Warmup Iteration   2: 8074,196 ±(99.9%) 42,583 ns/op
# Warmup Iteration   3: 8015,604 ±(99.9%) 38,753 ns/op
# Warmup Iteration   4: 8142,972 ±(99.9%) 41,249 ns/op
# Warmup Iteration   5: 8067,050 ±(99.9%) 43,449 ns/op
Iteration   1: 8046,098 ±(99.9%) 43,794 ns/op
                 apacheBeanutils·p0.00:   6792,000 ns/op
                 apacheBeanutils·p0.50:   7392,000 ns/op
                 apacheBeanutils·p0.90:   8288,000 ns/op
                 apacheBeanutils·p0.95:   11184,000 ns/op
                 apacheBeanutils·p0.99:   15696,000 ns/op
                 apacheBeanutils·p0.999:  63744,000 ns/op
                 apacheBeanutils·p0.9999: 552971,264 ns/op
                 apacheBeanutils·p1.00:   802816,000 ns/op

Iteration   2: 8049,526 ±(99.9%) 42,887 ns/op
                 apacheBeanutils·p0.00:   6696,000 ns/op
                 apacheBeanutils·p0.50:   7392,000 ns/op
                 apacheBeanutils·p0.90:   8288,000 ns/op
                 apacheBeanutils·p0.95:   11200,000 ns/op
                 apacheBeanutils·p0.99:   15792,000 ns/op
                 apacheBeanutils·p0.999:  64199,936 ns/op
                 apacheBeanutils·p0.9999: 501258,445 ns/op
                 apacheBeanutils·p1.00:   785408,000 ns/op

Iteration   3: 8061,798 ±(99.9%) 43,063 ns/op
                 apacheBeanutils·p0.00:   6792,000 ns/op
                 apacheBeanutils·p0.50:   7392,000 ns/op
                 apacheBeanutils·p0.90:   8592,000 ns/op
                 apacheBeanutils·p0.95:   11296,000 ns/op
                 apacheBeanutils·p0.99:   15888,000 ns/op
                 apacheBeanutils·p0.999:  62272,000 ns/op
                 apacheBeanutils·p0.9999: 527843,738 ns/op
                 apacheBeanutils·p1.00:   757760,000 ns/op

Iteration   4: 8054,996 ±(99.9%) 45,038 ns/op
                 apacheBeanutils·p0.00:   6696,000 ns/op
                 apacheBeanutils·p0.50:   7392,000 ns/op
                 apacheBeanutils·p0.90:   8288,000 ns/op
                 apacheBeanutils·p0.95:   11200,000 ns/op
                 apacheBeanutils·p0.99:   15696,000 ns/op
                 apacheBeanutils·p0.999:  63744,256 ns/op
                 apacheBeanutils·p0.9999: 561971,405 ns/op
                 apacheBeanutils·p1.00:   856064,000 ns/op

Iteration   5: 8042,924 ±(99.9%) 45,072 ns/op
                 apacheBeanutils·p0.00:   6696,000 ns/op
                 apacheBeanutils·p0.50:   7296,000 ns/op
                 apacheBeanutils·p0.90:   8592,000 ns/op
                 apacheBeanutils·p0.95:   11296,000 ns/op
                 apacheBeanutils·p0.99:   16384,000 ns/op
                 apacheBeanutils·p0.999:  63040,000 ns/op
                 apacheBeanutils·p0.9999: 527912,141 ns/op
                 apacheBeanutils·p1.00:   904192,000 ns/op


# Run progress: 73,33% complete, ETA 00:20:09
# Fork: 4 of 5
# Warmup Iteration   1: 8302,841 ±(99.9%) 352,140 ns/op
# Warmup Iteration   2: 8009,425 ±(99.9%) 44,545 ns/op
# Warmup Iteration   3: 7992,294 ±(99.9%) 42,582 ns/op
# Warmup Iteration   4: 8011,421 ±(99.9%) 44,513 ns/op
# Warmup Iteration   5: 8023,658 ±(99.9%) 44,599 ns/op
Iteration   1: 7739,029 ±(99.9%) 39,207 ns/op
                 apacheBeanutils·p0.00:   6696,000 ns/op
                 apacheBeanutils·p0.50:   7296,000 ns/op
                 apacheBeanutils·p0.90:   7696,000 ns/op
                 apacheBeanutils·p0.95:   10192,000 ns/op
                 apacheBeanutils·p0.99:   12592,000 ns/op
                 apacheBeanutils·p0.999:  54656,000 ns/op
                 apacheBeanutils·p0.9999: 349127,808 ns/op
                 apacheBeanutils·p1.00:   820224,000 ns/op

Iteration   2: 7370,540 ±(99.9%) 29,619 ns/op
                 apacheBeanutils·p0.00:   6696,000 ns/op
                 apacheBeanutils·p0.50:   7200,000 ns/op
                 apacheBeanutils·p0.90:   7600,000 ns/op
                 apacheBeanutils·p0.95:   7696,000 ns/op
                 apacheBeanutils·p0.99:   8992,000 ns/op
                 apacheBeanutils·p0.999:  12288,000 ns/op
                 apacheBeanutils·p0.9999: 65755,040 ns/op
                 apacheBeanutils·p1.00:   686080,000 ns/op

Iteration   3: 7410,646 ±(99.9%) 31,741 ns/op
                 apacheBeanutils·p0.00:   6792,000 ns/op
                 apacheBeanutils·p0.50:   7296,000 ns/op
                 apacheBeanutils·p0.90:   7600,000 ns/op
                 apacheBeanutils·p0.95:   7696,000 ns/op
                 apacheBeanutils·p0.99:   9088,000 ns/op
                 apacheBeanutils·p0.999:  12192,000 ns/op
                 apacheBeanutils·p0.9999: 156417,843 ns/op
                 apacheBeanutils·p1.00:   698368,000 ns/op

Iteration   4: 7382,955 ±(99.9%) 31,538 ns/op
                 apacheBeanutils·p0.00:   6696,000 ns/op
                 apacheBeanutils·p0.50:   7200,000 ns/op
                 apacheBeanutils·p0.90:   7600,000 ns/op
                 apacheBeanutils·p0.95:   7696,000 ns/op
                 apacheBeanutils·p0.99:   8992,000 ns/op
                 apacheBeanutils·p0.999:  12400,000 ns/op
                 apacheBeanutils·p0.9999: 55756,672 ns/op
                 apacheBeanutils·p1.00:   652288,000 ns/op

Iteration   5: 7370,522 ±(99.9%) 31,693 ns/op
                 apacheBeanutils·p0.00:   6696,000 ns/op
                 apacheBeanutils·p0.50:   7200,000 ns/op
                 apacheBeanutils·p0.90:   7600,000 ns/op
                 apacheBeanutils·p0.95:   7696,000 ns/op
                 apacheBeanutils·p0.99:   9046,720 ns/op
                 apacheBeanutils·p0.999:  12192,000 ns/op
                 apacheBeanutils·p0.9999: 462069,555 ns/op
                 apacheBeanutils·p1.00:   658432,000 ns/op


# Run progress: 75,56% complete, ETA 00:18:28
# Fork: 5 of 5
# Warmup Iteration   1: 8259,782 ±(99.9%) 349,968 ns/op
# Warmup Iteration   2: 7769,351 ±(99.9%) 28,955 ns/op
# Warmup Iteration   3: 7778,049 ±(99.9%) 28,365 ns/op
# Warmup Iteration   4: 7778,956 ±(99.9%) 28,299 ns/op
# Warmup Iteration   5: 7789,185 ±(99.9%) 28,182 ns/op
Iteration   1: 7780,006 ±(99.9%) 29,174 ns/op
                 apacheBeanutils·p0.00:   7000,000 ns/op
                 apacheBeanutils·p0.50:   7696,000 ns/op
                 apacheBeanutils·p0.90:   7896,000 ns/op
                 apacheBeanutils·p0.95:   8000,000 ns/op
                 apacheBeanutils·p0.99:   9296,000 ns/op
                 apacheBeanutils·p0.999:  12496,000 ns/op
                 apacheBeanutils·p0.9999: 421126,144 ns/op
                 apacheBeanutils·p1.00:   610304,000 ns/op

Iteration   2: 7788,453 ±(99.9%) 30,027 ns/op
                 apacheBeanutils·p0.00:   6992,000 ns/op
                 apacheBeanutils·p0.50:   7696,000 ns/op
                 apacheBeanutils·p0.90:   7896,000 ns/op
                 apacheBeanutils·p0.95:   8000,000 ns/op
                 apacheBeanutils·p0.99:   9392,000 ns/op
                 apacheBeanutils·p0.999:  11888,000 ns/op
                 apacheBeanutils·p0.9999: 439382,426 ns/op
                 apacheBeanutils·p1.00:   631808,000 ns/op

Iteration   3: 7804,944 ±(99.9%) 31,163 ns/op
                 apacheBeanutils·p0.00:   6992,000 ns/op
                 apacheBeanutils·p0.50:   7696,000 ns/op
                 apacheBeanutils·p0.90:   7992,000 ns/op
                 apacheBeanutils·p0.95:   8000,000 ns/op
                 apacheBeanutils·p0.99:   9392,000 ns/op
                 apacheBeanutils·p0.999:  12496,000 ns/op
                 apacheBeanutils·p0.9999: 399873,946 ns/op
                 apacheBeanutils·p1.00:   672768,000 ns/op

Iteration   4: 7774,097 ±(99.9%) 28,604 ns/op
                 apacheBeanutils·p0.00:   7096,000 ns/op
                 apacheBeanutils·p0.50:   7696,000 ns/op
                 apacheBeanutils·p0.90:   7896,000 ns/op
                 apacheBeanutils·p0.95:   8000,000 ns/op
                 apacheBeanutils·p0.99:   9392,000 ns/op
                 apacheBeanutils·p0.999:  12288,000 ns/op
                 apacheBeanutils·p0.9999: 360293,440 ns/op
                 apacheBeanutils·p1.00:   556032,000 ns/op

Iteration   5: 7850,560 ±(99.9%) 30,600 ns/op
                 apacheBeanutils·p0.00:   7192,000 ns/op
                 apacheBeanutils·p0.50:   7792,000 ns/op
                 apacheBeanutils·p0.90:   8000,000 ns/op
                 apacheBeanutils·p0.95:   8000,000 ns/op
                 apacheBeanutils·p0.99:   9392,000 ns/op
                 apacheBeanutils·p0.999:  12800,000 ns/op
                 apacheBeanutils·p0.9999: 457474,970 ns/op
                 apacheBeanutils·p1.00:   698368,000 ns/op



Result "org.example.Main.apacheBeanutils":
  N = 8108788
  mean =   7740,536 ±(99.9%) 6,873 ns/op

  Histogram, ns/op:
    [      0,000,  100000,000) = 8107755 
    [ 100000,000,  200000,000) = 197 
    [ 200000,000,  300000,000) = 7 
    [ 300000,000,  400000,000) = 2 
    [ 400000,000,  500000,000) = 204 
    [ 500000,000,  600000,000) = 403 
    [ 600000,000,  700000,000) = 175 
    [ 700000,000,  800000,000) = 37 
    [ 800000,000,  900000,000) = 7 

  Percentiles, ns/op:
      p(0,0000) =   6696,000 ns/op
     p(50,0000) =   7496,000 ns/op
     p(90,0000) =   7896,000 ns/op
     p(95,0000) =   8192,000 ns/op
     p(99,0000) =  12096,000 ns/op
     p(99,9000) =  40768,000 ns/op
     p(99,9900) = 435386,010 ns/op
     p(99,9990) = 668582,001 ns/op
     p(99,9999) = 801924,801 ns/op
    p(100,0000) = 904192,000 ns/op


# JMH version: 1.35
# VM version: JDK 18.0.2, OpenJDK 64-Bit Server VM, 18.0.2+9-61
# VM invoker: C:\java\open\jdk-18.0.2\bin\java.exe
# VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\lib\idea_rt.jar=65160:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.mapstruct

# Run progress: 77,78% complete, ETA 00:16:47
# Fork: 1 of 5
# Warmup Iteration   1: 115,047 ±(99.9%) 57,804 ns/op
# Warmup Iteration   2: 80,677 ±(99.9%) 0,772 ns/op
# Warmup Iteration   3: 84,911 ±(99.9%) 4,240 ns/op
# Warmup Iteration   4: 92,855 ±(99.9%) 10,837 ns/op
# Warmup Iteration   5: 83,533 ±(99.9%) 7,105 ns/op
Iteration   1: 80,432 ±(99.9%) 0,352 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 1952,310 ns/op
                 mapstruct·p1.00:   7000,000 ns/op

Iteration   2: 83,111 ±(99.9%) 5,677 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 3344,918 ns/op
                 mapstruct·p1.00:   500224,000 ns/op

Iteration   3: 84,577 ±(99.9%) 7,287 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 2397,982 ns/op
                 mapstruct·p1.00:   397312,000 ns/op

Iteration   4: 86,027 ±(99.9%) 8,484 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 2600,240 ns/op
                 mapstruct·p1.00:   393216,000 ns/op

Iteration   5: 86,772 ±(99.9%) 6,139 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 2483,810 ns/op
                 mapstruct·p1.00:   401408,000 ns/op


# Run progress: 80,00% complete, ETA 00:15:06
# Fork: 2 of 5
# Warmup Iteration   1: 116,528 ±(99.9%) 60,906 ns/op
# Warmup Iteration   2: 86,457 ±(99.9%) 8,813 ns/op
# Warmup Iteration   3: 86,579 ±(99.9%) 5,202 ns/op
# Warmup Iteration   4: 89,617 ±(99.9%) 7,688 ns/op
# Warmup Iteration   5: 87,014 ±(99.9%) 8,202 ns/op
Iteration   1: 84,309 ±(99.9%) 6,708 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 2536,174 ns/op
                 mapstruct·p1.00:   448512,000 ns/op

Iteration   2: 83,587 ±(99.9%) 6,284 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 2746,720 ns/op
                 mapstruct·p1.00:   560128,000 ns/op

Iteration   3: 83,116 ±(99.9%) 4,607 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 2192,767 ns/op
                 mapstruct·p1.00:   407040,000 ns/op

Iteration   4: 83,420 ±(99.9%) 5,188 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 3089,340 ns/op
                 mapstruct·p1.00:   458752,000 ns/op

Iteration   5: 88,736 ±(99.9%) 8,513 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 2404,096 ns/op
                 mapstruct·p1.00:   428032,000 ns/op


# Run progress: 82,22% complete, ETA 00:13:26
# Fork: 3 of 5
# Warmup Iteration   1: 116,519 ±(99.9%) 62,954 ns/op
# Warmup Iteration   2: 82,990 ±(99.9%) 6,606 ns/op
# Warmup Iteration   3: 84,767 ±(99.9%) 4,252 ns/op
# Warmup Iteration   4: 86,826 ±(99.9%) 5,975 ns/op
# Warmup Iteration   5: 82,951 ±(99.9%) 6,349 ns/op
Iteration   1: 80,741 ±(99.9%) 0,628 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 2534,930 ns/op
                 mapstruct·p1.00:   32192,000 ns/op

Iteration   2: 82,490 ±(99.9%) 5,602 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 2097,534 ns/op
                 mapstruct·p1.00:   502272,000 ns/op

Iteration   3: 81,026 ±(99.9%) 0,692 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 2038,600 ns/op
                 mapstruct·p1.00:   41088,000 ns/op

Iteration   4: 81,024 ±(99.9%) 0,888 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 2134,310 ns/op
                 mapstruct·p1.00:   52288,000 ns/op

Iteration   5: 87,129 ±(99.9%) 5,406 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 3125,190 ns/op
                 mapstruct·p1.00:   468480,000 ns/op


# Run progress: 84,44% complete, ETA 00:11:45
# Fork: 4 of 5
# Warmup Iteration   1: 117,385 ±(99.9%) 58,013 ns/op
# Warmup Iteration   2: 86,464 ±(99.9%) 9,787 ns/op
# Warmup Iteration   3: 82,673 ±(99.9%) 0,719 ns/op
# Warmup Iteration   4: 82,403 ±(99.9%) 3,799 ns/op
# Warmup Iteration   5: 83,258 ±(99.9%) 5,187 ns/op
Iteration   1: 83,024 ±(99.9%) 0,734 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 2843,790 ns/op
                 mapstruct·p1.00:   30880,000 ns/op

Iteration   2: 86,989 ±(99.9%) 7,800 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 3097,869 ns/op
                 mapstruct·p1.00:   457728,000 ns/op

Iteration   3: 89,173 ±(99.9%) 9,403 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 2943,238 ns/op
                 mapstruct·p1.00:   471040,000 ns/op

Iteration   4: 85,805 ±(99.9%) 6,138 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 3443,613 ns/op
                 mapstruct·p1.00:   400384,000 ns/op

Iteration   5: 84,262 ±(99.9%) 4,516 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 2446,099 ns/op
                 mapstruct·p1.00:   401408,000 ns/op


# Run progress: 86,67% complete, ETA 00:10:04
# Fork: 5 of 5
# Warmup Iteration   1: 122,374 ±(99.9%) 64,559 ns/op
# Warmup Iteration   2: 86,133 ±(99.9%) 4,733 ns/op
# Warmup Iteration   3: 84,363 ±(99.9%) 4,581 ns/op
# Warmup Iteration   4: 81,567 ±(99.9%) 4,474 ns/op
# Warmup Iteration   5: 91,119 ±(99.9%) 10,447 ns/op
Iteration   1: 87,132 ±(99.9%) 6,119 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 2976,387 ns/op
                 mapstruct·p1.00:   369664,000 ns/op

Iteration   2: 88,299 ±(99.9%) 7,903 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 2058,560 ns/op
                 mapstruct·p1.00:   416768,000 ns/op

Iteration   3: 86,765 ±(99.9%) 5,809 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 2081,270 ns/op
                 mapstruct·p1.00:   442368,000 ns/op

Iteration   4: 87,570 ±(99.9%) 7,068 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 2976,430 ns/op
                 mapstruct·p1.00:   461312,000 ns/op

Iteration   5: 83,268 ±(99.9%) 0,326 ns/op
                 mapstruct·p0.00:   ≈ 0 ns/op
                 mapstruct·p0.50:   100,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   100,000 ns/op
                 mapstruct·p0.99:   100,000 ns/op
                 mapstruct·p0.999:  200,000 ns/op
                 mapstruct·p0.9999: 1843,649 ns/op
                 mapstruct·p1.00:   6400,000 ns/op



Result "org.example.Main.mapstruct":
  N = 7323893
  mean =     84,727 ±(99.9%) 1,166 ns/op

  Histogram, ns/op:
    [     0,000,  50000,000) = 7323848 
    [ 50000,000, 100000,000) = 4 
    [100000,000, 150000,000) = 1 
    [150000,000, 200000,000) = 0 
    [200000,000, 250000,000) = 1 
    [250000,000, 300000,000) = 0 
    [300000,000, 350000,000) = 1 
    [350000,000, 400000,000) = 20 
    [400000,000, 450000,000) = 10 
    [450000,000, 500000,000) = 5 
    [500000,000, 550000,000) = 2 

  Percentiles, ns/op:
      p(0,0000) =        ≈ 0 ns/op
     p(50,0000) =    100,000 ns/op
     p(90,0000) =    100,000 ns/op
     p(95,0000) =    100,000 ns/op
     p(99,0000) =    100,000 ns/op
     p(99,9000) =    200,000 ns/op
     p(99,9900) =   2558,618 ns/op
     p(99,9990) =  30761,062 ns/op
     p(99,9999) = 458420,333 ns/op
    p(100,0000) = 560128,000 ns/op


# JMH version: 1.35
# VM version: JDK 18.0.2, OpenJDK 64-Bit Server VM, 18.0.2+9-61
# VM invoker: C:\java\open\jdk-18.0.2\bin\java.exe
# VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\lib\idea_rt.jar=65160:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.springBeanutils

# Run progress: 88,89% complete, ETA 00:08:23
# Fork: 1 of 5
# Warmup Iteration   1: 2633,785 ±(99.9%) 444,099 ns/op
# Warmup Iteration   2: 2427,144 ±(99.9%) 25,912 ns/op
# Warmup Iteration   3: 2417,033 ±(99.9%) 23,380 ns/op
# Warmup Iteration   4: 2418,931 ±(99.9%) 24,839 ns/op
# Warmup Iteration   5: 2430,190 ±(99.9%) 26,381 ns/op
Iteration   1: 2423,798 ±(99.9%) 24,227 ns/op
                 springBeanutils·p0.00:   2196,000 ns/op
                 springBeanutils·p0.50:   2396,000 ns/op
                 springBeanutils·p0.90:   2500,000 ns/op
                 springBeanutils·p0.95:   2596,000 ns/op
                 springBeanutils·p0.99:   3000,000 ns/op
                 springBeanutils·p0.999:  4800,000 ns/op
                 springBeanutils·p0.9999: 40235,104 ns/op
                 springBeanutils·p1.00:   523776,000 ns/op

Iteration   2: 2426,104 ±(99.9%) 25,055 ns/op
                 springBeanutils·p0.00:   2196,000 ns/op
                 springBeanutils·p0.50:   2400,000 ns/op
                 springBeanutils·p0.90:   2500,000 ns/op
                 springBeanutils·p0.95:   2600,000 ns/op
                 springBeanutils·p0.99:   3096,000 ns/op
                 springBeanutils·p0.999:  4797,392 ns/op
                 springBeanutils·p0.9999: 30995,622 ns/op
                 springBeanutils·p1.00:   566272,000 ns/op

Iteration   3: 2441,586 ±(99.9%) 29,360 ns/op
                 springBeanutils·p0.00:   2196,000 ns/op
                 springBeanutils·p0.50:   2400,000 ns/op
                 springBeanutils·p0.90:   2500,000 ns/op
                 springBeanutils·p0.95:   2600,000 ns/op
                 springBeanutils·p0.99:   3100,000 ns/op
                 springBeanutils·p0.999:  5000,000 ns/op
                 springBeanutils·p0.9999: 39719,194 ns/op
                 springBeanutils·p1.00:   602112,000 ns/op

Iteration   4: 2456,374 ±(99.9%) 29,836 ns/op
                 springBeanutils·p0.00:   2196,000 ns/op
                 springBeanutils·p0.50:   2300,000 ns/op
                 springBeanutils·p0.90:   2500,000 ns/op
                 springBeanutils·p0.95:   2700,000 ns/op
                 springBeanutils·p0.99:   3600,000 ns/op
                 springBeanutils·p0.999:  5696,000 ns/op
                 springBeanutils·p0.9999: 95016,128 ns/op
                 springBeanutils·p1.00:   584704,000 ns/op

Iteration   5: 2515,356 ±(99.9%) 30,839 ns/op
                 springBeanutils·p0.00:   2100,000 ns/op
                 springBeanutils·p0.50:   2400,000 ns/op
                 springBeanutils·p0.90:   2696,000 ns/op
                 springBeanutils·p0.95:   3200,000 ns/op
                 springBeanutils·p0.99:   3700,000 ns/op
                 springBeanutils·p0.999:  5696,000 ns/op
                 springBeanutils·p0.9999: 48075,283 ns/op
                 springBeanutils·p1.00:   610304,000 ns/op


# Run progress: 91,11% complete, ETA 00:06:43
# Fork: 2 of 5
# Warmup Iteration   1: 2798,805 ±(99.9%) 471,370 ns/op
# Warmup Iteration   2: 2519,707 ±(99.9%) 33,112 ns/op
# Warmup Iteration   3: 2434,211 ±(99.9%) 24,958 ns/op
# Warmup Iteration   4: 2431,411 ±(99.9%) 24,424 ns/op
# Warmup Iteration   5: 2548,702 ±(99.9%) 27,629 ns/op
Iteration   1: 2446,339 ±(99.9%) 27,202 ns/op
                 springBeanutils·p0.00:   2196,000 ns/op
                 springBeanutils·p0.50:   2400,000 ns/op
                 springBeanutils·p0.90:   2500,000 ns/op
                 springBeanutils·p0.95:   2600,000 ns/op
                 springBeanutils·p0.99:   3400,000 ns/op
                 springBeanutils·p0.999:  4996,904 ns/op
                 springBeanutils·p0.9999: 83952,346 ns/op
                 springBeanutils·p1.00:   656384,000 ns/op

Iteration   2: 2447,098 ±(99.9%) 29,139 ns/op
                 springBeanutils·p0.00:   2196,000 ns/op
                 springBeanutils·p0.50:   2400,000 ns/op
                 springBeanutils·p0.90:   2500,000 ns/op
                 springBeanutils·p0.95:   2600,000 ns/op
                 springBeanutils·p0.99:   3300,000 ns/op
                 springBeanutils·p0.999:  5200,000 ns/op
                 springBeanutils·p0.9999: 57122,022 ns/op
                 springBeanutils·p1.00:   620544,000 ns/op

Iteration   3: 2417,640 ±(99.9%) 26,404 ns/op
                 springBeanutils·p0.00:   2196,000 ns/op
                 springBeanutils·p0.50:   2396,000 ns/op
                 springBeanutils·p0.90:   2496,000 ns/op
                 springBeanutils·p0.95:   2500,000 ns/op
                 springBeanutils·p0.99:   2900,000 ns/op
                 springBeanutils·p0.999:  4696,000 ns/op
                 springBeanutils·p0.9999: 18537,830 ns/op
                 springBeanutils·p1.00:   619520,000 ns/op

Iteration   4: 2435,452 ±(99.9%) 27,994 ns/op
                 springBeanutils·p0.00:   2196,000 ns/op
                 springBeanutils·p0.50:   2400,000 ns/op
                 springBeanutils·p0.90:   2500,000 ns/op
                 springBeanutils·p0.95:   2596,000 ns/op
                 springBeanutils·p0.99:   3100,000 ns/op
                 springBeanutils·p0.999:  4800,000 ns/op
                 springBeanutils·p0.9999: 25199,136 ns/op
                 springBeanutils·p1.00:   632832,000 ns/op

Iteration   5: 2433,712 ±(99.9%) 26,924 ns/op
                 springBeanutils·p0.00:   2196,000 ns/op
                 springBeanutils·p0.50:   2400,000 ns/op
                 springBeanutils·p0.90:   2500,000 ns/op
                 springBeanutils·p0.95:   2596,000 ns/op
                 springBeanutils·p0.99:   3200,000 ns/op
                 springBeanutils·p0.999:  4800,000 ns/op
                 springBeanutils·p0.9999: 30670,269 ns/op
                 springBeanutils·p1.00:   602112,000 ns/op


# Run progress: 93,33% complete, ETA 00:05:02
# Fork: 3 of 5
# Warmup Iteration   1: 2663,216 ±(99.9%) 469,453 ns/op
# Warmup Iteration   2: 2434,418 ±(99.9%) 30,945 ns/op
# Warmup Iteration   3: 2437,741 ±(99.9%) 27,155 ns/op
# Warmup Iteration   4: 2425,528 ±(99.9%) 26,261 ns/op
# Warmup Iteration   5: 2421,530 ±(99.9%) 27,244 ns/op
Iteration   1: 2430,806 ±(99.9%) 28,719 ns/op
                 springBeanutils·p0.00:   2100,000 ns/op
                 springBeanutils·p0.50:   2300,000 ns/op
                 springBeanutils·p0.90:   2496,000 ns/op
                 springBeanutils·p0.95:   2596,000 ns/op
                 springBeanutils·p0.99:   3496,000 ns/op
                 springBeanutils·p0.999:  5896,000 ns/op
                 springBeanutils·p0.9999: 91720,448 ns/op
                 springBeanutils·p1.00:   585728,000 ns/op

Iteration   2: 2430,541 ±(99.9%) 30,911 ns/op
                 springBeanutils·p0.00:   2100,000 ns/op
                 springBeanutils·p0.50:   2300,000 ns/op
                 springBeanutils·p0.90:   2496,000 ns/op
                 springBeanutils·p0.95:   2596,000 ns/op
                 springBeanutils·p0.99:   3400,000 ns/op
                 springBeanutils·p0.999:  5592,000 ns/op
                 springBeanutils·p0.9999: 82585,882 ns/op
                 springBeanutils·p1.00:   719872,000 ns/op

Iteration   3: 2429,273 ±(99.9%) 30,998 ns/op
                 springBeanutils·p0.00:   2100,000 ns/op
                 springBeanutils·p0.50:   2300,000 ns/op
                 springBeanutils·p0.90:   2400,000 ns/op
                 springBeanutils·p0.95:   2500,000 ns/op
                 springBeanutils·p0.99:   3200,000 ns/op
                 springBeanutils·p0.999:  5476,800 ns/op
                 springBeanutils·p0.9999: 94141,440 ns/op
                 springBeanutils·p1.00:   659456,000 ns/op

Iteration   4: 2431,076 ±(99.9%) 29,178 ns/op
                 springBeanutils·p0.00:   2100,000 ns/op
                 springBeanutils·p0.50:   2300,000 ns/op
                 springBeanutils·p0.90:   2400,000 ns/op
                 springBeanutils·p0.95:   2500,000 ns/op
                 springBeanutils·p0.99:   3300,000 ns/op
                 springBeanutils·p0.999:  6400,000 ns/op
                 springBeanutils·p0.9999: 84982,720 ns/op
                 springBeanutils·p1.00:   665600,000 ns/op

Iteration   5: 2405,416 ±(99.9%) 24,716 ns/op
                 springBeanutils·p0.00:   2196,000 ns/op
                 springBeanutils·p0.50:   2300,000 ns/op
                 springBeanutils·p0.90:   2400,000 ns/op
                 springBeanutils·p0.95:   2500,000 ns/op
                 springBeanutils·p0.99:   3000,000 ns/op
                 springBeanutils·p0.999:  4896,000 ns/op
                 springBeanutils·p0.9999: 33232,006 ns/op
                 springBeanutils·p1.00:   624640,000 ns/op


# Run progress: 95,56% complete, ETA 00:03:21
# Fork: 4 of 5
# Warmup Iteration   1: 2728,753 ±(99.9%) 533,758 ns/op
# Warmup Iteration   2: 2466,867 ±(99.9%) 29,630 ns/op
# Warmup Iteration   3: 2470,533 ±(99.9%) 31,662 ns/op
# Warmup Iteration   4: 2457,311 ±(99.9%) 29,179 ns/op
# Warmup Iteration   5: 2456,382 ±(99.9%) 27,562 ns/op
Iteration   1: 2455,577 ±(99.9%) 29,511 ns/op
                 springBeanutils·p0.00:   2196,000 ns/op
                 springBeanutils·p0.50:   2400,000 ns/op
                 springBeanutils·p0.90:   2500,000 ns/op
                 springBeanutils·p0.95:   2600,000 ns/op
                 springBeanutils·p0.99:   3196,000 ns/op
                 springBeanutils·p0.999:  5400,000 ns/op
                 springBeanutils·p0.9999: 112904,243 ns/op
                 springBeanutils·p1.00:   649216,000 ns/op

Iteration   2: 2497,564 ±(99.9%) 33,084 ns/op
                 springBeanutils·p0.00:   2100,000 ns/op
                 springBeanutils·p0.50:   2400,000 ns/op
                 springBeanutils·p0.90:   2500,000 ns/op
                 springBeanutils·p0.95:   2700,000 ns/op
                 springBeanutils·p0.99:   3700,000 ns/op
                 springBeanutils·p0.999:  6600,000 ns/op
                 springBeanutils·p0.9999: 110925,056 ns/op
                 springBeanutils·p1.00:   615424,000 ns/op

Iteration   3: 2486,244 ±(99.9%) 30,770 ns/op
                 springBeanutils·p0.00:   2196,000 ns/op
                 springBeanutils·p0.50:   2400,000 ns/op
                 springBeanutils·p0.90:   2500,000 ns/op
                 springBeanutils·p0.95:   2696,000 ns/op
                 springBeanutils·p0.99:   3600,000 ns/op
                 springBeanutils·p0.999:  6193,840 ns/op
                 springBeanutils·p0.9999: 75775,360 ns/op
                 springBeanutils·p1.00:   658432,000 ns/op

Iteration   4: 2690,491 ±(99.9%) 32,966 ns/op
                 springBeanutils·p0.00:   2196,000 ns/op
                 springBeanutils·p0.50:   2400,000 ns/op
                 springBeanutils·p0.90:   3500,000 ns/op
                 springBeanutils·p0.95:   3700,000 ns/op
                 springBeanutils·p0.99:   4200,000 ns/op
                 springBeanutils·p0.999:  13296,000 ns/op
                 springBeanutils·p0.9999: 103594,611 ns/op
                 springBeanutils·p1.00:   707584,000 ns/op

Iteration   5: 2643,202 ±(99.9%) 33,070 ns/op
                 springBeanutils·p0.00:   2196,000 ns/op
                 springBeanutils·p0.50:   2400,000 ns/op
                 springBeanutils·p0.90:   3100,000 ns/op
                 springBeanutils·p0.95:   3500,000 ns/op
                 springBeanutils·p0.99:   4096,000 ns/op
                 springBeanutils·p0.999:  10124,512 ns/op
                 springBeanutils·p0.9999: 181766,272 ns/op
                 springBeanutils·p1.00:   626688,000 ns/op


# Run progress: 97,78% complete, ETA 00:01:40
# Fork: 5 of 5
# Warmup Iteration   1: 2812,408 ±(99.9%) 474,780 ns/op
# Warmup Iteration   2: 2607,256 ±(99.9%) 54,401 ns/op
# Warmup Iteration   3: 2460,431 ±(99.9%) 31,583 ns/op
# Warmup Iteration   4: 2434,338 ±(99.9%) 28,666 ns/op
# Warmup Iteration   5: 2471,391 ±(99.9%) 27,442 ns/op
Iteration   1: 2442,556 ±(99.9%) 27,197 ns/op
                 springBeanutils·p0.00:   2196,000 ns/op
                 springBeanutils·p0.50:   2396,000 ns/op
                 springBeanutils·p0.90:   2496,000 ns/op
                 springBeanutils·p0.95:   2500,000 ns/op
                 springBeanutils·p0.99:   3200,000 ns/op
                 springBeanutils·p0.999:  6496,000 ns/op
                 springBeanutils·p0.9999: 71558,771 ns/op
                 springBeanutils·p1.00:   667648,000 ns/op

Iteration   2: 2461,367 ±(99.9%) 27,675 ns/op
                 springBeanutils·p0.00:   2196,000 ns/op
                 springBeanutils·p0.50:   2400,000 ns/op
                 springBeanutils·p0.90:   2500,000 ns/op
                 springBeanutils·p0.95:   2600,000 ns/op
                 springBeanutils·p0.99:   3696,000 ns/op
                 springBeanutils·p0.999:  5800,000 ns/op
                 springBeanutils·p0.9999: 66942,426 ns/op
                 springBeanutils·p1.00:   673792,000 ns/op

Iteration   3: 2448,667 ±(99.9%) 32,006 ns/op
                 springBeanutils·p0.00:   2196,000 ns/op
                 springBeanutils·p0.50:   2400,000 ns/op
                 springBeanutils·p0.90:   2500,000 ns/op
                 springBeanutils·p0.95:   2600,000 ns/op
                 springBeanutils·p0.99:   3396,000 ns/op
                 springBeanutils·p0.999:  5200,000 ns/op
                 springBeanutils·p0.9999: 84702,464 ns/op
                 springBeanutils·p1.00:   666624,000 ns/op

Iteration   4: 2432,672 ±(99.9%) 26,290 ns/op
                 springBeanutils·p0.00:   2196,000 ns/op
                 springBeanutils·p0.50:   2396,000 ns/op
                 springBeanutils·p0.90:   2500,000 ns/op
                 springBeanutils·p0.95:   2596,000 ns/op
                 springBeanutils·p0.99:   3300,000 ns/op
                 springBeanutils·p0.999:  5800,000 ns/op
                 springBeanutils·p0.9999: 82127,539 ns/op
                 springBeanutils·p1.00:   624640,000 ns/op

Iteration   5: 2451,794 ±(99.9%) 29,546 ns/op
                 springBeanutils·p0.00:   2100,000 ns/op
                 springBeanutils·p0.50:   2396,000 ns/op
                 springBeanutils·p0.90:   2500,000 ns/op
                 springBeanutils·p0.95:   2600,000 ns/op
                 springBeanutils·p0.99:   3600,000 ns/op
                 springBeanutils·p0.999:  5592,000 ns/op
                 springBeanutils·p0.9999: 75741,440 ns/op
                 springBeanutils·p1.00:   730112,000 ns/op



Result "org.example.Main.springBeanutils":
  N = 6472692
  mean =   2461,685 ±(99.9%) 5,798 ns/op

  Histogram, ns/op:
    [     0,000,  50000,000) = 6471851 
    [ 50000,000, 100000,000) = 280 
    [100000,000, 150000,000) = 62 
    [150000,000, 200000,000) = 7 
    [200000,000, 250000,000) = 3 
    [250000,000, 300000,000) = 3 
    [300000,000, 350000,000) = 0 
    [350000,000, 400000,000) = 13 
    [400000,000, 450000,000) = 77 
    [450000,000, 500000,000) = 156 
    [500000,000, 550000,000) = 121 
    [550000,000, 600000,000) = 79 
    [600000,000, 650000,000) = 27 
    [650000,000, 700000,000) = 10 
    [700000,000, 750000,000) = 3 

  Percentiles, ns/op:
      p(0,0000) =   2100,000 ns/op
     p(50,0000) =   2400,000 ns/op
     p(90,0000) =   2500,000 ns/op
     p(95,0000) =   2600,000 ns/op
     p(99,0000) =   3700,000 ns/op
     p(99,9000) =   5896,000 ns/op
     p(99,9900) =  78488,589 ns/op
     p(99,9990) = 580143,247 ns/op
     p(99,9999) = 671855,849 ns/op
    p(100,0000) = 730112,000 ns/op


# JMH version: 1.35
# VM version: JDK 18.0.2, OpenJDK 64-Bit Server VM, 18.0.2+9-61
# VM invoker: C:\java\open\jdk-18.0.2\bin\java.exe
# VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\lib\idea_rt.jar=65160:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 1 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.apacheBeanutils

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 5
Iteration   1: 32279600,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 5
Iteration   1: 32601500,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 3 of 5
Iteration   1: 32971999,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 4 of 5
Iteration   1: 33108601,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 5 of 5
Iteration   1: 32220299,000 ns/op


Result "org.example.Main.apacheBeanutils":
  N = 5
  mean = 32636399,800 ±(99.9%) 1536962,668 ns/op

  Histogram, ns/op:
    [32200000,000, 32300000,000) = 2 
    [32300000,000, 32400000,000) = 0 
    [32400000,000, 32500000,000) = 0 
    [32500000,000, 32600000,000) = 0 
    [32600000,000, 32700000,000) = 1 
    [32700000,000, 32800000,000) = 0 
    [32800000,000, 32900000,000) = 0 
    [32900000,000, 33000000,000) = 1 
    [33000000,000, 33100000,000) = 0 

  Percentiles, ns/op:
      p(0,0000) = 32220299,000 ns/op
     p(50,0000) = 32601500,000 ns/op
     p(90,0000) = 33108601,000 ns/op
     p(95,0000) = 33108601,000 ns/op
     p(99,0000) = 33108601,000 ns/op
     p(99,9000) = 33108601,000 ns/op
     p(99,9900) = 33108601,000 ns/op
     p(99,9990) = 33108601,000 ns/op
     p(99,9999) = 33108601,000 ns/op
    p(100,0000) = 33108601,000 ns/op


# JMH version: 1.35
# VM version: JDK 18.0.2, OpenJDK 64-Bit Server VM, 18.0.2+9-61
# VM invoker: C:\java\open\jdk-18.0.2\bin\java.exe
# VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\lib\idea_rt.jar=65160:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 1 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.mapstruct

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 5
Iteration   1: 4329100,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 5
Iteration   1: 4392200,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 3 of 5
Iteration   1: 4327600,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 4 of 5
Iteration   1: 4450500,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 5 of 5
Iteration   1: 4319300,000 ns/op


Result "org.example.Main.mapstruct":
  N = 5
  mean = 4363740,000 ±(99.9%) 217980,222 ns/op

  Histogram, ns/op:
    [4300000,000, 4312500,000) = 0 
    [4312500,000, 4325000,000) = 1 
    [4325000,000, 4337500,000) = 2 
    [4337500,000, 4350000,000) = 0 
    [4350000,000, 4362500,000) = 0 
    [4362500,000, 4375000,000) = 0 
    [4375000,000, 4387500,000) = 0 
    [4387500,000, 4400000,000) = 1 
    [4400000,000, 4412500,000) = 0 
    [4412500,000, 4425000,000) = 0 
    [4425000,000, 4437500,000) = 0 
    [4437500,000, 4450000,000) = 0 
    [4450000,000, 4462500,000) = 1 
    [4462500,000, 4475000,000) = 0 
    [4475000,000, 4487500,000) = 0 

  Percentiles, ns/op:
      p(0,0000) = 4319300,000 ns/op
     p(50,0000) = 4329100,000 ns/op
     p(90,0000) = 4450500,000 ns/op
     p(95,0000) = 4450500,000 ns/op
     p(99,0000) = 4450500,000 ns/op
     p(99,9000) = 4450500,000 ns/op
     p(99,9900) = 4450500,000 ns/op
     p(99,9990) = 4450500,000 ns/op
     p(99,9999) = 4450500,000 ns/op
    p(100,0000) = 4450500,000 ns/op


# JMH version: 1.35
# VM version: JDK 18.0.2, OpenJDK 64-Bit Server VM, 18.0.2+9-61
# VM invoker: C:\java\open\jdk-18.0.2\bin\java.exe
# VM options: -javaagent:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\lib\idea_rt.jar=65160:C:\Program Files\JetBrains\IntelliJ IDEA 2022.3.2\bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 1 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.springBeanutils

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 5
Iteration   1: 37229299,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 2 of 5
Iteration   1: 35876201,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 3 of 5
Iteration   1: 38411600,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 4 of 5
Iteration   1: 36746699,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 5 of 5
Iteration   1: 36497800,000 ns/op


Result "org.example.Main.springBeanutils":
  N = 5
  mean = 36952319,800 ±(99.9%) 3659690,162 ns/op

  Histogram, ns/op:
    [35000000,000, 35250000,000) = 0 
    [35250000,000, 35500000,000) = 0 
    [35500000,000, 35750000,000) = 0 
    [35750000,000, 36000000,000) = 1 
    [36000000,000, 36250000,000) = 0 
    [36250000,000, 36500000,000) = 1 
    [36500000,000, 36750000,000) = 1 
    [36750000,000, 37000000,000) = 0 
    [37000000,000, 37250000,000) = 1 
    [37250000,000, 37500000,000) = 0 
    [37500000,000, 37750000,000) = 0 
    [37750000,000, 38000000,000) = 0 
    [38000000,000, 38250000,000) = 0 
    [38250000,000, 38500000,000) = 1 
    [38500000,000, 38750000,000) = 0 

  Percentiles, ns/op:
      p(0,0000) = 35876201,000 ns/op
     p(50,0000) = 36746699,000 ns/op
     p(90,0000) = 38411600,000 ns/op
     p(95,0000) = 38411600,000 ns/op
     p(99,0000) = 38411600,000 ns/op
     p(99,9000) = 38411600,000 ns/op
     p(99,9900) = 38411600,000 ns/op
     p(99,9990) = 38411600,000 ns/op
     p(99,9999) = 38411600,000 ns/op
    p(100,0000) = 38411600,000 ns/op


# Run complete. Total time: 01:15:39

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

NOTE: Current JVM experimentally supports Compiler Blackholes, and they are in use. Please exercise
extra caution when trusting the results, look into the generated code to check the benchmark still
works, and factor in a small probability of new VM bugs. Additionally, while comparisons between
different JVMs are already problematic, the performance difference caused by different Blackhole
modes can be very significant. Please make sure you use the consistent Blackhole mode for comparisons.

Benchmark                                       Mode      Cnt         Score         Error   Units
Main.apacheBeanutils                           thrpt       25        ≈ 10⁻⁴                ops/ns
Main.springBeanutils                           thrpt       25        ≈ 10⁻³                ops/ns
Main.mapstruct                                 thrpt       25         0,014 ±       0,001  ops/ns

Main.apacheBeanutils                            avgt       25      7747,547 ±     127,691   ns/op
Main.springBeanutils                            avgt       25      2421,689 ±      34,245   ns/op
Main.mapstruct                                  avgt       25        66,997 ±       1,237   ns/op

Main.apacheBeanutils                          sample  8108788      7740,536 ±       6,873   ns/op
Main.apacheBeanutils:apacheBeanutils·p0.00    sample               6696,000                 ns/op
Main.apacheBeanutils:apacheBeanutils·p0.50    sample               7496,000                 ns/op
Main.apacheBeanutils:apacheBeanutils·p0.90    sample               7896,000                 ns/op
Main.apacheBeanutils:apacheBeanutils·p0.95    sample               8192,000                 ns/op
Main.apacheBeanutils:apacheBeanutils·p0.99    sample              12096,000                 ns/op
Main.apacheBeanutils:apacheBeanutils·p0.999   sample              40768,000                 ns/op
Main.apacheBeanutils:apacheBeanutils·p0.9999  sample             435386,010                 ns/op
Main.apacheBeanutils:apacheBeanutils·p1.00    sample             904192,000                 ns/op
Main.springBeanutils                          sample  6472692      2461,685 ±       5,798   ns/op
Main.springBeanutils:springBeanutils·p0.00    sample               2100,000                 ns/op
Main.springBeanutils:springBeanutils·p0.50    sample               2400,000                 ns/op
Main.springBeanutils:springBeanutils·p0.90    sample               2500,000                 ns/op
Main.springBeanutils:springBeanutils·p0.95    sample               2600,000                 ns/op
Main.springBeanutils:springBeanutils·p0.99    sample               3700,000                 ns/op
Main.springBeanutils:springBeanutils·p0.999   sample               5896,000                 ns/op
Main.springBeanutils:springBeanutils·p0.9999  sample              78488,589                 ns/op
Main.springBeanutils:springBeanutils·p1.00    sample             730112,000                 ns/op
Main.mapstruct                                sample  7323893        84,727 ±       1,166   ns/op
Main.mapstruct:mapstruct·p0.00                sample                    ≈ 0                 ns/op
Main.mapstruct:mapstruct·p0.50                sample                100,000                 ns/op
Main.mapstruct:mapstruct·p0.90                sample                100,000                 ns/op
Main.mapstruct:mapstruct·p0.95                sample                100,000                 ns/op
Main.mapstruct:mapstruct·p0.99                sample                100,000                 ns/op
Main.mapstruct:mapstruct·p0.999               sample                200,000                 ns/op
Main.mapstruct:mapstruct·p0.9999              sample               2558,618                 ns/op
Main.mapstruct:mapstruct·p1.00                sample             560128,000                 ns/op

Main.apacheBeanutils                              ss        5  32636399,800 ± 1536962,668   ns/op
Main.springBeanutils                              ss        5  36952319,800 ± 3659690,162   ns/op
Main.mapstruct                                    ss        5   4363740,000 ±  217980,222   ns/op

Process finished with exit code 0
```
