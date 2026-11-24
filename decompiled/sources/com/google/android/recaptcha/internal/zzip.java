package com.google.android.recaptcha.internal;

import a.j0g0;
import a.wne;
import a.yje;
import a.zje;

/* JADX INFO: loaded from: classes2.dex */
final class zzip extends zje {
    /* synthetic */ Object zza;
    final /* synthetic */ zzja zzb;
    int zzc;
    zzja zzd;
    String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzip(zzja zzjaVar, yje yjeVar) {
        super(yjeVar);
        this.zzb = zzjaVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzf = this.zzb.zzf(null, this);
        return objZzf == wne.f39444a ? objZzf : new j0g0(objZzf);
    }
}
