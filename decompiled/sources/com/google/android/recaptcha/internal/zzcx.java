package com.google.android.recaptcha.internal;

import a.j0g0;
import a.wne;
import a.yje;
import a.zje;

/* JADX INFO: loaded from: classes2.dex */
final class zzcx extends zje {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcx(zzdc zzdcVar, yje yjeVar) {
        super(yjeVar);
        this.zzb = zzdcVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objMo25executegIAlus = this.zzb.mo25executegIAlus(null, this);
        return objMo25executegIAlus == wne.f39444a ? objMo25executegIAlus : new j0g0(objMo25executegIAlus);
    }
}
