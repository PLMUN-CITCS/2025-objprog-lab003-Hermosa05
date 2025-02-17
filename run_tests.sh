#!/bin/bash

# Run the Java program and capture the output
output=$(java InputOutputDemo.java < tests/input.txt)

# Expected output
expected=$(cat tests/output.txt)

# Check if output matches expected
if [ "$output" == "$expected" ]; then
  echo "Tests passed"
  exit 0
else
  echo "Tests failed"
  echo "Expected:"
  echo "$expected"
  echo "Got:"
  echo "$output"
  exit 1
fi