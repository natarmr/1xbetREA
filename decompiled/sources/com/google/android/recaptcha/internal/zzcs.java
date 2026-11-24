package com.google.android.recaptcha.internal;

import a.yje;
import a.zje;

/* JADX INFO: loaded from: classes2.dex */
final class zzcs extends zje {
    Object zza;
    Object zzb;
    Object zzc;
    long zzd;
    /* synthetic */ Object zze;
    final /* synthetic */ zzcv zzf;
    int zzg;
    String zzh;
    zzch zzi;
    zzbi zzj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcs(zzcv zzcvVar, yje yjeVar) {
        super(yjeVar);
        this.zzf = zzcvVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zze = obj;
        this.zzg |= Integer.MIN_VALUE;
        return this.zzf.zzg(null, 0L, null, null, null, this);
    }
}
