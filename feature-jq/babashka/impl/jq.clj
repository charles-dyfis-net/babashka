(ns babashka.impl.jq
  {:no-doc true}
  (:require [sci.core :as sci :refer [copy-var]]
            [jq.api]))

;; compile -> runnable
(def jns (sci/create-ns 'jq.api))
(def jq-namespace
  {'execute (copy-var jq.api/execute jns)
   'processor (copy-var jq.api/processor jns)
   'flexible-processor (copy-var jq.api/flexible-processor jns)
  })
