$document.ready(function(){
$("#actualizar-calificaciones").click(funcion(){
$.ajax({
url:"actualizar-calificaciones",
method:put;
data:{
id=1,
nombre=petra,
calificacion=8.5,
}
sucess:funcion(respuesta){
$("#resultado-calificaciones"html(repsuesta);
}
)};
)};
)},