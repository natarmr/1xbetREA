package com.google.android.recaptcha.internal;

import a.itt0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhl implements zzgx {
    public static final zzhl zza = new zzhl();

    private zzhl() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 1) {
            itt0.g(4, 3, null);
        } else {
            zzgdVar.zzc().zze(i, zzgdVar.zzc().zza(zzueVarArr[0]));
        }
    }
}
