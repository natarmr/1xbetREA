package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ov30 implements nw30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25907a;
    public final iz30 b;
    public final r040 c;
    public final String d;
    public final long e;
    public final long f;
    public final int g;
    public final long h;
    public final String i;
    public final String j;

    public ov30(boolean z, iz30 iz30Var, r040 r040Var, String str, long j, long j2, int i, long j3, String str2, String str3) {
        w6x.y(r040Var, str2, str3);
        this.f25907a = z;
        this.b = iz30Var;
        this.c = r040Var;
        this.d = str;
        this.e = j;
        this.f = j2;
        this.g = i;
        this.h = j3;
        this.i = str2;
        this.j = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov30)) {
            return false;
        }
        ov30 ov30Var = (ov30) obj;
        if (this.f25907a != ov30Var.f25907a || this.b != ov30Var.b || this.c != ov30Var.c || !this.d.equals(ov30Var.d)) {
            return false;
        }
        long j = ov30Var.e;
        int i = y3d.h;
        return h2t0.a(this.e, j) && h2t0.a(this.f, ov30Var.f) && this.g == ov30Var.g && h2t0.a(this.h, ov30Var.h) && Intrinsics.d(this.i, ov30Var.i) && Intrinsics.d(this.j, ov30Var.j);
    }

    public final int hashCode() {
        int iB = ua80.b(w6x.f(this.c, f140.g(this.b, Boolean.hashCode(this.f25907a) * 31, 31), 31), 31, this.d);
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return this.j.hashCode() + ua80.b(rw2.b(twn.a(this.g, rw2.b(rw2.b(iB, 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i);
    }

    @Override // a.nw30
    public final iz30 m() {
        return this.b;
    }

    @Override // a.nw30
    public final r040 n() {
        return this.c;
    }

    public final String toString() {
        String strI = y3d.i(this.e);
        String strI2 = y3d.i(this.f);
        String strI3 = y3d.i(this.h);
        StringBuilder sb = new StringBuilder("BalanceManageMenuUiItem(isBadgeVisible=");
        sb.append(this.f25907a);
        sb.append(", menuItemModel=");
        sb.append(this.b);
        sb.append(", menuSectionType=");
        sb.append(this.c);
        sb.append(", iconUrl=");
        sb.append(this.d);
        sb.append(", iconTint=");
        f140.v(sb, strI, ", backgroundIconTint=", strI2, ", placeholder=");
        kng0.w(this.g, ", placeholderTint=", strI3, ", title=", sb);
        return ua80.m(sb, this.i, ", subtitle=", this.j, Separators.RPAREN);
    }
}
