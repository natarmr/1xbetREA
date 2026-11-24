package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class js50 implements os50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17034a;
    public final boolean b;

    public js50(int i, boolean z) {
        this.f17034a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof js50)) {
            return false;
        }
        js50 js50Var = (js50) obj;
        return this.f17034a == js50Var.f17034a && this.b == js50Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Integer.hashCode(this.f17034a) * 31);
    }

    public final String toString() {
        return rz4.i(this.f17034a, "OnSegmentFinish(segmentIndex=", ", isLast=", Separators.RPAREN, this.b);
    }
}
