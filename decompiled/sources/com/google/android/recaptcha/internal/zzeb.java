package com.google.android.recaptcha.internal;

import a.bnn0;
import a.ndd;
import a.odd;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzeb extends bnn0 implements Function2 {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ ndd zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzec zzecVar, ndd nddVar, long j, yje yjeVar) {
        super(2, yjeVar);
        this.zzb = zzecVar;
        this.zzc = nddVar;
        this.zzd = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zzeb(this.zzb, this.zzc, this.zzd, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        zzbd zzbdVar;
        zzeb zzebVar;
        zzbd e;
        wne wneVar = wne.f39444a;
        if (this.zza != 0) {
            try {
                z1x.P(obj);
                zzebVar = this;
            } catch (zzbd e2) {
                zzbdVar = e2;
                zzebVar = this;
                zzebVar.zzb.zzf = zzcm.zzd;
                ((odd) zzebVar.zzc).b0(zzbdVar);
            }
        } else {
            z1x.P(obj);
            try {
                zzbq zzbqVar = zzbq.zza;
                zzdz zzdzVar = new zzdz(this.zzb);
                zzea zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                zzebVar = this;
                try {
                    obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, zzebVar);
                    if (obj == wneVar) {
                        return wneVar;
                    }
                } catch (zzbd e3) {
                    e = e3;
                    zzbdVar = e;
                    zzebVar.zzb.zzf = zzcm.zzd;
                    ((odd) zzebVar.zzc).b0(zzbdVar);
                }
            } catch (zzbd e4) {
                e = e4;
                zzebVar = this;
                zzbdVar = e;
                zzebVar.zzb.zzf = zzcm.zzd;
                ((odd) zzebVar.zzc).b0(zzbdVar);
            }
        }
        ((Boolean) obj).getClass();
        return Unit.f46060a;
    }
}
