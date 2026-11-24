package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xbq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gcq f40612a;
    public final List b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;

    public xbq(gcq gcqVar, List list, long j, long j2, long j3, long j4, float f) {
        list.getClass();
        this.f40612a = gcqVar;
        this.b = list;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbq)) {
            return false;
        }
        xbq xbqVar = (xbq) obj;
        return this.f40612a.equals(xbqVar.f40612a) && Intrinsics.d(this.b, xbqVar.b) && znq0.e(this.c, xbqVar.c) && znq0.e(this.d, xbqVar.d) && znq0.e(this.e, xbqVar.e) && znq0.e(this.f, xbqVar.f) && Float.compare(this.g, xbqVar.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + rw2.b(rw2.b(rw2.b(rw2.b(dw9.a(this.f40612a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        String strH = znq0.h(this.c);
        String strH2 = znq0.h(this.d);
        String strH3 = znq0.h(this.e);
        String strH4 = znq0.h(this.f);
        StringBuilder sb = new StringBuilder("FinanceGraphModel(finInstrument=");
        sb.append(this.f40612a);
        sb.append(", points=");
        sb.append(this.b);
        sb.append(", closeTime=");
        f140.v(sb, strH, ", openTime=", strH2, ", remainingTime=");
        f140.v(sb, strH3, ", remainingTimeMobile=", strH4, ", startLevel=");
        return kng0.o(sb, this.g, Separators.RPAREN);
    }
}
