package org.loed.qmdj.domain;

/**
 * @author Thomason
 * @version 1.0
 * @date 12-11-7 下午1:52
 */

public class QiMenDunJiaYongJu {
	private String jieQi;
	private String yinYang;
	private String yuan;
	private int ju;

	public QiMenDunJiaYongJu() {
	}

	public QiMenDunJiaYongJu(String jieQi, String yinYang, String yuan, int ju) {
		this.jieQi = jieQi;
		this.yinYang = yinYang;
		this.yuan = yuan;
		this.ju = ju;
	}

	public String getJieQi() {
		return jieQi;
	}

	public void setJieQi(String jieQi) {
		this.jieQi = jieQi;
	}

	public String getYinYang() {
		return yinYang;
	}

	public void setYinYang(String yinYang) {
		this.yinYang = yinYang;
	}

	public String getYuan() {
		return yuan;
	}

	public void setYuan(String yuan) {
		this.yuan = yuan;
	}

	public int getJu() {
		return ju;
	}

	public void setJu(int ju) {
		this.ju = ju;
	}

	@Override
	public String toString() {
		return "QiMenDunJiaYongJu{" +
				"jieQi='" + jieQi + '\'' +
				", yinYang='" + yinYang + '\'' +
				", yuan='" + yuan + '\'' +
				", ju=" + ju +
				'}';
	}
}
