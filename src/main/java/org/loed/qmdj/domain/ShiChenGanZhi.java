package org.loed.qmdj.domain;

import java.io.Serializable;

/**
 * @author Thomason
 * @version 1.0
 * @date 12-11-8 上午11:44
 */

public class ShiChenGanZhi implements Serializable {
	//纪日干支
	private String jiRiGanZhi;
	//时辰范围
	private String shiJianFanWei;
	//时辰
	private String shiChen;
	//时辰干支
	private String shiChenGanZhi;

	public ShiChenGanZhi() {
	}

	public ShiChenGanZhi(String jiRiGanZhi, String shiJianFanWei, String shiChen, String shiChenGanZhi) {
		this.jiRiGanZhi = jiRiGanZhi;
		this.shiChen = shiChen;
		this.shiJianFanWei = shiJianFanWei;
		this.shiChenGanZhi = shiChenGanZhi;
	}

	public String getJiRiGanZhi() {
		return jiRiGanZhi;
	}

	public void setJiRiGanZhi(String jiRiGanZhi) {
		this.jiRiGanZhi = jiRiGanZhi;
	}

	public String getShiChen() {
		return shiChen;
	}

	public void setShiChen(String shiChen) {
		this.shiChen = shiChen;
	}

	public String getShiChenGanZhi() {
		return shiChenGanZhi;
	}

	public void setShiChenGanZhi(String shiChenGanZhi) {
		this.shiChenGanZhi = shiChenGanZhi;
	}

	public String getShiJianFanWei() {
		return shiJianFanWei;
	}

	public void setShiJianFanWei(String shiJianFanWei) {
		this.shiJianFanWei = shiJianFanWei;
	}
}
