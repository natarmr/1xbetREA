package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u140 implements f240 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34885a;
    public final iz30 b;
    public final r040 c;
    public final int d;
    public final String e;
    public final String f;
    public final List g;

    public u140(boolean z, iz30 iz30Var, r040 r040Var, int i, String str, String str2, List list) {
        w6x.y(r040Var, str, str2);
        this.f34885a = z;
        this.b = iz30Var;
        this.c = r040Var;
        this.d = i;
        this.e = str;
        this.f = str2;
        this.g = list;
    }

    @Override // a.f240
    public final boolean K() {
        return this.f34885a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u140)) {
            return false;
        }
        u140 u140Var = (u140) obj;
        return this.f34885a == u140Var.f34885a && this.b == u140Var.b && this.c == u140Var.c && this.d == u140Var.d && Intrinsics.d(this.e, u140Var.e) && Intrinsics.d(this.f, u140Var.f) && this.g.equals(u140Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(ua80.b(twn.a(this.d, w6x.f(this.c, f140.g(this.b, Boolean.hashCode(this.f34885a) * 31, 31), 31), 31), 31, this.e), 31, this.f);
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
        StringBuilder sb = new StringBuilder("IndividualXGamesMenuUiItem(isBadgeVisible=");
        sb.append(this.f34885a);
        sb.append(", menuItemModel=");
        sb.append(this.b);
        sb.append(", menuSectionType=");
        f140.t(sb, this.c, ", icon=", this.d, ", title=");
        f140.v(sb, this.e, ", subtitle=", this.f, ", xGames=");
        return dw9.r(sb, this.g, Separators.RPAREN);
    }
}
