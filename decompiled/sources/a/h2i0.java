package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public final class h2i0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12336a;
    public final int b;
    public final int c;

    public h2i0(int i, int i2, int i3) {
        this.f12336a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2i0)) {
            return false;
        }
        h2i0 h2i0Var = (h2i0) obj;
        return this.f12336a == h2i0Var.f12336a && this.b == h2i0Var.b && this.c == h2i0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f12336a) * 31, 31);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, dw9.t("SelectDateTimeResult(year=", this.f12336a, ", month=", ", dayOfMonth=", this.b));
    }
}
