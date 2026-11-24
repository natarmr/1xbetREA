package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class eb9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7509a;
    public final fb9 b;

    public eb9(String str, fb9 fb9Var) {
        this.f7509a = str;
        this.b = fb9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eb9)) {
            return false;
        }
        eb9 eb9Var = (eb9) obj;
        return this.f7509a.equals(eb9Var.f7509a) && this.b == eb9Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f7509a.hashCode() * 31);
    }

    public final String toString() {
        return "BuilderCoefficient(coefficient=" + this.f7509a + ", builderCoefficientState=" + this.b + Separators.RPAREN;
    }
}
