package com.google.android.recaptcha.internal;

import a.bnn0;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzfh extends bnn0 implements Function2 {
    final /* synthetic */ zzfj zza;
    final /* synthetic */ zzbr zzb;
    final /* synthetic */ zzsp zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfh(zzfj zzfjVar, zzbr zzbrVar, zzsp zzspVar, yje yjeVar) {
        super(2, yjeVar);
        this.zza = zzfjVar;
        this.zzb = zzbrVar;
        this.zzc = zzspVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zzfh(this.zza, this.zzb, this.zzc, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfh) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        zzew zzewVarZza = null;
        try {
            try {
                zzewVarZza = zzfj.zza(this.zza).zza(this.zzb.zzd());
                zzewVarZza.zzc();
                zzewVarZza.zze(this.zzc.zzd());
                zzsr zzsrVar = (zzsr) zzewVarZza.zza(zzsr.zzi());
                zzewVarZza.zzd();
                return zzsrVar;
            } catch (zzbd e) {
                throw e;
            } catch (Exception e2) {
                throw new zzbd(zzbb.zzc, zzba.zzF, e2.getMessage());
            }
        } catch (Throwable th) {
            if (zzewVarZza != null) {
                zzewVarZza.zzd();
            }
            throw th;
        }
    }
}
