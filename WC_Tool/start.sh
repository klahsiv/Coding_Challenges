#!/bin/bash

# # Check if the filename argument is provided
# if [ -z "$1" ]; then
#     echo "Usage: $0 <filename>"
#     exit 1
# fi

java.exe -jar "target/WC_Tool-0.0.1-SNAPSHOT.jar" "$@"