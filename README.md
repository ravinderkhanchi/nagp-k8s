Code repi link- https://github.com/ravinderkhanchi/nagp-k8s
Docker pull command for app image- docker pull ravindercool28/nagp-k8s:1.0

As I have used Minikube to setup the k8s cluster, I need to do tunneling for the same.

1. minikueb start and apply all the cofigmap, secrest and deployments.
2. In separate cmd run minkube tunnel
3. Url to get records- http://127.0.0.1:8080/products

If you are using minikube on windows directly, then you dont need to do tunnling.
1. minikueb start and apply all the cofigmap, secrest and deployments.
2. minikube ip = It will provide the IP on which you can access the application.
3. Url to get records- http://IP:ServicePort/products

