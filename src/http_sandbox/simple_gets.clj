(ns http-sandbox.simple_gets
  (:require [clojure.repl :refer :all]
            [clojure.pprint :refer [pprint]]
            [org.httpkit.client :as http]
            [cheshire.core :as json]))
(def x 42)

(ns-unmap 'http-sandbox.simple_gets 'x)

(find-doc "dir")

(dir http-sandbox.simple_gets)

(dir http)

(doc http.get)

@(http/get "https://www.evross.com" {:as :text}
          (fn [{:keys [status headers body error opts]}]
            ;; body is a java.lang.String
            ))

(let [response1 (http/get "http://http-kit.org/")
      response2 (http/get "http://clojure.org/")]
  ;; Handle responses one-by-one, blocking as necessary
  ;; Other keys :headers :body :error :opts
  (println "response1's status: " (:status @response1))
  (println "response2's status: " (:status @response2)))


