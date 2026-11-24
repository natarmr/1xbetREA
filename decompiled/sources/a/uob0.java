package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class uob0 {
    public static final uob0 p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36005a;
    public final long b;
    public final String c;
    public final String d;
    public final int e;
    public final long f;
    public final boolean g;
    public final uoy h;
    public final int i;
    public final String j;
    public final long k;
    public final vf60 l;
    public final tob0 m;
    public final List n;
    public final List o;

    static {
        uoy uoyVar = uoy.UNKNOWN;
        vf60 vf60Var = new vf60("", "", "", 0.0d, 0.0d);
        tob0 tob0Var = new tob0(0.0d, 0.0d, -1);
        iun iunVar = iun.f15405a;
        p = new uob0(-1, -1L, "", "", -1, -1L, false, uoyVar, -1, "", -1L, vf60Var, tob0Var, iunVar, iunVar);
    }

    public uob0(int i, long j, String str, String str2, int i2, long j2, boolean z, uoy uoyVar, int i3, String str3, long j3, vf60 vf60Var, tob0 tob0Var, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.f36005a = i;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = j2;
        this.g = z;
        this.h = uoyVar;
        this.i = i3;
        this.j = str3;
        this.k = j3;
        this.l = vf60Var;
        this.m = tob0Var;
        this.n = list;
        this.o = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uob0)) {
            return false;
        }
        uob0 uob0Var = (uob0) obj;
        return this.f36005a == uob0Var.f36005a && this.b == uob0Var.b && Intrinsics.d(this.c, uob0Var.c) && Intrinsics.d(this.d, uob0Var.d) && this.e == uob0Var.e && this.f == uob0Var.f && this.g == uob0Var.g && this.h == uob0Var.h && this.i == uob0Var.i && Intrinsics.d(this.j, uob0Var.j) && this.k == uob0Var.k && this.l.equals(uob0Var.l) && this.m.equals(uob0Var.m) && Intrinsics.d(this.n, uob0Var.n) && Intrinsics.d(this.o, uob0Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + dw9.a((this.m.hashCode() + ((this.l.hashCode() + rw2.b(ua80.b(twn.a(this.i, twn.d(this.h, brm0.e(rw2.b(twn.a(this.e, ua80.b(ua80.b(rw2.b(Integer.hashCode(this.f36005a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31), 31), 31, this.j), 31, this.k)) * 31)) * 31, 31, this.n);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f36005a, this.b, "PowerBetScreenModel(couponTypeId=", ", couponDate=");
        f140.v(sbQ, ", couponTypeName=", this.c, ", betId=", this.d);
        rw2.x(sbQ, ", betHistoryTypeId=", this.e, ", gameId=");
        hne.t(this.f, ", live=", sbQ, this.g);
        sbQ.append(", kind=");
        sbQ.append(this.h);
        sbQ.append(", statusId=");
        sbQ.append(this.i);
        hne.B(sbQ, ", currencySymbol=", this.j, ", eventTypeSmallGroupId=");
        sbQ.append(this.k);
        sbQ.append(", oldMarketModel=");
        sbQ.append(this.l);
        sbQ.append(", powerBetParamsModel=");
        sbQ.append(this.m);
        sbQ.append(", params=");
        sbQ.append(this.n);
        return ohs0.s(sbQ, ", playerNames=", this.o, Separators.RPAREN);
    }
}
