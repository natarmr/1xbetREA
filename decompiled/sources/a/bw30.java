package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class bw30 implements nw30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3307a;
    public final iz30 b;
    public final r040 c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final long h;

    public bw30(boolean z, iz30 iz30Var, r040 r040Var, long j, long j2, String str, String str2, long j3) {
        r040Var.getClass();
        str2.getClass();
        this.f3307a = z;
        this.b = iz30Var;
        this.c = r040Var;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bw30)) {
            return false;
        }
        bw30 bw30Var = (bw30) obj;
        return this.f3307a == bw30Var.f3307a && this.b == bw30Var.b && this.c == bw30Var.c && this.d == bw30Var.d && this.e == bw30Var.e && this.f.equals(bw30Var.f) && Intrinsics.d(this.g, bw30Var.g) && this.h == bw30Var.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + ua80.b(ua80.b(rw2.b(rw2.b(twn.a(R.drawable.ic_glyph_language, w6x.f(this.c, f140.g(this.b, Boolean.hashCode(this.f3307a) * 31, 31), 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
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
        StringBuilder sb = new StringBuilder("IndividualVirtualSimpleMenuUiItem(isBadgeVisible=");
        sb.append(this.f3307a);
        sb.append(", menuItemModel=");
        sb.append(this.b);
        sb.append(", menuSectionType=");
        f140.t(sb, this.c, ", placeholder=", R.drawable.ic_glyph_language, ", id=");
        sb.append(this.d);
        kng0.A(sb, ", gameId=", this.e, ", imageUrl=");
        f140.v(sb, this.f, ", title=", this.g, ", partType=");
        return brm0.k(this.h, Separators.RPAREN, sb);
    }
}
