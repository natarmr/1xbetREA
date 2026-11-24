package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class oij {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25314a;
    public final pij b;
    public final long c;
    public final boolean d;
    public final String e;

    public oij(int i, pij pijVar, long j, boolean z, String str) {
        this.f25314a = i;
        this.b = pijVar;
        this.c = j;
        this.d = z;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oij)) {
            return false;
        }
        oij oijVar = (oij) obj;
        return this.f25314a == oijVar.f25314a && this.b == oijVar.b && this.c == oijVar.c && this.d == oijVar.d && this.e.equals(oijVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.e(rw2.b((this.b.hashCode() + (Integer.hashCode(this.f25314a) * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DayInfoUiModel(number=");
        sb.append(this.f25314a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", milliseconds=");
        hne.t(this.c, ", currentDay=", sb, this.d);
        return rw2.o(sb, ", xGamesName=", this.e, Separators.RPAREN);
    }
}
