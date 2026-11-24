package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class toa0 {
    public static final roa0 Companion = new roa0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f34274a;
    public final Double b;

    public /* synthetic */ toa0(int i, Double d, Double d2) {
        if ((i & 1) == 0) {
            this.f34274a = null;
        } else {
            this.f34274a = d;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof toa0)) {
            return false;
        }
        toa0 toa0Var = (toa0) obj;
        return Intrinsics.d(this.f34274a, toa0Var.f34274a) && Intrinsics.d(this.b, toa0Var.b);
    }

    public final int hashCode() {
        Double d = this.f34274a;
        int iHashCode = (d == null ? 0 : d.hashCode()) * 31;
        Double d2 = this.b;
        return iHashCode + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        return "PointResponse(x=" + this.f34274a + ", y=" + this.b + Separators.RPAREN;
    }
}
