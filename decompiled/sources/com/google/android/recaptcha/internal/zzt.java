package com.google.android.recaptcha.internal;

import a.j0g0;
import a.wne;
import a.yje;
import a.zje;

/* JADX INFO: loaded from: classes2.dex */
final class zzt extends zje {
    /* synthetic */ Object zza;
    final /* synthetic */ zzv zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzt(zzv zzvVar, yje yjeVar) {
        super(yjeVar);
        this.zzb = zzvVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objZzh = this.zzb.zzh(null, this);
        return objZzh == wne.f39444a ? objZzh : new j0g0(objZzh);
    }
}
