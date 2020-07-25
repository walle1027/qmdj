package org.loed.qmdj.domain;

/**
 * @author Thomason
 * @version 1.0
 * @date 12-11-14 上午11:14
 */

public class ShenPan {
	private int index;
	//神
	private String shen;
	//名字
	private String mingZi;
	//禀
	private String bing;
	//性格
	private String xingGe;

	public ShenPan() {
	}

	public ShenPan(int index, String shen, String mingZi, String bing, String xingGe) {
		this.index = index;
		this.shen = shen;
		this.mingZi = mingZi;
		this.bing = bing;
		this.xingGe = xingGe;
	}

	public String getShen() {
		return shen;
	}

	public void setShen(String shen) {
		this.shen = shen;
	}

	public String getMingZi() {
		return mingZi;
	}

	public void setMingZi(String mingZi) {
		this.mingZi = mingZi;
	}

	public String getBing() {
		return bing;
	}

	public void setBing(String bing) {
		this.bing = bing;
	}

	public String getXingGe() {
		return xingGe;
	}

	public void setXingGe(String xingGe) {
		this.xingGe = xingGe;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
