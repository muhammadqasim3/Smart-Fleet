$('document').ready(function(){
	$('table #editButton').on('click', function(e){
		e.preventDefault();
		$('#editModal').modal();
	});
	
	$('.table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#deleteModal #delRef').attr('href', href);
		$('#deleteModal').modal();		
	});	
	
});