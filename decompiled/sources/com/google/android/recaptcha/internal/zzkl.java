package com.google.android.recaptcha.internal;

import a.f140;
import a.rw2;
import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
final class zzkl {
    public static void zza(boolean z, String str, long j, long j2) {
        if (!z) {
            throw new ArithmeticException(rw2.n(f140.o(j, "overflow: ", str, Separators.LPAREN), j2, ", ", Separators.RPAREN));
        }
    }

    public static void zzb(boolean z) {
        if (!z) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
