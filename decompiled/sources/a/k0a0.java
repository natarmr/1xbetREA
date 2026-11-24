package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k0a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17456a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final List e;
    public final hva f;
    public final List g;
    public final List h;

    static {
        hva hvaVar = hva.d;
    }

    public k0a0(boolean z, boolean z2, boolean z3, int i, List list, hva hvaVar, List list2, List list3) {
        list.getClass();
        hvaVar.getClass();
        list2.getClass();
        list3.getClass();
        this.f17456a = z;
        this.b = z2;
        this.c = z3;
        this.d = i;
        this.e = list;
        this.f = hvaVar;
        this.g = list2;
        this.h = list3;
    }

    public static k0a0 a(k0a0 k0a0Var, boolean z, boolean z2, boolean z3) {
        int i = k0a0Var.d;
        List list = k0a0Var.e;
        hva hvaVar = k0a0Var.f;
        List list2 = k0a0Var.g;
        List list3 = k0a0Var.h;
        k0a0Var.getClass();
        list.getClass();
        hvaVar.getClass();
        list2.getClass();
        list3.getClass();
        return new k0a0(z, z2, z3, i, list, hvaVar, list2, list3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0a0)) {
            return false;
        }
        k0a0 k0a0Var = (k0a0) obj;
        return this.f17456a == k0a0Var.f17456a && this.b == k0a0Var.b && this.c == k0a0Var.c && this.d == k0a0Var.d && Intrinsics.d(this.e, k0a0Var.e) && Intrinsics.d(this.f, k0a0Var.f) && Intrinsics.d(this.g, k0a0Var.g) && Intrinsics.d(this.h, k0a0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + dw9.a((this.f.hashCode() + dw9.a(twn.a(this.d, brm0.e(brm0.e(Boolean.hashCode(this.f17456a) * 31, 31, this.b), 31, this.c), 31), 31, this.e)) * 31, 31, this.g);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("PlayerCareerTableState(loading=", ", error=", ", empty=", this.f17456a, this.b);
        ua80.q(this.d, ", selectedTabId=", ", careerTables=", sbQ, this.c);
        sbQ.append(this.e);
        sbQ.append(", currentTable=");
        sbQ.append(this.f);
        sbQ.append(", teams=");
        return kng0.n(", tournaments=", Separators.RPAREN, sbQ, this.g, this.h);
    }
}
