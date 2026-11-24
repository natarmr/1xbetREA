package com.google.android.recaptcha.internal;

import a.bnn0;
import a.mie0;
import a.msm0;
import a.ndd;
import a.odd;
import a.ohs0;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzam extends bnn0 implements Function2 {
    Object zza;
    int zzb;
    final /* synthetic */ zzan zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzan zzanVar, zzen zzenVar, yje yjeVar) {
        super(2, yjeVar);
        this.zzc = zzanVar;
        this.zzd = zzenVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zzam(this.zzc, this.zzd, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d  */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        mie0 mie0Var;
        Exception e;
        Throwable th;
        wne wneVar = wne.f39444a;
        if (this.zzb != 0) {
            mie0Var = (mie0) this.zza;
            try {
                z1x.P(obj);
            } catch (Exception e2) {
                e = e2;
                ndd nddVarZzf = this.zzc.zzf();
                th = (Throwable) mie0Var.f21842a;
                if (th == null) {
                    th = e;
                }
                ((odd) nddVarZzf).b0(th);
                this.zzc.zze = zzao.zza;
                this.zzd.zzb(new zzbd(zzbb.zzb, zzba.zza, e.getMessage()));
            }
        } else {
            mie0 mie0VarJ = ohs0.j(obj);
            try {
                zzal zzalVar = new zzal(this.zzc, this.zzd, mie0VarJ, null);
                this.zza = mie0VarJ;
                this.zzb = 1;
                if (msm0.t(60000L, zzalVar, this) == wneVar) {
                    return wneVar;
                }
            } catch (Exception e3) {
                mie0Var = mie0VarJ;
                e = e3;
                ndd nddVarZzf2 = this.zzc.zzf();
                th = (Throwable) mie0Var.f21842a;
                if (th == null) {
                    th = e;
                }
                ((odd) nddVarZzf2).b0(th);
                this.zzc.zze = zzao.zza;
                this.zzd.zzb(new zzbd(zzbb.zzb, zzba.zza, e.getMessage()));
            }
        }
        return Unit.f46060a;
    }
}
