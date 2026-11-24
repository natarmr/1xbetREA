package com.google.android.recaptcha.internal;

import a.d5c;
import a.jf4;
import a.vne;
import a.wne;
import a.yje;
import a.z1x;
import android.content.Context;
import java.nio.charset.StandardCharsets;
import kotlin.Unit;

/* JADX INFO: loaded from: classes2.dex */
public final class zzae implements zzy {
    private final zzek zza;
    private final Context zzb;
    private final zzan zzc;
    private boolean zzd = true;
    private String zze = "";
    private final zzbs zzf;

    public zzae(zzek zzekVar, Context context, vne vneVar, zzan zzanVar, zzbs zzbsVar) {
        this.zza = zzekVar;
        this.zzb = context;
        this.zzc = zzanVar;
        this.zzf = zzbsVar;
    }

    private static final String zzi(zzle zzleVar) {
        zzkh zzkhVarZzg = zzkh.zzg();
        byte[] bArrZzl = zzleVar.zzl();
        byte[] bArrZzd = zzjz.zza().zza(zzkhVarZzg.zzi(bArrZzl, 0, bArrZzl.length), StandardCharsets.UTF_8).zzd();
        zzle zzleVarZzk = zzle.zzk(bArrZzd, 0, bArrZzd.length);
        zzkh zzkhVarZzh = zzkh.zzh();
        byte[] bArrZzl2 = zzleVarZzk.zzl();
        return zzkhVarZzh.zzi(bArrZzl2, 0, bArrZzl2.length);
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(String str, yje yjeVar) {
        return d5c.J(yjeVar, new zzac(this, str, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzd(zzse zzseVar, yje yjeVar) {
        zzad zzadVar;
        zzen zzenVarZzc;
        zzen zzenVar;
        if (yjeVar instanceof zzad) {
            zzadVar = (zzad) yjeVar;
            int i = zzadVar.zzd;
            if ((i & Integer.MIN_VALUE) != 0) {
                zzadVar.zzd = i - Integer.MIN_VALUE;
            } else {
                zzadVar = new zzad(this, yjeVar);
            }
        } else {
            zzadVar = new zzad(this, yjeVar);
        }
        Object obj = zzadVar.zzb;
        wne wneVar = wne.f39444a;
        int i2 = zzadVar.zzd;
        if (i2 != 0) {
            if (i2 == 1) {
                zzen zzenVar2 = zzadVar.zze;
                zzae zzaeVar = (zzae) zzadVar.zza;
                z1x.P(obj);
                zzenVarZzc = zzenVar2;
                this = zzaeVar;
            } else {
                if (i2 != 2) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zzenVar = (zzen) zzadVar.zza;
                z1x.P(obj);
            }
            zzenVar.zza();
            return Unit.f46060a;
        }
        z1x.P(obj);
        zzenVarZzc = zzz.zzc(this);
        if (this.zzf.zza(this.zzb) != 3 || zzseVar.zzf() == 0) {
            this.zzd = false;
            zzenVarZzc.zzb(new zzbd(zzbb.zzb, zzba.zzab, null));
            return Unit.f46060a;
        }
        this.zze = zzi(zzseVar.zzg());
        zzan zzanVar = this.zzc;
        long jZzf = zzseVar.zzf();
        zzadVar.zza = this;
        zzadVar.zze = zzenVarZzc;
        zzadVar.zzd = 1;
        if (zzanVar.zzd(jZzf, zzadVar) != wneVar) {
        }
        return wneVar;
        zzan zzanVar2 = this.zzc;
        zzadVar.zza = zzenVarZzc;
        zzadVar.zze = null;
        zzadVar.zzd = 2;
        if (zzanVar2.zze(zzadVar) != wneVar) {
            zzenVar = zzenVarZzc;
            zzenVar.zza();
            return Unit.f46060a;
        }
        return wneVar;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(zzsr zzsrVar) {
        this.zze = zzi(zzsrVar.zzf());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzd;
    }
}
