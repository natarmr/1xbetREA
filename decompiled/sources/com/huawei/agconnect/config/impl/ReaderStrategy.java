package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.agconnect.config.AesDecrypt;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public class ReaderStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AesDecrypt f45686a;

    public ReaderStrategy(Context context, String str) {
        String str2;
        String strB = ResourcesUtils.b(context, str, "agc_plugin_", "crypto");
        if (strB != null) {
            try {
                str2 = new String(Hex.a(strB), "utf-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException e) {
                Log.e("ReaderStrategy", "UnsupportedEncodingException" + e.getMessage());
                str2 = null;
            }
        } else {
            str2 = null;
        }
        this.f45686a = (TextUtils.isEmpty(str2) || Build.VERSION.SDK_INT < 26) ? new FixedDecrypt(context, str) : new FlexibleDecrypt(context, str);
    }
}
