package com.google.android.recaptcha.internal;

import a.bnn0;
import a.ndd;
import a.odd;
import a.wne;
import a.yje;
import a.z1x;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
final class zzea extends bnn0 implements Function1 {
    Object zza;
    int zzb;
    final /* synthetic */ zzec zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ ndd zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzec zzecVar, long j, ndd nddVar, yje yjeVar) {
        super(1, yjeVar);
        this.zzc = zzecVar;
        this.zzd = j;
        this.zze = nddVar;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new zzea(this.zzc, this.zzd, this.zze, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzea) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zzbd {
        zzen zzenVarZzf;
        wne wneVar = wne.f39444a;
        int i = this.zzb;
        try {
            if (i == 0) {
                z1x.P(obj);
                zzenVarZzf = this.zzc.zzb.zzf(41);
                zzdt zzdtVar = this.zzc.zza;
                long j = this.zzd;
                this.zza = zzenVarZzf;
                this.zzb = 1;
                obj = zzdtVar.zzo(j, this);
                if (obj != wneVar) {
                }
                return wneVar;
            }
            zzenVarZzf = (zzen) this.zza;
            if (i != 1) {
                z1x.P(obj);
            } else {
                z1x.P(obj);
            }
            zzenVarZzf.zza();
            this.zzc.zzf = zzcm.zzb;
            return Boolean.valueOf(((odd) this.zze).N(Unit.f46060a));
            zzsc zzscVar = (zzsc) obj;
            this.zzc.zze = zzscVar;
            zzdt zzdtVar2 = this.zzc.zza;
            long j2 = this.zzd;
            this.zza = zzenVarZzf;
            this.zzb = 2;
            if (zzdtVar2.zzn(zzscVar, j2, this) == wneVar) {
                return wneVar;
            }
            zzenVarZzf.zza();
            this.zzc.zzf = zzcm.zzb;
            return Boolean.valueOf(((odd) this.zze).N(Unit.f46060a));
        } catch (zzbd e) {
            this.zzc.zzd = e;
            zzenVarZzf.zzb(e);
            throw e;
        }
    }
}
