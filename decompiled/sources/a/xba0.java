package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class xba0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40593a;
    public final long b;
    public final String c;
    public final List d;
    public final String e;

    public xba0(int i, long j, String str, String str2, List list) {
        list.getClass();
        this.f40593a = i;
        this.b = j;
        this.c = str;
        this.d = list;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xba0)) {
            return false;
        }
        xba0 xba0Var = (xba0) obj;
        return this.f40593a == xba0Var.f40593a && this.b == xba0Var.b && this.c.equals(xba0Var.c) && Intrinsics.d(this.d, xba0Var.d) && this.e.equals(xba0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + dw9.a(ua80.b(rw2.b(Integer.hashCode(this.f40593a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f40593a, this.b, "PlayerTennisMenuItemModel(age=", ", birthDay=");
        ua80.t(", id=", this.c, ", menu=", sbQ, this.d);
        return rw2.o(sbQ, ", plays=", this.e, Separators.RPAREN);
    }
}
