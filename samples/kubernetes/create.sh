

kubectl create -f monitoring-namespace.yaml
# customize the namespaces of wls operator and domain in crossnsrbac.yaml
kubectl create -f crossnsrbac.yaml
kubectl create -f prometheus-deployment.yaml

kubectl create -f grafana-deployment.yaml 
