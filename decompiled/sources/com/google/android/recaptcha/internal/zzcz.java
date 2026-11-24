package com.google.android.recaptcha.internal;

import a.bnn0;
import a.j0g0;
import a.wne;
import a.yje;
import a.z1x;
import com.google.android.recaptcha.RecaptchaAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzcz extends bnn0 implements Function2 {
    int zza;
    final /* synthetic */ zzdc zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ RecaptchaAction zzd;
    final /* synthetic */ String zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcz(zzdc zzdcVar, long j, RecaptchaAction recaptchaAction, String str, yje yjeVar) {
        super(2, yjeVar);
        this.zzb = zzdcVar;
        this.zzc = j;
        this.zzd = recaptchaAction;
        this.zze = str;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zzcz(this.zzb, this.zzc, this.zzd, this.zze, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcz) create((zzek) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws zzbd {
        wne wneVar = wne.f39444a;
        int i = this.zza;
        z1x.P(obj);
        if (i == 0) {
            zzdc.zze(this.zzb, this.zzc, this.zzd);
            zzdc zzdcVar = this.zzb;
            String str = this.zze;
            RecaptchaAction recaptchaAction = this.zzd;
            long j = this.zzc;
            zzcn zzcnVar = zzdcVar.zzb;
            this.zza = 1;
            obj = zzcnVar.zza(str, recaptchaAction, j, this);
            if (obj == wneVar) {
                return wneVar;
            }
        }
        return new j0g0((String) obj);
    }
}
