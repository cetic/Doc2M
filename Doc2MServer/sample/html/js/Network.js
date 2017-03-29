var port = 1234;
var Endpoint = "http://localhost:" + port + "/doc2M/";
var timeout = 3000;

var network_locateConcept = function(conceptId, successFunction, errorFunction){
	var url = Endpoint + "concepts/" + conceptId + "/locate";
	$.ajax({
		crossDomain: true,
		type: 'GET',
		url: url,
		success: successFunction,
		error: errorFunction,
		timeout: timeout,
		async: false,
		traditional: true,
		contentType: 'application/json; charset=utf-8',
		dataType: 'json'			
	});
}

var network_createConcept = function(conceptName, conceptType, successFunction, errorFunction){
	var url = Endpoint + "concepts";
	$.ajax({
		crossDomain: true,
		type: 'POST',
		url: url,
		data: JSON.stringify({
			name: conceptName,
			type: conceptType
		}),
		success: successFunction,
		error: errorFunction,
		timeout: timeout,
		async: false,
		traditional: true,
		contentType: 'application/json; charset=utf-8',
		dataType: 'json'			
	});
}

var network_getModel = function(successFunction, errorFunction){
	var url = Endpoint + "concepts";
	$.ajax({
		crossDomain: true,
		type: 'GET',
		url: url,		
		success: successFunction,
		error: errorFunction,
		timeout: timeout,
		async: false,
		traditional: true,
		contentType: 'application/json; charset=utf-8',
		dataType: 'json'			
	});

}

var network_getConceptTypes = function(successFunction, errorFunction){
	var url = Endpoint + "util/conceptTypes";
	$.ajax({
		crossDomain: true,
		type: 'GET',
		url: url,
		success: successFunction,
		error: errorFunction,
		timeout: timeout,
		async: false,
		traditional: true,
		contentType: 'application/json; charset=utf-8',
		dataType: 'json'			
	});
}