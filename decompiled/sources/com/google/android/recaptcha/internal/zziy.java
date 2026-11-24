package com.google.android.recaptcha.internal;

import a.bnn0;
import a.vne;
import a.yje;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zziy extends bnn0 implements Function2 {
    Object zza;
    Object zzb;
    Object zzc;
    Object zzd;
    int zze;
    final /* synthetic */ zzja zzf;
    final /* synthetic */ zzen zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziy(zzja zzjaVar, zzen zzenVar, yje yjeVar) {
        super(2, yjeVar);
        this.zzf = zzjaVar;
        this.zzg = zzenVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zziy(this.zzf, this.zzg, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziy) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x009d  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        if (r9.zzc(r1, r8) == r0) goto L31;
     */
    @Override // a.zw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zziy.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
