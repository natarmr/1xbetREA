package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class hiq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13127a;
    public final int b;
    public final long c;
    public final int d;

    public hiq(int i, int i2, int i3, long j) {
        this.f13127a = i;
        this.b = i2;
        this.c = j;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hiq)) {
            return false;
        }
        hiq hiqVar = (hiq) obj;
        return this.f13127a == hiqVar.f13127a && this.b == hiqVar.b && this.c == hiqVar.c && this.d == hiqVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + rw2.b(twn.a(this.b, Integer.hashCode(this.f13127a) * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("FixedGraphConfig(valueStep=", this.f13127a, ", lineCount=", ", maxTimeValueInSeconds=", this.b);
        ua80.v(sbT, this.c, ", maxRoundedValue=", this.d);
        sbT.append(Separators.RPAREN);
        return sbT.toString();
    }
}
