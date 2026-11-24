package com.google.android.recaptcha.internal;

import a.itt0;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgv implements zzgx {
    public static final zzgv zza = new zzgv();

    private zzgv() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        Object array;
        if (zzueVarArr.length != 2) {
            itt0.g(4, 3, null);
            return;
        }
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            itt0.g(4, 5, null);
            return;
        }
        Object objZza2 = zzgdVar.zzc().zza(zzueVarArr[1]);
        if (true != (objZza2 instanceof Integer)) {
            objZza2 = null;
        }
        Integer num = (Integer) objZza2;
        if (num == null) {
            itt0.g(4, 5, null);
            return;
        }
        int iIntValue = num.intValue();
        try {
            if (objZza instanceof Integer) {
                array = Integer.valueOf(((Number) objZza).intValue() / iIntValue);
            } else {
                if (!(objZza instanceof int[])) {
                    throw new zzce(4, 5, null);
                }
                int[] iArr = (int[]) objZza;
                ArrayList arrayList = new ArrayList(iArr.length);
                for (int i2 : iArr) {
                    arrayList.add(Integer.valueOf(i2 / iIntValue));
                }
                array = arrayList.toArray(new Integer[0]);
            }
            zzgdVar.zzc().zze(i, array);
        } catch (ArithmeticException e) {
            itt0.g(4, 6, e);
        }
    }
}
