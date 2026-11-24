package com.appsflyer.internal;

import a.bh30;
import a.g3;
import a.tx3;
import kotlin.Pair;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1ySDK {
    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    public static boolean registerClient(String str, String str2) {
        Pair pair;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        str.getClass();
        str2.getClass();
        int iAFKeystoreWrapper = AFj1kSDK.AFKeystoreWrapper(str);
        int iAFKeystoreWrapper2 = AFj1kSDK.AFKeystoreWrapper(str2);
        bh30 bh30VarF = new Regex("(\\d+).(\\d+).(\\d+)-(\\d+).(\\d+).(\\d+)").f(str2);
        Pair pair2 = null;
        if (bh30VarF == null) {
            pair = null;
        } else {
            g3 g3Var = bh30VarF.c;
            MatchGroup matchGroupE = g3Var.e(1);
            Integer intOrNull = (matchGroupE == null || (str11 = matchGroupE.f46071a) == null) ? null : StringsKt.toIntOrNull(str11);
            MatchGroup matchGroupE2 = g3Var.e(2);
            Integer intOrNull2 = (matchGroupE2 == null || (str10 = matchGroupE2.f46071a) == null) ? null : StringsKt.toIntOrNull(str10);
            MatchGroup matchGroupE3 = g3Var.e(3);
            Integer intOrNull3 = (matchGroupE3 == null || (str9 = matchGroupE3.f46071a) == null) ? null : StringsKt.toIntOrNull(str9);
            MatchGroup matchGroupE4 = g3Var.e(4);
            Integer intOrNull4 = (matchGroupE4 == null || (str8 = matchGroupE4.f46071a) == null) ? null : StringsKt.toIntOrNull(str8);
            MatchGroup matchGroupE5 = g3Var.e(5);
            Integer intOrNull5 = (matchGroupE5 == null || (str7 = matchGroupE5.f46071a) == null) ? null : StringsKt.toIntOrNull(str7);
            MatchGroup matchGroupE6 = g3Var.e(6);
            Integer intOrNull6 = (matchGroupE6 == null || (str6 = matchGroupE6.f46071a) == null) ? null : StringsKt.toIntOrNull(str6);
            Integer num = intOrNull6;
            if (tx3.u(null, new Object[]{intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, intOrNull6})) {
                pair = null;
            } else {
                intOrNull.getClass();
                int iIntValue = intOrNull.intValue() * 1000000;
                intOrNull2.getClass();
                int iIntValue2 = (intOrNull2.intValue() * 1000) + iIntValue;
                intOrNull3.getClass();
                Integer numValueOf = Integer.valueOf(intOrNull3.intValue() + iIntValue2);
                intOrNull4.getClass();
                int iIntValue3 = intOrNull4.intValue() * 1000000;
                intOrNull5.getClass();
                int iIntValue4 = (intOrNull5.intValue() * 1000) + iIntValue3;
                num.getClass();
                pair = new Pair(numValueOf, Integer.valueOf(num.intValue() + iIntValue4));
            }
        }
        bh30 bh30VarF2 = new Regex("^(\\d+).(\\+)$|^(\\d+).(\\d+).(\\+)$").f(str2);
        if (bh30VarF2 != null) {
            g3 g3Var2 = bh30VarF2.c;
            MatchGroup matchGroupE7 = g3Var2.e(1);
            Integer intOrNull7 = (matchGroupE7 == null || (str5 = matchGroupE7.f46071a) == null) ? null : StringsKt.toIntOrNull(str5);
            MatchGroup matchGroupE8 = g3Var2.e(3);
            Integer intOrNull8 = (matchGroupE8 == null || (str4 = matchGroupE8.f46071a) == null) ? null : StringsKt.toIntOrNull(str4);
            MatchGroup matchGroupE9 = g3Var2.e(4);
            Integer intOrNull9 = (matchGroupE9 == null || (str3 = matchGroupE9.f46071a) == null) ? null : StringsKt.toIntOrNull(str3);
            if (intOrNull7 != null) {
                pair2 = new Pair(Integer.valueOf(intOrNull7.intValue() * 1000000), Integer.valueOf(((intOrNull7.intValue() + 1) * 1000000) - 1));
            } else if (intOrNull8 != null && intOrNull9 != null) {
                pair2 = new Pair(Integer.valueOf((intOrNull9.intValue() * 1000) + (intOrNull8.intValue() * 1000000)), Integer.valueOf((((intOrNull9.intValue() + 1) * 1000) + (intOrNull8.intValue() * 1000000)) - 1));
            }
        }
        if (iAFKeystoreWrapper2 == -1 || pair != null) {
            if (pair2 != null) {
                if (((Number) pair2.f46059a).intValue() > iAFKeystoreWrapper || iAFKeystoreWrapper > ((Number) pair2.b).intValue()) {
                    return false;
                }
            } else if (pair == null || ((Number) pair.f46059a).intValue() > iAFKeystoreWrapper || iAFKeystoreWrapper > ((Number) pair.b).intValue()) {
                return false;
            }
        } else if (iAFKeystoreWrapper2 != iAFKeystoreWrapper) {
            return false;
        }
        return true;
    }
}
