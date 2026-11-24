package com.google.android.recaptcha.internal;

import a.yje;
import a.zje;

/* JADX INFO: loaded from: classes2.dex */
final class zzad extends zje {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzae zzc;
    int zzd;
    zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzad(zzae zzaeVar, yje yjeVar) {
        super(yjeVar);
        this.zzc = zzaeVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzd(null, this);
    }
}
