package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fxn0 implements uxn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f10318a;

    public fxn0(double d) {
        this.f10318a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fxn0) && Double.compare(this.f10318a, ((fxn0) obj).f10318a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f10318a);
    }

    public final String toString() {
        return "OpenChangeBetValueDialog(currentBet=" + this.f10318a + Separators.RPAREN;
    }
}
