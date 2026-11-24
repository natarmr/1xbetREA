package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xrk0 implements usk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btk0 f41376a;
    public final List b;
    public final List c;
    public final List d;
    public final boolean e;

    public xrk0(btk0 btk0Var, List list, List list2, List list3, boolean z) {
        b1j.B(list, list2, list3);
        this.f41376a = btk0Var;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xrk0)) {
            return false;
        }
        xrk0 xrk0Var = (xrk0) obj;
        return this.f41376a.equals(xrk0Var.f41376a) && Intrinsics.d(this.b, xrk0Var.b) && Intrinsics.d(this.c, xrk0Var.c) && Intrinsics.d(this.d, xrk0Var.d) && this.e == xrk0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + dw9.a(dw9.a(dw9.a(this.f41376a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AllGames(status=");
        sb.append(this.f41376a);
        sb.append(", live=");
        sb.append(this.b);
        sb.append(", line=");
        b1j.y(", history=", ", isAllHistoryAvailable=", sb, this.c, this.d);
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
