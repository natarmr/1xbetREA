package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ifz implements qfz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14710a;
    public final String b;
    public final boolean c;

    public ifz(String str, long j, boolean z) {
        this.f14710a = j;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ifz)) {
            return false;
        }
        ifz ifzVar = (ifz) obj;
        return this.f14710a == ifzVar.f14710a && this.b.equals(ifzVar.b) && this.c == ifzVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Long.hashCode(this.f14710a) * 31, 31, this.b);
    }

    public final String toString() {
        return f140.n(axq.o(this.f14710a, "OnItemClick(teamId=", ", teamName=", this.b), ", hasStatistic=", this.c, Separators.RPAREN);
    }
}
