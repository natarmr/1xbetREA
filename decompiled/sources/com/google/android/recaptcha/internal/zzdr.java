package com.google.android.recaptcha.internal;

import a.yje;
import a.zje;

/* JADX INFO: loaded from: classes2.dex */
final class zzdr extends zje {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdt zzb;
    int zzc;
    zzdt zzd;
    zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdr(zzdt zzdtVar, yje yjeVar) {
        super(yjeVar);
        this.zzb = zzdtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzo(0L, this);
    }
}
