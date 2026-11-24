package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class y4p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42015a;
    public final String b;
    public final String c;

    public y4p0(int i, String str, String str2) {
        this.f42015a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y4p0)) {
            return false;
        }
        y4p0 y4p0Var = (y4p0) obj;
        return this.f42015a == y4p0Var.f42015a && this.b.equals(y4p0Var.b) && this.c.equals(y4p0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f42015a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f42015a, "TeamCardLUiModel(id=", ", teamIconUrl=", this.b, ", teamName="), this.c, Separators.RPAREN);
    }
}
