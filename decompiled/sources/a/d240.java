package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d240 implements f240 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5339a;
    public final iz30 b;
    public final r040 c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final long h;

    public d240(boolean z, iz30 iz30Var, r040 r040Var, long j, long j2, String str, String str2, long j3) {
        r040Var.getClass();
        str2.getClass();
        this.f5339a = z;
        this.b = iz30Var;
        this.c = r040Var;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = j3;
    }

    @Override // a.f240
    public final boolean K() {
        return this.f5339a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d240)) {
            return false;
        }
        d240 d240Var = (d240) obj;
        return this.f5339a == d240Var.f5339a && this.b == d240Var.b && this.c == d240Var.c && this.d == d240Var.d && this.e == d240Var.e && this.f.equals(d240Var.f) && Intrinsics.d(this.g, d240Var.g) && this.h == d240Var.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + ua80.b(ua80.b(rw2.b(rw2.b(w6x.f(this.c, f140.g(this.b, Boolean.hashCode(this.f5339a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
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
        StringBuilder sb = new StringBuilder("VirtualSimpleMenuUiItem(isBadgeVisible=");
        sb.append(this.f5339a);
        sb.append(", menuItemModel=");
        sb.append(this.b);
        sb.append(", menuSectionType=");
        sb.append(this.c);
        sb.append(", id=");
        sb.append(this.d);
        kng0.A(sb, ", gameId=", this.e, ", imageUrl=");
        f140.v(sb, this.f, ", title=", this.g, ", partType=");
        return brm0.k(this.h, Separators.RPAREN, sb);
    }
}
