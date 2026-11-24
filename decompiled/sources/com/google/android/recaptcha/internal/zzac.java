package com.google.android.recaptcha.internal;

import a.bnn0;
import a.vne;
import a.yje;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzac extends bnn0 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzae zzc;
    final /* synthetic */ String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzae zzaeVar, String str, yje yjeVar) {
        super(2, yjeVar);
        this.zzc = zzaeVar;
        this.zzd = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zzac(this.zzc, this.zzd, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzac) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (r7 != r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00da, code lost:
    
        if (r7 != r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fb, code lost:
    
        return r0;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzac.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
