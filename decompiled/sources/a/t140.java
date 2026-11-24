package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t140 implements f240 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f33151a;
    public final iz30 b;
    public final r040 c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final long h;

    public t140(boolean z, iz30 iz30Var, r040 r040Var, long j, long j2, String str, String str2, long j3) {
        r040Var.getClass();
        str2.getClass();
        this.f33151a = z;
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
        return this.f33151a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t140)) {
            return false;
        }
        t140 t140Var = (t140) obj;
        return this.f33151a == t140Var.f33151a && this.b == t140Var.b && this.c == t140Var.c && this.d == t140Var.d && this.e == t140Var.e && this.f.equals(t140Var.f) && Intrinsics.d(this.g, t140Var.g) && this.h == t140Var.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + ua80.b(ua80.b(rw2.b(rw2.b(w6x.f(this.c, f140.g(this.b, Boolean.hashCode(this.f33151a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
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
        StringBuilder sb = new StringBuilder("IndividualVirtualSimpleMenuUiItem(isBadgeVisible=");
        sb.append(this.f33151a);
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
