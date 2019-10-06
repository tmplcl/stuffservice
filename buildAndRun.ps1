mvn clean package
docker build -t org.tmplcl/stuffservice .
docker rm -f stuffservice
docker run -p 9080:9080 --name stuffservice org.tmplcl/stuffservice