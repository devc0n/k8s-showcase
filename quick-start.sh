#!/usr/bin/env bash

# List your project directories here
projects=(
  "hello-java11"
  "hello-java17"
  "hello-java21"
  "hello-java25"
)

minikube start

minikube addons enable ingress

for project in "${projects[@]}"; do
  echo "=== Building $project ==="
  cd "$project" || { echo "Directory $project not found, skipping"; continue; }

  ./mvnw clean package || { echo "Maven build failed for $project, skipping docker build"; cd - >/dev/null; continue; }

  docker build -t "$project:local" . || { echo "Docker build failed for $project"; cd - >/dev/null; continue; }

  minikube image load $project:local

  cd - >/dev/null
done

kubectl apply -f k8s/
