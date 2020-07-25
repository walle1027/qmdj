package org.loed.qmdj.domain;

/**
 * @author Thomason
 * @version 1.0
 * @date 12-11-14 上午10:49
 */

public class RenPan {
	//方位
	private String fangWei;
	//卦
	private String gua;
	//宫位
	private int gongWei;
	//星座
	private String xingZuo;
	//五行属性
	private String wuXing;
	//门
	private String men;

	public RenPan() {
	}

	public RenPan(String fangWei, String gua, int gongWei, String xingZuo, String wuXing, String men) {
		this.fangWei = fangWei;
		this.gua = gua;
		this.gongWei = gongWei;
		this.xingZuo = xingZuo;
		this.wuXing = wuXing;
		this.men = men;
	}

	public String getFangWei() {
		return fangWei;
	}

	public void setFangWei(String fangWei) {
		this.fangWei = fangWei;
	}

	public String getGua() {
		return gua;
	}

	public void setGua(String gua) {
		this.gua = gua;
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

	public String getWuXing() {
		return wuXing;
	}

	public void setWuXing(String wuXing) {
		this.wuXing = wuXing;
	}

	public String getMen() {
		return men;
	}

	public void setMen(String men) {
		this.men = men;
	}
}
