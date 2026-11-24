package com.google.android.recaptcha.internal;

import a.yje;
import a.zje;

/* JADX INFO: loaded from: classes2.dex */
final class zzag extends zje {
    /* synthetic */ Object zza;
    final /* synthetic */ zzan zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzag(zzan zzanVar, yje yjeVar) {
        super(yjeVar);
        this.zzb = zzanVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzi(this);
    }
}
