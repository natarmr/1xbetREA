package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class lw30 implements nw30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20744a;
    public final iz30 b;
    public final r040 c;
    public final long d;
    public final long e;
    public final String f;
    public final String g;
    public final long h;

    public lw30(boolean z, iz30 iz30Var, r040 r040Var, long j, long j2, String str, String str2, long j3) {
        r040Var.getClass();
        str2.getClass();
        this.f20744a = z;
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
        if (!(obj instanceof lw30)) {
            return false;
        }
        lw30 lw30Var = (lw30) obj;
        return this.f20744a == lw30Var.f20744a && this.b == lw30Var.b && this.c == lw30Var.c && this.d == lw30Var.d && this.e == lw30Var.e && this.f.equals(lw30Var.f) && Intrinsics.d(this.g, lw30Var.g) && this.h == lw30Var.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + ua80.b(twn.a(R.drawable.ic_glyph_language, ua80.b(rw2.b(rw2.b(w6x.f(this.c, f140.g(this.b, Boolean.hashCode(this.f20744a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.g);
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
        StringBuilder sb = new StringBuilder("VirtualSimpleMenuUiItem(isBadgeVisible=");
        sb.append(this.f20744a);
        sb.append(", menuItemModel=");
        sb.append(this.b);
        sb.append(", menuSectionType=");
        sb.append(this.c);
        sb.append(", id=");
        sb.append(this.d);
        kng0.A(sb, ", gameId=", this.e, ", imageUrl=");
        twn.w(R.drawable.ic_glyph_language, this.f, ", placeholder=", ", title=", sb);
        defpackage.c.i(sb, this.h, this.g, ", partType=");
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
