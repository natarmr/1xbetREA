package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class cnq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4668a;
    public final int b;
    public final boolean c;

    public cnq0(int i, int i2, boolean z) {
        this.f4668a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnq0)) {
            return false;
        }
        cnq0 cnq0Var = (cnq0) obj;
        return this.f4668a == cnq0Var.f4668a && this.b == cnq0Var.b && this.c == cnq0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + twn.a(this.b, Integer.hashCode(this.f4668a) * 31, 31);
    }

    public final String toString() {
        return rw2.p(dw9.t("TimerModel(timeSec=", this.f4668a, ", timeDirection=", ", timeRun=", this.b), this.c, Separators.RPAREN);
    }
}
