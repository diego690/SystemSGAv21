/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$('document').ready(function(){
    $('table #editButton').on('click',function(event){
        event.preventDefault();
        //docentes/findById(id)
        
        var href = $(this).attr('href');
        $.get(href, function(estudiante, status){
            $('#idestudianteEdit').val(estudiante.idestudiante);
            $('#carnetEdit').val(estudiante.canetestudiante);
            $('#apellidoEdit').val(estudiante.apellidosestudiante);
            $('#nombreEdit').val(estudiante.nombresestudiante);
            $('#cedulaEdit').val(estudiante.cedulaestudiante);
            $('#emailEdit').val(estudiante.correoestudiante);
            $('#celularEdit').val(estudiante.celularestudiante);
            $('#telefonoEdit').val(estudiante.telefonoestudiante);
            $('#direccionEdit').val(estudiante.direccionestudiante);
            $('#fechaEdit').val(estudiante.fnacimiento);
        });
        
        
        
        $('#editModal').modal();
    });
    
    $('table #deleteButton').on('click',function(event){
        event.preventDefault();
         var href = $(this).attr('href');
         $('#confirmDeleteButton').attr('href',href);
        $('#deleteModal').modal();
    });
});
