package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z7y implements a5w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43943a;
    public final q4f b;
    public final double c;
    public final long d;
    public final i0w e;
    public final double f;
    public final double g;
    public final String h;
    public final List i;
    public final String j;
    public final hxu k;

    static {
        hxu hxuVar = hxu.h;
    }

    public z7y(String str, q4f q4fVar, double d, long j, i0w i0wVar, double d2, double d3, String str2, List list, String str3, hxu hxuVar) {
        str.getClass();
        list.getClass();
        hxuVar.getClass();
        this.f43943a = str;
        this.b = q4fVar;
        this.c = d;
        this.d = j;
        this.e = i0wVar;
        this.f = d2;
        this.g = d3;
        this.h = str2;
        this.i = list;
        this.j = str3;
        this.k = hxuVar;
    }

    @Override // a.a5w
    public final jvw b() {
        return this.e;
    }

    @Override // a.a5w
    public final q4f c() {
        return this.b;
    }

    @Override // a.a5w
    public final String d() {
        return this.f43943a;
    }

    @Override // a.a5w
    public final double e() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7y)) {
            return false;
        }
        z7y z7yVar = (z7y) obj;
        return Intrinsics.d(this.f43943a, z7yVar.f43943a) && this.b == z7yVar.b && Double.compare(this.c, z7yVar.c) == 0 && this.d == z7yVar.d && this.e == z7yVar.e && Double.compare(this.f, z7yVar.f) == 0 && Double.compare(this.g, z7yVar.g) == 0 && this.h.equals(z7yVar.h) && Intrinsics.d(this.i, z7yVar.i) && this.j.equals(z7yVar.j) && Intrinsics.d(this.k, z7yVar.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ua80.b(twn.a(1, twn.a(1, dw9.a(ua80.b(brm0.d(this.g, brm0.d(this.f, (this.e.hashCode() + rw2.b(brm0.d(this.c, vqd.b(this.b, this.f43943a.hashCode() * 31, 31), 31), 31, this.d)) * 31, 31), 31), 31, this.h), 31, this.i), 31), 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JackpotTotoHistoryItemModel(betId=");
        sb.append(this.f43943a);
        sb.append(", couponType=");
        sb.append(this.b);
        sb.append(", winSum=");
        sb.append(this.c);
        kng0.A(sb, ", date=", this.d, ", status=");
        sb.append(this.e);
        sb.append(", coefficient=");
        sb.append(this.f);
        ohs0.A(sb, this.g, ", betSum=", ", currencySymbol=");
        cs0.y(this.h, ", eventsList=", ", betCount=1, eventCount=1, eventName=", sb, this.i);
        sb.append(this.j);
        sb.append(", taxBet=");
        sb.append(this.k);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
