package com.google.android.recaptcha.internal;

import a.yje;
import a.zje;
import com.google.android.recaptcha.RecaptchaAction;

/* JADX INFO: loaded from: classes2.dex */
final class zzdu extends zje {
    double zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzec zzc;
    int zzd;
    zzec zze;
    String zzf;
    RecaptchaAction zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdu(zzec zzecVar, yje yjeVar) {
        super(yjeVar);
        this.zzc = zzecVar;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zza(null, null, 0L, this);
    }
}
