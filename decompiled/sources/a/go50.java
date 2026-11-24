package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class go50 implements mo50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11614a;
    public final boolean b;

    public go50(int i, boolean z) {
        this.f11614a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go50)) {
            return false;
        }
        go50 go50Var = (go50) obj;
        return this.f11614a == go50Var.f11614a && this.b == go50Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f11614a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f11614a, "OnSegmentFinish(segmentIndex=", ", isLast=", Separators.RPAREN, this.b);
    }
}
