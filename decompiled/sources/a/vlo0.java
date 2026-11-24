package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class vlo0 implements zlo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sjo0 f37636a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;

    public vlo0(sjo0 sjo0Var, String str, String str2, String str3, long j) {
        str.getClass();
        str3.getClass();
        this.f37636a = sjo0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vlo0)) {
            return false;
        }
        vlo0 vlo0Var = (vlo0) obj;
        if (this.f37636a != vlo0Var.f37636a || !Intrinsics.d(this.b, vlo0Var.b) || !this.c.equals(vlo0Var.c) || !Intrinsics.d(this.d, vlo0Var.d)) {
            return false;
        }
        long j = vlo0Var.e;
        int i = y3d.h;
        return h2t0.a(this.e, j);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(ua80.b(this.f37636a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.e) + iB;
    }

    public final String toString() {
        String strI = y3d.i(this.e);
        StringBuilder sb = new StringBuilder("HeaderParams(tableHeaderType=");
        sb.append(this.f37636a);
        sb.append(", teamName=");
        sb.append(this.b);
        sb.append(", teamImage=");
        f140.v(sb, this.c, ", tagText=", this.d, ", tableTeamColor=");
        return axq.n(sb, strI, Separators.RPAREN);
    }
}
