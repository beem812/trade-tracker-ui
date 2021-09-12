(ns trade-tracker-ui.components.trade-list)

(defn trades-list [trades]
      [:div (map (fn [trade]
                   [:<>
                    [:div (:ticker trade)]
                    [:div (:price trade)]]) trades)])