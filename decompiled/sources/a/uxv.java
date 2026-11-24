package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class uxv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36461a;
    public final String b;
    public final String c;

    public uxv(String str, String str2, String str3) {
        this.f36461a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxv)) {
            return false;
        }
        uxv uxvVar = (uxv) obj;
        return this.f36461a.equals(uxvVar.f36461a) && this.b.equals(uxvVar.b) && this.c.equals(uxvVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((this.b.hashCode() + ((((this.f36461a.hashCode() + 1519) * 31) + 50) * 31)) * 31) + 51) * 31);
    }

    public final String toString() {
        return axq.n(b1j.n("HigherVsLowerRoundModel(firstRoundName=1, firstRoundScore=", this.f36461a, ", secondRoundName=2, secondRoundScore=", this.b, ", thirdRoundName=3, thirdRoundScore="), this.c, Separators.RPAREN);
    }
}
