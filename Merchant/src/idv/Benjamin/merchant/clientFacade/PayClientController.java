package idv.Benjamin.merchant.clientFacade;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayClientController {

	@RequestMapping("/payApply")
	public ClientRtnVO getPayReservation(HttpServletRequest request){
		
		ClientRtnVO rtn=new ClientRtnVO();
		
		
		return rtn;
	}
}
