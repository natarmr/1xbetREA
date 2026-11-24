package com.google.android.recaptcha.internal;

import a.itt0;
import a.tx3;
import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.Objects;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes2.dex */
public final class zzgp implements zzgx {
    public static final zzgp zza = new zzgp();

    private zzgp() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, zzgd zzgdVar, zzue... zzueVarArr) throws zzce {
        String strB0;
        String str;
        if (zzueVarArr.length != 1) {
            itt0.g(4, 3, null);
            return;
        }
        int i2 = 0;
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            itt0.g(4, 5, null);
            return;
        }
        if (objZza instanceof int[]) {
            strB0 = tx3.M((int[]) objZza, Separators.COMMA, null, 56);
        } else {
            if (objZza instanceof byte[]) {
                str = new String((byte[]) objZza, Charsets.UTF_8);
            } else if (objZza instanceof long[]) {
                long[] jArr = (long[]) objZza;
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) "[");
                int length = jArr.length;
                int i3 = 0;
                while (i2 < length) {
                    long j = jArr[i2];
                    i3++;
                    if (i3 > 1) {
                        sb.append((CharSequence) Separators.COMMA);
                    }
                    sb.append((CharSequence) String.valueOf(j));
                    i2++;
                }
                sb.append((CharSequence) "]");
                strB0 = sb.toString();
            } else if (objZza instanceof short[]) {
                short[] sArr = (short[]) objZza;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) "[");
                int length2 = sArr.length;
                int i4 = 0;
                while (i2 < length2) {
                    short s = sArr[i2];
                    i4++;
                    if (i4 > 1) {
                        sb2.append((CharSequence) Separators.COMMA);
                    }
                    sb2.append((CharSequence) String.valueOf((int) s));
                    i2++;
                }
                sb2.append((CharSequence) "]");
                strB0 = sb2.toString();
            } else if (objZza instanceof float[]) {
                float[] fArr = (float[]) objZza;
                StringBuilder sb3 = new StringBuilder();
                sb3.append((CharSequence) "[");
                int length3 = fArr.length;
                int i5 = 0;
                while (i2 < length3) {
                    float f = fArr[i2];
                    i5++;
                    if (i5 > 1) {
                        sb3.append((CharSequence) Separators.COMMA);
                    }
                    sb3.append((CharSequence) String.valueOf(f));
                    i2++;
                }
                sb3.append((CharSequence) "]");
                strB0 = sb3.toString();
            } else if (objZza instanceof double[]) {
                double[] dArr = (double[]) objZza;
                StringBuilder sb4 = new StringBuilder();
                sb4.append((CharSequence) "[");
                int length4 = dArr.length;
                int i6 = 0;
                while (i2 < length4) {
                    double d = dArr[i2];
                    i6++;
                    if (i6 > 1) {
                        sb4.append((CharSequence) Separators.COMMA);
                    }
                    sb4.append((CharSequence) String.valueOf(d));
                    i2++;
                }
                sb4.append((CharSequence) "]");
                strB0 = sb4.toString();
            } else if (objZza instanceof char[]) {
                str = new String((char[]) objZza);
            } else if (objZza instanceof Object[]) {
                strB0 = tx3.N((Object[]) objZza, Separators.COMMA, "[", "]", null, 56);
            } else {
                if (!(objZza instanceof Collection)) {
                    itt0.g(4, 5, null);
                    return;
                }
                strB0 = CollectionsKt.b0((Iterable) objZza, Separators.COMMA, "[", "]", null, 56);
            }
            strB0 = str;
        }
        zzgdVar.zzc().zze(i, strB0);
    }
}
