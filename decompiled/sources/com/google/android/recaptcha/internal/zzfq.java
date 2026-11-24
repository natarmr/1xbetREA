package com.google.android.recaptcha.internal;

import a.bnn0;
import a.d5c;
import a.m0x0;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzfq extends bnn0 implements Function2 {
    int zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzft zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzgd zzgdVar, List list, zzft zzftVar, yje yjeVar) {
        super(2, yjeVar);
        this.zzb = zzgdVar;
        this.zzc = list;
        this.zzd = zzftVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        zzfq zzfqVar = new zzfq(this.zzb, this.zzc, this.zzd, yjeVar);
        zzfqVar.zze = obj;
        return zzfqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfq) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        int i = this.zza;
        z1x.P(obj);
        if (i == 0) {
            vne vneVar = (vne) this.zze;
            while (true) {
                zzgd zzgdVar = this.zzb;
                if (zzgdVar.zza() < 0) {
                    break;
                }
                if (zzgdVar.zza() >= this.zzc.size() || !d5c.R(vneVar)) {
                    break;
                }
                zzuf zzufVar = (zzuf) this.zzc.get(this.zzb.zza());
                try {
                    zzft.zzf(this.zzd, zzufVar, this.zzb);
                } catch (Exception e) {
                    zzufVar.zzk();
                    m0x0.H(zzufVar.zzg());
                    CollectionsKt.b0(zzufVar.zzj(), null, null, null, new zzfp(this.zzd), 31);
                    zzft zzftVar = this.zzd;
                    zzgd zzgdVar2 = this.zzb;
                    this.zza = 1;
                    if (zzftVar.zzh(e, zzgdVar2, this) == wneVar) {
                        return wneVar;
                    }
                }
            }
            return Unit.f46060a;
        }
        return Unit.f46060a;
    }
}
