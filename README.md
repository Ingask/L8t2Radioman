# Цикломатическая сложность кода
- Цикломатическая сложность программы - структурная мера сложности компьютерной программы.
- Цикломатическая сложность части программного кода — количество линейно независимых маршрутов через программный код.
- Например, если исходный код не содержит никаких точек ветвления или циклов, то сложность равна единице, поскольку есть только единственный маршрут через код.
- Если код имеет единственный оператор IF, содержащий простое условие, то существует два пути через код: один если условие оператора IF имеет значение TRUE и один — если FALSE.
- Математически цикломатическая сложность структурированной программы определяется с помощью ориентированного графа, узлами которого являются блоки программы, соединенные рёбрами, если управление может переходить с одного блока на другой. 
Тогда сложность определяется как:
M = E − N + 2P,
где:
M = цикломатическая сложность,
E = количество рёбер в графе,
N = количество узлов в графе,
P = количество компонент связности.
- Одно из первоначально предложенных  применений состоит в том, что необходимо ограничивать сложность программ во время их разработки.
- Рекомендовано, чтобы программистов обязывали вычислять сложность разрабатываемых ими модулей и разделять модули на более мелкие всякий раз, когда цикломатическая сложность этих модулей превысит десять.
- Эта практика была включена НИСТ-ом в методику структурного тестирования с замечанием, что со времени исходной публикации Маккейба выбор значения 10 получил весомые подтверждения, однако в некоторых случаях может быть целесообразно ослабить ограничение и разрешить модули со сложностью до 15.
- В данной методике признаётся, что иногда могут существовать причины для выхода за рамки согласованного лимита.
- Это сформулировано как рекомендация: «Для каждого модуля следует либо ограничивать цикломатическую сложность до согласованных пределов, либо предоставить письменное объяснение того, почему лимит был превышен».
