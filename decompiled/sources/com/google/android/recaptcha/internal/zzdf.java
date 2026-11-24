package com.google.android.recaptcha.internal;

import a.bnn0;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzdf extends bnn0 implements Function2 {
    int zza;
    final /* synthetic */ zzdt zzb;
    final /* synthetic */ zzsp zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdf(zzdt zzdtVar, zzsp zzspVar, zzen zzenVar, yje yjeVar) {
        super(2, yjeVar);
        this.zzb = zzdtVar;
        this.zzc = zzspVar;
        this.zzd = zzenVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zzdf(this.zzb, this.zzc, this.zzd, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdf) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        int i = this.zza;
        z1x.P(obj);
        if (i == 0) {
            zzdt zzdtVar = this.zzb;
            zzsp zzspVar = this.zzc;
            zzfj zzfjVarZzh = zzdt.zzh(zzdtVar);
            zzbr zzbrVarZzd = zzdt.zzd(zzdtVar);
            this.zza = 1;
            obj = zzfjVarZzh.zzb(zzbrVarZzd, zzspVar, this);
            if (obj == wneVar) {
                return wneVar;
            }
        }
        zzsr zzsrVar = (zzsr) obj;
        this.zzd.zza();
        return zzsrVar;
    }
}
