package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class e5p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7244a;
    public final String b;
    public final String c;

    public e5p0(String str, String str2, String str3) {
        this.f7244a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5p0)) {
            return false;
        }
        e5p0 e5p0Var = (e5p0) obj;
        return this.f7244a.equals(e5p0Var.f7244a) && this.b.equals(e5p0Var.b) && this.c.equals(e5p0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f7244a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(b1j.n("TeamChampStatisticInfoModel(valueTeamOne=", this.f7244a, ", valueTeamTwo=", this.b, ", typeText="), this.c, Separators.RPAREN);
    }
}
