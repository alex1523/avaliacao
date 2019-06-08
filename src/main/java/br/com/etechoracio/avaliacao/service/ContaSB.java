package br.com.etechoracio.avaliacao.service;



import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.etechoracio.avaliacao.dao.ContaDAO;
import br.com.etechoracio.avaliacao.entidades.Conta;
import br.com.etechoracio.common.business.BaseSB;


@Service
public class ContaSB extends BaseSB {
	
	private ContaDAO contaDAO;
	
	@Override
	protected void postConstructImpl() {
		contaDAO = getDAO(ContaDAO.class);
		
	}
	
	@Transactional(propagation = Propagation.REQUIRED)
	public void save(Conta conta) {
		contaDAO.save(conta);
	}

}
