package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mx10 extends yx10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iz30 f22532a;
    public final String b;

    public mx10(iz30 iz30Var, String str) {
        this.f22532a = iz30Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx10)) {
            return false;
        }
        mx10 mx10Var = (mx10) obj;
        return this.f22532a == mx10Var.f22532a && this.b.equals(mx10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22532a.hashCode() * 31);
    }

    public final String toString() {
        return "MenuItemCyberModel(menuItem=" + this.f22532a + ", endIconUrl=" + this.b + Separators.RPAREN;
    }
}
