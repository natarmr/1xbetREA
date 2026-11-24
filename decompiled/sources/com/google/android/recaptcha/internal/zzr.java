package com.google.android.recaptcha.internal;

import a.bnn0;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzr extends bnn0 implements Function2 {
    int zza;
    final /* synthetic */ zzy zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ List zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr(zzy zzyVar, String str, List list, yje yjeVar) {
        super(2, yjeVar);
        this.zzb = zzyVar;
        this.zzc = str;
        this.zzd = list;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zzr(this.zzb, this.zzc, this.zzd, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzr) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        int i = this.zza;
        z1x.P(obj);
        if (i == 0) {
            zzy zzyVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            obj = zzyVar.zzc(str, this);
            if (obj == wneVar) {
                return wneVar;
            }
        }
        this.zzd.add((zzaa) obj);
        return Unit.f46060a;
    }
}
