package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p9m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26613a;
    public final long b;
    public final long c;
    public final long d;
    public final List e;
    public final List f;

    public p9m(long j, long j2, long j3, long j4, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f26613a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = list;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p9m)) {
            return false;
        }
        p9m p9mVar = (p9m) obj;
        long j = p9mVar.f26613a;
        int i = y3d.h;
        return h2t0.a(this.f26613a, j) && h2t0.a(this.b, p9mVar.b) && h2t0.a(this.c, p9mVar.c) && h2t0.a(this.d, p9mVar.d) && Intrinsics.d(this.e, p9mVar.e) && Intrinsics.d(this.f, p9mVar.f);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.f.hashCode() + dw9.a(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f26613a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        String strI = y3d.i(this.f26613a);
        String strI2 = y3d.i(this.b);
        String strI3 = y3d.i(this.c);
        String strI4 = y3d.i(this.d);
        StringBuilder sbN = b1j.n("DsCyberRatingTableColors(backgroundColor=", strI, ", cellBorderColor=", strI2, ", textLabelColor=");
        f140.v(sbN, strI3, ", placeholderTint=", strI4, ", startGradientColors=");
        return kng0.n(", endGradientColors=", Separators.RPAREN, sbN, this.e, this.f);
    }
}
