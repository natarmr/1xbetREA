package a;

import android.gov.nist.core.Separators;
import android.graphics.Color;

/* JADX INFO: loaded from: classes.dex */
public final class sul0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32827a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    public sul0(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f32827a = str;
        this.b = i;
        this.c = num;
        this.d = num2;
        this.e = f;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = i2;
    }

    public static int a(String str) {
        boolean z;
        try {
            int i = Integer.parseInt(str.trim());
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        dw9.A("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            f1t0.h0("SsaStyle", "Failed to parse boolean value: '" + str + Separators.QUOTE, e);
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            x0x.A(j <= 4294967295L);
            return Integer.valueOf(Color.argb(n6x.s(((j >> 24) & 255) ^ 255), n6x.s(j & 255), n6x.s((j >> 8) & 255), n6x.s((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            f1t0.h0("SsaStyle", "Failed to parse color expression: '" + str + Separators.QUOTE, e);
            return null;
        }
    }
}
