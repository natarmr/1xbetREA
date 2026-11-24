package a;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class elq implements chi0 {
    public static final dlq Companion = new dlq();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f8014a;

    public /* synthetic */ elq(int i, float[] fArr) {
        if (1 == (i & 1)) {
            this.f8014a = fArr;
        } else {
            m2x.I(i, 1, clq.f4573a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof elq) && Intrinsics.d(this.f8014a, ((elq) obj).f8014a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8014a);
    }

    public final String toString() {
        return "FloatArrayValue(value=" + Arrays.toString(this.f8014a) + ')';
    }

    public elq(float[] fArr) {
        this.f8014a = fArr;
    }
}
