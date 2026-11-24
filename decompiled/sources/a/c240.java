package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c240 implements f240 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3606a;
    public final iz30 b;
    public final r040 c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;

    public c240(boolean z, iz30 iz30Var, r040 r040Var, long j, long j2, String str, String str2, String str3, long j3) {
        r040Var.getClass();
        str2.getClass();
        this.f3606a = z;
        this.b = iz30Var;
        this.c = r040Var;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = j3;
    }

    @Override // a.f240
    public final boolean K() {
        return this.f3606a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c240)) {
            return false;
        }
        c240 c240Var = (c240) obj;
        return this.f3606a == c240Var.f3606a && this.b == c240Var.b && this.c == c240Var.c && this.d == c240Var.d && this.e == c240Var.e && this.f.equals(c240Var.f) && Intrinsics.d(this.g, c240Var.g) && this.h.equals(c240Var.h) && this.i == c240Var.i;
    }

    public final int hashCode() {
        return Long.hashCode(this.i) + ua80.b(ua80.b(ua80.b(rw2.b(rw2.b(w6x.f(this.c, f140.g(this.b, Boolean.hashCode(this.f3606a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    @Override // a.f240
    public final iz30 m() {
        return this.b;
    }

    @Override // a.f240
    public final r040 n() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VirtualBannerMenuUiItem(isBadgeVisible=");
        sb.append(this.f3606a);
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
