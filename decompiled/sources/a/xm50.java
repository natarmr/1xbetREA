package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class xm50 {
    public static final wm50 Companion = new wm50();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41106a;
    public final long b;
    public final long c;

    public /* synthetic */ xm50(String str, long j, long j2, int i) {
        if (7 != (i & 7)) {
            m2x.I(i, 7, vm50.f37662a.getDescriptor());
            throw null;
        }
        this.f41106a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xm50)) {
            return false;
        }
        xm50 xm50Var = (xm50) obj;
        return Intrinsics.d(this.f41106a, xm50Var.f41106a) && this.b == xm50Var.b && this.c == xm50Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + rw2.b(this.f41106a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.n(f140.o(this.b, "DataRequest(password=", this.f41106a, ", time="), this.c, ", userId=", Separators.RPAREN);
    }

    public xm50(long j, long j2, String str) {
        this.f41106a = str;
        this.b = j;
        this.c = j2;
    }
}
