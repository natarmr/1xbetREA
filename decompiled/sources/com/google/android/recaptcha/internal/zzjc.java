package com.google.android.recaptcha.internal;

import a.bnn0;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import android.content.Context;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzjc extends bnn0 implements Function2 {
    final /* synthetic */ zzjd zza;
    final /* synthetic */ Context zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjc(zzjd zzjdVar, Context context, yje yjeVar) {
        super(2, yjeVar);
        this.zza = zzjdVar;
        this.zzb = context;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zzjc(this.zza, this.zzb, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzjc) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        WebView webView = this.zza.zza;
        if (webView == null) {
            webView = new WebView(this.zzb);
        }
        this.zza.zza = webView;
        return webView;
    }
}
