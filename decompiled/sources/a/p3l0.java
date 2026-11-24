package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class p3l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f26304a;
    public final String b;
    public final boolean c;

    public p3l0(String str, int i, boolean z) {
        this.f26304a = i;
        this.b = str;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3l0)) {
            return false;
        }
        p3l0 p3l0Var = (p3l0) obj;
        return this.f26304a == p3l0Var.f26304a && this.b.equals(p3l0Var.b) && this.c == p3l0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(Integer.hashCode(this.f26304a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(vqd.r(this.f26304a, "SportChipUiModel(sportIndex=", ", title=", this.b, ", selected="), this.c, Separators.RPAREN);
    }
}
