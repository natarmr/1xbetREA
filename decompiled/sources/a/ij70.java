package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ij70 extends oj70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f14860a;

    public ij70(int i) {
        this.f14860a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ij70) && this.f14860a == ((ij70) obj).f14860a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f14860a);
    }

    public final String toString() {
        return ua80.e(this.f14860a, "SetAutoSpinAmountLeft(amount=", Separators.RPAREN);
    }
}
