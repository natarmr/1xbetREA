package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class m5i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21221a;
    public final int b;
    public final String c;

    public m5i0(int i, int i2, String str) {
        this.f21221a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5i0)) {
            return false;
        }
        m5i0 m5i0Var = (m5i0) obj;
        return this.f21221a == m5i0Var.f21221a && this.b == m5i0Var.b && this.c.equals(m5i0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, Integer.hashCode(this.f21221a) * 31, 31);
    }

    public final String toString() {
        return axq.n(dw9.t("SelectorModel(id=", this.f21221a, ", groupId=", ", title=", this.b), this.c, Separators.RPAREN);
    }
}
