package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ym50 {
    public static final um50 Companion = new um50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tm50 f42871a;
    public final xm50 b;

    public /* synthetic */ ym50(int i, tm50 tm50Var, xm50 xm50Var) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, qm50.f28966a.getDescriptor());
            throw null;
        }
        this.f42871a = tm50Var;
        this.b = xm50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ym50)) {
            return false;
        }
        ym50 ym50Var = (ym50) obj;
        return Intrinsics.d(this.f42871a, ym50Var.f42871a) && Intrinsics.d(this.b, ym50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f42871a.hashCode() * 31);
    }

    public final String toString() {
        return "NewPasswordRequest(auth=" + this.f42871a + ", data=" + this.b + Separators.RPAREN;
    }

    public ym50(tm50 tm50Var, xm50 xm50Var) {
        this.f42871a = tm50Var;
        this.b = xm50Var;
    }
}
