package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class nrr implements asr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vqr f24018a;
    public final hdp0 b;
    public final hdp0 c;
    public final j83 d;
    public final dex e;
    public final String f;
    public final boolean g;
    public final String h;
    public final boolean i;

    public nrr(vqr vqrVar, hdp0 hdp0Var, hdp0 hdp0Var2, j83 j83Var, dex dexVar, String str, boolean z, String str2, boolean z2) {
        str.getClass();
        str2.getClass();
        this.f24018a = vqrVar;
        this.b = hdp0Var;
        this.c = hdp0Var2;
        this.d = j83Var;
        this.e = dexVar;
        this.f = str;
        this.g = z;
        this.h = str2;
        this.i = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nrr)) {
            return false;
        }
        nrr nrrVar = (nrr) obj;
        return this.f24018a.equals(nrrVar.f24018a) && this.b.equals(nrrVar.b) && this.c.equals(nrrVar.c) && this.d.equals(nrrVar.d) && this.e == nrrVar.e && Intrinsics.d(this.f, nrrVar.f) && this.g == nrrVar.g && Intrinsics.d(this.h, nrrVar.h) && this.i == nrrVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ua80.b(brm0.e(ua80.b((this.e.hashCode() + brm0.f(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f24018a.hashCode() * 31)) * 31)) * 31, 31)) * 31, 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CricketScore(labels=");
        sb.append(this.f24018a);
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
