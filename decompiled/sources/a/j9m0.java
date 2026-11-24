package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class j9m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16147a;
    public final String b;
    public final int c;

    public j9m0(int i, String str, String str2) {
        this.f16147a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j9m0)) {
            return false;
        }
        j9m0 j9m0Var = (j9m0) obj;
        return this.f16147a.equals(j9m0Var.f16147a) && this.b.equals(j9m0Var.b) && this.c == j9m0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(this.f16147a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, b1j.n("StatisticBackgroundUiModel(backgroundImage=", this.f16147a, ", customChampBackgroundImage=", this.b, ", backgroundPlaceHolder="));
    }
}
