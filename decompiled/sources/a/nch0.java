package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nch0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23294a;
    public final int b;

    public nch0(int i, int i2) {
        this.f23294a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nch0)) {
            return false;
        }
        nch0 nch0Var = (nch0) obj;
        return this.f23294a == nch0Var.f23294a && this.b == nch0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f23294a) * 31);
    }

    public final String toString() {
        return ohs0.m("ScrollingGraphValueUiModel(gold=", this.f23294a, ", round=", Separators.RPAREN, this.b);
    }
}
