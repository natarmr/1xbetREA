package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class nhn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f23541a;
    public final boolean b;

    public nhn0(boolean z, boolean z2) {
        this.f23541a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nhn0)) {
            return false;
        }
        nhn0 nhn0Var = (nhn0) obj;
        return this.f23541a == nhn0Var.f23541a && this.b == nhn0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f23541a) * 31);
    }

    public final String toString() {
        return hne.n("SumEnableModel(betSumEnable=", ", wontedSumEnable=", Separators.RPAREN, this.f23541a, this.b);
    }
}
