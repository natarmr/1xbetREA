package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jx20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f17281a;
    public final long b;
    public final String c;

    public jx20(float f, long j, String str) {
        this.f17281a = f;
        this.b = j;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jx20)) {
            return false;
        }
        jx20 jx20Var = (jx20) obj;
        return Float.compare(this.f17281a, jx20Var.f17281a) == 0 && this.b == jx20Var.b && this.c.equals(jx20Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + rw2.b(Float.hashCode(this.f17281a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketStatisticGraphItemModel(coef=");
        sb.append(this.f17281a);
        sb.append(", date=");
        sb.append(this.b);
        return rw2.o(sb, ", coefText=", this.c, Separators.RPAREN);
    }
}
