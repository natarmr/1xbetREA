package com.google.android.recaptcha.internal;

import a.itt0;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes2.dex */
public final class zzho implements zzgx {
    public static final zzho zza = new zzho();

    private zzho() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        if (zzueVarArr.length != 2) {
            itt0.g(4, 3, null);
            return;
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != (objZza instanceof Field)) {
            objZza = null;
        }
        Field field = (Field) objZza;
        if (field == null) {
            itt0.g(4, 5, null);
            return;
        }
        try {
            field.set(null, zzgdVar.zzc().zza(zzueVarArr[1]));
        } catch (Exception e) {
            itt0.g(6, 11, e);
        }
    }
}
