package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sc70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31973a;
    public final long b;

    public sc70(String str, long j) {
        ro8 ro8Var = ro8.f30824a;
        str.getClass();
        this.f31973a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc70)) {
            return false;
        }
        sc70 sc70Var = (sc70) obj;
        if (!Intrinsics.d(this.f31973a, sc70Var.f31973a)) {
            return false;
        }
        ro8 ro8Var = ro8.f30824a;
        long j = sc70Var.b;
        int i = y3d.h;
        return h2t0.a(this.b, j);
    }

    public final int hashCode() {
        int iHashCode = (ro8.c.hashCode() + (this.f31973a.hashCode() * 31)) * 31;
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.b) + iHashCode;
    }

    public final String toString() {
        ro8 ro8Var = ro8.c;
        String strI = y3d.i(this.b);
        StringBuilder sb = new StringBuilder("Middle(bodyText=");
        sb.append(this.f31973a);
        sb.append(", bodyTextStyle=");
        sb.append(ro8Var);
        sb.append(", bodyTextColor=");
        return axq.n(sb, strI, Separators.RPAREN);
    }
}
