package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ResourcesUtils {
    public static String a(Context context, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            Log.w("ResourcesUtils", "resName is empty");
            return null;
        }
        int identifier = context.getResources().getIdentifier(str2, "string", str);
        if (identifier == 0) {
            Log.w("ResourcesUtils", "resId == 0");
            return null;
        }
        try {
            return context.getResources().getString(identifier);
        } catch (Resources.NotFoundException e) {
            Log.e("ResourcesUtils", "resources not fund" + e.getMessage());
            return null;
        }
    }

    public static String b(Context context, String str, String str2, String str3) {
        try {
            return a(context, str, str2.concat(Hex.b(MessageDigest.getInstance("SHA-256").digest(str3.getBytes("utf-8")))));
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            Log.e("ResourcesUtils", "getResources exception:" + e.getMessage());
            return null;
        }
    }
}
