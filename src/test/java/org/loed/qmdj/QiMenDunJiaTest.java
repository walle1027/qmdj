package org.loed.qmdj;

import org.junit.Test;
import org.loed.qmdj.core.QiMenDunJia;
import org.loed.qmdj.domain.JiuGongGe;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author Thomason
 * @version 1.0
 * @date 12-11-7 下午6:05
 */

public class QiMenDunJiaTest {
	@Test
	public void testGetDipan1() throws Exception {
		String testDateStr = "2011-12-23 04:30:00";
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		Date testDate = sdf.parse(testDateStr);
		QiMenDunJia qiMenDunJia = new QiMenDunJia();
		List<JiuGongGe> jiuGongGeList = qiMenDunJia.qiPan(testDate);
		System.out.println("测试日期:" + testDateStr);
		printJiuGongGe(jiuGongGeList);
	}

	@Test
	public void testGetDipan2() throws Exception {
		String testDateStr = "2011-12-22 20:30:00";
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		Date testDate = sdf.parse(testDateStr);
		QiMenDunJia qiMenDunJia = new QiMenDunJia();
		List<JiuGongGe> jiuGongGeList = qiMenDunJia.qiPan(testDate);
		System.out.println("测试日期:" + testDateStr);
		printJiuGongGe(jiuGongGeList);
	}

	@Test
	public void testGetDipan3() throws Exception {
		String testDateStr = "2011-12-25 04:30:00";
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		Date testDate = sdf.parse(testDateStr);
		QiMenDunJia qiMenDunJia = new QiMenDunJia();
		List<JiuGongGe> jiuGongGeList = qiMenDunJia.qiPan(testDate);
		System.out.println("测试日期:" + testDateStr);
		printJiuGongGe(jiuGongGeList);
	}

	@Test
	public void testGetDipan4() throws Exception {
		String testDateStr = "2011-06-23 10:30:00";
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		Date testDate = sdf.parse(testDateStr);
		QiMenDunJia qiMenDunJia = new QiMenDunJia();
		List<JiuGongGe> jiuGongGeList = qiMenDunJia.qiPan(testDate);
		System.out.println("测试日期:" + testDateStr);
		printJiuGongGe(jiuGongGeList);
	}

	@Test
	public void testGetDipan5() throws Exception {
		String testDateStr = "1995-06-11 09:30:00";
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		Date testDate = sdf.parse(testDateStr);
		QiMenDunJia qiMenDunJia = new QiMenDunJia();
		List<JiuGongGe> jiuGongGeList = qiMenDunJia.qiPan(testDate);
		System.out.println("测试日期:" + testDateStr);
		printJiuGongGe(jiuGongGeList);
	}

	@Test
	public void testToday() throws Exception {
		Date testDate = new Date();
		QiMenDunJia qiMenDunJia = new QiMenDunJia();
		List<JiuGongGe> jiuGongGeList = qiMenDunJia.qiPan(testDate);
		System.out.println("测试日期:" + testDate);
		printJiuGongGe(jiuGongGeList);
	}

	private void printJiuGongGe(List<JiuGongGe> jiuGongGeList) {
		StringBuilder builder = new StringBuilder();
		for (JiuGongGe jiuGongGe : jiuGongGeList) {
			builder.append(jiuGongGe.getGongWei());
			builder.append(":");
			builder.append(jiuGongGe.getDiPan());
			if (jiuGongGe.getTianPan() != null) {
//				builder.append("\n");
				builder.append(jiuGongGe.getTianPan().getXingZuo());
				if (jiuGongGe.getTianPanSanQiLiuYi() != null) {
					builder.append("(").append(jiuGongGe.getTianPanSanQiLiuYi()).append(")");
				}
			}
			if (jiuGongGe.getTianPan2() != null) {
//				builder.append("\n");
				builder.append(jiuGongGe.getTianPan2().getXingZuo());
				builder.append("(").append(jiuGongGe.getTianPanSanQiLiuYi2()).append(")");
			}
			if (jiuGongGe.getRenPan() != null) {
				builder.append("|");
				builder.append(jiuGongGe.getRenPan().getMen());
			}
			if (jiuGongGe.getShenPan() != null) {
				builder.append(jiuGongGe.getShenPan().getMingZi());
			}
			builder.append("---");
			if (jiuGongGe.getIndex() == 3 || jiuGongGe.getIndex() == 6) {
				builder.append("\n");
			}
		}
		System.out.println(builder);
	}
}
