package com.google.android.recaptcha.internal;

import a.e9d0;
import a.jf4;

/* JADX INFO: loaded from: classes2.dex */
public final class zzjf {
    public static void zza(boolean z) {
        if (z) {
            return;
        }
        e9d0.o();
    }

    public static void zzb(boolean z, Object obj) {
        if (z) {
            return;
        }
        jf4.o((String) obj);
    }

    public static void zzc(boolean z, String str, char c) {
        if (z) {
            return;
        }
        jf4.o(zzji.zza(str, Character.valueOf(c)));
    }

    public static void zzd(int i, int i2, int i3) {
        String strZzf;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strZzf = zzf(i, i3, "start index");
            } else {
                strZzf = (i2 < 0 || i2 > i3) ? zzf(i2, i3, "end index") : zzji.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strZzf);
        }
    }

    public static void zze(boolean z, Object obj) {
        if (z) {
            return;
        }
        jf4.n((String) obj);
    }

    private static String zzf(int i, int i2, String str) {
        return i < 0 ? zzji.zza("%s (%s) must not be negative", str, Integer.valueOf(i)) : zzji.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
    }
}
