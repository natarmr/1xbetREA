package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class wv30 implements nw30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f39822a;
    public final iz30 b;
    public final r040 c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;

    public wv30(int i, iz30 iz30Var, r040 r040Var, String str, String str2, String str3, boolean z) {
        w6x.y(r040Var, str2, str3);
        this.f39822a = z;
        this.b = iz30Var;
        this.c = r040Var;
        this.d = str;
        this.e = i;
        this.f = str2;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv30)) {
            return false;
        }
        wv30 wv30Var = (wv30) obj;
        return this.f39822a == wv30Var.f39822a && this.b == wv30Var.b && this.c == wv30Var.c && this.d.equals(wv30Var.d) && this.e == wv30Var.e && Intrinsics.d(this.f, wv30Var.f) && Intrinsics.d(this.g, wv30Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(twn.a(this.e, ua80.b(w6x.f(this.c, f140.g(this.b, Boolean.hashCode(this.f39822a) * 31, 31), 31), 31, this.d), 31), 31, this.f);
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
        StringBuilder sb = new StringBuilder("IndividualBalanceManageMenuUiItem(isBadgeVisible=");
        sb.append(this.f39822a);
        sb.append(", menuItemModel=");
        sb.append(this.b);
        sb.append(", menuSectionType=");
        sb.append(this.c);
        sb.append(", iconUrl=");
        sb.append(this.d);
        sb.append(", placeholder=");
        kng0.w(this.e, ", title=", this.f, ", subtitle=", sb);
        return axq.n(sb, this.g, Separators.RPAREN);
    }
}
