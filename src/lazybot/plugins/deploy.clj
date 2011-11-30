(ns lazybot.plugins.deploy
  (:use lazybot.registry
        [compojure.core :only [POST]]
        clojure.data.json))

(defn handler [req]
  "Process JSON data payload sent by deploy agent."
  
