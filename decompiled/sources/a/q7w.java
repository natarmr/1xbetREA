package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class q7w {
    public static final p7w Companion = new p7w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f28271a;
    public final Double b;
    public final Double c;

    public /* synthetic */ q7w(int i, Long l, Double d, Double d2) {
        if ((i & 1) == 0) {
            this.f28271a = null;
        } else {
            this.f28271a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7w)) {
            return false;
        }
        q7w q7wVar = (q7w) obj;
        return Intrinsics.d(this.f28271a, q7wVar.f28271a) && Intrinsics.d(this.b, q7wVar.b) && Intrinsics.d(this.c, q7wVar.c);
    }

    public final int hashCode() {
        Long l = this.f28271a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.c;
        return iHashCode2 + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        return "HistoryTransactionsResponse(date=" + this.f28271a + ", sumCut=" + this.b + ", sumOut=" + this.c + Separators.RPAREN;
    }
}
