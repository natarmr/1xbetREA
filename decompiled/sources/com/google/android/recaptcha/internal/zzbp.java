package com.google.android.recaptcha.internal;

import a.yje;
import a.zje;

/* JADX INFO: loaded from: classes2.dex */
final class zzbp extends zje {
    Object zza;
    Object zzb;
    long zzc;
    long zzd;
    double zze;
    /* synthetic */ Object zzf;
    final /* synthetic */ zzbq zzg;
    int zzh;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbp(zzbq zzbqVar, yje yjeVar) {
        super(yjeVar);
        this.zzg = zzbqVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zzf = obj;
        this.zzh |= Integer.MIN_VALUE;
        return this.zzg.zza(null, 0L, 0L, 0.0d, null, this);
    }
}
