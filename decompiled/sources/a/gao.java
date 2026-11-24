package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gao {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10978a;
    public final long b;
    public final double c;
    public final long d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final double j;
    public final fao k;

    public gao(int i, long j, double d, long j2, boolean z, String str, String str2, String str3, int i2, double d2, fao faoVar) {
        str.getClass();
        str3.getClass();
        this.f10978a = i;
        this.b = j;
        this.c = d;
        this.d = j2;
        this.e = z;
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = i2;
        this.j = d2;
        this.k = faoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gao)) {
            return false;
        }
        gao gaoVar = (gao) obj;
        return this.f10978a == gaoVar.f10978a && this.b == gaoVar.b && Double.compare(this.c, gaoVar.c) == 0 && this.d == gaoVar.d && this.e == gaoVar.e && Intrinsics.d(this.f, gaoVar.f) && this.g.equals(gaoVar.g) && Intrinsics.d(this.h, gaoVar.h) && this.i == gaoVar.i && Double.compare(this.j, gaoVar.j) == 0 && this.k == gaoVar.k;
    }

    public final int hashCode() {
        return this.k.hashCode() + brm0.d(this.j, twn.a(this.i, ua80.b(ua80.b(ua80.b(brm0.e(rw2.b(brm0.d(this.c, rw2.b(Integer.hashCode(this.f10978a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f10978a, this.b, "EventBetModel(id=", ", marketTypeId=");
        ohs0.A(sbQ, this.c, ", coef=", ", marketGroupId=");
        hne.t(this.d, ", blocked=", sbQ, this.e);
        f140.v(sbQ, ", coefV=", this.f, ", marketName=", this.g);
        axq.s(this.i, ", eventName=", this.h, ", typeParam=", sbQ);
        ohs0.A(sbQ, this.j, ", param=", ", coefType=");
        sbQ.append(this.k);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
