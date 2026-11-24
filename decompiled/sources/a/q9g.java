package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class q9g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f28345a;
    public final long b;
    public final int c;

    public q9g(float f, int i, long j) {
        this.f28345a = f;
        this.b = j;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q9g)) {
            return false;
        }
        q9g q9gVar = (q9g) obj;
        return Float.compare(this.f28345a, q9gVar.f28345a) == 0 && this.b == q9gVar.b && this.c == q9gVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + rw2.b(Float.hashCode(this.f28345a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventViewParams(startPosition=");
        sb.append(this.f28345a);
        sb.append(", width=");
        sb.append(this.b);
        return vqd.p(sb, ", intersectionPeriodCount=", this.c, Separators.RPAREN);
    }
}
