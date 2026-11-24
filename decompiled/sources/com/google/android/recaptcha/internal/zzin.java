package com.google.android.recaptcha.internal;

import a.bnn0;
import a.vne;
import a.yje;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzin extends bnn0 implements Function2 {
    int zza;
    final /* synthetic */ zzja zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzin(zzja zzjaVar, String str, yje yjeVar) {
        super(2, yjeVar);
        this.zzb = zzjaVar;
        this.zzc = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zzin(this.zzb, this.zzc, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzin) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        if (r4.zzF(r1, r3) == r0) goto L13;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            a.wne r0 = a.wne.f39444a
            int r1 = r3.zza
            r2 = 1
            a.z1x.P(r4)
            if (r1 == 0) goto Ld
            if (r1 == r2) goto L17
            goto L2a
        Ld:
            com.google.android.recaptcha.internal.zzja r4 = r3.zzb
            r3.zza = r2
            java.lang.Object r4 = r4.zzw(r3)
            if (r4 == r0) goto L2d
        L17:
            android.webkit.WebView r4 = (android.webkit.WebView) r4
            r4.clearCache(r2)
            com.google.android.recaptcha.internal.zzja r4 = r3.zzb
            java.lang.String r1 = r3.zzc
            r2 = 2
            r3.zza = r2
            java.lang.Object r3 = com.google.android.recaptcha.internal.zzja.zzu(r4, r1, r3)
            if (r3 != r0) goto L2a
            goto L2d
        L2a:
            kotlin.Unit r3 = kotlin.Unit.f46060a
            return r3
        L2d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzin.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
