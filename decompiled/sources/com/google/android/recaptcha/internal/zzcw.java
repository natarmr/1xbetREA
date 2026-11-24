package com.google.android.recaptcha.internal;

import a.j0g0;
import a.wne;
import a.yje;
import a.zje;

/* JADX INFO: loaded from: classes2.dex */
final class zzcw extends zje {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(zzdc zzdcVar, yje yjeVar) {
        super(yjeVar);
        this.zzb = zzdcVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objMo24execute0E7RQCE = this.zzb.mo24execute0E7RQCE(null, 0L, this);
        return objMo24execute0E7RQCE == wne.f39444a ? objMo24execute0E7RQCE : new j0g0(objMo24execute0E7RQCE);
    }
}
