package com.google.android.recaptcha.internal;

import a.bnn0;
import a.j0g0;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import com.google.android.recaptcha.RecaptchaAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzda extends bnn0 implements Function2 {
    int zza;
    final /* synthetic */ zzdc zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzda(zzdc zzdcVar, RecaptchaAction recaptchaAction, long j, yje yjeVar) {
        super(2, yjeVar);
        this.zzb = zzdcVar;
        this.zzc = recaptchaAction;
        this.zzd = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zzda(this.zzb, this.zzc, this.zzd, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzda) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objZzf;
        wne wneVar = wne.f39444a;
        int i = this.zza;
        z1x.P(obj);
        if (i != 0) {
            objZzf = ((j0g0) obj).f15681a;
        } else {
            zzdc zzdcVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            objZzf = zzdcVar.zzf(recaptchaAction, j, this);
            if (objZzf == wneVar) {
                return wneVar;
            }
        }
        z1x.P(objZzf);
        return objZzf;
    }
}
