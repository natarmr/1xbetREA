package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class i1h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13998a;
    public final String b;
    public final String c;

    public i1h(String str, String str2, String str3) {
        this.f13998a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1h)) {
            return false;
        }
        i1h i1hVar = (i1h) obj;
        return this.f13998a.equals(i1hVar.f13998a) && this.b.equals(i1hVar.b) && this.c.equals(i1hVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((this.b.hashCode() + ((((this.f13998a.hashCode() + 1519) * 31) + 50) * 31)) * 31) + 51) * 31);
    }

    public final String toString() {
        return axq.n(b1j.n("CyberHigherVsLoweRoundUiModel(firstRoundName=1, firstRoundScore=", this.f13998a, ", secondRoundName=2, secondRoundScore=", this.b, ", thirdRoundName=3, thirdRoundScore="), this.c, Separators.RPAREN);
    }
}
