# Kubernetes showcase

## pre requisites

* Docker
* Minikube

## Getting started

To quickly get started. run the [quick-start.sh](quick-start.sh) script. This does the following.
* starts minikube & enables the ingress addon
* builds all the java applications and turns them into docker images
* loads the docker images in minikube
* applies kubernetes config

this leaves  you with a running kubernetes cluster with a few deployed apps to get you started.

## Making api calls

currently the way to do this is by opening a terminal. and doing the following
```bash
  curl $(minikube ip)/java11
```