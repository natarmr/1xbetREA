package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class p8p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26569a;
    public final String b;
    public final int c;
    public final float d;
    public final String e;

    public p8p0(long j, String str, int i, float f, String str2) {
        this.f26569a = j;
        this.b = str;
        this.c = i;
        this.d = f;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8p0)) {
            return false;
        }
        p8p0 p8p0Var = (p8p0) obj;
        return this.f26569a == p8p0Var.f26569a && this.b.equals(p8p0Var.b) && this.c == p8p0Var.c && Float.compare(this.d, p8p0Var.d) == 0 && this.e.equals(p8p0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + defpackage.c.a(twn.a(this.c, ua80.b(Long.hashCode(this.f26569a) * 31, 31, this.b), 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f26569a, "TeamDetailsBestHeroModel(id=", ", name=", this.b);
        sbO.append(", numberOfMatches=");
        sbO.append(this.c);
        sbO.append(", winRate=");
        sbO.append(this.d);
        return rw2.o(sbO, ", image=", this.e, Separators.RPAREN);
    }
}
