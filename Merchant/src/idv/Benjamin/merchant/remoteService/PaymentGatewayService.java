package idv.Benjamin.merchant.remoteService;

public interface PaymentGatewayService {

	public String getLoginLinkInfoForIdentity(LoginInfoArgDO arg);
	
	public String getLoginLinkInfoForPayment(LoginInfoArgDO arg);
	
	
	public TranscationResult queryTransactionResult();
	
	
	
	
	
	
	
}
