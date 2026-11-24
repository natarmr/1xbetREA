package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public abstract class edx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f7642a = a(Float.NaN, Float.NaN);
    public static final /* synthetic */ int b = 0;

    public static long a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static String b(long j) {
        return rw2.i(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), "InlineDensity(density=", ", fontScale=", Separators.RPAREN);
    }
}
