package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class nte0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24096a;
    public final int b;

    public nte0(int i, int i2) {
        this.f24096a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nte0)) {
            return false;
        }
        nte0 nte0Var = (nte0) obj;
        return this.f24096a == nte0Var.f24096a && this.b == nte0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f24096a) * 31);
    }

    public final String toString() {
        return ohs0.m("RegisterSendSmsModel(expiryTime=", this.f24096a, ", canResendAfterTime=", Separators.RPAREN, this.b);
    }
}
