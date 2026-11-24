package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class m6z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21295a;
    public final int b;
    public final boolean c;

    public m6z(int i, int i2, boolean z) {
        this.f21295a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6z)) {
            return false;
        }
        m6z m6zVar = (m6z) obj;
        return this.f21295a == m6zVar.f21295a && this.b == m6zVar.b && this.c == m6zVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f21295a) * 31, 31);
    }

    public final String toString() {
        return rw2.p(dw9.t("BidiRun(start=", this.f21295a, ", end=", ", isRtl=", this.b), this.c, Separators.RPAREN);
    }
}
