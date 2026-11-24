package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rt0 extends t9p {
    public final aml b;

    public rt0(aml amlVar) {
        super("AGGREGATOR", iun.f15405a);
        this.b = amlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rt0) && this.b.equals(((rt0) obj).b);
    }

    @Override // a.p6t0
    public final String getKey() {
        return "AGGREGATOR " + this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() - 1300475561;
    }

    public final String toString() {
        return "AggregatorGameCardShimmersCollection(id=AGGREGATOR, content=" + this.b + Separators.RPAREN;
    }
}
