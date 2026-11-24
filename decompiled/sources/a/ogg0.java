package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ogg0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25217a;
    public final String b;
    public final i4 c;
    public final boolean d;

    public ogg0(String str, String str2, i4 i4Var, boolean z) {
        this.f25217a = str;
        this.b = str2;
        this.c = i4Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ogg0)) {
            return false;
        }
        ogg0 ogg0Var = (ogg0) obj;
        return this.f25217a.equals(ogg0Var.f25217a) && this.b.equals(ogg0Var.b) && this.c.equals(ogg0Var.c) && this.d == ogg0Var.d;
    }

    @Override // a.p6t0
    public final String getKey() {
        return "ROUND_STATISTIC";
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + f140.c(this.c, ua80.b(ua80.b(156477505, 31, this.f25217a), 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RoundStatisticUiModel(key=ROUND_STATISTIC, firstTeamImage=", this.f25217a, ", secondTeamImage=", this.b, ", items=");
        sbN.append(this.c);
        sbN.append(", scrollToEnd=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
