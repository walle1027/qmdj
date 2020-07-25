package org.loed.qmdj.domain;

/**
 * @author Thomason
 * @version 1.0
 * @date 12-11-8 下午2:15
 */

public class JiaZi {
	//序号
	private int index;
	//天干
	private String tianGan;
	//地支
	private String diZhi;
	//上中下三元
	private String yuan;
	//符头
	private String futou;

	public JiaZi() {
	}

	public JiaZi(int index, String ganZhi, String yuan, String futou) {
		this.index = index;
		this.tianGan = ganZhi.substring(0, 1);
		this.diZhi = ganZhi.substring(1);
		this.yuan = yuan;
		this.futou = futou;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getTianGan() {
		return tianGan;
	}

	public void setTianGan(String tianGan) {
		this.tianGan = tianGan;
	}

	public String getDiZhi() {
		return diZhi;
	}

	public void setDiZhi(String diZhi) {
		this.diZhi = diZhi;
	}

	public String getYuan() {
		return yuan;
	}

	public void setYuan(String yuan) {
		this.yuan = yuan;
	}

	public String getFutou() {
		return futou;
	}

	public void setFutou(String futou) {
		this.futou = futou;
	}
}
