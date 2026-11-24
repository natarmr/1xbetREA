package com.google.android.recaptcha.internal;

import a.yje;
import a.zje;

/* JADX INFO: loaded from: classes2.dex */
final class zzbz extends zje {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzcb zzc;
    int zzd;
    zzcb zze;
    zzje[] zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzbz(zzcb zzcbVar, yje yjeVar) {
        super(yjeVar);
        this.zzc = zzcbVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzb(null, this);
    }
}
