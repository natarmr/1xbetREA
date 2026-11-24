package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18340a;
    public final pij b;
    public final long c;
    public final boolean d;

    public kij(int i, pij pijVar, long j, boolean z) {
        this.f18340a = i;
        this.b = pijVar;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kij)) {
            return false;
        }
        kij kijVar = (kij) obj;
        return this.f18340a == kijVar.f18340a && this.b == kijVar.b && this.c == kijVar.c && this.d == kijVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + rw2.b((this.b.hashCode() + (Integer.hashCode(this.f18340a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DayInfoModel(number=");
        sb.append(this.f18340a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", milliseconds=");
        hne.t(this.c, ", currentDay=", sb, this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
