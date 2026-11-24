package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class a6l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322a;
    public final int b;
    public final int c;
    public final String d;

    public a6l(String str, int i, int i2, String str2) {
        this.f322a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6l)) {
            return false;
        }
        a6l a6lVar = (a6l) obj;
        return this.f322a.equals(a6lVar.f322a) && this.b == a6lVar.b && this.c == a6lVar.c && this.d.equals(a6lVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, twn.a(this.b, this.f322a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return rw2.k(this.c, ", icon=", this.d, Separators.RPAREN, kng0.p(this.b, "DotaPopularHeroModel(name=", this.f322a, ", winRate=", ", pickRate="));
    }
}
