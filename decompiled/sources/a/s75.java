package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class s75 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m65 f31733a;
    public final f61 b;
    public final boolean c;
    public final boolean d;

    public s75(m65 m65Var, f61 f61Var, boolean z, boolean z2) {
        this.f31733a = m65Var;
        this.b = f61Var;
        this.c = z;
        this.d = z2;
    }

    public static s75 a(s75 s75Var, m65 m65Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            m65Var = s75Var.f31733a;
        }
        f61 f61Var = s75Var.b;
        if ((i & 4) != 0) {
            z = s75Var.c;
        }
        s75Var.getClass();
        if ((i & 16) != 0) {
            z2 = s75Var.d;
        }
        s75Var.getClass();
        return new s75(m65Var, f61Var, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s75)) {
            return false;
        }
        s75 s75Var = (s75) obj;
        return this.f31733a.equals(s75Var.f31733a) && this.b.equals(s75Var.b) && this.c == s75Var.c && this.d == s75Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + twn.a(0, brm0.e((this.b.hashCode() + (this.f31733a.hashCode() * 31)) * 31, 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AvailableGamesState(contentState=");
        sb.append(this.f31733a);
        sb.append(", aggregatorModel=");
        sb.append(this.b);
        sb.append(", isAuth=");
        return ohs0.p(", lottieTypeId=0, isRefreshing=", Separators.RPAREN, sb, this.c, this.d);
    }
}
