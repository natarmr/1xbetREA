package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d94 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5682a;
    public final List b;
    public final boolean c;
    public final Throwable d;
    public final boolean e;

    public d94(List list, List list2, boolean z, Throwable th, boolean z2) {
        list.getClass();
        list2.getClass();
        this.f5682a = list;
        this.b = list2;
        this.c = z;
        this.d = th;
        this.e = z2;
    }

    public static d94 a(d94 d94Var, List list, List list2, boolean z, Throwable th, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = d94Var.f5682a;
        }
        List list3 = list;
        if ((i & 2) != 0) {
            list2 = d94Var.b;
        }
        List list4 = list2;
        if ((i & 4) != 0) {
            z = d94Var.c;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            th = d94Var.d;
        }
        Throwable th2 = th;
        if ((i & 16) != 0) {
            z2 = d94Var.e;
        }
        d94Var.getClass();
        list3.getClass();
        list4.getClass();
        return new d94(list3, list4, z3, th2, z2);
    }

    public final boolean b() {
        return this.f5682a.isEmpty() && this.b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d94)) {
            return false;
        }
        d94 d94Var = (d94) obj;
        return Intrinsics.d(this.f5682a, d94Var.f5682a) && Intrinsics.d(this.b, d94Var.b) && this.c == d94Var.c && Intrinsics.d(this.d, d94Var.d) && this.e == d94Var.e;
    }

    public final int hashCode() {
        int iE = brm0.e(dw9.a(this.f5682a.hashCode() * 31, 31, this.b), 31, this.c);
        Throwable th = this.d;
        return Boolean.hashCode(this.e) + ((iE + (th == null ? 0 : th.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbT = w6x.t("AuthHistoryState(activeSessions=", ", historySessions=", this.f5682a, ", isConnected=", this.b);
        sbT.append(this.c);
        sbT.append(", loadingError=");
        sbT.append(this.d);
        sbT.append(", loading=");
        return rw2.p(sbT, this.e, Separators.RPAREN);
    }
}
