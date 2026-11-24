package com.google.android.recaptcha.internal;

import a.yje;
import a.zje;

/* JADX INFO: loaded from: classes2.dex */
final class zzim extends zje {
    /* synthetic */ Object zza;
    final /* synthetic */ zzja zzb;
    int zzc;
    zzja zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzim(zzja zzjaVar, yje yjeVar) {
        super(yjeVar);
        this.zzb = zzjaVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzE(null, this);
    }
}
