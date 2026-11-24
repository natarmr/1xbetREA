package a;

import android.gov.nist.core.Separators;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class p560 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f26390a;
    public final boolean b;
    public final String c;
    public final Map d;
    public final boolean e;

    public p560(String str, Map map, boolean z, boolean z2, boolean z3) {
        this.f26390a = z;
        this.b = z2;
        this.c = str;
        this.d = map;
        this.e = z3;
    }

    public static p560 a(p560 p560Var, boolean z, String str, Map map, int i) {
        boolean z2 = (i & 2) != 0 ? p560Var.b : true;
        if ((i & 4) != 0) {
            str = p560Var.c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            map = p560Var.d;
        }
        boolean z3 = p560Var.e;
        p560Var.getClass();
        return new p560(str2, map, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p560)) {
            return false;
        }
        p560 p560Var = (p560) obj;
        return this.f26390a == p560Var.f26390a && this.b == p560Var.b && this.c.equals(p560Var.c) && this.d.equals(p560Var.d) && this.e == p560Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ohs0.f(this.d, ua80.b(brm0.e(Boolean.hashCode(this.f26390a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("NomaPayState(isLoading=", ", isReceivedCallBack=", ", url=", this.f26390a, this.b);
        sbQ.append(this.c);
        sbQ.append(", headers=");
        sbQ.append(this.d);
        sbQ.append(", debugAllowed=");
        return rw2.p(sbQ, this.e, Separators.RPAREN);
    }
}
