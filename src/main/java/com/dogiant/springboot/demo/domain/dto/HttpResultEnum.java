package com.dogiant.springboot.demo.domain.dto;

/**
 * HTTP结果枚举类
 */
public enum HttpResultEnum {
	Undefined("-100", "未定义异常"),
	UnknownHost("-7", "请求地址不正确"), 
	IllegalCharset("-6", "不支持的字符集"), 
	CloseError("-5", "关闭HttpClient错误"), 
	IOError("-4", "读取IO流错误"), 
	UnsupportedEncoding("-3", "编码不支持错误"), 
	ProtocolERROR("-2", "HTTP协议错误"), 
	Failed("-1", "请求失败"), 
	Success("0", "请求成功"), 
	Redirect("redirect", "重定向"), 
	;
	public final String code;
	public final String msg;

	private HttpResultEnum(String code, String msg) {
		this.code = code;
		this.msg = msg;
	}

}
