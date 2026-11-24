package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ish {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15303a;
    public final String b;
    public final long c;

    public ish(String str, String str2, long j) {
        this.f15303a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ish)) {
            return false;
        }
        ish ishVar = (ish) obj;
        return this.f15303a.equals(ishVar.f15303a) && this.b.equals(ishVar.b) && this.c == ishVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + ua80.b(this.f15303a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return brm0.k(this.c, Separators.RPAREN, b1j.n("CyberWorldCupTeamModel(name=", this.f15303a, ", image=", this.b, ", feedId="));
    }
}
