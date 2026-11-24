package com.google.android.recaptcha.internal;

import a.bnn0;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzaj extends bnn0 implements Function2 {
    int zza;
    final /* synthetic */ zzan zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaj(zzan zzanVar, yje yjeVar) {
        super(2, yjeVar);
        this.zzb = zzanVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zzaj(this.zzb, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaj) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        int i = this.zza;
        z1x.P(obj);
        if (i == 0) {
            this.zzb.zze = zzao.zza;
            zzan zzanVar = this.zzb;
            this.zza = 1;
            if (zzanVar.zze(this) == wneVar) {
                return wneVar;
            }
        }
        return Unit.f46060a;
    }
}
