package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wty implements yty {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39766a;
    public final String b;
    public final long c;

    public wty(String str, String str2, long j) {
        str.getClass();
        str2.getClass();
        this.f39766a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wty)) {
            return false;
        }
        wty wtyVar = (wty) obj;
        if (!Intrinsics.d(this.f39766a, wtyVar.f39766a) || !Intrinsics.d(this.b, wtyVar.b)) {
            return false;
        }
        long j = wtyVar.c;
        int i = y3d.h;
        return h2t0.a(this.c, j);
    }

    public final int hashCode() {
        int iB = ua80.b(this.f39766a.hashCode() * 31, 31, this.b);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.c) + iB;
    }

    public final String toString() {
        return axq.n(b1j.n("SimpleText(value=", this.f39766a, ", currencySymbol=", this.b, ", color="), y3d.i(this.c), Separators.RPAREN);
    }
}
