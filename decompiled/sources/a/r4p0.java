package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class r4p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v4p0 f29848a;
    public final String b;

    public r4p0(v4p0 v4p0Var, String str) {
        this.f29848a = v4p0Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r4p0)) {
            return false;
        }
        r4p0 r4p0Var = (r4p0) obj;
        return this.f29848a.equals(r4p0Var.f29848a) && this.b.equals(r4p0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29848a.hashCode() * 31);
    }

    public final String toString() {
        return "TeamBetTipModel(screen=" + this.f29848a + ", imagePath=" + this.b + Separators.RPAREN;
    }
}
