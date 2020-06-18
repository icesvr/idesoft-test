package com.idesofttest.app.services;

import org.springframework.http.ResponseEntity;

import com.idesofttest.app.model.GenericResponse;

public interface MainService {
	
	public ResponseEntity<GenericResponse> getByComuna(String comuna);

}
