# modelmapper-mapstruct-beanutils-benchmark

This project gives a rough idea of the performance of approaches to transform the same DTO
* Apache BeanUtils
* Springframework BeanUtils
* ModelMapper
* mapstruct

~Spoiler: mapstruct fastest approach -> modelMapper -> apache-beanutils -> spring-beanutils.~

You can customize measurements to suit your needs. Below is the output of the measurement result of the current project
```
/usr/lib/jvm/jdk-20/bin/java -javaagent:/home/hwak/snap/idea/idea-IU-232.8660.185/lib/idea_rt.jar=38647:/home/hwak/snap/idea/idea-IU-232.8660.185/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /home/hwak/Документы/experimental/mapstruct-beanutils-benchmark/target/classes:/home/hwak/.m2/repository/org/mapstruct/mapstruct/1.5.2.Final/mapstruct-1.5.2.Final.jar:/home/hwak/.m2/repository/org/mapstruct/mapstruct-processor/1.5.2.Final/mapstruct-processor-1.5.2.Final.jar:/home/hwak/.m2/repository/commons-beanutils/commons-beanutils/1.9.4/commons-beanutils-1.9.4.jar:/home/hwak/.m2/repository/commons-logging/commons-logging/1.2/commons-logging-1.2.jar:/home/hwak/.m2/repository/commons-collections/commons-collections/3.2.2/commons-collections-3.2.2.jar:/home/hwak/.m2/repository/org/modelmapper/modelmapper/3.2.0/modelmapper-3.2.0.jar:/home/hwak/.m2/repository/org/springframework/spring-beans/6.0.8/spring-beans-6.0.8.jar:/home/hwak/.m2/repository/org/springframework/spring-core/6.0.8/spring-core-6.0.8.jar:/home/hwak/.m2/repository/org/springframework/spring-jcl/6.0.8/spring-jcl-6.0.8.jar:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-core/1.35/jmh-core-1.35.jar:/home/hwak/.m2/repository/net/sf/jopt-simple/jopt-simple/5.0.4/jopt-simple-5.0.4.jar:/home/hwak/.m2/repository/org/apache/commons/commons-math3/3.2/commons-math3-3.2.jar:/home/hwak/.m2/repository/org/openjdk/jmh/jmh-generator-annprocess/1.35/jmh-generator-annprocess-1.35.jar org.example.Main
# JMH version: 1.35
# VM version: JDK 20.0.2, Java HotSpot(TM) 64-Bit Server VM, 20.0.2+9-78
# VM invoker: /usr/lib/jvm/jdk-20/bin/java
# VM options: -javaagent:/home/hwak/snap/idea/idea-IU-232.8660.185/lib/idea_rt.jar=38647:/home/hwak/snap/idea/idea-IU-232.8660.185/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.example.Main.apacheBeanutils

# Run progress: 0,00% complete, ETA 00:40:00
# Warmup Fork: 1 of 1
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

# Run progress: 4,17% complete, ETA 00:38:31
# Fork: 1 of 1
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
# VM version: JDK 20.0.2, Java HotSpot(TM) 64-Bit Server VM, 20.0.2+9-78
# VM invoker: /usr/lib/jvm/jdk-20/bin/java
# VM options: -javaagent:/home/hwak/snap/idea/idea-IU-232.8660.185/lib/idea_rt.jar=38647:/home/hwak/snap/idea/idea-IU-232.8660.185/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.example.Main.mapstruct

# Run progress: 8,33% complete, ETA 00:36:50
# Warmup Fork: 1 of 1
# Warmup Iteration   1: 0,013 ops/ns
# Warmup Iteration   2: 0,013 ops/ns
# Warmup Iteration   3: 0,013 ops/ns
# Warmup Iteration   4: 0,013 ops/ns
# Warmup Iteration   5: 0,013 ops/ns
Iteration   1: 0,013 ops/ns
Iteration   2: 0,013 ops/ns
Iteration   3: 0,013 ops/ns
Iteration   4: 0,013 ops/ns
Iteration   5: 0,013 ops/ns

# Run progress: 12,50% complete, ETA 00:35:10
# Fork: 1 of 1
# Warmup Iteration   1: 0,013 ops/ns
# Warmup Iteration   2: 0,013 ops/ns
# Warmup Iteration   3: 0,013 ops/ns
# Warmup Iteration   4: 0,013 ops/ns
# Warmup Iteration   5: 0,013 ops/ns
Iteration   1: 0,013 ops/ns
Iteration   2: 0,013 ops/ns
Iteration   3: 0,013 ops/ns
Iteration   4: 0,013 ops/ns
Iteration   5: 0,013 ops/ns


Result "org.example.Main.mapstruct":
  0,013 ±(99.9%) 0,001 ops/ns [Average]
  (min, avg, max) = (0,013, 0,013, 0,013), stdev = 0,001
  CI (99.9%): [0,012, 0,014] (assumes normal distribution)


# JMH version: 1.35
# VM version: JDK 20.0.2, Java HotSpot(TM) 64-Bit Server VM, 20.0.2+9-78
# VM invoker: /usr/lib/jvm/jdk-20/bin/java
# VM options: -javaagent:/home/hwak/snap/idea/idea-IU-232.8660.185/lib/idea_rt.jar=38647:/home/hwak/snap/idea/idea-IU-232.8660.185/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.example.Main.modelMapper

# Run progress: 16,67% complete, ETA 00:33:29
# Warmup Fork: 1 of 1
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

# Run progress: 20,83% complete, ETA 00:31:49
# Fork: 1 of 1
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


Result "org.example.Main.modelMapper":
  ≈ 10⁻³ ops/ns


# JMH version: 1.35
# VM version: JDK 20.0.2, Java HotSpot(TM) 64-Bit Server VM, 20.0.2+9-78
# VM invoker: /usr/lib/jvm/jdk-20/bin/java
# VM options: -javaagent:/home/hwak/snap/idea/idea-IU-232.8660.185/lib/idea_rt.jar=38647:/home/hwak/snap/idea/idea-IU-232.8660.185/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Throughput, ops/time
# Benchmark: org.example.Main.springBeanutils

# Run progress: 25,00% complete, ETA 00:30:08
# Warmup Fork: 1 of 1
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

# Run progress: 29,17% complete, ETA 00:28:28
# Fork: 1 of 1
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
# VM version: JDK 20.0.2, Java HotSpot(TM) 64-Bit Server VM, 20.0.2+9-78
# VM invoker: /usr/lib/jvm/jdk-20/bin/java
# VM options: -javaagent:/home/hwak/snap/idea/idea-IU-232.8660.185/lib/idea_rt.jar=38647:/home/hwak/snap/idea/idea-IU-232.8660.185/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.example.Main.apacheBeanutils

# Run progress: 33,33% complete, ETA 00:26:47
# Warmup Fork: 1 of 1
# Warmup Iteration   1: 7919,025 ns/op
# Warmup Iteration   2: 7743,361 ns/op
# Warmup Iteration   3: 7743,697 ns/op
# Warmup Iteration   4: 7948,829 ns/op
# Warmup Iteration   5: 7995,248 ns/op
Iteration   1: 7992,788 ns/op
Iteration   2: 8030,025 ns/op
Iteration   3: 8019,428 ns/op
Iteration   4: 8010,947 ns/op
Iteration   5: 7928,565 ns/op

# Run progress: 37,50% complete, ETA 00:25:07
# Fork: 1 of 1
# Warmup Iteration   1: 7911,784 ns/op
# Warmup Iteration   2: 7634,009 ns/op
# Warmup Iteration   3: 7634,078 ns/op
# Warmup Iteration   4: 7631,630 ns/op
# Warmup Iteration   5: 7621,230 ns/op
Iteration   1: 7645,236 ns/op
Iteration   2: 7413,097 ns/op
Iteration   3: 7573,951 ns/op
Iteration   4: 7647,175 ns/op
Iteration   5: 7651,781 ns/op


Result "org.example.Main.apacheBeanutils":
  7586,248 ±(99.9%) 392,778 ns/op [Average]
  (min, avg, max) = (7413,097, 7586,248, 7651,781), stdev = 102,003
  CI (99.9%): [7193,470, 7979,026] (assumes normal distribution)


# JMH version: 1.35
# VM version: JDK 20.0.2, Java HotSpot(TM) 64-Bit Server VM, 20.0.2+9-78
# VM invoker: /usr/lib/jvm/jdk-20/bin/java
# VM options: -javaagent:/home/hwak/snap/idea/idea-IU-232.8660.185/lib/idea_rt.jar=38647:/home/hwak/snap/idea/idea-IU-232.8660.185/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.example.Main.mapstruct

# Run progress: 41,67% complete, ETA 00:23:26
# Warmup Fork: 1 of 1
# Warmup Iteration   1: 80,160 ns/op
# Warmup Iteration   2: 77,974 ns/op
# Warmup Iteration   3: 76,819 ns/op
# Warmup Iteration   4: 77,104 ns/op
# Warmup Iteration   5: 77,670 ns/op
Iteration   1: 78,118 ns/op
Iteration   2: 77,350 ns/op
Iteration   3: 76,031 ns/op
Iteration   4: 76,653 ns/op
Iteration   5: 77,204 ns/op

# Run progress: 45,83% complete, ETA 00:21:46
# Fork: 1 of 1
# Warmup Iteration   1: 77,884 ns/op
# Warmup Iteration   2: 78,363 ns/op
# Warmup Iteration   3: 79,870 ns/op
# Warmup Iteration   4: 79,066 ns/op
# Warmup Iteration   5: 77,579 ns/op
Iteration   1: 75,966 ns/op
Iteration   2: 76,882 ns/op
Iteration   3: 76,322 ns/op
Iteration   4: 75,891 ns/op
Iteration   5: 77,239 ns/op


Result "org.example.Main.mapstruct":
  76,460 ±(99.9%) 2,255 ns/op [Average]
  (min, avg, max) = (75,891, 76,460, 77,239), stdev = 0,586
  CI (99.9%): [74,205, 78,715] (assumes normal distribution)


# JMH version: 1.35
# VM version: JDK 20.0.2, Java HotSpot(TM) 64-Bit Server VM, 20.0.2+9-78
# VM invoker: /usr/lib/jvm/jdk-20/bin/java
# VM options: -javaagent:/home/hwak/snap/idea/idea-IU-232.8660.185/lib/idea_rt.jar=38647:/home/hwak/snap/idea/idea-IU-232.8660.185/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.example.Main.modelMapper

# Run progress: 50,00% complete, ETA 00:20:05
# Warmup Fork: 1 of 1
# Warmup Iteration   1: 2222,644 ns/op
# Warmup Iteration   2: 2158,802 ns/op
# Warmup Iteration   3: 2135,800 ns/op
# Warmup Iteration   4: 2118,591 ns/op
# Warmup Iteration   5: 2118,864 ns/op
Iteration   1: 2134,804 ns/op
Iteration   2: 2135,936 ns/op
Iteration   3: 2158,610 ns/op
Iteration   4: 2132,198 ns/op
Iteration   5: 2146,860 ns/op

# Run progress: 54,17% complete, ETA 00:18:25
# Fork: 1 of 1
# Warmup Iteration   1: 2198,089 ns/op
# Warmup Iteration   2: 2184,572 ns/op
# Warmup Iteration   3: 2126,400 ns/op
# Warmup Iteration   4: 2102,455 ns/op
# Warmup Iteration   5: 2117,467 ns/op
Iteration   1: 2133,215 ns/op
Iteration   2: 2065,150 ns/op
Iteration   3: 2090,494 ns/op
Iteration   4: 2094,239 ns/op
Iteration   5: 2113,975 ns/op


Result "org.example.Main.modelMapper":
  2099,414 ±(99.9%) 98,829 ns/op [Average]
  (min, avg, max) = (2065,150, 2099,414, 2133,215), stdev = 25,666
  CI (99.9%): [2000,585, 2198,244] (assumes normal distribution)


# JMH version: 1.35
# VM version: JDK 20.0.2, Java HotSpot(TM) 64-Bit Server VM, 20.0.2+9-78
# VM invoker: /usr/lib/jvm/jdk-20/bin/java
# VM options: -javaagent:/home/hwak/snap/idea/idea-IU-232.8660.185/lib/idea_rt.jar=38647:/home/hwak/snap/idea/idea-IU-232.8660.185/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Average time, time/op
# Benchmark: org.example.Main.springBeanutils

# Run progress: 58,33% complete, ETA 00:16:44
# Warmup Fork: 1 of 1
# Warmup Iteration   1: 2165,401 ns/op
# Warmup Iteration   2: 2105,892 ns/op
# Warmup Iteration   3: 2150,916 ns/op
# Warmup Iteration   4: 2173,929 ns/op
# Warmup Iteration   5: 2174,088 ns/op
Iteration   1: 2159,653 ns/op
Iteration   2: 2160,258 ns/op
Iteration   3: 2133,989 ns/op
Iteration   4: 2125,549 ns/op
Iteration   5: 2112,394 ns/op

# Run progress: 62,50% complete, ETA 00:15:04
# Fork: 1 of 1
# Warmup Iteration   1: 2198,429 ns/op
# Warmup Iteration   2: 2154,777 ns/op
# Warmup Iteration   3: 2147,156 ns/op
# Warmup Iteration   4: 2113,147 ns/op
# Warmup Iteration   5: 2058,720 ns/op
Iteration   1: 2075,090 ns/op
Iteration   2: 2060,375 ns/op
Iteration   3: 2045,383 ns/op
Iteration   4: 2046,921 ns/op
Iteration   5: 2045,961 ns/op


Result "org.example.Main.springBeanutils":
  2054,746 ±(99.9%) 49,896 ns/op [Average]
  (min, avg, max) = (2045,383, 2054,746, 2075,090), stdev = 12,958
  CI (99.9%): [2004,850, 2104,642] (assumes normal distribution)


# JMH version: 1.35
# VM version: JDK 20.0.2, Java HotSpot(TM) 64-Bit Server VM, 20.0.2+9-78
# VM invoker: /usr/lib/jvm/jdk-20/bin/java
# VM options: -javaagent:/home/hwak/snap/idea/idea-IU-232.8660.185/lib/idea_rt.jar=38647:/home/hwak/snap/idea/idea-IU-232.8660.185/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.apacheBeanutils

# Run progress: 66,67% complete, ETA 00:13:23
# Warmup Fork: 1 of 1
# Warmup Iteration   1: 8420,200 ±(99.9%) 311,832 ns/op
# Warmup Iteration   2: 8197,550 ±(99.9%) 35,894 ns/op
# Warmup Iteration   3: 8077,292 ±(99.9%) 26,927 ns/op
# Warmup Iteration   4: 8181,801 ±(99.9%) 37,179 ns/op
# Warmup Iteration   5: 8097,380 ±(99.9%) 25,436 ns/op
Iteration   1: 7918,646 ±(99.9%) 18,552 ns/op
                 apacheBeanutils·p0.00:   7112,000 ns/op
                 apacheBeanutils·p0.50:   7632,000 ns/op
                 apacheBeanutils·p0.90:   8080,000 ns/op
                 apacheBeanutils·p0.95:   11072,000 ns/op
                 apacheBeanutils·p0.99:   12288,000 ns/op
                 apacheBeanutils·p0.999:  16768,000 ns/op
                 apacheBeanutils·p0.9999: 23985,459 ns/op
                 apacheBeanutils·p1.00:   627712,000 ns/op

Iteration   2: 8097,473 ±(99.9%) 18,365 ns/op
                 apacheBeanutils·p0.00:   7408,000 ns/op
                 apacheBeanutils·p0.50:   7808,000 ns/op
                 apacheBeanutils·p0.90:   8168,000 ns/op
                 apacheBeanutils·p0.95:   9904,000 ns/op
                 apacheBeanutils·p0.99:   13312,000 ns/op
                 apacheBeanutils·p0.999:  17692,704 ns/op
                 apacheBeanutils·p0.9999: 25534,352 ns/op
                 apacheBeanutils·p1.00:   494080,000 ns/op

Iteration   3: 8050,029 ±(99.9%) 18,047 ns/op
                 apacheBeanutils·p0.00:   7040,000 ns/op
                 apacheBeanutils·p0.50:   7712,000 ns/op
                 apacheBeanutils·p0.90:   8160,000 ns/op
                 apacheBeanutils·p0.95:   11680,000 ns/op
                 apacheBeanutils·p0.99:   13216,000 ns/op
                 apacheBeanutils·p0.999:  18656,000 ns/op
                 apacheBeanutils·p0.9999: 30848,000 ns/op
                 apacheBeanutils·p1.00:   484864,000 ns/op

Iteration   4: 7993,233 ±(99.9%) 29,570 ns/op
                 apacheBeanutils·p0.00:   7208,000 ns/op
                 apacheBeanutils·p0.50:   7624,000 ns/op
                 apacheBeanutils·p0.90:   8088,000 ns/op
                 apacheBeanutils·p0.95:   11264,000 ns/op
                 apacheBeanutils·p0.99:   12960,000 ns/op
                 apacheBeanutils·p0.999:  23259,840 ns/op
                 apacheBeanutils·p0.9999: 410348,544 ns/op
                 apacheBeanutils·p1.00:   629760,000 ns/op

Iteration   5: 7799,921 ±(99.9%) 24,588 ns/op
                 apacheBeanutils·p0.00:   7096,000 ns/op
                 apacheBeanutils·p0.50:   7512,000 ns/op
                 apacheBeanutils·p0.90:   7960,000 ns/op
                 apacheBeanutils·p0.95:   9712,000 ns/op
                 apacheBeanutils·p0.99:   12288,000 ns/op
                 apacheBeanutils·p0.999:  16133,920 ns/op
                 apacheBeanutils·p0.9999: 24668,416 ns/op
                 apacheBeanutils·p1.00:   770048,000 ns/op


# Run progress: 70,83% complete, ETA 00:11:43
# Fork: 1 of 1
# Warmup Iteration   1: 8199,922 ±(99.9%) 313,466 ns/op
# Warmup Iteration   2: 8091,393 ±(99.9%) 35,326 ns/op
# Warmup Iteration   3: 8211,313 ±(99.9%) 32,258 ns/op
# Warmup Iteration   4: 8186,606 ±(99.9%) 33,162 ns/op
# Warmup Iteration   5: 7881,834 ±(99.9%) 29,460 ns/op
Iteration   1: 7777,016 ±(99.9%) 34,475 ns/op
                 apacheBeanutils·p0.00:   7072,000 ns/op
                 apacheBeanutils·p0.50:   7424,000 ns/op
                 apacheBeanutils·p0.90:   7904,800 ns/op
                 apacheBeanutils·p0.95:   11152,000 ns/op
                 apacheBeanutils·p0.99:   12000,000 ns/op
                 apacheBeanutils·p0.999:  16048,000 ns/op
                 apacheBeanutils·p0.9999: 487318,272 ns/op
                 apacheBeanutils·p1.00:   772096,000 ns/op

Iteration   2: 7909,878 ±(99.9%) 35,013 ns/op
                 apacheBeanutils·p0.00:   7080,000 ns/op
                 apacheBeanutils·p0.50:   7520,000 ns/op
                 apacheBeanutils·p0.90:   8072,000 ns/op
                 apacheBeanutils·p0.95:   11472,000 ns/op
                 apacheBeanutils·p0.99:   12240,000 ns/op
                 apacheBeanutils·p0.999:  16512,000 ns/op
                 apacheBeanutils·p0.9999: 482079,334 ns/op
                 apacheBeanutils·p1.00:   786432,000 ns/op

Iteration   3: 7957,102 ±(99.9%) 36,185 ns/op
                 apacheBeanutils·p0.00:   7208,000 ns/op
                 apacheBeanutils·p0.50:   7592,000 ns/op
                 apacheBeanutils·p0.90:   8064,000 ns/op
                 apacheBeanutils·p0.95:   11472,000 ns/op
                 apacheBeanutils·p0.99:   12288,000 ns/op
                 apacheBeanutils·p0.999:  17120,000 ns/op
                 apacheBeanutils·p0.9999: 491264,000 ns/op
                 apacheBeanutils·p1.00:   771072,000 ns/op

Iteration   4: 7922,497 ±(99.9%) 34,358 ns/op
                 apacheBeanutils·p0.00:   7208,000 ns/op
                 apacheBeanutils·p0.50:   7592,000 ns/op
                 apacheBeanutils·p0.90:   8032,000 ns/op
                 apacheBeanutils·p0.95:   10608,000 ns/op
                 apacheBeanutils·p0.99:   12288,000 ns/op
                 apacheBeanutils·p0.999:  17109,536 ns/op
                 apacheBeanutils·p0.9999: 399129,498 ns/op
                 apacheBeanutils·p1.00:   1411072,000 ns/op

Iteration   5: 7962,261 ±(99.9%) 32,036 ns/op
                 apacheBeanutils·p0.00:   7080,000 ns/op
                 apacheBeanutils·p0.50:   7648,000 ns/op
                 apacheBeanutils·p0.90:   8080,000 ns/op
                 apacheBeanutils·p0.95:   10800,000 ns/op
                 apacheBeanutils·p0.99:   12320,000 ns/op
                 apacheBeanutils·p0.999:  16896,000 ns/op
                 apacheBeanutils·p0.9999: 432200,909 ns/op
                 apacheBeanutils·p1.00:   670720,000 ns/op



Result "org.example.Main.apacheBeanutils":
  N = 1584767
  mean =   7905,183 ±(99.9%) 15,405 ns/op

  Histogram, ns/op:
    [      0,000,  125000,000) = 1584583 
    [ 125000,000,  250000,000) = 1 
    [ 250000,000,  375000,000) = 5 
    [ 375000,000,  500000,000) = 56 
    [ 500000,000,  625000,000) = 102 
    [ 625000,000,  750000,000) = 15 
    [ 750000,000,  875000,000) = 4 
    [ 875000,000, 1000000,000) = 0 
    [1000000,000, 1125000,000) = 0 
    [1125000,000, 1250000,000) = 0 
    [1250000,000, 1375000,000) = 0 
    [1375000,000, 1500000,000) = 1 
    [1500000,000, 1625000,000) = 0 
    [1625000,000, 1750000,000) = 0 
    [1750000,000, 1875000,000) = 0 

  Percentiles, ns/op:
      p(0,0000) =   7072,000 ns/op
     p(50,0000) =   7560,000 ns/op
     p(90,0000) =   8040,000 ns/op
     p(95,0000) =  11296,000 ns/op
     p(99,0000) =  12240,000 ns/op
     p(99,9000) =  16736,000 ns/op
     p(99,9900) = 433931,878 ns/op
     p(99,9990) = 656363,684 ns/op
     p(99,9999) = 1045802,516 ns/op
    p(100,0000) = 1411072,000 ns/op


# JMH version: 1.35
# VM version: JDK 20.0.2, Java HotSpot(TM) 64-Bit Server VM, 20.0.2+9-78
# VM invoker: /usr/lib/jvm/jdk-20/bin/java
# VM options: -javaagent:/home/hwak/snap/idea/idea-IU-232.8660.185/lib/idea_rt.jar=38647:/home/hwak/snap/idea/idea-IU-232.8660.185/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.mapstruct

# Run progress: 75,00% complete, ETA 00:10:02
# Warmup Fork: 1 of 1
# Warmup Iteration   1: 136,326 ±(99.9%) 63,604 ns/op
# Warmup Iteration   2: 93,877 ±(99.9%) 6,350 ns/op
# Warmup Iteration   3: 98,370 ±(99.9%) 7,199 ns/op
# Warmup Iteration   4: 94,141 ±(99.9%) 0,948 ns/op
# Warmup Iteration   5: 93,701 ±(99.9%) 4,621 ns/op
Iteration   1: 91,767 ±(99.9%) 0,402 ns/op
                 mapstruct·p0.00:   80,000 ns/op
                 mapstruct·p0.50:   90,000 ns/op
                 mapstruct·p0.90:   91,000 ns/op
                 mapstruct·p0.95:   110,000 ns/op
                 mapstruct·p0.99:   131,000 ns/op
                 mapstruct·p0.999:  248,929 ns/op
                 mapstruct·p0.9999: 4206,114 ns/op
                 mapstruct·p1.00:   6352,000 ns/op

Iteration   2: 98,320 ±(99.9%) 6,958 ns/op
                 mapstruct·p0.00:   80,000 ns/op
                 mapstruct·p0.50:   90,000 ns/op
                 mapstruct·p0.90:   101,000 ns/op
                 mapstruct·p0.95:   111,000 ns/op
                 mapstruct·p0.99:   140,000 ns/op
                 mapstruct·p0.999:  270,000 ns/op
                 mapstruct·p0.9999: 3502,016 ns/op
                 mapstruct·p1.00:   491008,000 ns/op

Iteration   3: 99,250 ±(99.9%) 6,051 ns/op
                 mapstruct·p0.00:   90,000 ns/op
                 mapstruct·p0.50:   90,000 ns/op
                 mapstruct·p0.90:   101,000 ns/op
                 mapstruct·p0.95:   120,000 ns/op
                 mapstruct·p0.99:   140,000 ns/op
                 mapstruct·p0.999:  323,223 ns/op
                 mapstruct·p0.9999: 5160,940 ns/op
                 mapstruct·p1.00:   422912,000 ns/op

Iteration   4: 98,148 ±(99.9%) 5,473 ns/op
                 mapstruct·p0.00:   90,000 ns/op
                 mapstruct·p0.50:   90,000 ns/op
                 mapstruct·p0.90:   101,000 ns/op
                 mapstruct·p0.95:   111,000 ns/op
                 mapstruct·p0.99:   140,000 ns/op
                 mapstruct·p0.999:  319,316 ns/op
                 mapstruct·p0.9999: 5046,157 ns/op
                 mapstruct·p1.00:   386048,000 ns/op

Iteration   5: 98,222 ±(99.9%) 5,539 ns/op
                 mapstruct·p0.00:   90,000 ns/op
                 mapstruct·p0.50:   90,000 ns/op
                 mapstruct·p0.90:   101,000 ns/op
                 mapstruct·p0.95:   121,000 ns/op
                 mapstruct·p0.99:   140,000 ns/op
                 mapstruct·p0.999:  305,077 ns/op
                 mapstruct·p0.9999: 4601,887 ns/op
                 mapstruct·p1.00:   390144,000 ns/op


# Run progress: 79,17% complete, ETA 00:08:22
# Fork: 1 of 1
# Warmup Iteration   1: 135,773 ±(99.9%) 59,709 ns/op
# Warmup Iteration   2: 94,237 ±(99.9%) 6,463 ns/op
# Warmup Iteration   3: 93,833 ±(99.9%) 5,598 ns/op
# Warmup Iteration   4: 96,180 ±(99.9%) 6,455 ns/op
# Warmup Iteration   5: 102,045 ±(99.9%) 12,990 ns/op
Iteration   1: 92,104 ±(99.9%) 0,409 ns/op
                 mapstruct·p0.00:   80,000 ns/op
                 mapstruct·p0.50:   90,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   120,000 ns/op
                 mapstruct·p0.99:   131,000 ns/op
                 mapstruct·p0.999:  261,000 ns/op
                 mapstruct·p0.9999: 3589,289 ns/op
                 mapstruct·p1.00:   9184,000 ns/op

Iteration   2: 92,611 ±(99.9%) 0,530 ns/op
                 mapstruct·p0.00:   80,000 ns/op
                 mapstruct·p0.50:   90,000 ns/op
                 mapstruct·p0.90:   100,000 ns/op
                 mapstruct·p0.95:   110,000 ns/op
                 mapstruct·p0.99:   131,000 ns/op
                 mapstruct·p0.999:  298,164 ns/op
                 mapstruct·p0.9999: 3985,552 ns/op
                 mapstruct·p1.00:   14224,000 ns/op

Iteration   3: 93,849 ±(99.9%) 5,360 ns/op
                 mapstruct·p0.00:   80,000 ns/op
                 mapstruct·p0.50:   90,000 ns/op
                 mapstruct·p0.90:   91,000 ns/op
                 mapstruct·p0.95:   120,000 ns/op
                 mapstruct·p0.99:   131,000 ns/op
                 mapstruct·p0.999:  280,269 ns/op
                 mapstruct·p0.9999: 3887,537 ns/op
                 mapstruct·p1.00:   396288,000 ns/op

Iteration   4: 91,520 ±(99.9%) 0,386 ns/op
                 mapstruct·p0.00:   80,000 ns/op
                 mapstruct·p0.50:   90,000 ns/op
                 mapstruct·p0.90:   91,000 ns/op
                 mapstruct·p0.95:   110,000 ns/op
                 mapstruct·p0.99:   131,000 ns/op
                 mapstruct·p0.999:  241,000 ns/op
                 mapstruct·p0.9999: 3386,615 ns/op
                 mapstruct·p1.00:   9616,000 ns/op

Iteration   5: 90,722 ±(99.9%) 0,366 ns/op
                 mapstruct·p0.00:   80,000 ns/op
                 mapstruct·p0.50:   90,000 ns/op
                 mapstruct·p0.90:   91,000 ns/op
                 mapstruct·p0.95:   110,000 ns/op
                 mapstruct·p0.99:   131,000 ns/op
                 mapstruct·p0.999:  263,268 ns/op
                 mapstruct·p0.9999: 3497,002 ns/op
                 mapstruct·p1.00:   5896,000 ns/op



Result "org.example.Main.mapstruct":
  N = 1231453
  mean =     92,158 ±(99.9%) 1,087 ns/op

  Histogram, ns/op:
    [     0,000,  25000,000) = 1231452 
    [ 25000,000,  50000,000) = 0 
    [ 50000,000,  75000,000) = 0 
    [ 75000,000, 100000,000) = 0 
    [100000,000, 125000,000) = 0 
    [125000,000, 150000,000) = 0 
    [150000,000, 175000,000) = 0 
    [175000,000, 200000,000) = 0 
    [200000,000, 225000,000) = 0 
    [225000,000, 250000,000) = 0 
    [250000,000, 275000,000) = 0 
    [275000,000, 300000,000) = 0 
    [300000,000, 325000,000) = 0 
    [325000,000, 350000,000) = 0 
    [350000,000, 375000,000) = 0 

  Percentiles, ns/op:
      p(0,0000) =     80,000 ns/op
     p(50,0000) =     90,000 ns/op
     p(90,0000) =     91,000 ns/op
     p(95,0000) =    110,000 ns/op
     p(99,0000) =    131,000 ns/op
     p(99,9000) =    261,000 ns/op
     p(99,9900) =   3670,184 ns/op
     p(99,9990) =  16296,831 ns/op
     p(99,9999) = 309550,151 ns/op
    p(100,0000) = 396288,000 ns/op


# JMH version: 1.35
# VM version: JDK 20.0.2, Java HotSpot(TM) 64-Bit Server VM, 20.0.2+9-78
# VM invoker: /usr/lib/jvm/jdk-20/bin/java
# VM options: -javaagent:/home/hwak/snap/idea/idea-IU-232.8660.185/lib/idea_rt.jar=38647:/home/hwak/snap/idea/idea-IU-232.8660.185/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.modelMapper

# Run progress: 83,33% complete, ETA 00:06:41
# Warmup Fork: 1 of 1
# Warmup Iteration   1: 2326,262 ±(99.9%) 186,541 ns/op
# Warmup Iteration   2: 2184,025 ±(99.9%) 12,175 ns/op
# Warmup Iteration   3: 2225,219 ±(99.9%) 19,072 ns/op
# Warmup Iteration   4: 2131,546 ±(99.9%) 19,453 ns/op
# Warmup Iteration   5: 2121,045 ±(99.9%) 9,327 ns/op
Iteration   1: 2240,759 ±(99.9%) 44,122 ns/op
                 modelMapper·p0.00:   1922,000 ns/op
                 modelMapper·p0.50:   2052,000 ns/op
                 modelMapper·p0.90:   2172,000 ns/op
                 modelMapper·p0.95:   2864,000 ns/op
                 modelMapper·p0.99:   3304,000 ns/op
                 modelMapper·p0.999:  6652,400 ns/op
                 modelMapper·p0.9999: 455964,160 ns/op
                 modelMapper·p1.00:   1073152,000 ns/op

Iteration   2: 2140,404 ±(99.9%) 12,133 ns/op
                 modelMapper·p0.00:   1922,000 ns/op
                 modelMapper·p0.50:   2052,000 ns/op
                 modelMapper·p0.90:   2172,000 ns/op
                 modelMapper·p0.95:   2712,000 ns/op
                 modelMapper·p0.99:   3304,000 ns/op
                 modelMapper·p0.999:  8163,616 ns/op
                 modelMapper·p0.9999: 11833,781 ns/op
                 modelMapper·p1.00:   592896,000 ns/op

Iteration   3: 2150,665 ±(99.9%) 18,682 ns/op
                 modelMapper·p0.00:   1922,000 ns/op
                 modelMapper·p0.50:   2060,000 ns/op
                 modelMapper·p0.90:   2184,000 ns/op
                 modelMapper·p0.95:   2924,000 ns/op
                 modelMapper·p0.99:   3156,000 ns/op
                 modelMapper·p0.999:  6000,000 ns/op
                 modelMapper·p0.9999: 10813,736 ns/op
                 modelMapper·p1.00:   558080,000 ns/op

Iteration   4: 2172,419 ±(99.9%) 28,009 ns/op
                 modelMapper·p0.00:   1924,000 ns/op
                 modelMapper·p0.50:   2052,000 ns/op
                 modelMapper·p0.90:   2184,000 ns/op
                 modelMapper·p0.95:   2916,000 ns/op
                 modelMapper·p0.99:   3196,000 ns/op
                 modelMapper·p0.999:  5940,688 ns/op
                 modelMapper·p0.9999: 11609,376 ns/op
                 modelMapper·p1.00:   678912,000 ns/op

Iteration   5: 2138,851 ±(99.9%) 19,237 ns/op
                 modelMapper·p0.00:   1934,000 ns/op
                 modelMapper·p0.50:   2064,000 ns/op
                 modelMapper·p0.90:   2152,000 ns/op
                 modelMapper·p0.95:   2324,000 ns/op
                 modelMapper·p0.99:   3216,000 ns/op
                 modelMapper·p0.999:  6053,960 ns/op
                 modelMapper·p0.9999: 11039,808 ns/op
                 modelMapper·p1.00:   838656,000 ns/op


# Run progress: 87,50% complete, ETA 00:05:01
# Fork: 1 of 1
# Warmup Iteration   1: 2337,654 ±(99.9%) 189,504 ns/op
# Warmup Iteration   2: 2141,639 ±(99.9%) 14,021 ns/op
# Warmup Iteration   3: 2180,515 ±(99.9%) 14,948 ns/op
# Warmup Iteration   4: 2184,056 ±(99.9%) 19,496 ns/op
# Warmup Iteration   5: 2163,481 ±(99.9%) 18,030 ns/op
Iteration   1: 2203,404 ±(99.9%) 28,981 ns/op
                 modelMapper·p0.00:   1932,000 ns/op
                 modelMapper·p0.50:   2072,000 ns/op
                 modelMapper·p0.90:   2212,000 ns/op
                 modelMapper·p0.95:   2956,000 ns/op
                 modelMapper·p0.99:   3324,000 ns/op
                 modelMapper·p0.999:  8368,000 ns/op
                 modelMapper·p0.9999: 60292,314 ns/op
                 modelMapper·p1.00:   599040,000 ns/op

Iteration   2: 2253,056 ±(99.9%) 20,783 ns/op
                 modelMapper·p0.00:   1944,000 ns/op
                 modelMapper·p0.50:   2152,000 ns/op
                 modelMapper·p0.90:   2292,000 ns/op
                 modelMapper·p0.95:   3016,000 ns/op
                 modelMapper·p0.99:   3524,000 ns/op
                 modelMapper·p0.999:  7525,528 ns/op
                 modelMapper·p0.9999: 12808,962 ns/op
                 modelMapper·p1.00:   584704,000 ns/op

Iteration   3: 2326,659 ±(99.9%) 38,271 ns/op
                 modelMapper·p0.00:   2014,000 ns/op
                 modelMapper·p0.50:   2164,000 ns/op
                 modelMapper·p0.90:   2292,000 ns/op
                 modelMapper·p0.95:   2564,000 ns/op
                 modelMapper·p0.99:   3464,000 ns/op
                 modelMapper·p0.999:  7080,000 ns/op
                 modelMapper·p0.9999: 402575,974 ns/op
                 modelMapper·p1.00:   481792,000 ns/op

Iteration   4: 2256,243 ±(99.9%) 11,581 ns/op
                 modelMapper·p0.00:   2002,000 ns/op
                 modelMapper·p0.50:   2164,000 ns/op
                 modelMapper·p0.90:   2312,000 ns/op
                 modelMapper·p0.95:   3104,000 ns/op
                 modelMapper·p0.99:   3656,000 ns/op
                 modelMapper·p0.999:  6634,048 ns/op
                 modelMapper·p0.9999: 10756,096 ns/op
                 modelMapper·p1.00:   511488,000 ns/op

Iteration   5: 2223,440 ±(99.9%) 21,672 ns/op
                 modelMapper·p0.00:   1942,000 ns/op
                 modelMapper·p0.50:   2132,000 ns/op
                 modelMapper·p0.90:   2284,000 ns/op
                 modelMapper·p0.95:   3012,000 ns/op
                 modelMapper·p0.99:   3496,000 ns/op
                 modelMapper·p0.999:  6272,000 ns/op
                 modelMapper·p0.9999: 10200,640 ns/op
                 modelMapper·p1.00:   790528,000 ns/op



Result "org.example.Main.modelMapper":
  N = 1416639
  mean =   2252,156 ±(99.9%) 11,587 ns/op

  Histogram, ns/op:
    [     0,000,  50000,000) = 1416512 
    [ 50000,000, 100000,000) = 4 
    [100000,000, 150000,000) = 0 
    [150000,000, 200000,000) = 0 
    [200000,000, 250000,000) = 0 
    [250000,000, 300000,000) = 0 
    [300000,000, 350000,000) = 4 
    [350000,000, 400000,000) = 36 
    [400000,000, 450000,000) = 28 
    [450000,000, 500000,000) = 32 
    [500000,000, 550000,000) = 13 
    [550000,000, 600000,000) = 7 
    [600000,000, 650000,000) = 2 
    [650000,000, 700000,000) = 0 
    [700000,000, 750000,000) = 0 

  Percentiles, ns/op:
      p(0,0000) =   1932,000 ns/op
     p(50,0000) =   2144,000 ns/op
     p(90,0000) =   2284,000 ns/op
     p(95,0000) =   2964,000 ns/op
     p(99,0000) =   3496,000 ns/op
     p(99,9000) =   7272,000 ns/op
     p(99,9900) =  19403,776 ns/op
     p(99,9990) = 529070,490 ns/op
     p(99,9999) = 726105,457 ns/op
    p(100,0000) = 790528,000 ns/op


# JMH version: 1.35
# VM version: JDK 20.0.2, Java HotSpot(TM) 64-Bit Server VM, 20.0.2+9-78
# VM invoker: /usr/lib/jvm/jdk-20/bin/java
# VM options: -javaagent:/home/hwak/snap/idea/idea-IU-232.8660.185/lib/idea_rt.jar=38647:/home/hwak/snap/idea/idea-IU-232.8660.185/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: 5 iterations, 10 s each
# Measurement: 5 iterations, 10 s each
# Timeout: 10 min per iteration
# Threads: 1 thread, will synchronize iterations
# Benchmark mode: Sampling time
# Benchmark: org.example.Main.springBeanutils

# Run progress: 91,67% complete, ETA 00:03:20
# Warmup Fork: 1 of 1
# Warmup Iteration   1: 2466,973 ±(99.9%) 372,680 ns/op
# Warmup Iteration   2: 2251,726 ±(99.9%) 19,268 ns/op
# Warmup Iteration   3: 2270,987 ±(99.9%) 17,148 ns/op
# Warmup Iteration   4: 2253,303 ±(99.9%) 18,175 ns/op
# Warmup Iteration   5: 2191,975 ±(99.9%) 18,880 ns/op
Iteration   1: 2257,003 ±(99.9%) 30,226 ns/op
                 springBeanutils·p0.00:   1954,000 ns/op
                 springBeanutils·p0.50:   2132,000 ns/op
                 springBeanutils·p0.90:   2344,000 ns/op
                 springBeanutils·p0.95:   2712,000 ns/op
                 springBeanutils·p0.99:   3084,000 ns/op
                 springBeanutils·p0.999:  7059,376 ns/op
                 springBeanutils·p0.9999: 375586,048 ns/op
                 springBeanutils·p1.00:   610304,000 ns/op

Iteration   2: 2206,796 ±(99.9%) 19,834 ns/op
                 springBeanutils·p0.00:   1964,000 ns/op
                 springBeanutils·p0.50:   2112,000 ns/op
                 springBeanutils·p0.90:   2332,000 ns/op
                 springBeanutils·p0.95:   2716,000 ns/op
                 springBeanutils·p0.99:   3004,000 ns/op
                 springBeanutils·p0.999:  5863,000 ns/op
                 springBeanutils·p0.9999: 18178,400 ns/op
                 springBeanutils·p1.00:   627712,000 ns/op

Iteration   3: 2205,206 ±(99.9%) 18,661 ns/op
                 springBeanutils·p0.00:   1954,000 ns/op
                 springBeanutils·p0.50:   2112,000 ns/op
                 springBeanutils·p0.90:   2332,000 ns/op
                 springBeanutils·p0.95:   2724,000 ns/op
                 springBeanutils·p0.99:   3044,000 ns/op
                 springBeanutils·p0.999:  6493,056 ns/op
                 springBeanutils·p0.9999: 19938,867 ns/op
                 springBeanutils·p1.00:   490496,000 ns/op

Iteration   4: 2211,980 ±(99.9%) 30,283 ns/op
                 springBeanutils·p0.00:   1944,000 ns/op
                 springBeanutils·p0.50:   2084,000 ns/op
                 springBeanutils·p0.90:   2292,000 ns/op
                 springBeanutils·p0.95:   2684,000 ns/op
                 springBeanutils·p0.99:   3052,000 ns/op
                 springBeanutils·p0.999:  7144,168 ns/op
                 springBeanutils·p0.9999: 404994,150 ns/op
                 springBeanutils·p1.00:   658432,000 ns/op

Iteration   5: 2202,480 ±(99.9%) 24,844 ns/op
                 springBeanutils·p0.00:   1964,000 ns/op
                 springBeanutils·p0.50:   2104,000 ns/op
                 springBeanutils·p0.90:   2312,000 ns/op
                 springBeanutils·p0.95:   2704,000 ns/op
                 springBeanutils·p0.99:   3004,000 ns/op
                 springBeanutils·p0.999:  5976,800 ns/op
                 springBeanutils·p0.9999: 10291,200 ns/op
                 springBeanutils·p1.00:   719872,000 ns/op


# Run progress: 95,83% complete, ETA 00:01:40
# Fork: 1 of 1
# Warmup Iteration   1: 2384,577 ±(99.9%) 342,520 ns/op
# Warmup Iteration   2: 2220,545 ±(99.9%) 24,729 ns/op
# Warmup Iteration   3: 2192,088 ±(99.9%) 26,987 ns/op
# Warmup Iteration   4: 2148,659 ±(99.9%) 24,280 ns/op
# Warmup Iteration   5: 2183,548 ±(99.9%) 27,142 ns/op
Iteration   1: 2182,110 ±(99.9%) 24,481 ns/op
                 springBeanutils·p0.00:   1932,000 ns/op
                 springBeanutils·p0.50:   2084,000 ns/op
                 springBeanutils·p0.90:   2284,000 ns/op
                 springBeanutils·p0.95:   2652,000 ns/op
                 springBeanutils·p0.99:   2984,000 ns/op
                 springBeanutils·p0.999:  6180,304 ns/op
                 springBeanutils·p0.9999: 11347,930 ns/op
                 springBeanutils·p1.00:   591872,000 ns/op

Iteration   2: 2239,283 ±(99.9%) 24,337 ns/op
                 springBeanutils·p0.00:   1944,000 ns/op
                 springBeanutils·p0.50:   2132,000 ns/op
                 springBeanutils·p0.90:   2352,000 ns/op
                 springBeanutils·p0.95:   2744,000 ns/op
                 springBeanutils·p0.99:   3104,000 ns/op
                 springBeanutils·p0.999:  6515,880 ns/op
                 springBeanutils·p0.9999: 23297,568 ns/op
                 springBeanutils·p1.00:   583680,000 ns/op

Iteration   3: 2243,352 ±(99.9%) 22,472 ns/op
                 springBeanutils·p0.00:   1992,000 ns/op
                 springBeanutils·p0.50:   2144,000 ns/op
                 springBeanutils·p0.90:   2352,000 ns/op
                 springBeanutils·p0.95:   2724,000 ns/op
                 springBeanutils·p0.99:   3104,000 ns/op
                 springBeanutils·p0.999:  6178,880 ns/op
                 springBeanutils·p0.9999: 13555,200 ns/op
                 springBeanutils·p1.00:   502784,000 ns/op

Iteration   4: 2232,079 ±(99.9%) 24,474 ns/op
                 springBeanutils·p0.00:   1992,000 ns/op
                 springBeanutils·p0.50:   2132,000 ns/op
                 springBeanutils·p0.90:   2332,000 ns/op
                 springBeanutils·p0.95:   2704,000 ns/op
                 springBeanutils·p0.99:   3144,000 ns/op
                 springBeanutils·p0.999:  6547,376 ns/op
                 springBeanutils·p0.9999: 10843,339 ns/op
                 springBeanutils·p1.00:   598016,000 ns/op

Iteration   5: 2214,898 ±(99.9%) 25,062 ns/op
                 springBeanutils·p0.00:   2002,000 ns/op
                 springBeanutils·p0.50:   2124,000 ns/op
                 springBeanutils·p0.90:   2304,000 ns/op
                 springBeanutils·p0.95:   2512,000 ns/op
                 springBeanutils·p0.99:   3116,000 ns/op
                 springBeanutils·p0.999:  6881,544 ns/op
                 springBeanutils·p0.9999: 13200,114 ns/op
                 springBeanutils·p1.00:   906240,000 ns/op



Result "org.example.Main.springBeanutils":
  N = 1427977
  mean =   2222,116 ±(99.9%) 10,819 ns/op

  Histogram, ns/op:
    [      0,000,  100000,000) = 1427873 
    [ 100000,000,  200000,000) = 0 
    [ 200000,000,  300000,000) = 0 
    [ 300000,000,  400000,000) = 17 
    [ 400000,000,  500000,000) = 71 
    [ 500000,000,  600000,000) = 15 
    [ 600000,000,  700000,000) = 0 
    [ 700000,000,  800000,000) = 0 
    [ 800000,000,  900000,000) = 0 

  Percentiles, ns/op:
      p(0,0000) =   1932,000 ns/op
     p(50,0000) =   2124,000 ns/op
     p(90,0000) =   2324,000 ns/op
     p(95,0000) =   2684,000 ns/op
     p(99,0000) =   3096,000 ns/op
     p(99,9000) =   6440,000 ns/op
     p(99,9900) =  16647,526 ns/op
     p(99,9990) = 512819,763 ns/op
     p(99,9999) = 774326,909 ns/op
    p(100,0000) = 906240,000 ns/op


# JMH version: 1.35
# VM version: JDK 20.0.2, Java HotSpot(TM) 64-Bit Server VM, 20.0.2+9-78
# VM invoker: /usr/lib/jvm/jdk-20/bin/java
# VM options: -javaagent:/home/hwak/snap/idea/idea-IU-232.8660.185/lib/idea_rt.jar=38647:/home/hwak/snap/idea/idea-IU-232.8660.185/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 1 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.apacheBeanutils

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 1
Iteration   1: 27361100,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 1
Iteration   1: 27635671,000 ns/op



# JMH version: 1.35
# VM version: JDK 20.0.2, Java HotSpot(TM) 64-Bit Server VM, 20.0.2+9-78
# VM invoker: /usr/lib/jvm/jdk-20/bin/java
# VM options: -javaagent:/home/hwak/snap/idea/idea-IU-232.8660.185/lib/idea_rt.jar=38647:/home/hwak/snap/idea/idea-IU-232.8660.185/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 1 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.mapstruct

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 1
Iteration   1: 4241954,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 1
Iteration   1: 4432466,000 ns/op



# JMH version: 1.35
# VM version: JDK 20.0.2, Java HotSpot(TM) 64-Bit Server VM, 20.0.2+9-78
# VM invoker: /usr/lib/jvm/jdk-20/bin/java
# VM options: -javaagent:/home/hwak/snap/idea/idea-IU-232.8660.185/lib/idea_rt.jar=38647:/home/hwak/snap/idea/idea-IU-232.8660.185/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 1 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.modelMapper

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 1
Iteration   1: 14959333,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 1
Iteration   1: 15123665,000 ns/op



# JMH version: 1.35
# VM version: JDK 20.0.2, Java HotSpot(TM) 64-Bit Server VM, 20.0.2+9-78
# VM invoker: /usr/lib/jvm/jdk-20/bin/java
# VM options: -javaagent:/home/hwak/snap/idea/idea-IU-232.8660.185/lib/idea_rt.jar=38647:/home/hwak/snap/idea/idea-IU-232.8660.185/bin -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8
# Blackhole mode: compiler (auto-detected, use -Djmh.blackhole.autoDetect=false to disable)
# Warmup: <none>
# Measurement: 1 iterations, single-shot each
# Timeout: 10 min per iteration
# Threads: 1 thread
# Benchmark mode: Single shot invocation time
# Benchmark: org.example.Main.springBeanutils

# Run progress: 100,00% complete, ETA 00:00:00
# Warmup Fork: 1 of 1
Iteration   1: 28454967,000 ns/op

# Run progress: 100,00% complete, ETA 00:00:00
# Fork: 1 of 1
Iteration   1: 31550434,000 ns/op



# Run complete. Total time: 00:40:15

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

Benchmark                                       Mode      Cnt         Score     Error   Units
Main.apacheBeanutils                           thrpt        5        ≈ 10⁻⁴            ops/ns
Main.mapstruct                                 thrpt        5         0,013 ±   0,001  ops/ns
Main.modelMapper                               thrpt        5        ≈ 10⁻³            ops/ns
Main.springBeanutils                           thrpt        5        ≈ 10⁻³            ops/ns
Main.apacheBeanutils                            avgt        5      7586,248 ± 392,778   ns/op
Main.mapstruct                                  avgt        5        76,460 ±   2,255   ns/op
Main.modelMapper                                avgt        5      2099,414 ±  98,829   ns/op
Main.springBeanutils                            avgt        5      2054,746 ±  49,896   ns/op
Main.apacheBeanutils                          sample  1584767      7905,183 ±  15,405   ns/op
Main.apacheBeanutils:apacheBeanutils·p0.00    sample               7072,000             ns/op
Main.apacheBeanutils:apacheBeanutils·p0.50    sample               7560,000             ns/op
Main.apacheBeanutils:apacheBeanutils·p0.90    sample               8040,000             ns/op
Main.apacheBeanutils:apacheBeanutils·p0.95    sample              11296,000             ns/op
Main.apacheBeanutils:apacheBeanutils·p0.99    sample              12240,000             ns/op
Main.apacheBeanutils:apacheBeanutils·p0.999   sample              16736,000             ns/op
Main.apacheBeanutils:apacheBeanutils·p0.9999  sample             433931,878             ns/op
Main.apacheBeanutils:apacheBeanutils·p1.00    sample            1411072,000             ns/op
Main.mapstruct                                sample  1231453        92,158 ±   1,087   ns/op
Main.mapstruct:mapstruct·p0.00                sample                 80,000             ns/op
Main.mapstruct:mapstruct·p0.50                sample                 90,000             ns/op
Main.mapstruct:mapstruct·p0.90                sample                 91,000             ns/op
Main.mapstruct:mapstruct·p0.95                sample                110,000             ns/op
Main.mapstruct:mapstruct·p0.99                sample                131,000             ns/op
Main.mapstruct:mapstruct·p0.999               sample                261,000             ns/op
Main.mapstruct:mapstruct·p0.9999              sample               3670,184             ns/op
Main.mapstruct:mapstruct·p1.00                sample             396288,000             ns/op
Main.modelMapper                              sample  1416639      2252,156 ±  11,587   ns/op
Main.modelMapper:modelMapper·p0.00            sample               1932,000             ns/op
Main.modelMapper:modelMapper·p0.50            sample               2144,000             ns/op
Main.modelMapper:modelMapper·p0.90            sample               2284,000             ns/op
Main.modelMapper:modelMapper·p0.95            sample               2964,000             ns/op
Main.modelMapper:modelMapper·p0.99            sample               3496,000             ns/op
Main.modelMapper:modelMapper·p0.999           sample               7272,000             ns/op
Main.modelMapper:modelMapper·p0.9999          sample              19403,776             ns/op
Main.modelMapper:modelMapper·p1.00            sample             790528,000             ns/op
Main.springBeanutils                          sample  1427977      2222,116 ±  10,819   ns/op
Main.springBeanutils:springBeanutils·p0.00    sample               1932,000             ns/op
Main.springBeanutils:springBeanutils·p0.50    sample               2124,000             ns/op
Main.springBeanutils:springBeanutils·p0.90    sample               2324,000             ns/op
Main.springBeanutils:springBeanutils·p0.95    sample               2684,000             ns/op
Main.springBeanutils:springBeanutils·p0.99    sample               3096,000             ns/op
Main.springBeanutils:springBeanutils·p0.999   sample               6440,000             ns/op
Main.springBeanutils:springBeanutils·p0.9999  sample              16647,526             ns/op
Main.springBeanutils:springBeanutils·p1.00    sample             906240,000             ns/op
Main.apacheBeanutils                              ss           27635671,000             ns/op
Main.mapstruct                                    ss            4432466,000             ns/op
Main.modelMapper                                  ss           15123665,000             ns/op
Main.springBeanutils                              ss           31550434,000             ns/op

Process finished with exit code 0
```
