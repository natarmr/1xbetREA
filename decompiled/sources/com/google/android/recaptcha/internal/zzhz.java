package com.google.android.recaptcha.internal;

import a.a2t0;
import a.b2t0;
import a.itt0;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhz implements zzhx {
    private final zzhy zza;

    public zzhz(zzhy zzhyVar, zzhw zzhwVar) {
        this.zza = zzhyVar;
    }

    private final zztz zzb(String str, List list) throws zzce {
        if (str.length() == 0) {
            itt0.g(3, 17, null);
            return null;
        }
        try {
            zzhv zzhvVar = new zzhv(this.zza.zza(CollectionsKt.M0(list)), 255L, zzhv.zza);
            StringBuilder sb = new StringBuilder(str.length());
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                a2t0 a2t0Var = b2t0.b;
                sb.append((char) (cCharAt ^ ((int) zzhvVar.zza())));
            }
            return zztz.zzg(zzkh.zzh().zzj(sb.toString()));
        } catch (Exception e) {
            itt0.g(3, 18, e);
            return null;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzhx
    public final zztz zza(zzub zzubVar) throws zzce {
        zzjh zzjhVarZzb = zzjh.zzb();
        zztz zztzVarZzb = zzb(zzubVar.zzj(), zzubVar.zzk());
        zzjhVarZzb.zzf();
        long jZza = zzjhVarZzb.zza(TimeUnit.MICROSECONDS);
        int i = zzbk.zza;
        zzbk.zza(zzbl.zzh.zza(), jZza);
        return zztzVarZzb;
    }
}
