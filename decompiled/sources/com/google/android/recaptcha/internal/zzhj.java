package com.google.android.recaptcha.internal;

import a.itt0;
import a.tx3;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzhj implements zzgx {
    public static final zzhj zza = new zzhj();

    private zzhj() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        int length = zzueVarArr.length;
        if (length == 0) {
            itt0.g(4, 3, null);
            return;
        }
        Constructor<?> constructorZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(constructorZza)) {
            constructorZza = null;
        }
        if (constructorZza == null) {
            itt0.g(4, 5, null);
            return;
        }
        Constructor<?> constructor = constructorZza instanceof Constructor ? constructorZza : constructorZza.getClass().getConstructor(null);
        Object[] objArrZzg = zzgdVar.zzc().zzg(tx3.g0(zzueVarArr).subList(1, length));
        try {
            zzgdVar.zzc().zze(i, constructor.newInstance(Arrays.copyOf(objArrZzg, objArrZzg.length)));
        } catch (Exception e) {
            itt0.g(6, 14, e);
        }
    }
}
