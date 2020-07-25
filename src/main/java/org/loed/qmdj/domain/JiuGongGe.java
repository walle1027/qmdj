package org.loed.qmdj.domain;


import java.io.Serializable;

/**
 * @author Thomason
 * @version 1.0
 * @date 12-11-7 上午10:42
 */

public class JiuGongGe implements Serializable {
	//序号
	private int index;
	//符值
	private int gongWei;
	//宫位别名
	private String gongWeiBieMing;
	//三奇六仪
	private String sanQiLiuYi;
	//天盘
	private TianPan tianPan;
	//天盘携带的原始的三奇六仪
	private String tianPanSanQiLiuYi;
	//寄天盘
	private TianPan tianPan2;
	//寄天盘携带的原始的三奇六仪
	private String tianPanSanQiLiuYi2;
	//地盘
	private String diPan;
	//人盘
	private RenPan renPan;
	//神盘
	private ShenPan shenPan;

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getGongWei() {
		return gongWei;
	}

	public void setGongWei(int gongWei) {
		this.gongWei = gongWei;
	}


	public TianPan getTianPan() {
		return tianPan;
	}

	public void setTianPan(TianPan tianPan) {
		this.tianPan = tianPan;
	}

	public String getDiPan() {
		return diPan;
	}

	public void setDiPan(String diPan) {
		this.diPan = diPan;
	}

	public RenPan getRenPan() {
		return renPan;
	}

	public void setRenPan(RenPan renPan) {
		this.renPan = renPan;
	}

	public TianPan getTianPan2() {
		return tianPan2;
	}

	public void setTianPan2(TianPan tianPan2) {
		this.tianPan2 = tianPan2;
	}

	public String getTianPanSanQiLiuYi() {
		return tianPanSanQiLiuYi;
	}

	public void setTianPanSanQiLiuYi(String tianPanSanQiLiuYi) {
		this.tianPanSanQiLiuYi = tianPanSanQiLiuYi;
	}

	public String getTianPanSanQiLiuYi2() {
		return tianPanSanQiLiuYi2;
	}

	public void setTianPanSanQiLiuYi2(String tianPanSanQiLiuYi2) {
		this.tianPanSanQiLiuYi2 = tianPanSanQiLiuYi2;
	}

	public ShenPan getShenPan() {
		return shenPan;
	}

	public void setShenPan(ShenPan shenPan) {
		this.shenPan = shenPan;
	}

	public String getGongWeiBieMing() {
		return gongWeiBieMing;
	}

	public void setGongWeiBieMing(String gongWeiBieMing) {
		this.gongWeiBieMing = gongWeiBieMing;
	}

	public String getSanQiLiuYi() {
		return sanQiLiuYi;
	}

	public void setSanQiLiuYi(String sanQiLiuYi) {
		this.sanQiLiuYi = sanQiLiuYi;
	}
}
