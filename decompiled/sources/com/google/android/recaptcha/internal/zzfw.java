package com.google.android.recaptcha.internal;

import a.qjj;
import a.vne;
import android.webkit.WebView;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfw {
    private final WebView zza;
    private final vne zzb;

    public zzfw(WebView webView, vne vneVar) {
        this.zza = webView;
        this.zzb = vneVar;
    }

    public final void zzb(String str, String... strArr) {
        qjj.W(this.zzb, null, null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3);
    }
}
