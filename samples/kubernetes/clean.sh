
kubectl delete -f grafana-deployment.yaml 
kubectl delete -f prometheus-deployment.yaml
kubectl delete -f crossnsrbac.yaml
kubectl delete -f monitoring-namespace.yaml

