package com.google.android.recaptcha.internal;

import a.bnn0;
import a.e0g0;
import a.g0g0;
import a.j0g0;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzu extends bnn0 implements Function2 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzsc zzd;
    final /* synthetic */ zzv zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(zzsc zzscVar, zzv zzvVar, yje yjeVar) {
        super(2, yjeVar);
        this.zzd = zzscVar;
        this.zze = zzvVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zzu(this.zzd, this.zze, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzu) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        zzse zzseVarZzj;
        Iterator it;
        wne wneVar = wne.f39444a;
        if (this.zzc != 0) {
            it = (Iterator) this.zzb;
            zzseVarZzj = (zzse) this.zza;
            z1x.P(obj);
        } else {
            z1x.P(obj);
            if (!this.zzd.zzS()) {
                e0g0 e0g0Var = j0g0.b;
                return new j0g0(new g0g0(new zzbd(zzbb.zzb, zzba.zzab, null)));
            }
            zzseVarZzj = this.zzd.zzj();
            if (zzseVarZzj.zzi().zzd() == 0) {
                e0g0 e0g0Var2 = j0g0.b;
                return new j0g0(new g0g0(new zzbd(zzbb.zzb, zzba.zzab, null)));
            }
            this.zze.zzc = zzseVarZzj.zzi();
            it = this.zze.zzb.iterator();
        }
        while (it.hasNext()) {
            zzy zzyVar = (zzy) it.next();
            this.zza = zzseVarZzj;
            this.zzb = it;
            this.zzc = 1;
            if (zzyVar.zzd(zzseVarZzj, this) == wneVar) {
                return wneVar;
            }
        }
        e0g0 e0g0Var3 = j0g0.b;
        return new j0g0(Unit.f46060a);
    }
}
