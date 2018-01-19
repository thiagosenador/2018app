FROM gcr.io/google_appengine/jetty9

ADD airie-api.war $JETTY_BASE/webapps/root.war
ADD . /app
RUN chown jetty:jetty $JETTY_BASE/webapps/root.war