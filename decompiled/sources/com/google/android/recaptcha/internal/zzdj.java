package com.google.android.recaptcha.internal;

import a.yje;
import a.zje;

/* JADX INFO: loaded from: classes2.dex */
final class zzdj extends zje {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzdt zzc;
    int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdj(zzdt zzdtVar, yje yjeVar) {
        super(yjeVar);
        this.zzc = zzdtVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzv(null, 0L, this);
    }
}
