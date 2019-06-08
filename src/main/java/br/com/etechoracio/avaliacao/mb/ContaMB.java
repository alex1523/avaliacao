package br.com.etechoracio.avaliacao.mb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import br.com.etechoracio.avaliacao.entidades.Conta;
import br.com.etechoracio.avaliacao.service.ContaSB;
import br.com.etechoracio.common.view.BaseMB;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Controller
@Scope("view")
public class ContaMB extends BaseMB {
		
	@Autowired
	private ContaSB contaSB;
	private Conta edit = new Conta();
	
	public void onSave() {
		contaSB.save(edit);
		showInsertMessage();
	}
	
}
