$(document).ready(function() {
	$('#submit_post').on('click', function(e) {
		$('.user_info h3').remove()
		$.ajax({
			method : 'POST',
			dataType : 'json',
			url : '/get_user_info',
			data : {
				'userId' : '12'
			},
			complete : function(res) {
				var user = res.responseJSON
				var user_info_div = $('.user_info')
				user_info_div.append($('<h3></h3>').text('Name: ' + user.firstName + ' ' + user.lastName))
				user_info_div.append($('<h3></h3>').text('Sex: ' + user.sexEnum))
				user_info_div.append($('<h3></h3>').text('Birth Date: ' + user.dateOfBirth))
			}
		})
	})
})