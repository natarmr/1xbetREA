package a;

import android.gov.nist.core.Separators;
import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class zef0 implements dne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f44248a;

    public zef0(float f) {
        this.f44248a = f;
    }

    @Override // a.dne
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f44248a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zef0) && this.f44248a == ((zef0) obj).f44248a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f44248a)});
    }

    public final String toString() {
        return rz4.j((int) (this.f44248a * 100.0f), Separators.PERCENT, new StringBuilder());
    }
}
