package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class w7e0 implements a8e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38669a;
    public final int b;

    public w7e0(int i, int i2) {
        this.f38669a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7e0)) {
            return false;
        }
        w7e0 w7e0Var = (w7e0) obj;
        return this.f38669a == w7e0Var.f38669a && this.b == w7e0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f38669a) * 31);
    }

    public final String toString() {
        return ohs0.m("OnScrolled(lastVisibleItem=", this.f38669a, ", totalItems=", Separators.RPAREN, this.b);
    }
}
