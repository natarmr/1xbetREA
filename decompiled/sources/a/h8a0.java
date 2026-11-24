package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h8a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12617a;
    public final b9a0 b;
    public final znq0 c;
    public final ufp0 d;
    public final int e;
    public final String f;
    public final List g;

    static {
        b9a0 b9a0Var = b9a0.g;
    }

    public h8a0(String str, b9a0 b9a0Var, znq0 znq0Var, ufp0 ufp0Var, int i, String str2, List list) {
        b9a0Var.getClass();
        list.getClass();
        this.f12617a = str;
        this.b = b9a0Var;
        this.c = znq0Var;
        this.d = ufp0Var;
        this.e = i;
        this.f = str2;
        this.g = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8a0)) {
            return false;
        }
        h8a0 h8a0Var = (h8a0) obj;
        return this.f12617a.equals(h8a0Var.f12617a) && Intrinsics.d(this.b, h8a0Var.b) && this.c.equals(h8a0Var.c) && this.d.equals(h8a0Var.d) && this.e == h8a0Var.e && this.f.equals(h8a0Var.f) && Intrinsics.d(this.g, h8a0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b(twn.a(this.e, twn.f(this.d, rw2.b((this.b.hashCode() + (this.f12617a.hashCode() * 31)) * 31, 31, this.c.f44687a), 31), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerMenuModel(id=");
        sb.append(this.f12617a);
        sb.append(", playerModel=");
        sb.append(this.b);
        sb.append(", birthDay=");
        sb.append(this.c);
        sb.append(", teamModel=");
        sb.append(this.d);
        sb.append(", age=");
        kng0.w(this.e, ", playerType=", this.f, ", menu=", sb);
        return dw9.r(sb, this.g, Separators.RPAREN);
    }
}
