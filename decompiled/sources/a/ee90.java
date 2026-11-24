package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ee90 implements wpd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7660a;
    public final zmk0 b;
    public final zmk0 c;

    public ee90(int i, zmk0 zmk0Var, zmk0 zmk0Var2) {
        this.f7660a = i;
        this.b = zmk0Var;
        this.c = zmk0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee90)) {
            return false;
        }
        ee90 ee90Var = (ee90) obj;
        return this.f7660a == ee90Var.f7660a && this.b.equals(ee90Var.b) && this.c.equals(ee90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + axq.b(this.b, Integer.hashCode(this.f7660a) * 31, 31);
    }

    public final String toString() {
        return "PeriodEventUiModel(eventIconId=" + this.f7660a + ", teamOneValue=" + this.b + ", teamTwoValue=" + this.c + Separators.RPAREN;
    }
}
