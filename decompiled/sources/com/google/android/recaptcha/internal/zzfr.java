package com.google.android.recaptcha.internal;

import a.bnn0;
import a.d5c;
import a.sre0;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
final class zzfr extends bnn0 implements Function2 {
    final /* synthetic */ Exception zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ zzft zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfr(Exception exc, zzgd zzgdVar, zzft zzftVar, yje yjeVar) {
        super(2, yjeVar);
        this.zza = exc;
        this.zzb = zzgdVar;
        this.zzc = zzftVar;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        zzfr zzfrVar = new zzfr(this.zza, this.zzb, this.zzc, yjeVar);
        zzfrVar.zzd = obj;
        return zzfrVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfr) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        zztd zztdVarZza;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        vne vneVar = (vne) this.zzd;
        Exception exc = this.zza;
        if (exc instanceof zzce) {
            zztdVarZza = ((zzce) exc).zza();
            zztdVarZza.zze(this.zzb.zza());
        } else {
            zzgd zzgdVar = this.zzb;
            zztd zztdVarZzf = zzte.zzf();
            zztdVarZzf.zze(zzgdVar.zza());
            zztdVarZzf.zzr(2);
            zztdVarZzf.zzq(2);
            zztdVarZza = zztdVarZzf;
        }
        zzte zzteVar = (zzte) zztdVarZza.zzk();
        zzteVar.zzl();
        zzteVar.zzk();
        sre0.f32672a.b(this.zza.getClass()).J();
        this.zza.getMessage();
        zzgd zzgdVar2 = this.zzb;
        zzbn zzbnVarZzb = zzgdVar2.zzb();
        zzbn zzbnVar = zzgdVar2.zza;
        if (zzbnVar == null) {
            zzbnVar = null;
        }
        zzrl zzrlVarZza = zzev.zza(zzbnVarZzb, zzbnVar);
        String strZzd = this.zzb.zzd();
        if (strZzd.length() == 0) {
            strZzd = "recaptcha.m.Main.rge";
        }
        if (d5c.R(vneVar)) {
            zzft zzftVar = this.zzc;
            zzkh zzkhVarZzh = zzkh.zzh();
            byte[] bArrZzd = zzteVar.zzd();
            String strZzi = zzkhVarZzh.zzi(bArrZzd, 0, bArrZzd.length);
            zzkh zzkhVarZzh2 = zzkh.zzh();
            byte[] bArrZzd2 = zzrlVarZza.zzd();
            zzftVar.zzb.zzd().zzb(strZzd, (String[]) Arrays.copyOf(new String[]{strZzi, zzkhVarZzh2.zzi(bArrZzd2, 0, bArrZzd2.length)}, 2));
        }
        return Unit.f46060a;
    }
}
