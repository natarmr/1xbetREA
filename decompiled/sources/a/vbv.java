package a;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.SweepGradient;

/* JADX INFO: loaded from: classes.dex */
public final class vbv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vbv f37157a = new vbv();

    public final LinearGradient a(long j, long j2, long[] jArr, float[] fArr, int i) {
        return y5a.e(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), jArr, fArr, knx.R(i));
    }

    public final RadialGradient b(long j, float f, long[] jArr, float[] fArr, int i) {
        return y5a.f(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), f, jArr, fArr, knx.R(i));
    }

    public final SweepGradient c(long j, long[] jArr, float[] fArr) {
        return y5a.g(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), jArr, fArr);
    }
}
