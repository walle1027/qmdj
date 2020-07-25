package org.loed.qmdj.core;

import org.loed.qmdj.domain.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Thomason
 * @version 1.0
 * @date 12-11-7 上午10:45
 */

@SuppressWarnings("OptionalGetWithoutIsPresent")
public class QiMenDunJia {
	private static List<QiMenDunJiaYongJu> qiMenDunJiaYongJuList = new ArrayList<QiMenDunJiaYongJu>();
	private static List<String> sanQiLiuYiList = new ArrayList<String>();
	private static List<ShiChenGanZhi> shiChenGanZhiDuiZhaoBiao = new ArrayList<ShiChenGanZhi>();
	private static List<JiaZi> jiaZiList = new ArrayList<JiaZi>();
	private static List<TianPan> tianPanList = new ArrayList<TianPan>();
	private static List<RenPan> renPanList = new ArrayList<RenPan>();
	private static List<ShenPan> shenPanList = new ArrayList<ShenPan>();
	private static List<String> diZhiList = new ArrayList<String>();
	private static int[] shiZhen = new int[]{1, 8, 3, 4, 9, 2, 7, 6};

	static {
		//奇门遁甲用局对照表
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("冬至", "阳", "上元", 1));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("冬至", "阳", "中元", 7));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("冬至", "阳", "下元", 4));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("小寒", "阳", "上元", 2));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("小寒", "阳", "中元", 8));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("小寒", "阳", "下元", 5));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("大寒", "阳", "上元", 3));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("大寒", "阳", "中元", 9));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("大寒", "阳", "下元", 6));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("立春", "阳", "上元", 8));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("立春", "阳", "中元", 5));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("立春", "阳", "下元", 2));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("雨水", "阳", "上元", 9));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("雨水", "阳", "中元", 6));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("雨水", "阳", "下元", 3));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("惊蛰", "阳", "上元", 1));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("惊蛰", "阳", "中元", 7));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("惊蛰", "阳", "下元", 4));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("春分", "阳", "上元", 3));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("春分", "阳", "中元", 9));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("春分", "阳", "下元", 6));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("清明", "阳", "上元", 4));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("清明", "阳", "中元", 1));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("清明", "阳", "下元", 7));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("谷雨", "阳", "上元", 5));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("谷雨", "阳", "中元", 2));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("谷雨", "阳", "下元", 8));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("谷雨", "阳", "上元", 5));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("谷雨", "阳", "中元", 2));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("谷雨", "阳", "下元", 8));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("立夏", "阳", "上元", 4));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("立夏", "阳", "中元", 1));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("立夏", "阳", "下元", 7));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("小满", "阳", "上元", 5));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("小满", "阳", "中元", 2));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("小满", "阳", "下元", 8));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("芒种", "阳", "上元", 6));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("芒种", "阳", "中元", 3));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("芒种", "阳", "下元", 9));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("夏至", "阴", "上元", 9));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("夏至", "阴", "中元", 3));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("夏至", "阴", "下元", 6));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("小暑", "阴", "上元", 8));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("小暑", "阴", "中元", 2));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("小暑", "阴", "下元", 5));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("大暑", "阴", "上元", 7));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("大暑", "阴", "中元", 1));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("大暑", "阴", "下元", 4));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("立秋", "阴", "上元", 2));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("立秋", "阴", "中元", 5));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("立秋", "阴", "下元", 8));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("处暑", "阴", "上元", 1));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("处暑", "阴", "中元", 4));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("处暑", "阴", "下元", 7));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("白露", "阴", "上元", 9));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("白露", "阴", "中元", 3));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("白露", "阴", "下元", 6));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("秋分", "阴", "上元", 7));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("秋分", "阴", "中元", 1));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("秋分", "阴", "下元", 4));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("寒露", "阴", "上元", 6));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("寒露", "阴", "中元", 9));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("寒露", "阴", "下元", 3));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("霜降", "阴", "上元", 5));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("霜降", "阴", "中元", 8));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("霜降", "阴", "下元", 2));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("立冬", "阴", "上元", 6));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("立冬", "阴", "中元", 9));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("立冬", "阴", "下元", 3));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("小雪", "阴", "上元", 5));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("小雪", "阴", "中元", 8));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("小雪", "阴", "下元", 2));

		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("大雪", "阴", "上元", 4));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("大雪", "阴", "中元", 7));
		qiMenDunJiaYongJuList.add(new QiMenDunJiaYongJu("大雪", "阴", "下元", 1));

		//三奇六仪排布顺序
		sanQiLiuYiList.add("甲子戊");
		sanQiLiuYiList.add("甲戌己");
		sanQiLiuYiList.add("甲申庚");
		sanQiLiuYiList.add("甲午辛");
		sanQiLiuYiList.add("甲辰壬");
		sanQiLiuYiList.add("甲寅癸");
		sanQiLiuYiList.add("　　丁");
		sanQiLiuYiList.add("　　丙");
		sanQiLiuYiList.add("　　乙");

		//时辰干支对照表
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("甲", "23-01", "子", "甲子"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("己", "23-01", "子", "甲子"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("乙", "23-01", "子", "丙子"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("庚", "23-01", "子", "丙子"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丙", "23-01", "子", "戊子"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("辛", "23-01", "子", "戊子"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丁", "23-01", "子", "庚子"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("壬", "23-01", "子", "庚子"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("戊", "23-01", "子", "壬子"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("癸", "23-01", "子", "壬子"));

		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("甲", "01-03", "丑", "乙丑"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("己", "01-03", "丑", "乙丑"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("乙", "01-03", "丑", "丁丑"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("庚", "01-03", "丑", "丁丑"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丙", "01-03", "丑", "己丑"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("辛", "01-03", "丑", "己丑"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丁", "01-03", "丑", "辛丑"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("壬", "01-03", "丑", "辛丑"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("戊", "01-03", "丑", "癸丑"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("癸", "01-03", "丑", "癸丑"));

		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("甲", "03-05", "寅", "丙寅"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("己", "03-05", "寅", "丙寅"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("乙", "03-05", "寅", "戊寅"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("庚", "03-05", "寅", "戊寅"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丙", "03-05", "寅", "庚寅"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("辛", "03-05", "寅", "庚寅"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丁", "03-05", "寅", "壬寅"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("壬", "03-05", "寅", "壬寅"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("戊", "03-05", "寅", "甲寅"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("癸", "03-05", "寅", "甲寅"));

		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("甲", "05-07", "卯", "丁卯"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("己", "05-07", "卯", "丁卯"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("乙", "05-07", "卯", "已卯"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("庚", "05-07", "卯", "已卯"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丙", "05-07", "卯", "辛卯"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("辛", "05-07", "卯", "辛卯"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丁", "05-07", "卯", "癸卯"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("壬", "05-07", "卯", "癸卯"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("戊", "05-07", "卯", "乙卯"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("癸", "05-07", "卯", "乙卯"));

		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("甲", "07-09", "辰", "戊辰"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("己", "07-09", "辰", "戊辰"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("乙", "07-09", "辰", "庚辰"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("庚", "07-09", "辰", "庚辰"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丙", "07-09", "辰", "壬辰"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("辛", "07-09", "辰", "壬辰"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丁", "07-09", "辰", "甲辰"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("壬", "07-09", "辰", "甲辰"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("戊", "07-09", "辰", "丙辰"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("癸", "07-09", "辰", "丙辰"));

		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("甲", "09-11", "巳", "己巳"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("己", "09-11", "巳", "己巳"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("乙", "09-11", "巳", "辛巳"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("庚", "09-11", "巳", "辛巳"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丙", "09-11", "巳", "癸巳"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("辛", "09-11", "巳", "癸巳"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丁", "09-11", "巳", "乙巳"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("壬", "09-11", "巳", "乙巳"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("戊", "09-11", "巳", "丁巳"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("癸", "09-11", "巳", "丁巳"));

		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("甲", "11-13", "午", "庚午"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("己", "11-13", "午", "庚午"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("乙", "11-13", "午", "壬午"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("庚", "11-13", "午", "壬午"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丙", "11-13", "午", "甲午"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("辛", "11-13", "午", "甲午"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丁", "11-13", "午", "丙午"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("壬", "11-13", "午", "丙午"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("戊", "11-13", "午", "戊午"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("癸", "11-13", "午", "戊午"));

		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("甲", "13-15", "未", "辛未"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("己", "13-15", "未", "辛未"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("乙", "13-15", "未", "癸未"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("庚", "13-15", "未", "癸未"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丙", "13-15", "未", "乙未"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("辛", "13-15", "未", "乙未"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丁", "13-15", "未", "丁未"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("壬", "13-15", "未", "丁未"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("戊", "13-15", "未", "己未"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("癸", "13-15", "未", "己未"));

		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("甲", "15-17", "申", "壬申"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("己", "15-17", "申", "壬申"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("乙", "15-17", "申", "甲申"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("庚", "15-17", "申", "甲申"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丙", "15-17", "申", "丙申"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("辛", "15-17", "申", "丙申"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丁", "15-17", "申", "戊申"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("壬", "15-17", "申", "戊申"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("戊", "15-17", "申", "庚申"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("癸", "15-17", "申", "庚申"));

		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("甲", "17-19", "酉", "癸酉"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("己", "17-19", "酉", "癸酉"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("乙", "17-19", "酉", "乙酉"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("庚", "17-19", "酉", "乙酉"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丙", "17-19", "酉", "丁酉"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("辛", "17-19", "酉", "丁酉"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丁", "17-19", "酉", "己酉"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("壬", "17-19", "酉", "己酉"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("戊", "17-19", "酉", "辛酉"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("癸", "17-19", "酉", "辛酉"));

		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("甲", "19-21", "戌", "甲戌"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("己", "19-21", "戌", "甲戌"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("乙", "19-21", "戌", "丙戌"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("庚", "19-21", "戌", "丙戌"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丙", "19-21", "戌", "戊戌"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("辛", "19-21", "戌", "戊戌"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丁", "19-21", "戌", "庚戌"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("壬", "19-21", "戌", "庚戌"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("戊", "19-21", "戌", "壬戌"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("癸", "19-21", "戌", "壬戌"));

		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("甲", "21-23", "亥", "乙亥"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("己", "21-23", "亥", "乙亥"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("乙", "21-23", "亥", "丁亥"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("庚", "21-23", "亥", "丁亥"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丙", "21-23", "亥", "己亥"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("辛", "21-23", "亥", "己亥"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("丁", "21-23", "亥", "辛亥"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("壬", "21-23", "亥", "辛亥"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("戊", "21-23", "亥", "癸亥"));
		shiChenGanZhiDuiZhaoBiao.add(new ShiChenGanZhi("癸", "21-23", "亥", "癸亥"));

		jiaZiList.add(new JiaZi(1, "甲子", "上元", "甲子"));
		jiaZiList.add(new JiaZi(2, "乙丑", "上元", "甲子"));
		jiaZiList.add(new JiaZi(3, "丙寅", "上元", "甲子"));
		jiaZiList.add(new JiaZi(4, "丁卯", "上元", "甲子"));
		jiaZiList.add(new JiaZi(5, "戊辰", "上元", "甲子"));

		jiaZiList.add(new JiaZi(6, "己巳", "中元", "己巳"));
		jiaZiList.add(new JiaZi(7, "庚午", "中元", "己巳"));
		jiaZiList.add(new JiaZi(8, "辛未", "中元", "己巳"));
		jiaZiList.add(new JiaZi(9, "壬申", "中元", "己巳"));
		jiaZiList.add(new JiaZi(10, "癸酉", "中元", "己巳"));

		jiaZiList.add(new JiaZi(11, "甲戌", "下元", "甲戌"));
		jiaZiList.add(new JiaZi(12, "乙亥", "下元", "甲戌"));
		jiaZiList.add(new JiaZi(13, "丙子", "下元", "甲戌"));
		jiaZiList.add(new JiaZi(14, "丁丑", "下元", "甲戌"));
		jiaZiList.add(new JiaZi(15, "戊寅", "下元", "甲戌"));

		jiaZiList.add(new JiaZi(16, "己卯", "上元", "己卯"));
		jiaZiList.add(new JiaZi(17, "庚辰", "上元", "己卯"));
		jiaZiList.add(new JiaZi(18, "辛巳", "上元", "己卯"));
		jiaZiList.add(new JiaZi(19, "壬午", "上元", "己卯"));
		jiaZiList.add(new JiaZi(20, "癸未", "上元", "己卯"));

		jiaZiList.add(new JiaZi(21, "甲申", "中元", "甲申"));
		jiaZiList.add(new JiaZi(22, "乙酉", "中元", "甲申"));
		jiaZiList.add(new JiaZi(23, "丙戌", "中元", "甲申"));
		jiaZiList.add(new JiaZi(24, "丁亥", "中元", "甲申"));
		jiaZiList.add(new JiaZi(25, "戊子", "中元", "甲申"));

		jiaZiList.add(new JiaZi(26, "己丑", "下元", "己丑"));
		jiaZiList.add(new JiaZi(27, "庚寅", "下元", "己丑"));
		jiaZiList.add(new JiaZi(28, "辛卯", "下元", "己丑"));
		jiaZiList.add(new JiaZi(29, "壬辰", "下元", "己丑"));
		jiaZiList.add(new JiaZi(30, "癸巳", "下元", "己丑"));

		jiaZiList.add(new JiaZi(31, "甲午", "上元", "甲午"));
		jiaZiList.add(new JiaZi(32, "乙未", "上元", "甲午"));
		jiaZiList.add(new JiaZi(33, "丙申", "上元", "甲午"));
		jiaZiList.add(new JiaZi(34, "丁酉", "上元", "甲午"));
		jiaZiList.add(new JiaZi(35, "戊戌", "上元", "甲午"));

		jiaZiList.add(new JiaZi(36, "己亥", "中元", "己亥"));
		jiaZiList.add(new JiaZi(37, "庚子", "中元", "己亥"));
		jiaZiList.add(new JiaZi(38, "辛丑", "中元", "己亥"));
		jiaZiList.add(new JiaZi(39, "壬寅", "中元", "己亥"));
		jiaZiList.add(new JiaZi(40, "癸卯", "中元", "己亥"));

		jiaZiList.add(new JiaZi(41, "甲辰", "下元", "甲辰"));
		jiaZiList.add(new JiaZi(42, "乙巳", "下元", "甲辰"));
		jiaZiList.add(new JiaZi(43, "丙午", "下元", "甲辰"));
		jiaZiList.add(new JiaZi(44, "丁未", "下元", "甲辰"));
		jiaZiList.add(new JiaZi(45, "戊申", "下元", "甲辰"));

		jiaZiList.add(new JiaZi(46, "己酉", "上元", "己酉"));
		jiaZiList.add(new JiaZi(47, "庚戌", "上元", "己酉"));
		jiaZiList.add(new JiaZi(48, "辛亥", "上元", "己酉"));
		jiaZiList.add(new JiaZi(49, "壬子", "上元", "己酉"));
		jiaZiList.add(new JiaZi(50, "癸丑", "上元", "己酉"));

		jiaZiList.add(new JiaZi(51, "甲寅", "中元", "甲寅"));
		jiaZiList.add(new JiaZi(52, "乙卯", "中元", "甲寅"));
		jiaZiList.add(new JiaZi(53, "丙辰", "中元", "甲寅"));
		jiaZiList.add(new JiaZi(54, "丁巳", "中元", "甲寅"));
		jiaZiList.add(new JiaZi(55, "戊午", "中元", "甲寅"));

		jiaZiList.add(new JiaZi(56, "己未", "下元", "己未"));
		jiaZiList.add(new JiaZi(57, "庚申", "下元", "己未"));
		jiaZiList.add(new JiaZi(58, "辛酉", "下元", "己未"));
		jiaZiList.add(new JiaZi(59, "壬戌", "下元", "己未"));
		jiaZiList.add(new JiaZi(60, "癸亥", "下元", "己未"));

		//天盘
		tianPanList.add(new TianPan(1, "水", "坎卦", "北方", "天蓬星", "贪狼星"));
		tianPanList.add(new TianPan(2, "土", "坤卦", "西南方", "天芮星", "巨门星"));
		tianPanList.add(new TianPan(3, "木", "震卦", "东方", "天冲星", "禄存星"));
		tianPanList.add(new TianPan(4, "木", "巽卦", "东方", "天辅星", "文曲星"));
		tianPanList.add(new TianPan(5, "土", "　　", "中方", "天禽星", "廉贞星"));
		tianPanList.add(new TianPan(6, "金", "乾卦", "西北方", "天心星", "武曲星"));
		tianPanList.add(new TianPan(7, "金", "兑卦", "西方", "天柱星", "破军星"));
		tianPanList.add(new TianPan(8, "土", "艮卦", "东北方", "天任星", "左辅星"));
		tianPanList.add(new TianPan(9, "火", "离卦", "南方", "天英星", "右弼星"));

		//人盘
		renPanList.add(new RenPan("北方", "坎卦", 1, "天蓬星", "水", "休门"));
		renPanList.add(new RenPan("东北方", "艮卦", 8, "天任星", "土", "生门"));
		renPanList.add(new RenPan("东方", "震卦", 3, "天冲星", "木", "伤门"));
		renPanList.add(new RenPan("东南方", "巽卦", 4, "天辅星", "木", "杜门"));
		renPanList.add(new RenPan("南方", "离卦", 9, "天英星", "火", "景门"));
		renPanList.add(new RenPan("西南方", "坤卦", 2, "天芮星", "土", "死门"));
//		renPanList.add(new RenPan("西南方", "坤卦", 5, "天禽星", "土", "死门"));
		renPanList.add(new RenPan("西方", "兑卦", 7, "天柱星", "金", "惊门"));
		renPanList.add(new RenPan("西北方", "乾卦", 6, "天心星", "金", "开门"));

		//神盘
		shenPanList.add(new ShenPan(1, "天乙之神", "值符", "禀中央土", "它是八神的元首、九星的领袖，所到之处，百恶消散。又名小值符，以区别天盘上九星的大值符"));
		shenPanList.add(new ShenPan(2, "虚诈之神", "腾蛇", "禀南方火", "性柔而口毒，专司惊恐怪异之事"));
		shenPanList.add(new ShenPan(3, "荫佑之神", "太阴", "禀西方阴金", "性阴匿暗味"));
		shenPanList.add(new ShenPan(4, "护卫之神", "六合", "禀东方木", "性和平，专管婚姻交易中介之事"));
		shenPanList.add(new ShenPan(5, "凶恶刚猛之神", "白虎", "禀西方之金", "性好杀，专司兵戈争斗杀伐病死之事"));
		shenPanList.add(new ShenPan(6, "奸谗小盗之神", "玄武", "禀北方水", "性好阴谋贼害，专司盗贼逃亡口舌之事"));
		shenPanList.add(new ShenPan(7, "坚牢之神", "九地", "具有坤土之象，万物之母", "性柔好静"));
		shenPanList.add(new ShenPan(8, "威悍之神", "九天", "具有乾金之象，万物之父", "性刚好动"));

		//地支列表
		diZhiList.add("子");
		diZhiList.add("丑");
		diZhiList.add("寅");
		diZhiList.add("卯");
		diZhiList.add("辰");
		diZhiList.add("巳");
		diZhiList.add("午");
		diZhiList.add("未");
		diZhiList.add("申");
		diZhiList.add("酉");
		diZhiList.add("戌");
		diZhiList.add("亥");
	}

	/**
	 * 创建一个九宫格
	 *
	 * @return 按照顺序排列的九宫格
	 */
	public List<JiuGongGe> buildJiuGongGe() {
		List<JiuGongGe> jiuGongGeList = new ArrayList<JiuGongGe>();
		JiuGongGe yi = new JiuGongGe();
		yi.setIndex(1);
		yi.setGongWei(4);
		yi.setGongWeiBieMing("巽四");
		jiuGongGeList.add(yi);

		JiuGongGe er = new JiuGongGe();
		er.setIndex(2);
		er.setGongWei(9);
		er.setGongWeiBieMing("离九");
		jiuGongGeList.add(er);

		JiuGongGe san = new JiuGongGe();
		san.setIndex(3);
		san.setGongWei(2);
		san.setGongWeiBieMing("坤二");
		jiuGongGeList.add(san);

		JiuGongGe si = new JiuGongGe();
		si.setIndex(4);
		si.setGongWei(3);
		si.setGongWeiBieMing("震三");
		jiuGongGeList.add(si);

		JiuGongGe wu = new JiuGongGe();
		wu.setIndex(5);
		wu.setGongWei(5);
		wu.setGongWeiBieMing("中五");
		jiuGongGeList.add(wu);

		JiuGongGe liu = new JiuGongGe();
		liu.setIndex(6);
		liu.setGongWei(7);
		liu.setGongWeiBieMing("兑七");
		jiuGongGeList.add(liu);

		JiuGongGe qi = new JiuGongGe();
		qi.setIndex(7);
		qi.setGongWei(8);
		qi.setGongWeiBieMing("艮八");
		jiuGongGeList.add(qi);

		JiuGongGe ba = new JiuGongGe();
		ba.setIndex(8);
		ba.setGongWei(1);
		ba.setGongWeiBieMing("坎一");
		jiuGongGeList.add(ba);

		JiuGongGe jiu = new JiuGongGe();
		jiu.setIndex(9);
		jiu.setGongWei(6);
		jiu.setGongWeiBieMing("乾六");
		jiuGongGeList.add(jiu);

		return jiuGongGeList;
	}

	/**
	 * 起盘
	 *
	 * @return 起盘后的九宫格
	 */
	public List<JiuGongGe> qiPan(Date date) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
		String dateStr = sdf.format(date);
		int year = Integer.parseInt(dateStr.substring(0, 4));
		int month = Integer.parseInt(dateStr.substring(5, 7));
		int day = Integer.parseInt(dateStr.substring(8, 10));
		int hour = Integer.valueOf(dateStr.substring(11, 13));
		int minute = Integer.parseInt(dateStr.substring(14, 16));
		List<JiuGongGe> jiuGongGeList = buildJiuGongGe();
		//根据时间断定需要用哪一局，从而确定甲子
		SolarTerm solarTerm = new SolarTerm();
		Lauar lauar = new Lauar();
		//要用拆补法
		String riGanZhi = lauar.getDayGanZhi(year, month, day);
		String jieQi = solarTerm.getJieQi(year, month, day);
		System.out.println("节气:" + jieQi);
		System.out.println("日干支:" + riGanZhi);

		JiaZi jiaZi = jiaZiList.stream().filter(j -> {
			return j.getTianGan().equals(riGanZhi.substring(0, 1)) && j.getDiZhi().equals(riGanZhi.substring(1));
		}).findAny().get();
		System.out.println("元:" + jiaZi.getYuan());


		QiMenDunJiaYongJu qiMenDunJiaYongJu =
				qiMenDunJiaYongJuList.stream().filter(ju -> {
					return ju.getJieQi().equals(jieQi) && ju.getYuan().equals(jiaZi.getYuan());
				}).findAny().get();
		//根据甲子排布三奇六仪

		//找出甲子戊的宫位
		int gongWei = qiMenDunJiaYongJu.getJu();
		JiuGongGe jiaZiWu = jiuGongGeList.stream().filter(gong -> {
			return gong.getGongWei() == gongWei;
		}).findAny().get();
		//三奇六仪顺序
		//戊、己、庚、辛、壬、癸、丁、丙、乙
		//阳时顺排
		if ("阳".equals(qiMenDunJiaYongJu.getYinYang())) {
			int fuzhi = 0;
			for (int i = 0; i < 9; i++) {
				if (gongWei + i <= 9) {
					fuzhi = gongWei + i;
				} else {
					fuzhi = gongWei + i - 9;
				}
				int finalFuzhi = fuzhi;
				JiuGongGe temp = jiuGongGeList.stream().filter(jiuGongGe -> {
					return jiuGongGe.getGongWei() == finalFuzhi;
				}).findFirst().get();
				temp.setDiPan(sanQiLiuYiList.get(i));
				temp.setSanQiLiuYi(sanQiLiuYiList.get(i).substring(2, 3));
			}
		}
		//阴时逆排
		else if ("阴".equals(qiMenDunJiaYongJu.getYinYang())) {
			int fuzhi = 0;
			for (int i = 0; i < 9; i++) {
				if (gongWei - i > 0) {
					fuzhi = gongWei - i;
				} else {
					fuzhi = gongWei - i + 9;
				}
				int finalFuzhi = fuzhi;
				JiuGongGe temp = jiuGongGeList.stream().filter(jiuGongGe -> {
					return jiuGongGe.getGongWei() == finalFuzhi;
				}).findFirst().get();
				temp.setDiPan(sanQiLiuYiList.get(i));
				temp.setSanQiLiuYi(sanQiLiuYiList.get(i).substring(2, 3));
			}
		}
		//根据时辰拨转天盘
		//取得时辰干支
		String shiChen = getShiChen(hour);
		System.out.println("时辰:" + shiChen);
		//取得旬首
		ShiChenGanZhi shiChenGanZhi = shiChenGanZhiDuiZhaoBiao.stream().filter(s -> {
			return s.getJiRiGanZhi().equals(riGanZhi.substring(0, 1)) && s.getShiChen().equals(shiChen);
		})
				.findFirst().get();


//				ObjectQueryUtils.queryForObject(shiChenGanZhiDuiZhaoBiao, "select * from com.yangtao.qmdj.domain.ShiChenGanZhi where jiRiGanZhi =? and shiChen = ?"
//				, riGanZhi.substring(0, 1), shiChen);
		System.out.println("时辰干支:" + shiChenGanZhi.getShiChenGanZhi());
//		JiaZi tempJiaZi = ObjectQueryUtils.queryForObject(jiaZiList, "select * from com.yangtao.qmdj.domain.JiaZi where tianGan = ? and diZhi = ?", shiChenGanZhi.getShiChenGanZhi().substring(0, 1), shiChenGanZhi.getShiChenGanZhi().substring(1));
		JiaZi tempJiaZi = jiaZiList.stream().filter(j -> {
			return j.getTianGan().equals(shiChenGanZhi.getShiChenGanZhi().substring(0, 1)) && j.getDiZhi().equals(shiChenGanZhi.getShiChenGanZhi().substring(1));
		}).findFirst().get();

		int xunShouIndex = tempJiaZi.getIndex() / 10 * 10 + 1;
//		JiaZi xunShou = ObjectQueryUtils.queryForObject(jiaZiList, "select * from com.yangtao.qmdj.domain.JiaZi where index = ?", xunShouIndex);
		JiaZi xunShou = jiaZiList.stream().filter(j -> {
			return j.getIndex() == xunShouIndex;
		}).findFirst().get();
		System.out.println("时辰旬首:" + xunShou.getTianGan() + xunShou.getDiZhi());
//		JiuGongGe xingGong = ObjectQueryUtils.queryForObject(jiuGongGeList, "select * from com.yangtao.qmdj.domain.JiuGongGe where diPan like ?", xunShou.getTianGan() + xunShou.getDiZhi() + "%");
		JiuGongGe xingGong = jiuGongGeList.stream().filter(jiuGongGe -> {
			return jiuGongGe.getDiPan().startsWith(xunShou.getTianGan() + xunShou.getDiZhi());
		}).findFirst().get();
//		TianPan zhiFu = ObjectQueryUtils.queryForObject(tianPanList, "select * from com.yangtao.qmdj.domain.TianPan where gongWei = ?", xingGong.getGongWei());
		TianPan zhiFu = tianPanList.stream().filter(tianPan -> {
			return tianPan.getGongWei() == xingGong.getGongWei();
		}).findFirst().get();
		System.out.println(zhiFu.getXingZuo() + " " + zhiFu.getWuXingShuXing() + " " + zhiFu.getFangWei() + " " + zhiFu.getGua() + " " + zhiFu.getBieMing());

//		JiuGongGe zhiFuGongWei = ObjectQueryUtils.queryForObject(jiuGongGeList, "select * from com.yangtao.qmdj.domain.JiuGongGe where diPan like ?",   shiChenGanZhi.getShiChenGanZhi().substring(0, 1)+"%");
		JiuGongGe zhiFuGongWei = jiuGongGeList.stream().filter(jiuGongGe -> {
			return jiuGongGe.getDiPan().contains(shiChenGanZhi.getShiChenGanZhi().substring(0, 1));
		}).findFirst().get();

		//二五宫调换
		if (zhiFuGongWei.getGongWei() == 5) {
//			zhiFuGongWei = ObjectQueryUtils.queryForObject(jiuGongGeList, "select * from com.yangtao.qmdj.domain.JiuGongGe where gongWei = ?", 2);
			zhiFuGongWei = jiuGongGeList.stream().filter(jiuGongGe -> {
				return jiuGongGe.getGongWei() == 2;
			}).findFirst().get();
		}
		System.out.println("值符所在宫位:" + zhiFuGongWei.getGongWei() + "宫");

		zhiFuGongWei.setTianPan(zhiFu);
//		JiuGongGe oldTianPanGongWei = ObjectQueryUtils.queryForObject(jiuGongGeList, "select * from com.yangtao.qmdj.domain.JiuGongGe where gongWei = ?", zhiFu.getGongWei());
		JiuGongGe oldTianPanGongWei = jiuGongGeList.stream().filter(jiuGongGe -> {
			return jiuGongGe.getGongWei() == zhiFu.getGongWei();
		}).findFirst().get();
		zhiFuGongWei.setTianPanSanQiLiuYi(oldTianPanGongWei.getDiPan().substring(2, 3));
		if (zhiFu.getGongWei() == 2) {
//			TianPan wuGong = ObjectQueryUtils.queryForObject(tianPanList, "select * from com.yangtao.qmdj.domain.TianPan where gongWei = ?", 5);
			TianPan wuGong = tianPanList.stream().filter(tianPan -> {
				return tianPan.getGongWei() == 5;
			}).findFirst().get();
			zhiFuGongWei.setTianPan2(wuGong);
//			JiuGongGe oldTianPanGongWei2 = ObjectQueryUtils.queryForObject(jiuGongGeList, "select * from com.yangtao.qmdj.domain.JiuGongGe where gongWei = ?", 5);
			JiuGongGe oldTianPanGongWei2 = jiuGongGeList.stream().filter(jiuGongGe -> {
				return jiuGongGe.getGongWei() == 5;
			}).findFirst().get();
			zhiFuGongWei.setTianPanSanQiLiuYi2(oldTianPanGongWei2.getDiPan().substring(2, 3));
		}
		//从值符宫位开始循环
		int nextGongWei = getNextGongWei(zhiFuGongWei.getGongWei(), "顺");
		int nextZhiFuGongWei = getNextGongWei(zhiFu.getGongWei(), "顺");
		while (nextGongWei != zhiFuGongWei.getGongWei()) {
//			JiuGongGe nextGong = ObjectQueryUtils.queryForObject(jiuGongGeList, "select * from com.yangtao.qmdj.domain.JiuGongGe where gongWei = ?", nextGongWei);
			int finalNextGongWei = nextGongWei;
			JiuGongGe nextGong = jiuGongGeList.stream().filter(jiuGongGe -> {
				return jiuGongGe.getGongWei() == finalNextGongWei;
			}).findFirst().get();
//			TianPan nextTianPan = ObjectQueryUtils.queryForObject(tianPanList, "select * from com.yangtao.qmdj.domain.TianPan where gongWei = ?", nextZhiFuGongWei);
			int finalNextZhiFuGongWei = nextZhiFuGongWei;
			TianPan nextTianPan = tianPanList.stream().filter(tianPan -> {
				return tianPan.getGongWei() == finalNextZhiFuGongWei;
			}).findFirst().get();
			nextGong.setTianPan(nextTianPan);
//			JiuGongGe j = ObjectQueryUtils.queryForObject(jiuGongGeList, "select * from com.yangtao.qmdj.domain.JiuGongGe where gongWei = ?", nextZhiFuGongWei);
			JiuGongGe j = jiuGongGeList.stream().filter(jiuGongGe -> {
				return jiuGongGe.getGongWei() == finalNextZhiFuGongWei;
			}).findFirst().get();
			nextGong.setTianPanSanQiLiuYi(j.getDiPan().substring(2, 3));
			if (nextZhiFuGongWei == 2) {
//				TianPan _5 = ObjectQueryUtils.queryForObject(tianPanList, "select * from com.yangtao.qmdj.domain.TianPan where gongWei = ?", 5);
				TianPan _5 = tianPanList.stream().filter(tianPan -> {
					return tianPan.getGongWei() == 5;
				}).findFirst().get();
				nextGong.setTianPan2(_5);
//				JiuGongGe j2 = ObjectQueryUtils.queryForObject(jiuGongGeList, "select * from com.yangtao.qmdj.domain.JiuGongGe where gongWei = ?", 5);
				JiuGongGe j2 = jiuGongGeList.stream().filter(jiuGongGe -> {
					return jiuGongGe.getGongWei() == 5;
				}).findFirst().get();
				nextGong.setTianPanSanQiLiuYi2(j2.getDiPan().substring(2, 3));
			}
			nextGongWei = getNextGongWei(nextGongWei, "顺");
			nextZhiFuGongWei = getNextGongWei(nextZhiFuGongWei, "顺");
		}
		//设置5宫的天盘
//		JiuGongGe _5Gong = ObjectQueryUtils.queryForObject(jiuGongGeList, "select * from com.yangtao.qmdj.domain.JiuGongGe where gongWei = 5");
		JiuGongGe _5Gong = jiuGongGeList.stream().filter(jiuGongGe -> {
			return jiuGongGe.getGongWei() == 5;
		}).findFirst().get();
//		TianPan _5GongTianPan = ObjectQueryUtils.queryForObject(tianPanList, "select * from com.yangtao.qmdj.domain.TianPan where gongWei = 5");
		TianPan _5GongTianPan = tianPanList.stream().filter(tianPan -> {
			return tianPan.getGongWei() == 5;
		}).findFirst().get();
		_5Gong.setTianPan(_5GongTianPan);

//		RenPan renPan = ObjectQueryUtils.queryForObject(renPanList, "select * from com.yangtao.qmdj.domain.RenPan where gongWei = ?", zhiFu.getGongWei() == 5 ? 2 : zhiFu.getGongWei());
		RenPan renPan = renPanList.stream().filter(r -> {
			return r.getGongWei() == (zhiFu.getGongWei() == 5 ? 2 : zhiFu.getGongWei());
		}).findFirst().get();
		System.out.println("值使:" + renPan.getMen());
		String zhiShiDiZhi = xingGong.getDiPan().substring(1, 2);
		int distance = getShiChenCha(shiChen, zhiShiDiZhi);
		int target = 0;
		if ("阳".equals(qiMenDunJiaYongJu.getYinYang())) {
			target = xingGong.getGongWei() + distance;
		} else if ("阴".equals(qiMenDunJiaYongJu.getYinYang())) {
			target = xingGong.getGongWei() - distance;
		}
		if (target > 9) {
			target = target - 9;
		}
		if (target < 1) {
			target = target + 9;
		}
//		JiuGongGe zhiShiGongWei = ObjectQueryUtils.queryForObject(jiuGongGeList, "select * from com.yangtao.qmdj.domain.JiuGongGe where gongWei = ?", target);
		int finalTarget = target;
		JiuGongGe zhiShiGongWei = jiuGongGeList.stream().filter(jiuGongGe -> {
			return jiuGongGe.getGongWei() == finalTarget;
		}).findFirst().get();
		System.out.println("值使所在宫位:" + zhiShiGongWei.getGongWei());

		zhiShiGongWei.setRenPan(renPan);
		//阳时顺行，阴时逆行
		if ("阳".equals(qiMenDunJiaYongJu.getYinYang())) {
			int nextZhiShiGongWei = getNextGongWei(zhiShiGongWei.getGongWei(), "顺");
			int nextZhiShi = getNextGongWei(renPan.getGongWei(), "顺");
			while (nextZhiShiGongWei != zhiShiGongWei.getGongWei()) {
//				JiuGongGe nextGong = ObjectQueryUtils.queryForObject(jiuGongGeList, "select * from com.yangtao.qmdj.domain.JiuGongGe where gongWei = ?", nextZhiShiGongWei);
				int finalNextZhiFuGongWei1 = nextZhiFuGongWei;
				JiuGongGe nextGong = jiuGongGeList.stream().filter(jiuGongGe -> {
					return jiuGongGe.getGongWei() == finalNextZhiFuGongWei1;
				}).findFirst().get();
//				RenPan nextRenPan = ObjectQueryUtils.queryForObject(renPanList, "select * from com.yangtao.qmdj.domain.RenPan where gongWei = ?", nextZhiShi);
				int finalNextZhiShi = nextZhiShi;
				RenPan nextRenPan = renPanList.stream().filter(r -> {
					return r.getGongWei() == finalNextZhiShi;
				}).findFirst().get();
				nextGong.setRenPan(nextRenPan);
				nextZhiShiGongWei = getNextGongWei(nextZhiShiGongWei, "顺");
				nextZhiShi = getNextGongWei(nextZhiShi, "顺");

			}
		} else if ("阴".equals(qiMenDunJiaYongJu.getYinYang())) {
			//fixme 此处是否为顺逆，需要参考书籍
			int nextZhiShiGongWei = getNextGongWei(zhiShiGongWei.getGongWei(), "顺");
			int nextZhiShi = getNextGongWei(renPan.getGongWei(), "逆");
			while (nextZhiShiGongWei != zhiShiGongWei.getGongWei()) {
//				JiuGongGe nextGong = ObjectQueryUtils.queryForObject(jiuGongGeList, "select * from com.yangtao.qmdj.domain.JiuGongGe where gongWei = ?", nextZhiShiGongWei);
				int finalNextZhiShiGongWei = nextZhiShiGongWei;
				JiuGongGe nextGong = jiuGongGeList.stream().filter(jiuGongGe -> {
					return jiuGongGe.getGongWei() == finalNextZhiShiGongWei;
				}).findFirst().get();
//				RenPan nextRenPan = ObjectQueryUtils.queryForObject(renPanList, "select * from com.yangtao.qmdj.domain.RenPan where gongWei = ?", nextZhiShi);
				int finalNextZhiShi = nextZhiShi;
				RenPan nextRenPan = renPanList.stream().filter(r -> {
					return r.getGongWei() == finalNextZhiShi;
				}).findFirst().get();
				nextGong.setRenPan(nextRenPan);
				nextZhiShiGongWei = getNextGongWei(nextZhiShiGongWei, "顺");
				nextZhiShi = getNextGongWei(nextZhiShi, "逆");
			}
		}

		//设置神盘
		zhiFuGongWei.setShenPan(getShenPanByIndex(1));
		if ("阳".equals(qiMenDunJiaYongJu.getYinYang())) {
			int nextShenPanGongWei = getNextGongWei(zhiFuGongWei.getGongWei(), "顺");
			int shenPanIndex = 1;
			while (nextShenPanGongWei != zhiFuGongWei.getGongWei()) {
				shenPanIndex++;
//				JiuGongGe nextGong = ObjectQueryUtils.queryForObject(jiuGongGeList, "select * from com.yangtao.qmdj.domain.JiuGongGe where gongWei = ?", nextShenPanGongWei);
				int finalNextShenPanGongWei = nextShenPanGongWei;
				JiuGongGe nextGong = jiuGongGeList.stream().filter(jiuGongGe -> {
					return jiuGongGe.getGongWei() == finalNextShenPanGongWei;
				}).findFirst().get();
				nextGong.setShenPan(getShenPanByIndex(shenPanIndex));
				nextShenPanGongWei = getNextGongWei(nextShenPanGongWei, "顺");
			}
		} else if ("阴".equals(qiMenDunJiaYongJu.getYinYang())) {
			int nextShenPanGongWei = getNextGongWei(zhiFuGongWei.getGongWei(), "逆");
			int shenPanIndex = 1;
			while (nextShenPanGongWei != zhiFuGongWei.getGongWei()) {
				shenPanIndex++;
//				JiuGongGe nextGong = ObjectQueryUtils.queryForObject(jiuGongGeList, "select * from com.yangtao.qmdj.domain.JiuGongGe where gongWei = ?", nextShenPanGongWei);
				int finalNextShenPanGongWei = nextShenPanGongWei;
				JiuGongGe nextGong = jiuGongGeList.stream().filter(jiuGongGe -> {
					return jiuGongGe.getGongWei() == finalNextShenPanGongWei;
				}).findFirst().get();
				nextGong.setShenPan(getShenPanByIndex(shenPanIndex));
				nextShenPanGongWei = getNextGongWei(nextShenPanGongWei, "逆");
			}
		}
		return jiuGongGeList;
	}

	/**
	 * 根据时间取得对应的时辰
	 *
	 * @param hour 时间
	 * @return 时辰
	 */
	public static String getShiChen(int hour) {
		if (hour >= 23 || hour < 1) {
			return "子";
		}
		if (hour < 3 && hour >= 1) {
			return "丑";
		}
		if (hour < 5 && hour >= 3) {
			return "寅";
		}
		if (hour < 7 && hour >= 5) {
			return "卯";
		}
		if (hour < 9 && hour >= 7) {
			return "辰";
		}
		if (hour < 11 && hour >= 9) {
			return "巳";
		}
		if (hour < 13 && hour >= 11) {
			return "午";
		}
		if (hour < 15 && hour >= 13) {
			return "未";
		}
		if (hour < 17 && hour >= 15) {
			return "申";
		}
		if (hour < 19 && hour >= 17) {
			return "酉";
		}
		if (hour < 21 && hour >= 19) {
			return "戌";
		}
		if (hour < 23 && hour >= 21) {
			return "亥";
		}
		return null;
	}

	private int getShiChenCha(String shichen1, String shichen2) {
		int distance = diZhiList.indexOf(shichen1) - diZhiList.indexOf(shichen2);
		if (distance < 0) {
			distance = distance + 12;
		}
		return distance;
	}

	/**
	 * 取得下一个时针
	 *
	 * @param current   当前时针
	 * @param direction 方向
	 * @return 下一个时针的宫位
	 */
	private int getNextGongWei(int current, String direction) {
		if (current == 5) {
			return getNextGongWei(2, direction);
		}

		for (int i = 0; i < shiZhen.length; i++) {
			int gongwei = shiZhen[i];
			if (current == gongwei) {
				if ("顺".equals(direction)) {
					if (i + 1 > 7) {
						return shiZhen[i - 7];
					} else {
						return shiZhen[i + 1];
					}
				} else if ("逆".equals(direction)) {
					if (i - 1 > -1) {
						return shiZhen[i - 1];
					} else {
						return shiZhen[i + 7];
					}
				}
			}
		}
		return -1;
	}

	private ShenPan getShenPanByIndex(int index) {
		return shenPanList.stream().filter(shenPan -> {
			return shenPan.getIndex() == index;
		}).findFirst().get();
	}
}
