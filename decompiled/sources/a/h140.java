package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class h140 implements f240 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12264a;
    public final iz30 b;
    public final r040 c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;

    public h140(int i, iz30 iz30Var, r040 r040Var, String str, String str2, String str3, boolean z) {
        w6x.y(r040Var, str2, str3);
        this.f12264a = z;
        this.b = iz30Var;
        this.c = r040Var;
        this.d = str;
        this.e = i;
        this.f = str2;
        this.g = str3;
    }

    @Override // a.f240
    public final boolean K() {
        return this.f12264a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h140)) {
            return false;
        }
        h140 h140Var = (h140) obj;
        return this.f12264a == h140Var.f12264a && this.b == h140Var.b && this.c == h140Var.c && this.d.equals(h140Var.d) && this.e == h140Var.e && Intrinsics.d(this.f, h140Var.f) && Intrinsics.d(this.g, h140Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(twn.a(R.attr.uikitStaticWhite, twn.a(this.e, twn.a(R.attr.uikitStaticWhite, ua80.b(w6x.f(this.c, f140.g(this.b, Boolean.hashCode(this.f12264a) * 31, 31), 31), 31, this.d), 31), 31), 31), 31, this.f);
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
        StringBuilder sb = new StringBuilder("BalanceManageMenuUiItem(isBadgeVisible=");
        sb.append(this.f12264a);
        sb.append(", menuItemModel=");
        sb.append(this.b);
        sb.append(", menuSectionType=");
        sb.append(this.c);
        sb.append(", iconUrl=");
        sb.append(this.d);
        sb.append(", iconTint=");
        axq.r(R.attr.uikitStaticWhite, this.e, ", placeholder=", ", placeholderTint=", sb);
        kng0.w(R.attr.uikitStaticWhite, ", title=", this.f, ", subtitle=", sb);
        return axq.n(sb, this.g, Separators.RPAREN);
    }
}
