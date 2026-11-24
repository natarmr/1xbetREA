package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class g4d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f10660a;

    public /* synthetic */ g4d(float[] fArr) {
        this.f10660a = fArr;
    }

    public static float[] a() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    }

    public static final void b(float[] fArr) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[0] = 0.213f;
        fArr[1] = 0.715f;
        fArr[2] = 0.072f;
        fArr[5] = 0.213f;
        fArr[6] = 0.715f;
        fArr[7] = 0.072f;
        fArr[10] = 0.213f;
        fArr[11] = 0.715f;
        fArr[12] = 0.072f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g4d) {
            return this.f10660a.equals(((g4d) obj).f10660a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f10660a);
    }

    public final String toString() {
        return kng0.l("ColorMatrix(values=", Arrays.toString(this.f10660a), Separators.RPAREN);
    }
}
