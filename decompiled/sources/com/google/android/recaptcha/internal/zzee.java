package com.google.android.recaptcha.internal;

import a.yje;
import a.zje;

/* JADX INFO: loaded from: classes2.dex */
final class zzee extends zje {
    double zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzef zzc;
    int zzd;
    zzef zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzee(zzef zzefVar, yje yjeVar) {
        super(yjeVar);
        this.zzc = zzefVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzb(0L, this);
    }
}
