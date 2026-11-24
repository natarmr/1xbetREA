package com.google.android.recaptcha.internal;

import a.bnn0;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzdl extends bnn0 implements Function2 {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzsc zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdl(zzdt zzdtVar, zzsc zzscVar, long j, yje yjeVar) {
        super(2, yjeVar);
        this.zzb = zzdtVar;
        this.zzc = zzscVar;
        this.zzd = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zzdl(this.zzb, this.zzc, this.zzd, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdl) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        int i = this.zza;
        z1x.P(obj);
        if (i == 0) {
            zzdt zzdtVar = this.zzb;
            zzsc zzscVar = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            if (zzdtVar.zzv(zzscVar, j, this) == wneVar) {
                return wneVar;
            }
        }
        return Unit.f46060a;
    }
}
