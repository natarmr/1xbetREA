package com.google.android.recaptcha.internal;

import a.itt0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhs implements zzgx {
    public static final zzhs zza = new zzhs();

    private zzhs() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length != 2) {
            if (length == 0) {
                zzgdVar.zzc().zze(i, new zzbn());
                return;
            } else {
                itt0.g(4, 3, null);
                return;
            }
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof String)) {
            objZza = null;
        }
        String str = (String) objZza;
        if (str == null) {
            itt0.g(4, 5, null);
            return;
        }
        Object objZza2 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (objZza2 instanceof zzbn)) {
            objZza2 = null;
        }
        zzbn zzbnVar = (zzbn) objZza2;
        if (zzbnVar == null) {
            itt0.g(4, 5, null);
            return;
        }
        byte[] bArrZzd = zzev.zza(zzgdVar.zzb(), zzbnVar).zzd();
        zzgdVar.zzi().zzb(str, zzkh.zzh().zzi(bArrZzd, 0, bArrZzd.length));
    }
}
