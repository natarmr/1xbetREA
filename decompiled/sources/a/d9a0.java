package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class d9a0 {
    public static final d9a0 g = new d9a0(-1, -1, -1, "", "", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5691a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;

    public d9a0(int i, int i2, int i3, String str, String str2, String str3) {
        this.f5691a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i3;
    }

    public static d9a0 a(d9a0 d9a0Var, int i) {
        return new d9a0(d9a0Var.f5691a, d9a0Var.b, i, d9a0Var.c, d9a0Var.d, d9a0Var.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9a0)) {
            return false;
        }
        d9a0 d9a0Var = (d9a0) obj;
        return this.f5691a == d9a0Var.f5691a && this.b == d9a0Var.b && this.c.equals(d9a0Var.c) && this.d.equals(d9a0Var.d) && this.e.equals(d9a0Var.e) && this.f == d9a0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ua80.b(ua80.b(ua80.b(twn.a(this.b, Integer.hashCode(this.f5691a) * 31, 31), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("PlayerModel(gameId=", this.f5691a, ", playerId=", ", playerName=", this.b);
        f140.v(sbT, this.c, ", player=", this.d, ", image=");
        return brm0.j(this.f, this.e, ", teamId=", Separators.RPAREN, sbT);
    }
}
