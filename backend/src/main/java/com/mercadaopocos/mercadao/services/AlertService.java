package com.mercadaopocos.mercadao.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mercadaopocos.mercadao.DTO.AlertDTO;
import com.mercadaopocos.mercadao.entities.Alert;
import com.mercadaopocos.mercadao.repositories.AlertRepository;
import com.mercadaopocos.mercadao.services.exceptions.ResourceNotFoundException;

@Service
public class AlertService {

	@Autowired
	private AlertRepository repository;
	
	@Transactional(readOnly = true)
	public AlertDTO findById(Long id) {
		Alert alert = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Alert not found!"));
		return new AlertDTO(alert);
		
	}
	
	@Transactional(readOnly = true)
	public Page<AlertDTO> findAllPAge(Pageable pageable){
		Page<Alert> list = repository.findAll(pageable);
		Page<AlertDTO> listDTO = list.map(x -> new AlertDTO(x));
		return listDTO;
	}
	
	public AlertDTO insert(AlertDTO dto) {
		Alert alert = new Alert();
		alert.setId(dto.getId());
		alert.setName(dto.getName());
		alert.setText(dto.getText());
		alert.setStart(dto.getStart());
		alert.setEnd(dto.getEnd());
		alert = repository.save(alert);
		AlertDTO response = new AlertDTO(alert);
		return response;
	}
	
	public AlertDTO update(Long id, AlertDTO dto) {
		Alert alert = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Alert not found!"));
		alert.setName(dto.getName());
		alert.setText(dto.getText());
		alert.setStart(dto.getStart());
		alert.setEnd(dto.getEnd());
		alert = repository.save(alert);
		AlertDTO response = new AlertDTO(alert);
		return response;
		
	}
}
