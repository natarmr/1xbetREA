package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jqb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ypb0 f16942a;
    public final List b;
    public final qpb0 c;

    public jqb0(ypb0 ypb0Var, lc00 lc00Var, qpb0 qpb0Var) {
        lc00Var.getClass();
        this.f16942a = ypb0Var;
        this.b = lc00Var;
        this.c = qpb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jqb0)) {
            return false;
        }
        jqb0 jqb0Var = (jqb0) obj;
        return this.f16942a.equals(jqb0Var.f16942a) && Intrinsics.d(this.b, jqb0Var.b) && this.c.equals(jqb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dw9.a(this.f16942a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "PowerOfPowerTableColumn(columnSizeType=" + this.f16942a + ", cells=" + this.b + ", space=" + this.c + Separators.RPAREN;
    }
}
