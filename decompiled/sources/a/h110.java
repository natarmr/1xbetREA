package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class h110 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12260a;
    public final String b;
    public final String c;
    public final int d;
    public final i110 e;
    public final int f;
    public final float g;

    public h110(String str, String str2, String str3, int i, i110 i110Var, int i2, float f) {
        this.f12260a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = i110Var;
        this.f = i2;
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h110)) {
            return false;
        }
        h110 h110Var = (h110) obj;
        return this.f12260a.equals(h110Var.f12260a) && this.b.equals(h110Var.b) && this.c.equals(h110Var.c) && this.d == h110Var.d && this.e == h110Var.e && this.f == h110Var.f && Float.compare(this.g, h110Var.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + twn.a(this.f, (this.e.hashCode() + twn.a(this.d, ua80.b(ua80.b(this.f12260a.hashCode() * 31, 31, this.b), 31, this.c), 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("LolPopularChampionModel(id=", this.f12260a, ", name=", this.b, ", icon=");
        twn.w(this.d, this.c, ", tier=", ", role=", sbN);
        sbN.append(this.e);
        sbN.append(", pickRate=");
        sbN.append(this.f);
        sbN.append(", winRate=");
        return kng0.o(sbN, this.g, Separators.RPAREN);
    }
}
