package com.huawei.hms.hatool;

import a.kng0;
import a.ohs0;
import a.w6x;
import android.gov.nist.core.Separators;
import android.util.Pair;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n1 {
    public static Set<String> a(Set<String> set) {
        if (set == null || set.size() == 0) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet();
        for (String str : set) {
            if ("_default_config_tag".equals(str)) {
                hashSet.add("_default_config_tag");
            } else {
                String strN = ohs0.n(str, "-oper");
                String strN2 = ohs0.n(str, "-maint");
                hashSet.add(strN);
                hashSet.add(strN2);
                hashSet.add(str + "-diffprivacy");
            }
        }
        return hashSet;
    }

    public static Pair<String, String> a(String str) {
        String strSubstring;
        String str2;
        if ("_default_config_tag".equals(str)) {
            return new Pair<>(str, "");
        }
        String[] strArrSplit = str.split("-");
        if (strArrSplit.length > 2) {
            str2 = strArrSplit[strArrSplit.length - 1];
            strSubstring = str.substring(0, (str.length() - str2.length()) - 1);
        } else {
            strSubstring = strArrSplit[0];
            str2 = strArrSplit[1];
        }
        return new Pair<>(strSubstring, str2);
    }

    public static String a(int i) {
        if (i == 0) {
            return "oper";
        }
        if (i == 1) {
            return "maint";
        }
        if (i != 2) {
            return i != 3 ? "alltype" : "diffprivacy";
        }
        return "preins";
    }

    public static String a(String str, String str2) {
        return "_default_config_tag".equals(str) ? str : w6x.q(str, "-", str2);
    }

    public static String a(String str, String str2, String str3) {
        if ("_default_config_tag".equals(str)) {
            return kng0.k("_default_config_tag#", str3);
        }
        return str + "-" + str2 + Separators.POUND + str3;
    }

    public static long a(String str, long j) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
            return simpleDateFormat.parse(simpleDateFormat.format(Long.valueOf(j))).getTime();
        } catch (ParseException unused) {
            v.f("hmsSdk/stringUtil", "getMillisOfDate(): Time conversion Exception !");
            return 0L;
        }
    }
}
