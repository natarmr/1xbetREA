package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class w2w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38472a;
    public final int b;

    public w2w0(int i, int i2) {
        this.f38472a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2w0)) {
            return false;
        }
        w2w0 w2w0Var = (w2w0) obj;
        return this.f38472a == w2w0Var.f38472a && this.b == w2w0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f38472a) * 31);
    }

    public final String toString() {
        return ohs0.m("YearMonthModel(year=", this.f38472a, ", month=", Separators.RPAREN, this.b);
    }
}
