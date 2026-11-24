package com.google.android.recaptcha.internal;

import a.j0g0;
import a.wne;
import a.yje;
import a.zje;

/* JADX INFO: loaded from: classes2.dex */
final class zzc extends zje {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zze zzc;
    int zzd;
    zzen zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzc(zze zzeVar, yje yjeVar) {
        super(yjeVar);
        this.zzc = zzeVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        Object objZze = this.zzc.zze(0L, null, this);
        return objZze == wne.f39444a ? objZze : new j0g0(objZze);
    }
}
