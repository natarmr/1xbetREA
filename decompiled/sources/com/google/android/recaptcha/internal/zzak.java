package com.google.android.recaptcha.internal;

import a.yje;
import a.zje;

/* JADX INFO: loaded from: classes2.dex */
final class zzak extends zje {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzan zzc;
    int zzd;
    zzan zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzak(zzan zzanVar, yje yjeVar) {
        super(yjeVar);
        this.zzc = zzanVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zze(this);
    }
}
