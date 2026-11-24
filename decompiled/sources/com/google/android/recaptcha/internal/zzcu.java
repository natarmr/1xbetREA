package com.google.android.recaptcha.internal;

import a.yje;
import a.zje;

/* JADX INFO: loaded from: classes2.dex */
final class zzcu extends zje {
    /* synthetic */ Object zza;
    final /* synthetic */ zzcv zzb;
    int zzc;
    zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcu(zzcv zzcvVar, yje yjeVar) {
        super(yjeVar);
        this.zzb = zzcvVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzj(null, 0, null, this);
    }
}
