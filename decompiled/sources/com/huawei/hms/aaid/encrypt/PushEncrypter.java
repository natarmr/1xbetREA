package com.huawei.hms.aaid.encrypt;

import a.afn0;
import a.obc;
import a.rq8;
import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.opendevice.l;

/* JADX INFO: loaded from: classes2.dex */
public class PushEncrypter {
    public static String decrypter(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strB = l.b(context);
        if (TextUtils.isEmpty(str)) {
            afn0.j("CBC", "decrypt 1 content is null");
            return "";
        }
        if (TextUtils.isEmpty(strB)) {
            afn0.j("CBC", "decrypt 1 key is null");
            return "";
        }
        byte[] bArrR = obc.R(strB);
        if (bArrR.length >= 16) {
            return rq8.I(str, bArrR);
        }
        afn0.j("CBC", "decrypt 1 key error: 1 key length less than 16 bytes.");
        return "";
    }

    public static String encrypter(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strB = l.b(context);
        if (TextUtils.isEmpty(str)) {
            afn0.j("CBC", "encrypt 1 content is null");
            return "";
        }
        if (TextUtils.isEmpty(strB)) {
            afn0.j("CBC", "encrypt 1 key is null");
            return "";
        }
        byte[] bArrR = obc.R(strB);
        if (bArrR.length >= 16) {
            return rq8.N(str, bArrR);
        }
        afn0.j("CBC", "encrypt 1 key error: 1 key length less than 16 bytes.");
        return "";
    }

    public static String encrypterOld(Context context, String str) {
        return TextUtils.isEmpty(str) ? "" : rq8.N(str, l.a(context));
    }
}
