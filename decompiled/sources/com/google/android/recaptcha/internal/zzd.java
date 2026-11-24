package com.google.android.recaptcha.internal;

import a.bnn0;
import a.j0g0;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzd extends bnn0 implements Function2 {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ zzsc zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzd(zze zzeVar, zzsc zzscVar, yje yjeVar) {
        super(2, yjeVar);
        this.zzb = zzeVar;
        this.zzc = zzscVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zzd(this.zzb, this.zzc, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzd) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objZzh;
        wne wneVar = wne.f39444a;
        int i = this.zza;
        z1x.P(obj);
        if (i != 0) {
            objZzh = ((j0g0) obj).f15681a;
        } else {
            zze zzeVar = this.zzb;
            zzsc zzscVar = this.zzc;
            this.zza = 1;
            objZzh = zzeVar.zzh(zzscVar, this);
            if (objZzh == wneVar) {
                return wneVar;
            }
        }
        return new j0g0(objZzh);
    }
}
