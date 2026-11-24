package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class vvg0 {
    public static final uvg0 Companion = new uvg0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38097a;
    public final long b;
    public final String c;
    public final String d;

    public /* synthetic */ vvg0(int i, long j, long j2, String str, String str2) {
        if (15 != (i & 15)) {
            m2x.I(i, 15, tvg0.f34597a.getDescriptor());
            throw null;
        }
        this.f38097a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vvg0)) {
            return false;
        }
        vvg0 vvg0Var = (vvg0) obj;
        return this.f38097a == vvg0Var.f38097a && this.b == vvg0Var.b && Intrinsics.d(this.c, vvg0Var.c) && Intrinsics.d(this.d, vvg0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(rw2.b(Long.hashCode(this.f38097a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f38097a, "SaleSumRequest(userId=", ", userIdBonus=");
        kng0.z(sbQ, this.b, ", betId=", this.c);
        return rw2.o(sbQ, ", lng=", this.d, Separators.RPAREN);
    }

    public vvg0(long j, long j2, String str, String str2) {
        str.getClass();
        this.f38097a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }
}
