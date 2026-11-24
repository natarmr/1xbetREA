package com.appsflyer.internal;

import a.bh30;
import a.g3;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.text.Charsets;
import kotlin.text.MatchGroup;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1kSDK {
    public static final int AFKeystoreWrapper(String str) {
        String str2;
        Integer intOrNull;
        String str3;
        Integer intOrNull2;
        String str4;
        Integer intOrNull3;
        str.getClass();
        bh30 bh30VarF = new Regex("(\\d+).(\\d+).(\\d+).*").f(str);
        if (bh30VarF == null) {
            return -1;
        }
        g3 g3Var = bh30VarF.c;
        MatchGroup matchGroupE = g3Var.e(1);
        int iIntValue = 0;
        int iIntValue2 = ((matchGroupE == null || (str4 = matchGroupE.f46071a) == null || (intOrNull3 = StringsKt.toIntOrNull(str4)) == null) ? 0 : intOrNull3.intValue()) * 1000000;
        MatchGroup matchGroupE2 = g3Var.e(2);
        int iIntValue3 = (((matchGroupE2 == null || (str3 = matchGroupE2.f46071a) == null || (intOrNull2 = StringsKt.toIntOrNull(str3)) == null) ? 0 : intOrNull2.intValue()) * 1000) + iIntValue2;
        MatchGroup matchGroupE3 = g3Var.e(3);
        if (matchGroupE3 != null && (str2 = matchGroupE3.f46071a) != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
            iIntValue = intOrNull.intValue();
        }
        return iIntValue3 + iIntValue;
    }

    public static final String registerClient(String str, String str2) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str2);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        byte[] bArrDigest = messageDigest.digest(bytes);
        bArrDigest.getClass();
        String strConcat = "";
        for (byte b : bArrDigest) {
            strConcat = strConcat.concat(String.format(Locale.US, "%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
        }
        return strConcat;
    }
}
