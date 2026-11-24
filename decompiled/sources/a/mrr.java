package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mrr implements zrr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uqr f22286a;
    public final jdp0 b;
    public final jdp0 c;
    public final j83 d;
    public final eex e;
    public final String f;
    public final boolean g;
    public final String h;
    public final boolean i;

    public mrr(uqr uqrVar, jdp0 jdp0Var, jdp0 jdp0Var2, j83 j83Var, eex eexVar, String str, boolean z, String str2, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f22286a = uqrVar;
        this.b = jdp0Var;
        this.c = jdp0Var2;
        this.d = j83Var;
        this.e = eexVar;
        this.f = str;
        this.g = z;
        this.h = str2;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mrr)) {
            return false;
        }
        mrr mrrVar = (mrr) obj;
        return this.f22286a.equals(mrrVar.f22286a) && this.b.equals(mrrVar.b) && this.c.equals(mrrVar.c) && this.d.equals(mrrVar.d) && this.e == mrrVar.e && Intrinsics.d(this.f, mrrVar.f) && this.g == mrrVar.g && Intrinsics.d(this.h, mrrVar.h) && this.i == mrrVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ua80.b(brm0.e(ua80.b((this.e.hashCode() + brm0.f(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f22286a.hashCode() * 31)) * 31)) * 31, 31)) * 31, 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CricketScore(labels=");
        sb.append(this.f22286a);
        sb.append(", teamOne=");
        sb.append(this.b);
        sb.append(", teamTwo=");
        sb.append(this.c);
        sb.append(", bottomInfo=");
        sb.append((Object) this.d);
        sb.append(", inningType=");
        sb.append(this.e);
        sb.append(", oneTeamScore=");
        sb.append(this.f);
        sb.append(", isOneTeamScoreIncrease=");
        f140.s(", twoTeamScore=", this.h, ", isTwoTeamScoreIncrease=", sb, this.g);
        return rw2.p(sb, this.i, Separators.RPAREN);
    }
}
