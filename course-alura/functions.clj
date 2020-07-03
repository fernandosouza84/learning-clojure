; exec
; -> lein repl
; -> (load-file "course-alura/basic.clj")

;Define new function
;; (defn imprime-mensagem []
;;   (println "--------------")
;;   (println "Bem vindo(a) ao estoque"))

;; (imprime-mensagem)

;; ; function aplica-desconto
;; (defn aplica-desconto 
;;   "Retorna o valor com desconto de 10%"
;;   [valor-bruto]
;;   (* valor-bruto (- 1 0.10)))

;; (aplica-desconto 100)


; define vars local

;; (defn valor-descontado
;;   "Retorna o valor com desconto de 10%."
;;   [valor-bruto]
;;   (let [desconto 0.10]
;;     (* valor-bruto (- 1 desconto))))

;; (valor-descontado 100)


;; (defn valor-descontado
;;   "Retorna o valor com desconto de 10%."
;;   [valor-bruto]
;;   (let [desconto (/ 10 100)]
;;     (println "Calculando desconto de" desconto)
;;     (* valor-bruto (- 1 desconto))))

;; (valor-descontado 100)

; verify type
;; (class (valor-descontado 100))


; conditions

(defn valor-descontado
  "Retorna o valor com desconto de 10% se o valor bruto for estritamente maior que 100."
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (println "Calculando desconto de" desconto)
      (- valor-bruto desconto))
    valor-bruto))

(valor-descontado 100)

(valor-descontado 1000)