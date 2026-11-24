package com.google.android.recaptcha.internal;

import a.yje;
import a.zje;

/* JADX INFO: loaded from: classes2.dex */
final class zzdk extends zje {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdt zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdk(zzdt zzdtVar, yje yjeVar) {
        super(yjeVar);
        this.zzb = zzdtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzn(null, 0L, this);
    }
}
