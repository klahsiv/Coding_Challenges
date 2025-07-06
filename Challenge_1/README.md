# Coding Challenge 1 - Word Counter

Implementing WC tool following [Build Your Own wc Tool](https://codingchallenges.fyi/challenges/challenge-wc "Build Your Own wc Tool") made by [John Crickett](https://x.com/johncrickett)

## TeckStack

Language : Java (openjdk version "17.0.15")
Package Manager : Gradle (Gradle 8.14.2)

Libraries
* Command Line Tool
    * [Picocli](https://picocli.info/)

## Install And Run

### Build
Make sure you are inside Challenge_1 Folder.
```bash
./gradlew clean installDist
```
This will creates create an image of the application. We run it through wc.sh shell script.

### Run

File Path is required. If not provided, it will output help information

```bash
./wc.sh
Missing required parameter: '<file>'
Usage: ccwc [-chlmVw] <file>
Count number of characters, words, lines in a file
      <file>      File for which calculation is done
  -c              Get Count of Bytes
  -h, --help      Show this help message and exit.
  -l              Get Count of Lines
  -m              Get Count of Charcters
  -V, --version   Print version information and exit.
  -w              Get Count of Words
```

Running with just filePath, it will provide output for 3 flags.
\-c ( Byte Count)
\-w ( Word Count)
\-l ( Line Count)

```bash
./wc.sh app/src/test/resources/test.txt
Bytes : 342190
Word : 58164
Lines : 7145
```

Running with all flags
```bash
./wc.sh -c -w -l -m app/src/test/resources/test.txt
Bytes : 342190
Characters : 339292
Word : 58164
Lines : 7145
```
