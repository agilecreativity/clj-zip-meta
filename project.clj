(defproject clj-zip-meta "1.0"
  :description "a library for reading meta data from zip/jar files"
  :url "http://example.com/FIXME"
  :license {:name "Some Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [funcool/octet "1.0.2"]]
  :source-paths ["src/main"]
  :resource-paths ["src/main/resources"]
  :test-paths ["src/test"]
  :dev {:resource-paths ["src/test/resources"]}

  :profiles {:dev {:dependencies [[midje "1.8.3"]]}}        ; unit testing framework]

  :plugins [[lein-midje "3.2.1"]]                           ; testing framework

  )

