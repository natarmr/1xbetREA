package com.google.android.recaptcha.internal;

import a.a8z;
import a.d5c;
import a.maz;
import a.yje;
import kotlin.text.c;

/* JADX INFO: loaded from: classes2.dex */
public final class zzff {
    private final a8z zza;
    private final a8z zzb;
    private final a8z zzc;

    public zzff() {
        int i = zzav.zza;
        this.zza = maz.b(zzfc.zza);
        this.zzb = maz.b(zzfd.zza);
        this.zzc = maz.b(zzfe.zza);
    }

    public static final /* synthetic */ zzfk zzb(zzff zzffVar) {
        return (zzfk) zzffVar.zza.getValue();
    }

    public static /* synthetic */ Object zze(zzff zzffVar, zzsc zzscVar, zzek zzekVar, yje yjeVar) throws Exception {
        try {
            String strZzl = zzscVar.zzl();
            String strZzM = zzscVar.zzM();
            zzaq zzaqVarZzf = zzffVar.zzf();
            String strZzb = null;
            if (zzaqVarZzf != null && zzaqVarZzf.zzd(strZzM)) {
                zzen zzenVarZzf = zzekVar.zzf(25);
                try {
                    String strZza = zzffVar.zzf().zza(strZzM);
                    if (strZza != null) {
                        zzenVarZzf.zza();
                        strZzb = strZza;
                    } else {
                        zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzS, null));
                    }
                } catch (Exception e) {
                    zzenVarZzf.zzb(new zzbd(zzbb.zzk, zzba.zzR, e.getMessage()));
                }
            }
            if (strZzb == null) {
                zzaq zzaqVarZzf2 = zzffVar.zzf();
                if (zzaqVarZzf2 != null) {
                    zzaqVarZzf2.zzb();
                }
                zzen zzenVarZzf2 = zzekVar.zzf(23);
                try {
                    strZzb = zzffVar.zzg().zzb(strZzl);
                    zzenVarZzf2.zza();
                    zzen zzenVarZzf3 = zzekVar.zzf(24);
                    try {
                        zzaq zzaqVarZzf3 = zzffVar.zzf();
                        if (zzaqVarZzf3 != null) {
                            zzaqVarZzf3.zzc(strZzM, strZzb);
                        }
                        zzenVarZzf3.zza();
                    } catch (Exception e2) {
                        zzenVarZzf3.zzb(new zzbd(zzbb.zzk, zzba.zzT, e2.getMessage()));
                    }
                } catch (zzbd e3) {
                    zzenVarZzf2.zzb(e3);
                    throw e3;
                }
            }
            return c.r(zzscVar.zzk(), "JAVASCRIPT_TAG", strZzb, false);
        } catch (Exception e4) {
            if (e4 instanceof zzbd) {
                throw e4;
            }
            throw new zzbd(zzbb.zzb, zzba.zzL, e4.getMessage());
        }
    }

    private final zzaq zzf() {
        return (zzaq) this.zzb.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzey zzg() {
        return (zzey) this.zzc.getValue();
    }

    public final Object zzc(String str, zzto zztoVar, yje yjeVar) {
        return d5c.J(yjeVar, new zzfb(this, str, zztoVar, null));
    }

    public final Object zzd(zzsc zzscVar, zzek zzekVar, yje yjeVar) {
        return zze(this, zzscVar, zzekVar, yjeVar);
    }
}
