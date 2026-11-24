package com.google.android.recaptcha.internal;

import a.yje;
import a.zje;

/* JADX INFO: loaded from: classes2.dex */
final class zzfg extends zje {
    /* synthetic */ Object zza;
    final /* synthetic */ zzfj zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfg(zzfj zzfjVar, yje yjeVar) {
        super(yjeVar);
        this.zzb = zzfjVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return zzfj.zzc(this.zzb, null, null, this);
    }
}
