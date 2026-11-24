package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e65 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7264a;
    public final double b;
    public final String c;
    public final double d;
    public final int e;
    public final long f;
    public final zmq0 g;
    public final long h;
    public final gom0 i;
    public final List j;
    public final List k;
    public final List l;
    public final List m;
    public final List n;
    public final List o;

    public e65(int i, double d, String str, double d2, int i2, long j, zmq0 zmq0Var, long j2, gom0 gom0Var, List list, List list2, List list3, List list4, List list5, List list6) {
        rz4.B(list, list2, list3, list4, list5);
        list6.getClass();
        this.f7264a = i;
        this.b = d;
        this.c = str;
        this.d = d2;
        this.e = i2;
        this.f = j;
        this.g = zmq0Var;
        this.h = j2;
        this.i = gom0Var;
        this.j = list;
        this.k = list2;
        this.l = list3;
        this.m = list4;
        this.n = list5;
        this.o = list6;
    }

    public static e65 a(e65 e65Var, String str, zmq0 zmq0Var, int i) {
        int i2 = e65Var.f7264a;
        double d = e65Var.b;
        String str2 = (i & 4) != 0 ? e65Var.c : str;
        double d2 = e65Var.d;
        int i3 = e65Var.e;
        long j = e65Var.f;
        zmq0 zmq0Var2 = (i & 64) != 0 ? e65Var.g : zmq0Var;
        long j2 = e65Var.h;
        gom0 gom0Var = e65Var.i;
        List list = e65Var.j;
        List list2 = e65Var.k;
        List list3 = e65Var.l;
        List list4 = e65Var.m;
        List list5 = e65Var.n;
        List list6 = e65Var.o;
        e65Var.getClass();
        str2.getClass();
        zmq0Var2.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        list6.getClass();
        return new e65(i2, d, str2, d2, i3, j, zmq0Var2, j2, gom0Var, list, list2, list3, list4, list5, list6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e65)) {
            return false;
        }
        e65 e65Var = (e65) obj;
        return this.f7264a == e65Var.f7264a && Double.compare(this.b, e65Var.b) == 0 && this.c.equals(e65Var.c) && Double.compare(this.d, e65Var.d) == 0 && this.e == e65Var.e && this.f == e65Var.f && this.g.equals(e65Var.g) && this.h == e65Var.h && this.i.equals(e65Var.i) && Intrinsics.d(this.j, e65Var.j) && Intrinsics.d(this.k, e65Var.k) && Intrinsics.d(this.l, e65Var.l) && Intrinsics.d(this.m, e65Var.m) && Intrinsics.d(this.n, e65Var.n) && Intrinsics.d(this.o, e65Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + dw9.a(dw9.a(dw9.a(dw9.a(dw9.a((this.i.hashCode() + rw2.b(rw2.b(rw2.b(twn.a(this.e, brm0.d(this.d, ua80.b(brm0.d(this.b, Integer.hashCode(this.f7264a) * 31, 31), 31, this.c), 31), 31), 31, this.f), 31, this.g.f44639a), 31, this.h)) * 31, 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvailableBonusModel(id=");
        sb.append(this.f7264a);
        sb.append(", amount=");
        sb.append(this.b);
        hne.B(sb, ", currency=", this.c, ", currentWager=");
        rz4.w(sb, this.d, ", wager=", this.e);
        kng0.A(sb, ", timeExpired=", this.f, ", timerLeftModel=");
        sb.append(this.g);
        sb.append(", timePayment=");
        sb.append(this.h);
        sb.append(", status=");
        sb.append(this.i);
        sb.append(", availableCategoriesList=");
        sb.append(this.j);
        hne.v(", availableGamesList=", ", availableProductsList=", sb, this.k, this.l);
        hne.v(", unAvailableCategoriesList=", ", unAvailableGamesList=", sb, this.m, this.n);
        return ohs0.s(sb, ", unAvailableProductsList=", this.o, Separators.RPAREN);
    }
}
