package org.loed.qmdj.core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SolarTerm {
	public static void main(String[] s) throws Exception {
		SolarTerm st = new SolarTerm();

		if (s.length == 3) {
			System.out.println(st.getSoralTerm(Integer.parseInt(s[0]),
					Integer.parseInt(s[1]), Integer.parseInt(s[2])));
		}

//		System.out.println(st.getSoralTerm(2011, 12, 22));
//		System.out.println(st.getSoralTerm(2011, 12, 23));
//		System.out.println(st.getSoralTerm(2011, 12, 24));
//		System.out.println(st.getSoralTerm(2011, 12, 25));
//		System.out.println(st.getSoralTerm(2011, 12, 26));
//		System.out.println(st.getSoralTerm(2011, 12, 27));
//		System.out.println(st.getSoralTerm(2011, 12, 28));
//		System.out.println(st.getSoralTerm(2011, 12, 29));
//		System.out.println(st.getSoralTerm(2011, 12, 30));
//		System.out.println(st.getSoralTerm(2011, 12, 31));
//		System.out.println(st.getSoralTerm(2012, 1, 1));
//		System.out.println(st.getSoralTerm(2012, 1, 2));
//		System.out.println(st.getSoralTerm(2012, 1, 3));
//		System.out.println(st.getSoralTerm(2012, 1, 4));
//		System.out.println(st.getSoralTerm(2012, 1, 5));
//		System.out.println(st.getSoralTerm(2012, 1, 6));
//		for (int i = 0; i < 24; i++) {
//			printResult(st.sTerm2(2012, i));
//			System.out.println(SolarTerm[i]);
//		}
		System.out.println(st.getJieQi(2012, 9, 12));
	}

	static void printResult(int[] arr) {
		StringBuilder builder = new StringBuilder();
		for (int i : arr) {
			builder.append(i);
			builder.append("-");
		}
		System.out.println(builder.toString());
	}

	final static long[] STermInfo = new long[]{0, 21208, 42467, 63836, 85337,
			107014, 128867, 150921, 173149, 195551, 218072, 240693, 263343,
			285989, 308563, 331033, 353350, 375494, 397447, 419210, 440795,
			462224, 483532, 504758};

	private static final String[] SolarTerm = new String[]{"小寒", "大寒", "立春",
			"雨水", "惊蛰", "春分", "清明", "谷雨", "立夏", "小满", "芒种", "夏至", "小暑", "大暑",
			"立秋", "处暑", "白露", "秋分", "寒露", "霜降", "立冬", "小雪", "大雪", "冬至"};

	public SolarTerm() {
	}

	/**
	 * 核心方法 根据日期得到节气
	 */
	public String getSoralTerm(Date Date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(Date);

		int y = cal.get(Calendar.YEAR);
		int m = cal.get(Calendar.MONTH) + 1;
		int d = cal.get(Calendar.DAY_OF_MONTH);

		return getSoralTerm(y, m, d);
	}

	/**
	 * 核心方法 根据日期(y年m月d日)得到节气
	 */
	public String getSoralTerm(int y, int m, int d) {
		String solarTerms;
		if (d == sTerm(y, (m - 1) * 2)) {
			solarTerms = SolarTerm[(m - 1) * 2];
		} else if (d == sTerm(y, (m - 1) * 2 + 1)) {
			solarTerms = SolarTerm[(m - 1) * 2 + 1];
		} else {
			// 到这里说明非节气时间
			solarTerms = "";
		}
		System.out.println(d - sTerm(y, (m - 1) * 2) + "---天");
		return solarTerms;
	}

	// ===== y年的第n个节气为几日(从0小寒起算)
	private int sTerm(int y, int n) {
		Calendar cal = Calendar.getInstance();
		cal.set(1900, 0, 6, 2, 5, 0);
		long temp = cal.getTime().getTime();
		cal.setTime(new Date(
				(long) ((31556925974.7 * (y - 1900) + STermInfo[n] * 60000L) + temp)));

		return cal.get(Calendar.DAY_OF_MONTH);
	}

	public int[] sTerm2(int y, int n) {
		int[] returnArr = new int[3];
		Calendar cal = Calendar.getInstance();
		cal.set(1900, 0, 6, 2, 5, 0);
		long temp = cal.getTime().getTime();
		cal.setTime(new Date(
				(long) ((31556925974.7 * (y - 1900) + STermInfo[n] * 60000L) + temp)));
		returnArr[0] = y;
		returnArr[1] = cal.get(Calendar.MONTH) + 1;
		returnArr[2] = cal.get(Calendar.DAY_OF_MONTH);
		return returnArr;
	}

	public String getJieQi(int year, int month, int day) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy-MM-dd");
		Date thatDay = sdf.parse(year + "-" + month + "-" + day);
		for (int i = 0; i < 24; i++) {
			int[] ymd = sTerm2(year, i);
			String d = ymd[0] + "-" + (ymd[1] < 10 ? "0" + ymd[1] : ymd[1]) + "-" + (ymd[2] < 10 ? "0" + ymd[2] : ymd[2]);
			Date jieQiDate = sdf.parse(d);
			int distance = (int) ((thatDay.getTime() - jieQiDate.getTime()) / (1000 * 3600 * 24));
			if (distance >= 15) {
				continue;
			}
			return SolarTerm[i];
		}
		for (int i = 0; i < 24; i++) {
			int[] ymd = sTerm2(year + 1, i);
			String d = ymd[0] + "-" + (ymd[1] < 10 ? "0" + ymd[1] : ymd[1]) + "-" + (ymd[2] < 10 ? "0" + ymd[2] : ymd[2]);
			Date jieQiDate = sdf.parse(d);
			int distance = (int) ((thatDay.getTime() - jieQiDate.getTime()) / (1000 * 3600 * 24));
			if (distance >= 15) {
				continue;
			}
			return SolarTerm[i];
		}
		return null;
	}

}
