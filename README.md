segingfoucinf
=============

Ejercicio de encriptación de cadenas de String.

Debe recibir como entrada un String y un caracter que hace de _clave de encriptación_

Debe obtener el valor ASCII de la clave y convertirlo a su representación denúmero binario, de 8 dígitos.

Por cada letra del string recibido debe realizar lo siguiente:
* Obtener el valor ASCII
* Convertir el valor ASCII a su binario correspondiente, de 8 dígitos.
* Operar el valor obtenido con el valor binario de la clave, utilizando el operador XOR
* Convertir el resultado binario del paso anterior a número
* Obtener el caracter ASCII del resultado anterior

El resto es concatenar cada uno de los resultados y obtener la cadena encriptada.

