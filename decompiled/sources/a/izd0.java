package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class izd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15630a;
    public final String b;
    public final String c;
    public final yvd0 d;
    public final String e;

    public izd0(int i, String str, String str2, yvd0 yvd0Var, String str3) {
        this.f15630a = i;
        this.b = str;
        this.c = str2;
        this.d = yvd0Var;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof izd0)) {
            return false;
        }
        izd0 izd0Var = (izd0) obj;
        return this.f15630a == izd0Var.f15630a && this.b.equals(izd0Var.b) && this.c.equals(izd0Var.c) && this.d == izd0Var.d && this.e.equals(izd0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ua80.b(ua80.b(Integer.hashCode(this.f15630a) * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f15630a, "RainbowStatisticMatchesMapPicksModel(id=", ", name=", this.b, ", image=");
        sbR.append(this.c);
        sbR.append(", type=");
        sbR.append(this.d);
        sbR.append(", teamName=");
        return axq.n(sbR, this.e, Separators.RPAREN);
    }
}
