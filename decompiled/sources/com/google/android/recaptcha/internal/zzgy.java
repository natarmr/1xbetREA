package com.google.android.recaptcha.internal;

import a.itt0;
import a.r3d;
import a.tx3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgy implements zzgx {
    public static final zzgy zza = new zzgy();

    private zzgy() {
    }

    private static final List zzc(Object obj) {
        if (obj instanceof byte[]) {
            return tx3.a0((byte[]) obj);
        }
        if (obj instanceof short[]) {
            return tx3.h0((short[]) obj);
        }
        if (obj instanceof int[]) {
            return tx3.e0((int[]) obj);
        }
        if (obj instanceof long[]) {
            return tx3.f0((long[]) obj);
        }
        if (obj instanceof float[]) {
            return tx3.d0((float[]) obj);
        }
        if (obj instanceof double[]) {
            return tx3.c0((double[]) obj);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
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
        if (true != Objects.nonNull(objZza2)) {
            objZza2 = null;
        }
        if (objZza2 != null) {
            zzgdVar.zzc().zze(i, zzb(objZza, objZza2));
        } else {
            itt0.g(4, 5, null);
        }
    }

    public final Object zzb(Object obj, Object obj2) throws zzce {
        List listZzc = zzc(obj);
        List listZzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (listZzc2 != null) {
                ArrayList arrayList = new ArrayList(r3d.q(listZzc2, 10));
                Iterator it = listZzc2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return arrayList.toArray(new Double[0]);
            }
        }
        if (listZzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(r3d.q(listZzc, 10));
            Iterator it2 = listZzc.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            return arrayList2.toArray(new Double[0]);
        }
        if (listZzc == null || listZzc2 == null) {
            itt0.g(4, 5, null);
            return null;
        }
        zzgw.zza(this, listZzc.size(), listZzc2.size());
        int size = listZzc.size();
        Double[] dArr = new Double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = Double.valueOf(Math.pow(((Number) listZzc.get(i)).doubleValue(), ((Number) listZzc2.get(i)).doubleValue()));
        }
        return dArr;
    }
}
