package com.google.android.recaptcha.internal;

import a.yje;
import a.zje;

/* JADX INFO: loaded from: classes2.dex */
final class zzdw extends zje {
    long zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzec zzc;
    int zzd;
    zzec zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdw(zzec zzecVar, yje yjeVar) {
        super(yjeVar);
        this.zzc = zzecVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzm(0L, this);
    }
}
