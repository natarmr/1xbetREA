package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d7m implements e7m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4x f5599a;
    public final int b;
    public final hxh0 c;

    public d7m(i4 i4Var, int i, hxh0 hxh0Var) {
        i4Var.getClass();
        this.f5599a = i4Var;
        this.b = i;
        this.c = hxh0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7m)) {
            return false;
        }
        d7m d7mVar = (d7m) obj;
        return Intrinsics.d(this.f5599a, d7mVar.f5599a) && this.b == d7mVar.b && this.c.equals(d7mVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f5599a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "Segmented(segments=" + this.f5599a + ", selectedSegmentIndex=" + this.b + ", segmentedControlType=" + this.c + Separators.RPAREN;
    }
}
