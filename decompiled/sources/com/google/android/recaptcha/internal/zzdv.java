package com.google.android.recaptcha.internal;

import a.yje;
import a.zje;

/* JADX INFO: loaded from: classes2.dex */
final class zzdv extends zje {
    /* synthetic */ Object zza;
    final /* synthetic */ zzec zzb;
    int zzc;
    zzbn zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdv(zzec zzecVar, yje yjeVar) {
        super(yjeVar);
        this.zzb = zzecVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzl(null, this);
    }
}
