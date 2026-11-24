package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class r6p0 implements s6p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29945a;
    public final String b;
    public final String c;
    public final int d;

    public r6p0(int i, String str, String str2) {
        this.f29945a = i;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r6p0)) {
            return false;
        }
        r6p0 r6p0Var = (r6p0) obj;
        return this.f29945a == r6p0Var.f29945a && this.b.equals(r6p0Var.b) && this.c.equals(r6p0Var.c);
    }

    @Override // a.s6p0
    public final Object getKey() {
        return Integer.valueOf(this.d);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(Integer.hashCode(this.f29945a) * 31, 31, this.b);
    }

    public final String toString() {
        return axq.n(vqd.r(this.f29945a, "TeamCardDefaultUiModel(id=", ", teamIconUrl=", this.b, ", teamName="), this.c, Separators.RPAREN);
    }
}
