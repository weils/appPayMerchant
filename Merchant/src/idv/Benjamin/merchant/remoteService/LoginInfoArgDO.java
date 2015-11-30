package idv.Benjamin.merchant.remoteService;

import lombok.Data;

@Data
public class LoginInfoArgDO {
	
	private String callbackTarget;
	private String fnct;
	private String callbackUri;
	private String merchantId;
	private String orderAmount;
	private String orderNote;
	private String orderNum;
	private String orderSketch;
	private String orderSketchName;
	private String timestamp;
	private String vacc;
	private String vaccName;
	private String version;
	private String sign;
	
	
}
