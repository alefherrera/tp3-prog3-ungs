# tp3-prog3-ungs
tp3 programacion 3 ungs
Se acerca la Copa Am´erica, y la oficina de prensa nos ha solicitado una aplicaci´on para determinar el equipo ideal una vez finalizado el campeonato. Esta aplicaci´on debe permitir la carga de todos los jugadores que participaron en la copa, y para cada jugador se tienen los siguientes datos:
1. Nombre del jugador.
2. Selecci´on a la que pertenece.
3. Posici´on en la cancha (arquero, defensor, mediocampista o delantero).
4. Puntaje del jugador. Este dato se obtiene promediando los puntajes que obtuvo el
jugador en los partidos en los que jug´o. Si el jugador no particip´o en ning´un partido,
entonces el jugador no se carga en la aplicaci´on.
5. Tarjetas amarillas recibidas por el jugador.
6. Tarjetas rojas recibidas por el jugador.
#Con estos datos, la aplicaci´on debe calcular el equipo ideal por medio de un algoritmo de fuerza bruta o backtracking. El equipo ideal debe cumplir las siguientes condiciones:
1. Debe tener un arquero, cuatro defensores, tres mediocampistas y tres delanteros.
2. No debe tener m´as de 5 jugadores de la misma selecci´on.
3. No debe tener m´as de 3 jugadores que hayan recibido tarjetas amarillas.
4. No debe tener m´as de 1 jugador que haya recibido una tarjeta roja.
#Entre todas las combinaciones de jugadores que cumplan estas condiciones, se debe seleccionar
el equipo con la mayor suma de puntos (es decir, el equipo tal que la suma de los puntajes de
sus jugadores sea la mayor posible). La aplicaci´on debe contar con una interfaz visual para
cargar los datos, utilizando las bibliotecas Swing. Adem´as, debe realizar un almacenamiento
persistente de los datos, por medio de serializaci´on a archivos.
Condiciones de entrega: El trabajo pr´actico se debe entregar impreso y por mail a los
docentes de la materia. Adem´as del c´odigo, se debe incluir un documento en el que se describa
la implementaci´on y se detallen las decisiones tomadas durante el desarrollo. Todas las clases
de la capa de negocio deben incluir un conjunto adecuado de tests unitarios. Incluir un
diagrama de las clases utilizadas y las relaciones entre ellas. El trabajo pr´actico se puede
hacer en grupos de hasta tres personas.
Fecha de entrega: Jueves 11 de Junio.
