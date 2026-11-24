package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class kw30 implements nw30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18982a;
    public final iz30 b;
    public final r040 c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;

    public kw30(boolean z, iz30 iz30Var, r040 r040Var, long j, long j2, String str, String str2, String str3, long j3) {
        r040Var.getClass();
        str2.getClass();
        this.f18982a = z;
        this.b = iz30Var;
        this.c = r040Var;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw30)) {
            return false;
        }
        kw30 kw30Var = (kw30) obj;
        return this.f18982a == kw30Var.f18982a && this.b == kw30Var.b && this.c == kw30Var.c && this.d == kw30Var.d && this.e == kw30Var.e && this.f.equals(kw30Var.f) && Intrinsics.d(this.g, kw30Var.g) && this.h.equals(kw30Var.h) && this.i == kw30Var.i;
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + ua80.b(ua80.b(ua80.b(rw2.b(rw2.b(w6x.f(this.c, f140.g(this.b, Boolean.hashCode(this.f18982a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
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
        StringBuilder sb = new StringBuilder("VirtualBannerMenuUiItem(isBadgeVisible=");
        sb.append(this.f18982a);
        sb.append(", menuItemModel=");
        sb.append(this.b);
        sb.append(", menuSectionType=");
        sb.append(this.c);
        sb.append(", id=");
        sb.append(this.d);
        kng0.A(sb, ", gameId=", this.e, ", imageUrl=");
        f140.v(sb, this.f, ", title=", this.g, ", subtitle=");
        defpackage.c.i(sb, this.i, this.h, ", partType=");
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
