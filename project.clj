(defproject lunch-box "0.1.0-SNAPSHOT"
:description "Lunch Box App"
:url "http://localhost:8080/"
:min-lein-version "2.0.0"
:main lunch-box.handler
:dependencies [[org.clojure/clojure "1.7.0"]
               [compojure "1.4.0"]
               [ring/ring-defaults "0.1.5"]
               [hiccup "1.0.2"]
               [org.clojure/java.jdbc "0.2.3"]
               [com.h2database/h2 "1.3.170"]
               [ring/ring-jetty-adapter "1.4.0"]
               ]
:plugins [[lein-ring "0.9.7"]]
:ring {:handler lunch-box.handler/app}
:profiles
{:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                      [ring/ring-mock "0.3.0"]]}})
