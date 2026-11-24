package com.google.android.recaptcha;

import a.j0g0;
import a.wne;
import a.yje;
import a.zje;

/* JADX INFO: loaded from: classes2.dex */
public final class Recaptcha$getClient$1 extends zje {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, yje yjeVar) {
        super(yjeVar);
        this.zzb = recaptcha;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object objM23getClientBWLJW6A = this.zzb.m23getClientBWLJW6A(null, null, 0L, this);
        return objM23getClientBWLJW6A == wne.f39444a ? objM23getClientBWLJW6A : new j0g0(objM23getClientBWLJW6A);
    }
}
