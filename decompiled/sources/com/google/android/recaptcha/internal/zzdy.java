package com.google.android.recaptcha.internal;

import a.bnn0;
import a.msm0;
import a.wne;
import a.yje;
import a.z1x;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
final class zzdy extends bnn0 implements Function1 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzec zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(long j, zzec zzecVar, yje yjeVar) {
        super(1, yjeVar);
        this.zzb = j;
        this.zzc = zzecVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new zzdy(this.zzb, this.zzc, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzdy) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        int i = this.zza;
        z1x.P(obj);
        if (i == 0) {
            long j = this.zzb;
            zzdx zzdxVar = new zzdx(this.zzc, null);
            this.zza = 1;
            if (msm0.t(j, zzdxVar, this) == wneVar) {
                return wneVar;
            }
        }
        return Unit.f46060a;
    }
}
