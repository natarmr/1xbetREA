package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class je90 {
    public static final pn20 d = new pn20((byte) 7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16363a;
    public final zmk0 b;
    public final zmk0 c;

    public je90(String str, zmk0 zmk0Var, zmk0 zmk0Var2) {
        this.f16363a = str;
        this.b = zmk0Var;
        this.c = zmk0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je90)) {
            return false;
        }
        je90 je90Var = (je90) obj;
        return this.f16363a.equals(je90Var.f16363a) && this.b.equals(je90Var.b) && this.c.equals(je90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + axq.b(this.b, this.f16363a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "PeriodInfoUiModel(period=" + this.f16363a + ", teamOneScore=" + this.b + ", teamTwoScore=" + this.c + Separators.RPAREN;
    }
}
