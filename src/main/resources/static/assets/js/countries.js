$('document').ready(function(){
	$('table #editButton').on('click', function(e){
		e.preventDefault();
		$('#editModal').modal();
	});
	
	
	
	$('table #deleteButton').on('click', function(event){
		//event.preventDefault();
		
		var href = $(this).attr('href');
		$('#confirmDeleteButton').attr('href', href); // assign href to popup modal yes option
		$('#deleteModal').modal();
	})
	
});