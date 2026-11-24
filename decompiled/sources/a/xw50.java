package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xw50 implements yw50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eu50 f41593a;
    public final boolean b;
    public final int c;
    public final a4x d;
    public final List e;
    public final List f;

    public xw50(eu50 eu50Var, boolean z, int i, a4x a4xVar, List list, List list2) {
        a4xVar.getClass();
        list.getClass();
        list2.getClass();
        this.f41593a = eu50Var;
        this.b = z;
        this.c = i;
        this.d = a4xVar;
        this.e = list;
        this.f = list2;
    }

    @Override // a.yw50
    public final boolean a() {
        return this.b;
    }

    @Override // a.yw50
    public final eu50 b() {
        return this.f41593a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xw50)) {
            return false;
        }
        xw50 xw50Var = (xw50) obj;
        return this.f41593a.equals(xw50Var.f41593a) && this.b == xw50Var.b && this.c == xw50Var.c && Intrinsics.d(this.d, xw50Var.d) && Intrinsics.d(this.e, xw50Var.e) && Intrinsics.d(this.f, xw50Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + dw9.a(cs0.b(this.d, twn.a(this.c, brm0.e(this.f41593a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(headerUiState=");
        sb.append(this.f41593a);
        sb.append(", rtlSupport=");
        sb.append(this.b);
        sb.append(", selectedTab=");
        sb.append(this.c);
        sb.append(", tabs=");
        sb.append(this.d);
        sb.append(", newsTeamOne=");
        return kng0.n(", newsTeamTwo=", Separators.RPAREN, sb, this.e, this.f);
    }
}
