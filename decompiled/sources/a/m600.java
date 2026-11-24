package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class m600 {
    public static final m600 d = new m600(17, j600.c, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f21243a;
    public final int b;
    public final int c;

    public m600(int i, float f, int i2) {
        this.f21243a = f;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m600)) {
            return false;
        }
        m600 m600Var = (m600) obj;
        float f = m600Var.f21243a;
        float f2 = j600.b;
        return Float.compare(this.f21243a, f) == 0 && this.b == m600Var.b && this.c == m600Var.c;
    }

    public final int hashCode() {
        float f = j600.b;
        return Integer.hashCode(this.c) + twn.a(this.b, Float.hashCode(this.f21243a) * 31, 31);
    }

    public final String toString() {
        String str;
        String strB = j600.b(this.f21243a);
        String str2 = "Invalid";
        int i = this.b;
        if (i == 1) {
            str = "LineHeightStyle.Trim.FirstLineTop";
        } else if (i == 16) {
            str = "LineHeightStyle.Trim.LastLineBottom";
        } else if (i == 17) {
            str = "LineHeightStyle.Trim.Both";
        } else {
            str = i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
        }
        int i2 = this.c;
        if (i2 == 0) {
            str2 = "LineHeightStyle.Mode.Fixed";
        } else if (i2 == 1) {
            str2 = "LineHeightStyle.Mode.Minimum";
        } else if (i2 == 2) {
            str2 = "LineHeightStyle.Mode.Tight";
        }
        return axq.n(b1j.n("LineHeightStyle(alignment=", strB, ", trim=", str, ",mode="), str2, Separators.RPAREN);
    }
}
