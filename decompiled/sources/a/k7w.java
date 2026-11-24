package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class k7w {
    public static final j7w Companion = new j7w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f17844a;
    public final Double b;
    public final Double c;

    public /* synthetic */ k7w(int i, Long l, Double d, Double d2) {
        if ((i & 1) == 0) {
            this.f17844a = null;
        } else {
            this.f17844a = l;
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
        if (!(obj instanceof k7w)) {
            return false;
        }
        k7w k7wVar = (k7w) obj;
        return Intrinsics.d(this.f17844a, k7wVar.f17844a) && Intrinsics.d(this.b, k7wVar.b) && Intrinsics.d(this.c, k7wVar.c);
    }

    public final int hashCode() {
        Long l = this.f17844a;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.b;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.c;
        return iHashCode2 + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        return "HistoryTransactionItemDataResponse(date=" + this.f17844a + ", sumCut=" + this.b + ", sumOut=" + this.c + Separators.RPAREN;
    }
}
