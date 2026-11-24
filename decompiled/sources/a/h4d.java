package a;

import android.gov.nist.core.Separators;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.os.Build;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class h4d extends a4d {
    public float[] b;

    public final float[] a() {
        float[] fArr = this.b;
        if (fArr != null) {
            return fArr;
        }
        ColorFilter colorFilter = this.f217a;
        if (!(colorFilter instanceof ColorMatrixColorFilter) || 26 > Build.VERSION.SDK_INT) {
            jf4.o("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
            return null;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        ((ColorMatrixColorFilter) colorFilter).getColorMatrix(colorMatrix);
        float[] array = colorMatrix.getArray();
        this.b = array;
        return array;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h4d) && Arrays.equals(a(), ((h4d) obj).a());
    }

    public final int hashCode() {
        float[] fArr = this.b;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    public final String toString() {
        float[] fArr = this.b;
        return kng0.l("ColorMatrixColorFilter(colorMatrix=", fArr == null ? "null" : kng0.l("ColorMatrix(values=", Arrays.toString(fArr), Separators.RPAREN), Separators.RPAREN);
    }
}
