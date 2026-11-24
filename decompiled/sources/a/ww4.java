package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ww4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39868a;
    public final long b;
    public final long c;
    public final ArrayList d;
    public final int e;

    public ww4(long j, long j2, long j3, ArrayList arrayList, int i) {
        this.f39868a = j;
        this.b = j2;
        this.c = j3;
        this.d = arrayList;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ww4)) {
            return false;
        }
        ww4 ww4Var = (ww4) obj;
        return this.f39868a == ww4Var.f39868a && this.b == ww4Var.b && this.c == ww4Var.c && this.d.equals(ww4Var.d) && this.e == ww4Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + twn.g(this.d, rw2.b(rw2.b(Long.hashCode(this.f39868a) * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f39868a, "AutoBetHistoryModel(dateFrom=", ", dateTo=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", userBonusId=", this.c, ", statusList=");
        sbQ.append(this.d);
        sbQ.append(", coefTypeId=");
        sbQ.append(this.e);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
