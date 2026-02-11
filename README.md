# Java Stream API Practice Project

This project demonstrates various **Java 8 Stream API** use cases using number-based examples.  
Each use case focuses on a specific Stream operation to build strong foundational understanding.

---

## Technologies Used

- Java 8+
- Stream API
- Collections Framework

---

# Use Cases Implemented

---

## UC1 – Create Stream and Iterate

**Description:**  
Create a stream from a List and iterate using `forEach()`.

```java
numbers.stream().forEach(System.out::println);
```

---

## UC2 – Transform Elements (Double Each Number)

**Description:**  
Use `map()` to transform each element and display the result.

```java
numbers.stream()
       .map(x -> x * 2)
        .forEach(System.out::println);
```

---

## UC3 – Transform Elements (Double Each Number) and Storing Them.

**Description:**  
Use `map()` to transform each element and store the result.

```java
numbers.stream()
       .map(x -> x * 2)
       .collect(Collectors.toList());
```

---

## UC4 – Filter Even Numbers

**Description:**  
Use `filter()` to select only even numbers.

```java
numbers.stream()
       .filter(x -> x % 2 == 0)
       .collect(Collectors.toList());
```

---

## UC5 – Find First Even Number

**Description:**  
Use `findFirst()` and handle the result using `Optional`.

```java
numbers.stream()
       .filter(x -> x % 2 == 0)
       .findFirst();
```

---

## UC6 – Find Minimum and Maximum Even Numbers

**Description:**  
Use `min()` and `max()` with a comparator.

```java
numbers.stream()
       .filter(x -> x % 2 == 0)
       .min(Integer::compareTo);

numbers.stream()
       .filter(x -> x % 2 == 0)
       .max(Integer::compareTo);
```

---

## UC7 – Find Sum and Average

**Description:**  
Convert to primitive stream using `mapToInt()` and use `sum()` and `average()`.

```java
int sum = numbers.stream()
                 .mapToInt(Integer::intValue)
                 .sum();

double average = numbers.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0);
```

---

## UC8 – Match Operations

**Description:**  
Use `allMatch()` and `anyMatch()`.

```java
boolean allEven = numbers.stream()
                         .allMatch(x -> x % 2 == 0);

boolean anyEven = numbers.stream()
                         .anyMatch(x -> x % 2 == 0);
```

---

## UC9 – Sort Numbers

**Description:**  
Sort numbers in ascending order using `sorted()`.

```java
numbers.stream()
       .sorted()
       .collect(Collectors.toList());
```

---

# Key Concepts Covered

- Stream Creation
- Intermediate Operations
    - map()
    - filter()
    - sorted()
- Terminal Operations
    - forEach()
    - collect()
    - findFirst()
    - min()
    - max()
    - sum()
    - average()
    - allMatch()
    - anyMatch()
- Optional Handling
- Primitive Streams (`IntStream`)

---

# Important Notes

- Streams do not modify the original collection.
- Terminal operations close the stream.
- Primitive streams improve performance by avoiding boxing/unboxing.
- Optional prevents NullPointerException.

---

# Learning Outcome

After completing this project, you will understand:

- Stream lifecycle
- Difference between intermediate and terminal operations
- Transformation, filtering, aggregation, and sorting using Streams
- Safe handling of empty results using Optional

---

# Author

**Developer:** Akhil Puri 
**Version:** 2.9
