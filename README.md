
# Herramienta de gestión: Concurso de Programacion ORT

El *Concurso de Programación* se realiza desde hace varios años en la Facultad. Participan hasta 15 equipos
de estudiantes. Consiste en resolver problemas. Por cada problema, hay un archivo con el resultado oficial para
ciertos datos de prueba. A medida que cada equipo va resolviendo un ejercicio, envía su programa, el cual es
ejecutado con los datos oficiales y el archivo resultado es verificado con el resultado oficial. Si está
completamente correcto, obtiene un punto. El tiempo de resolución hasta la entrega de ese ejercicio también se
registra y será utilizado en casos de empate.

Cada equipo puede enviar múltiples veces la resolución de cada ejercicio. Apenas envíe un ejercicio correcto,
el equipo obtiene un punto por el ejercicio y los posteriores envíos de ese ejercicio no se tienen en cuenta. Si
previo al envío de un ejercicio correcto, hubiera entregas incorrectas de ese mismo ejercicio, se le sumará al
tiempo del ejercicio una multa de 20 minutos por cada entrega previa errónea. No se contarán las penalizaciones
para aquellos ejercicios que no pudieron ser resueltos al terminar el concurso.

Gana el equipo que tenga mayor cantidad de puntos, y en caso de coincidencia, el que tenga menor tiempo
total acumulado entre todos sus ejercicios correctamente resueltos.


## En el sistema es posible:

 - **Registrar estudiante** *(nombre, CI, mail, número, semestre)*: Es posible visualizar todos los estudiantes.
   
 - **Registrar docente** *(nombre, CI, mail, año de ingreso)*: Es posible visualizar todos los docentes.

   

 - **Registrar equipo en el Concurso**:  Se eligen los 3 estudiantes que conforman el equipo. El nombre del equipo se auto-genera con la palabra "Equipo" y un número consecutivo (ej. Equipo 1). Es posible visualizar todos los equipos. Cada estudiante puede estar en un único equipo.

   
 

 - **Registrar Problema**: Cada problema tiene un título (que debe ser único), descripción, el link al archivo de datos de salida oficial y un docente responsable del problema. Es posible visualizar todos los problemas.

   
  

 - **Carga individual de envío de solución de equipo a problema**: En el sistema se almacenará información de cada envío. Para ello, se elige de listas el problema que se está resolviendo, el equipo, el lenguaje utilizado (Java, C++ o Python) y se selecciona de una lista el nombre del archivo generado a partir de la ejecución de la resolución del equipo, se indica los minutos desde el comienzo del Concurso. (*Nota: La generación del archivo resultado a partir del código del equipo serealiza previamente y fuera de este sistema.*) 
Además, el sistema verifica e informa si el contenido del archivo del equipo coincide con el archivo de salida del problema. Los resultados posibles de dicha verificación son: **ok** (*coincide completamente*) o **incorrecto**.   Puede ser incorrecto por formato (*el archivo del equipo contiene más espacios de los necesarios entre las diferentes palabras de cada línea y, o hay diferencias de mayúsculas/minúsculas con el oficial*), o incorrecto por datos (*contiene algún dato mal u otros errores*).   Se visualiza en pantalla línea a línea el resultado de cada una incluyendo el número de línea, signo (*“*” corresponde a error de datos, “-“ corresponde a error de formato, “+” ok*) y color (*rojo: mal datos, amarillo: error de formato, verde: ok*), la cantidad de líneas erróneas y total de líneas mostradas, así como el resultado general  del ejercicio. Como máximo se visualizan en pantalla las 20 primeras líneas. Emite también la información del resultado en forma sonora. En esta interfaz, el botón seleccionar es para elegir el archivo, cancelar para anular dicha selección y el botón verificar para realizar el chequeo del archivo seleccionado. Al hacer la verificación, se registra en el sistema el envío del ejercicio y su resultado.

   

 - **Carga global de resultados de envíos**: A partir de un archivo dado, se puede ingresar en el sistema en forma global el resultado de envíos ya probados. Se elige el archivo y se realiza la carga de cada uno de los resultados de envíos. Cada línea de este archivo contiene: **nombre de equipo#lenguaje#título del ejercicio#minutos#resultado** . El resultado es 1:ok, 2:incorrecto formato, 3: incorrecto datos. La única inconsistencia a verificar es si el nombre del equipo no corresponde a ninguno registrado, en ese caso se agregará una línea en el archivo "Inconsistencias.txt", informando el número de línea y el nombre erróneo. Esa línea se ignora para la carga. El archivo de Inconsistencias es único.

   
  

 -  **Visualización de resultados**: Se visualiza en una ventana independiente, una matriz con una fila por equipo y una columna por problema, con el resultado del Concurso hasta ese momento. Los nombres de los equipos están ubicados al comienzo de cada fila, fuera de la matriz, con colores alternados. Los nombres de los problemas están ubicados sobre cada columna fuera de la matriz, con colores alternados. Al final de cada fila se indica el total de puntos obtenido y el tiempo acumulado por el equipo. En cada posición de la matriz aparece un botón que es: **verde** (resuelto correctamente, incluir el texto: tiempo total del ejercicio incluyendo multas si tiene y total de envíos), **rojo** (intentado incorrectamente, incluir el texto: cantidad de envíos) o **blanco** (no intentado). Al presionar cada botón, aparece en una ventana emergente la secuencia de envíos del problema por el equipo y sus resultados. Es posible ordenar las filas de la matriz por nombre de equipo o por cantidad de ejercicios resueltos decreciente/tiempo creciente.

   

 - **Estadísticas**: En otra ventana se puede visualizar una tabla con estadísticas por ejercicio. Cada ejercicio incluye cantidad de equipos que lo resolvieron correctamente y tiempo hasta la primera resolución correcta.
