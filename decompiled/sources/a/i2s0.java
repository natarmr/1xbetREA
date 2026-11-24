package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class i2s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f14067a;
    public final String b;
    public final String c;
    public final b2s0 d;
    public final int e;
    public final int f;
    public final float g;
    public final float h;
    public final String i;
    public final String j;

    public i2s0(long j, String str, String str2, b2s0 b2s0Var, int i, int i2, float f, float f2, String str3, String str4) {
        this.f14067a = j;
        this.b = str;
        this.c = str2;
        this.d = b2s0Var;
        this.e = i;
        this.f = i2;
        this.g = f;
        this.h = f2;
        this.i = str3;
        this.j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2s0)) {
            return false;
        }
        i2s0 i2s0Var = (i2s0) obj;
        return this.f14067a == i2s0Var.f14067a && this.b.equals(i2s0Var.b) && this.c.equals(i2s0Var.c) && this.d == i2s0Var.d && this.e == i2s0Var.e && this.f == i2s0Var.f && Float.compare(this.g, i2s0Var.g) == 0 && Float.compare(this.h, i2s0Var.h) == 0 && this.i.equals(i2s0Var.i) && this.j.equals(i2s0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ua80.b(defpackage.c.a(defpackage.c.a(twn.a(this.f, twn.a(this.e, (this.d.hashCode() + ua80.b(ua80.b(Long.hashCode(this.f14067a) * 31, 31, this.b), 31, this.c)) * 31, 31), 31), this.g, 31), this.h, 31), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f14067a, "TournamentLolFeedStatisticPlayerModel(id=", ", name=", this.b);
        sbO.append(", imageS3=");
        sbO.append(this.c);
        sbO.append(", role=");
        sbO.append(this.d);
        rw2.s(this.e, this.f, ", wins=", ", loses=", sbO);
        sbO.append(", winrate=");
        sbO.append(this.g);
        sbO.append(", kda=");
        sbO.append(this.h);
        f140.v(sbO, ", teamName=", this.i, ", teamImageS3=", this.j);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
