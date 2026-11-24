package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class qe2 implements ye2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28561a;
    public final int b;
    public final int c;

    public qe2(int i, int i2, int i3) {
        this.f28561a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe2)) {
            return false;
        }
        qe2 qe2Var = (qe2) obj;
        return this.f28561a == qe2Var.f28561a && this.b == qe2Var.b && this.c == qe2Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f28561a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("OnCalendarChoose(year=", this.f28561a, ", month=", ", dayOfMonth=", this.b));
    }
}
