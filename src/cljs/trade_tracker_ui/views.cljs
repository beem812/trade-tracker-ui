(ns trade-tracker-ui.views
  (:require
   [re-frame.core :as re-frame]
   [trade-tracker-ui.subs :as subs]
   [trade-tracker-ui.components.trade-list :refer [trades-list]]
   ))

(def trades {:ticker "PLTR" :price 1.00})

(defn main-panel []
  (let [name (re-frame/subscribe [::subs/name])]
    [:div
     [:h1 "Hello from " @name]
     [trades-list [trades]]
     (map (fn [trade] 
            [:<> (:ticker trade)]) [trades])]))

(comment 
  (main-panel)
  (trades-list [trades]))