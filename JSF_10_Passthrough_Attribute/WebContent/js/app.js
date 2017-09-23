/**
 * 
 */
$(document).ready(function() {
	$("#locations").hide();
	//
	$("#linkForm").click(function() {
		toggleForms();
		$("#itemLocations").removeClass("active");
		("#itemForm").addClass("active");
	});
	//
	$("#linkLocations").click(function() {
		toggleForms();
		$("#itemForm").removeClass("active");
		("#itemLocations").addClass("active");
	});
})

function toggleForms() {
	$("#locations").toggle();
	$("#form").toggle();

}