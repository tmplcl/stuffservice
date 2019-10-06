# Build
mvn clean package && docker build -t org.tmplcl/stuffservice .

# RUN

docker rm -f stuffservice || true && docker run -d -p 8080:8080 -p 4848:4848 --name stuffservice org.tmplcl/stuffservice #   s t u f f s e r v i c e  
 