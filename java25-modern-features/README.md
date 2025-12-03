
# java25-modern-features

Maven project demonstrating Java 25 language features:
- records
- sealed classes
- pattern matching
- text blocks
- switch expressions
- preview features (ScopedValue, Structured Concurrency)

Build & run (requires JDK 25, and Maven):
- mvn -v
- mvn -e -DskipTests package
- java --enable-preview -jar target/java25-modern-features-1.0.0.jar

Notes:
- This project uses preview APIs; run with --enable-preview both at compile and runtime.
- If your JDK doesn't support StructuredTaskScope or ScopedValue, those demo sections will print a fallback message.
