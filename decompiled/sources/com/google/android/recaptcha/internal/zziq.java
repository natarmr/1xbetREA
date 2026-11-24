package com.google.android.recaptcha.internal;

import a.bnn0;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zziq extends bnn0 implements Function2 {
    int zza;
    final /* synthetic */ zzja zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziq(zzja zzjaVar, String str, yje yjeVar) {
        super(2, yjeVar);
        this.zzb = zzjaVar;
        this.zzc = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zziq(this.zzb, this.zzc, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        int i = this.zza;
        z1x.P(obj);
        if (i == 0) {
            zzja zzjaVar = this.zzb;
            this.zza = 1;
            obj = zzjaVar.zzw(this);
            if (obj == wneVar) {
                return wneVar;
            }
        }
        ((WebView) obj).evaluateJavascript("recaptcha.m.Main.execute(\"" + this.zzc + "\")", null);
        return Unit.f46060a;
    }
}
