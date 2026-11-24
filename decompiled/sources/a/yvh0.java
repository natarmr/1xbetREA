package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yvh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43319a;
    public final dwh0 b;

    public yvh0(String str, dwh0 dwh0Var) {
        str.getClass();
        this.f43319a = str;
        this.b = dwh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvh0)) {
            return false;
        }
        yvh0 yvh0Var = (yvh0) obj;
        return Intrinsics.d(this.f43319a, yvh0Var.f43319a) && this.b.equals(yvh0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43319a.hashCode() * 31);
    }

    public final String toString() {
        return "SegmentControlSegmentModel(title=" + this.f43319a + ", segmentIcon=" + this.b + Separators.RPAREN;
    }
}
