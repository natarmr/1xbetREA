package com.google.android.recaptcha.internal;

import a.d5c;
import a.itt0;
import a.jf4;
import a.qjj;
import a.vne;
import a.wne;
import a.yje;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzft implements zzfo {
    private final vne zza;
    private final zzgf zzb;
    private final zzhx zzc;
    private final Map zzd;

    public zzft(vne vneVar, zzgf zzgfVar, zzhx zzhxVar, Map map) {
        this.zza = vneVar;
        this.zzb = zzgfVar;
        this.zzc = zzhxVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzft zzftVar, zzuf zzufVar, zzgd zzgdVar) throws zzce {
        zzjh zzjhVarZzb = zzjh.zzb();
        int iZza = zzgdVar.zza();
        zzgx zzgxVar = (zzgx) zzftVar.zzd.get(Integer.valueOf(zzufVar.zzf()));
        if (zzgxVar == null) {
            itt0.g(5, 2, null);
            return;
        }
        int iZzg = zzufVar.zzg();
        zzue[] zzueVarArr = (zzue[]) zzufVar.zzj().toArray(new zzue[0]);
        zzgxVar.zza(iZzg, zzgdVar, (zzue[]) Arrays.copyOf(zzueVarArr, zzueVarArr.length));
        if (iZza == zzgdVar.zza()) {
            zzgdVar.zzg(zzgdVar.zza() + 1);
        }
        zzjhVarZzb.zzf();
        long jZza = zzjhVarZzb.zza(TimeUnit.MICROSECONDS);
        int i = zzbk.zza;
        int iZzk = zzufVar.zzk();
        if (iZzk != 1) {
            zzbk.zza(iZzk - 2, jZza);
        } else {
            jf4.o("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzgd zzgdVar, yje yjeVar) {
        Object objJ = d5c.J(yjeVar, new zzfq(zzgdVar, list, this, null));
        return objJ == wne.f39444a ? objJ : Unit.f46060a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzgd zzgdVar, yje yjeVar) {
        Object objJ = d5c.J(yjeVar, new zzfr(exc, zzgdVar, this, null));
        return objJ == wne.f39444a ? objJ : Unit.f46060a;
    }

    @Override // com.google.android.recaptcha.internal.zzfo
    public final void zza(String str) {
        qjj.W(this.zza, null, null, new zzfs(new zzgd(this.zzb), this, str, null), 3);
    }
}
