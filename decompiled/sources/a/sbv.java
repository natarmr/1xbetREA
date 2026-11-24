package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class sbv {
    public static final rbv Companion = new rbv();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f31955a;
    public final Double b;

    public /* synthetic */ sbv(int i, int i2, Double d) {
        if (1 != (i & 1)) {
            m2x.I(i, 1, qbv.f28457a.getDescriptor());
            throw null;
        }
        this.f31955a = i2;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbv)) {
            return false;
        }
        sbv sbvVar = (sbv) obj;
        return this.f31955a == sbvVar.f31955a && Intrinsics.d(this.b, sbvVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f31955a) * 31;
        Double d = this.b;
        return iHashCode + (d == null ? 0 : d.hashCode());
    }

    public final String toString() {
        return "GpWebAppBonusData(type=" + this.f31955a + ", freeBetSum=" + this.b + Separators.RPAREN;
    }
}
