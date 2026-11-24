package a;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class kbl implements chi0 {
    public static final jbl Companion = new jbl();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double[] f18019a;

    public /* synthetic */ kbl(int i, double[] dArr) {
        if (1 == (i & 1)) {
            this.f18019a = dArr;
        } else {
            m2x.I(i, 1, ibl.f14493a.getDescriptor());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kbl) && Intrinsics.d(this.f18019a, ((kbl) obj).f18019a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18019a);
    }

    public final String toString() {
        return "DoubleArrayValue(value=" + Arrays.toString(this.f18019a) + ')';
    }

    public kbl(double[] dArr) {
        this.f18019a = dArr;
    }
}
