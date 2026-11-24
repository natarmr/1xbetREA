package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class m8w implements n8w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21389a;
    public final int b;
    public final int c;
    public final int d;
    public final String e;

    public m8w(int i, int i2, int i3, int i4, String str) {
        this.f21389a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8w)) {
            return false;
        }
        m8w m8wVar = (m8w) obj;
        return this.f21389a == m8wVar.f21389a && this.b == m8wVar.b && this.c == m8wVar.c && this.d == m8wVar.d && this.e.equals(m8wVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f21389a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("Simple(iconRes=", this.f21389a, ", iconTint=", ", iconBackgroundTint=", this.b);
        axq.r(this.c, this.d, ", title=", ", subtitle=", sbT);
        return axq.n(sbT, this.e, Separators.RPAREN);
    }
}
