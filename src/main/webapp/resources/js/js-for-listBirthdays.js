function addBirthday() {
	$('#birthdayDialog').dialog("option", "title", 'Add Birthday');
	$('#birthdayDialog').dialog('open');
}

function editBirthday(id) {

	$.get("get/" + id, function(result) {

		$("#birthdayDialog").html(result);

		$('#birthdayDialog').dialog("option", "title", 'Edit Birthday');

		$("#birthdayDialog").dialog('open');

		initializeDatePicker();
	});
}

function initializeDatePicker() {
	$(".datepicker").datepicker({
		dateFormat : "yy-mm-dd",
		changeMonth : true,
		changeYear : true,
		showButtonPanel : true
	});
}

function resetDialog(form) {

	form.find("input").val("");
}

$(document).ready(function() {

	$('#birthdayDialog').dialog({

		autoOpen : false,
		position : 'center',
		modal : true,
		resizable : false,
		width : 440,
		buttons : {
			"Save" : function() {
				$('#bdForm').submit();
			},
			"Cancel" : function() {
				$(this).dialog('close');
			}
		},
		close : function() {

			resetDialog($('#bdForm'));

			$(this).dialog('close');
		}
	});

	initializeDatePicker();
});
