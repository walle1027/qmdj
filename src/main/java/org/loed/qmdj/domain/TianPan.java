package org.loed.qmdj.domain;

/**
 * @author Thomason
 * @version 1.0
 * @date 12-11-12 下午4:58
 */

public class TianPan {
	//宫位
	private int gongWei;
	private String xingZuo;
	private String wuXingShuXing;
	private String gua;
	private String fangWei;
	private String bieMing;

	public TianPan() {
	}

	public TianPan(int gongWei,  String wuXingShuXing, String gua, String fangWei,String xingZuo, String bieMing) {
		this.gongWei = gongWei;
		this.xingZuo = xingZuo;
		this.wuXingShuXing = wuXingShuXing;
		this.gua = gua;
		this.fangWei = fangWei;
		this.bieMing = bieMing;
	}

	public int getGongWei() {
		return gongWei;
	}

	public void setGongWei(int gongWei) {
		this.gongWei = gongWei;
	}

	public String getXingZuo() {
		return xingZuo;
	}

	public void setXingZuo(String xingZuo) {
		this.xingZuo = xingZuo;
	}

	public String getWuXingShuXing() {
		return wuXingShuXing;
	}

	public void setWuXingShuXing(String wuXingShuXing) {
		this.wuXingShuXing = wuXingShuXing;
	}

	public String getGua() {
		return gua;
	}

	public void setGua(String gua) {
		this.gua = gua;
	}

	public String getFangWei() {
		return fangWei;
	}

	public void setFangWei(String fangWei) {
		this.fangWei = fangWei;
	}

	public String getBieMing() {
		return bieMing;
	}

	public void setBieMing(String bieMing) {
		this.bieMing = bieMing;
	}
}
