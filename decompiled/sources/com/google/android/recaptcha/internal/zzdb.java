package com.google.android.recaptcha.internal;

import a.yje;
import a.zje;

/* JADX INFO: loaded from: classes2.dex */
final class zzdb extends zje {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;
    zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdb(zzdc zzdcVar, yje yjeVar) {
        super(yjeVar);
        this.zzb = zzdcVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        return this.zzb.zzg(null, null, this);
    }
}
