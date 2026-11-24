package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o140 implements f240 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24460a;
    public final iz30 b;
    public final r040 c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;

    public o140(int i, iz30 iz30Var, r040 r040Var, String str, String str2, String str3, boolean z) {
        w6x.y(r040Var, str2, str3);
        this.f24460a = z;
        this.b = iz30Var;
        this.c = r040Var;
        this.d = str;
        this.e = i;
        this.f = str2;
        this.g = str3;
    }

    @Override // a.f240
    public final boolean K() {
        return this.f24460a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o140)) {
            return false;
        }
        o140 o140Var = (o140) obj;
        return this.f24460a == o140Var.f24460a && this.b == o140Var.b && this.c == o140Var.c && this.d.equals(o140Var.d) && this.e == o140Var.e && Intrinsics.d(this.f, o140Var.f) && Intrinsics.d(this.g, o140Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(twn.a(this.e, ua80.b(w6x.f(this.c, f140.g(this.b, Boolean.hashCode(this.f24460a) * 31, 31), 31), 31, this.d), 31), 31, this.f);
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
        StringBuilder sb = new StringBuilder("IndividualBalanceManageMenuUiItem(isBadgeVisible=");
        sb.append(this.f24460a);
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
