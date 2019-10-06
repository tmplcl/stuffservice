FROM open-liberty:kernel

# Add my app and config
COPY --chown=1001:0  target/stuffservice.war /config/dropins/
COPY --chown=1001:0  src/main/config/server.xml /config/

# Optional functionality
ARG SSL=true
ARG MP_MONITORING=true

# This script will add the requested XML snippets and grow image to be fit-for-purpose
RUN configure.sh