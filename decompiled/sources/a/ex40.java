package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ex40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8560a;
    public final j83 b;
    public final String c;
    public final j83 d;
    public final String e;

    public ex40(String str, j83 j83Var, String str2, j83 j83Var2, String str3) {
        this.f8560a = str;
        this.b = j83Var;
        this.c = str2;
        this.d = j83Var2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ex40)) {
            return false;
        }
        ex40 ex40Var = (ex40) obj;
        return this.f8560a.equals(ex40Var.f8560a) && this.b.equals(ex40Var.b) && this.c.equals(ex40Var.c) && this.d.equals(ex40Var.d) && this.e.equals(ex40Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + brm0.f(this.d, ua80.b(brm0.f(this.b, this.f8560a.hashCode() * 31, 31), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiTeamsCompactLiveEventCardModel(teamOneName=");
        sb.append(this.f8560a);
        sb.append(", teamOneScore=");
        sb.append((Object) this.b);
        sb.append(", teamTwoName=");
        sb.append(this.c);
        sb.append(", teamTwoScore=");
        sb.append((Object) this.d);
        sb.append(", infoLabel=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
