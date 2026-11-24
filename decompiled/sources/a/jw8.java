package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jw8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ux8 f17240a;
    public final xw8 b;
    public final int c;

    public jw8(ux8 ux8Var, xw8 xw8Var, int i) {
        this.f17240a = ux8Var;
        this.b = xw8Var;
        this.c = i;
    }

    public static jw8 a(jw8 jw8Var, ux8 ux8Var, vw8 vw8Var, int i) {
        jw8Var.getClass();
        jw8Var.getClass();
        xw8 xw8Var = vw8Var;
        if ((i & 8) != 0) {
            xw8Var = jw8Var.b;
        }
        int i2 = jw8Var.c;
        jw8Var.getClass();
        ux8Var.getClass();
        return new jw8(ux8Var, xw8Var, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jw8)) {
            return false;
        }
        jw8 jw8Var = (jw8) obj;
        return this.f17240a.equals(jw8Var.f17240a) && this.b.equals(jw8Var.b) && this.c == jw8Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + ((this.f17240a.hashCode() + brm0.e(Boolean.hashCode(false) * 31, 31, false)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrandGamesFiltersState(isSortingOptionsContentLoading=false, isLanguagesContentLoading=false, sortingOptionsContentState=");
        sb.append(this.f17240a);
        sb.append(", languagesContentState=");
        sb.append(this.b);
        sb.append(", lottieTypeId=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
