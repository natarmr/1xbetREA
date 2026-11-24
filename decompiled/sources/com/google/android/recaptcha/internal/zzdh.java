package com.google.android.recaptcha.internal;

import a.bnn0;
import a.pav;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import android.os.Build;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzdh extends bnn0 implements Function2 {
    int zza;
    final /* synthetic */ zzdt zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(zzdt zzdtVar, yje yjeVar) {
        super(2, yjeVar);
        this.zzb = zzdtVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zzdh(this.zzb, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdh) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        int i = this.zza;
        z1x.P(obj);
        if (i != 0) {
            return obj;
        }
        int iZza = new zzbs(pav.b).zza(this.zzb.zzr());
        zzdt zzdtVar = this.zzb;
        String str = zzdtVar.zza;
        String packageName = zzdtVar.zzr().getPackageName();
        String strZzd = this.zzb.zzb.zzd();
        zzbf zzbfVarZzt = this.zzb.zzt();
        int i2 = Build.VERSION.SDK_INT;
        String strZza = zzbfVarZzt.zza();
        zztn zztnVarZzf = zzto.zzf();
        zztnVarZzf.zzt(str);
        zztnVarZzf.zzq(packageName);
        zztnVarZzf.zzu(iZza);
        zztnVarZzf.zzr("18.6.1");
        zztnVarZzf.zzs(strZzd);
        zztnVarZzf.zzf(String.valueOf(i2));
        zztnVarZzf.zze(strZza);
        zzto zztoVar = (zzto) zztnVarZzf.zzk();
        zzdt zzdtVar2 = this.zzb;
        zzff zzffVarZzg = zzdt.zzg(zzdtVar2);
        String strZzb = zzdt.zzd(zzdtVar2).zzb();
        this.zza = 1;
        Object objZzc = zzffVarZzg.zzc(strZzb, zztoVar, this);
        return objZzc == wneVar ? wneVar : objZzc;
    }
}
