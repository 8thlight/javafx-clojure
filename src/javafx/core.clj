(ns javafx.core
  (:import [javax.swing SwingUtilities JFrame JLabel]))

(defn -main [& args]
  (SwingUtilities/invokeLater
    (proxy [Object Runnable] []
      (run []
        (let [label (JLabel. "Hello World")
              frame (JFrame. "HelloWorldSwing")]
          (.setDefaultCloseOperation frame JFrame/EXIT_ON_CLOSE)
          (.add (.getContentPane frame) label)
          (.pack frame)
          (.setVisible frame true))))))
