package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class w19 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f38387a;
    public final String b;
    public final String c;

    public w19(boolean z, String str, String str2) {
        this.f38387a = z;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w19)) {
            return false;
        }
        w19 w19Var = (w19) obj;
        return this.f38387a == w19Var.f38387a && this.b.equals(w19Var.b) && this.c.equals(w19Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Boolean.hashCode(this.f38387a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(axq.q("NavigationBarState(isSearchActive=", ", searchFieldQuery=", this.b, this.f38387a, ", filterQuery="), this.c, Separators.RPAREN);
    }
}
