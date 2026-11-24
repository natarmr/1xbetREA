package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class lm1 extends tm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20273a;

    public /* synthetic */ lm1() {
        this(nw80.t.getId());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lm1) && this.f20273a == ((lm1) obj).f20273a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20273a);
    }

    public final String toString() {
        return axq.h(this.f20273a, "RecommendedScreen(partitionId=", Separators.RPAREN);
    }

    public lm1(long j) {
        this.f20273a = j;
    }
}
